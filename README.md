# Shopping Website - Jenkins CI/CD Demo

This is a simple Java Maven project designed to demonstrate a Jenkins CI/CD pipeline for an online shopping website.

## Project Structure

- `pom.xml` - Maven project configuration
- `Jenkinsfile` - Jenkins Pipeline definition
- `deploy.bat` - Simulated Windows deployment script
- `src/main/java/com/example/App.java` - Application code
- `src/test/java/com/example/AppTest.java` - Automated unit tests

## Run Locally

Make sure Java and Maven are installed.

```bat
mvn clean package
mvn test
```

## Jenkins Pipeline

The Jenkinsfile performs:

1. Checkout
2. Build
3. Test
4. Deploy

If the tests fail, Jenkins stops the pipeline and the Deploy stage is not executed.

## GitHub Integration

Push this project to a GitHub repository and configure a Jenkins Pipeline job using:

- Definition: Pipeline script from SCM
- SCM: Git
- Branch: `*/main`
- Script Path: `Jenkinsfile`

For automatic builds after GitHub pushes, configure a GitHub webhook to your Jenkins server.
