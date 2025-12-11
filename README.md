
# QA Read & Write Excel Using Selenium

A modern and lightweight automation module that enables reading and writing Excel data during Selenium test execution. Designed for clean data-driven testing workflows and smooth integration into any Java-based Selenium framework.

---

## ✨ Features

* Read Excel data using Apache POI
* Write execution results (PASS/FAIL, comments, timestamps)
* Full support for Data-Driven Testing (DDT)
* Lightweight and reusable helper utilities
* Works with TestNG or JUnit
* Plug-and-play structure suitable for any automation framework
QA-Read-Write-Excel-UsingSelinium/
├── .settings/
├── src/
│   ├── main/java/UserClass/SeliniumFileManagementXL/
│   │   ├── ReadingDataFromExcel.java
│   │   └── WRITEtoExcel.java
│   └── test/java/UserClass/SeliniumFileManagementXL/
│       └── AppTest.java
├── .classpath
├── .gitignore
├── .project
├── Book1.xlsx
├── myexcelfilewrite.xlsx
├── pom.xml
└── README.md

## 🚀 Usage

### Reading Excel Data

```java
String username = ExcelReader.getCellData("TestData.xlsx", "Login", 1, 0);
String password = ExcelReader.getCellData("TestData.xlsx", "Login", 1, 1);
```

### Writing Excel Data

```java
ExcelWriter.writeCellData("Result.xlsx", "Login", 1, 2, "PASS");
```

---

## 🛠 Tech Stack

* Java
* Selenium WebDriver
* Apache POI
* Maven
* TestNG / JUnit

---

## 📌 Suitable For

* Data-driven automation
* Framework builders
* QA engineers managing external test data
* Scalable and maintainable test suites


**Lijo Raj P R**
QA & Automation Engineer
