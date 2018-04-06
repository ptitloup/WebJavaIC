pipeline {
  agent any
  tool {
    maven 'M3'
    jdk 'Java8'
  }
  stages {
    stage('Preparation') {
      parallel {
        stage('Preparation') {
          steps {
            if(isunix()) {
              sh 'mvn -Dmaven.test.failure.ignore clean site:site'
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
