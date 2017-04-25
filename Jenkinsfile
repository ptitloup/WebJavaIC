pipeline {
	agent any
	options {
	  gitLabConnection('GitLab Dawan')
	  gitlabCommitStatus(name: 'jenkins')
	}
	stages {
	  stage('Preparation') { // for display purposes
	    steps {
	      git credentialsId: '8b744777-8e3f-4500-83e5-b91aedfca49b', url: 'https://bmarron@gitlab.dawan.fr/demo/WebJavaIC.git'
	    }
	  }
	  stage('Build') {
	    steps {
	      script {
	        // Run the maven build
	        if (isUnix()) {
	          sh "mvn -Dmaven.test.failure.ignore clean site:site"
	        } else {
	          bat(/mvn -Dmaven.test.failure.ignore clean package/)
	        }
	      }
	      
	    }
	  }
	  stage('Results') {
	    steps {
	      junit '**/target/surefire-reports/TEST-*.xml'
	        archive 'target/*.jar'
	    }
	  }
	}
}