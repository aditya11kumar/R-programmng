# Loading data
data(iris)

# Structure
str(iris)
# Installing Packages
#install.packages("e1071")
#install.packages("caTools")

# Loading package
library(e1071)
library(caTools)

# Splitting data into train
# and test data
split <- sample.split(iris, SplitRatio = 0.7)
train_cl <- subset(iris, split == "TRUE")
train_cl
test_cl <- subset(iris, split == "FALSE")
test_cl

# Feature Scaling
train_scale <- scale(train_cl[, 1:4])
train_scale
test_scale <- scale(test_cl[, 1:4])

# Fitting Naive Bayes Model
# to training dataset
set.seed(120) # Setting Seed
classifier_cl <- naiveBayes(Species ~ ., data = train_cl)
classifier_cl

# Predicting on test data'
y_pred <- predict(classifier_cl, newdata = test_cl)

# Confusion Matrix
cm <- table(test_cl$Species, y_pred)
cm
