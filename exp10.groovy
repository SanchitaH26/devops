pipeline {
    agent any // Specifies that the pipeline can run on any available agent

    stages {
        stage('Build') {
            steps {
                echo 'Building...' // Use shell steps for main build logic
                // Add actual build commands here, e.g., sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add test commands here, e.g., sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add deployment commands here, e.g., sh 'your_deploy_script.sh'
            }
        }
    }
}
