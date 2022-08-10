pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building the application...'
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
      }
    }

  }
}