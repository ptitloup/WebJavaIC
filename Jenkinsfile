pipeline {
  agent any
  stages {
    stage('Preparation') {
      parallel {
        stage('Preparation') {
          steps {
            sh 'mvn -Dmaven.test.failure.ignore clean site:site'
          }
        }
        stage('Dodo') {
          steps {
            sleep 100
          }
        }
      }
    }
    stage('Resultat') {
      steps {
        echo 'Fini le pippeline !!'
      }
    }
  }
}