pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building the application...'
        sh "chmod +x ./gradlew"
        sh './gradlew clean test --no-daemon'
      }
    }

    stage('Test') {
      steps {
        echo 'Testing the application...'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying the application...'
        sh './gradlew clean bootRun --no-daemon --args=--server.port=8081'
      }
    }

  }
}