getwd()
wbcd <- read.csv("Prostate_cancer.csv", stringsAsFactors = FALSE)
str(wbcd)
wbcd <- wbcd[-1]# remove first element id
head(wbcd)
table(wbcd$diagnosis)
wbcd$diagnosis<- factor(wbcd$diagnosis, levels = c("B", "M"),
                        labels = c("Benign", "Malignant"))
round(prop.table(table(wbcd$diagnosis)) * 100, digits = 1)

normalize <- function(x) {
  return ((x - min(x)) / (max(x) - min(x)))
}  
wbcd_n <- as.data.frame(lapply(wbcd[2:9], normalize))
summary(wbcd_n$radius)
wbcd_train <- wbcd_n[1:65, ]
wbcd_test <- wbcd_n[66:100, ]
wbcd_train_labels <- wbcd[1:65, 1]
wbcd_test_labels <- wbcd[66:100, 1]
install.packages("class")
library(class)
wbcd_test_pred <- knn(train = wbcd_train, test = wbcd_test,
                      cl = wbcd_train_labels, k = 10)
install.packages("gmodels")
library(gmodels)
CrossTable(x = wbcd_test_labels, y = wbcd_test_pred,
           prop.chisq=FALSE)

