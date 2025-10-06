pipeline {
    agent any

    environment {
        APP_NAME = "javabackend"
        APP_PORT_STAGING = "8082"
        APP_PORT_PROD = "8081"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${env.BRANCH_NAME}", url: 'https://github.com/derekdip/JavaBackend.git'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    if (env.BRANCH_NAME == 'development') {
                        sh """
                        mkdir -p "build/libs"
                        chmod +x ./gradlew
                        ./gradlew clean build
                        cp build/libs/*.jar "/var/lib/jenkins/workspace/Java Backend-staging/build/libs/"
                        sudo systemctl restart javabackend-staging
                        echo "Staging app restarted on port $APP_PORT_STAGING"
                        """
                    } else if (env.BRANCH_NAME == 'main') {
                        sh """
                        mkdir -p "build/libs"
                        chmod +x ./gradlew
                        ./gradlew clean build
                        cp build/libs/*.jar "/var/lib/jenkins/workspace/Java Backend/build/libs/"
                        sudo systemctl restart javabackend
                        echo "Production app restarted on port $APP_PORT_PROD"
                        """
                    }
                }
            }
        }
    }

    post {
        success {
            echo "Deployment completed successfully!"
        }
        failure {
            echo "Deployment failed. Check logs."
        }
    }
}
