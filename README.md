# SOAP Use Case Library

[![Java CI with Maven](https://github.com/Silva01/soap-client/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/Silva01/soap-client/actions/workflows/maven.yml)

A simple Java library that demonstrates the usage of SOAP-based web services for specific use cases, with a command-line interface.

## Features

- Interact with SOAP-based web services using `RestTemplate`
- Two example use cases: `SumUseCase` and `NameSearchUseCase`
- Command-line interface for user interaction
- Easy to integrate with your existing project

## Prerequisites

- Java 11 or higher
- Maven

## Installation

1. Clone the repository:

```bash
git clone https://github.com/your_username/soap-use-case-library.git
cd soap-use-case-library
```

2. Build the project using Maven:

```bash
mvn clean install
```

## Usage

Run the `App` class which provides a command-line interface for the user to interact with the `SumUseCase` and `NameSearchUseCase`.

```bash
mvn exec:java -Dexec.mainClass="br.net.silva.daniel.App"
```

### SumUseCase

This use case adds two numbers using a SOAP-based web service.

1. Enter `1` to choose the "Sum" option.
2. Input two numbers to be added.
3. The program will display the sum response.

### NameSearchUseCase

This use case searches for a name using a SOAP-based web service.

1. Enter `2` to choose the "Name Search" option.
2. Input a name to be searched.
3. The program will display the name search response.

## License

This project is licensed under the MIT License. See the [LICENSE]([https://chat.openai.com/LICENSE](https://github.com/Silva01/soap-client/blob/master/README.md)) file for details.
