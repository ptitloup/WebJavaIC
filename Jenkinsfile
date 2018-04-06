pipeline {
  agent any
  tools { 
        maven 'M3' 
        jdk 'JDK8' 
    }
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
            sleep 40
          }
        }
      }
    }
    stage('Build') {
      steps {
        echo 'Construction'
      }
    }
    stage('Resultat') {
      steps {
        echo 'Fini le pippeline !!'
      }
    }
  }
}