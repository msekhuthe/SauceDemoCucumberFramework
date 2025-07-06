# SauceDemoCucumberFramework

A Java-based test automation framework using Cucumber, Maven, and Selenium for testing the SauceDemo web application.

## Project Structure

```
SauceDemoCucumberFramework/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   └── stepdefinitions/
│       │   └── runners/
│       └── resources/
│           └── features/
├── pom.xml
└── README.md
```

- `src/main/java/`: Application code (if any)
- `src/test/java/stepdefinitions/`: Step definition classes for Cucumber
- `src/test/java/runners/`: Test runner classes
- `src/test/resources/features/`: Cucumber feature files
- `pom.xml`: Maven configuration

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- Chrome browser (for Selenium tests)

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/SauceDemoCucumberFramework.git
   cd SauceDemoCucumberFramework
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

## Running Tests

To execute all Cucumber tests:
```
mvn test
```

## Customization

- Add or modify feature files in `src/test/resources/features/`
- Implement step definitions in `src/test/java/stepdefinitions/`
- Configure test runners in `src/test/java/runners/`

## Reporting

Test reports are generated in the `target/` directory after execution.

## License

This project is licensed under the MIT License.