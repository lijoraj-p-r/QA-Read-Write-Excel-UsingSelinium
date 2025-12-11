
---

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

---
QA-Read-Write-Excel-UsingSelinium/
│
├── src/test/java/
│     ├── excel/
│     │      ├── ExcelReader.java      // Read utilities
│     │      ├── ExcelWriter.java      // Write utilities
│     │      ├── ExcelHelper.java      // Common reusable methods
│     │
│     ├── tests/
│           ├── LoginTest.java         // Sample Selenium test
│
├── testdata/
│     ├── TestData.xlsx                // Input
│     ├── Result.xlsx                  // Output
│
├── pom.xml
└── README.md

---

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

---

## 👤 Author

**Lijo Raj P R**
QA & Automation Engineer

---

If you want a **banner**, **badges**, or a **GitHub-optimized version**, just tell me.
