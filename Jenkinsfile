pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out Shopping Website source code...'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                bat 'deploy.bat'
            }
        }
    }

    post {
        success {
            echo 'CI/CD Pipeline completed successfully!'
            echo 'Shopping Website is ready for users.'
        }

        failure {
            echo 'Pipeline failed. Deployment was stopped.'
        }
    }
}
