pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-25.0.3'
        PATH = "C:\\Program Files\\Java\\jdk-25.0.3\\bin;C:\\apache-maven-3.9.16\\bin;${env.PATH}"
    }

    stages {
        stage('Check Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test package'
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }
        failure {
            echo 'Build failed. Check the Console Output.'
        }
    }
}
