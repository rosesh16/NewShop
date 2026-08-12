pipeline {
    agent any

    triggers {
        pollSCM('* * * * *')
    }

    stages {

        stage('Checkout') {
            steps {
                echo '=== CHECKOUT: Getting latest code from GitHub ==='
            }
        }

        stage('Build') {
            steps {
                echo '=== BUILD: Compiling the Shopping Website ==='
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo '=== TEST: Running automated tests ==='
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo '=== DEPLOY: Deploying application ==='
                bat 'deploy.bat'
            }
        }
    }

    post {
        success {
            echo '======================================'
            echo 'CI/CD PIPELINE COMPLETED SUCCESSFULLY'
            echo 'Build ✓'
            echo 'Test  ✓'
            echo 'Deploy ✓'
            echo '======================================'
        }

        failure {
            echo '======================================'
            echo 'PIPELINE FAILED'
            echo 'Deployment was stopped.'
            echo '======================================'
        }
    }
}