# Academic Events Manager

A Java system for managing academic events at a university
## Features

- Register different types of events: Lectures, Workshops, Courses, Academic Fairs
- Register participants: Students, Teachers, Externals 
- Enroll participants in events (with capacity control and restrictions)
- Generate participation certificates (PDF)
- Support for online and in-person events
- Reports by event type and date
- Command-line interface (CLI)
- Uses iTextPDF library for certificate generation

## Requirements

- Java 21 or higher
- Maven 3.6+ (for build and execution)

## How to Compile and Run

### Using Maven

1. **Compile the project:**
   ```sh
   cd trabalho1
   mvn compile
   ```

2. **Run the application:**
   ```sh
   mvn exec:java -Dexec.mainClass="com.trabalho1.Main"
   ```

> **Note:** If you get an error about the exec plugin, add the following to your `pom.xml` inside `<build><plugins>`:
> ```xml
> <plugin>
>   <groupId>org.codehaus.mojo</groupId>
>   <artifactId>exec-maven-plugin</artifactId>
>   <version>3.1.0</version>
> </plugin>
> ```

### Manual Compilation (without Maven)

1. **Compile all Java files:**
   ```sh
   cd trabalho1/src/main/java
   javac -cp ".:../../../lib/itextpdf-5.5.13.3.jar" com/trabalho1/*.java
   ```

2. **Run the application:**
   ```sh
   java -cp ".:../../../lib/itextpdf-5.5.13.3.jar" com.trabalho1.Main
   ```

> **Note:** You must download the iTextPDF JAR and place it in a `lib` folder as shown above if not using Maven.

## Project Structure

```
trabalho1/
 ├── pom.xml
 └── src/
      └── main/
           └── java/
                └── com/
                     └── trabalho1/
                          *.java
```

## Cleaning the Project

Before submitting, remove all `.class` files and the `target/` folder:

```sh
cd trabalho1
mvn clean
```
Or, manually:
```sh
find . -name "*.class" -delete
rm -rf target/
```

## Author

-Matheus Cerqueira Rocha Santos

---