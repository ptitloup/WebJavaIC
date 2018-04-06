pipeline {
  agent any
  stages {
    stage('Preparation') {
      parallel {
        stage('Preparation') {
          steps {
            if (isUnix()) {
              sh 'mvn -Dmaven.test.failure.ignore clean site:site'
            } else {
              bat(/mvn -Dmaven.test.failure.ignore clean site:site/)
            }
            
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
