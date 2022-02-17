def call (Map config) {
    pipeline {
        agent any
        environment {
            CC = 'clang'
        }
        stages {
            stage('Build') {
                steps {
                    echo 'Building..'
                    println("Building.. ${config.AppName}")
                    println("Building.. ${config.Version}")
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
    }
}