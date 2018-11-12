node('master') {
	
	stage('Clone source') {		 
        git url: 'https://github.com/munugotik/Selenium-Cucumber.git' 
	} 
	
	stage('Maven build') {
        sh 'mvn -Dmaven.test.failure.ignore=true install' 
    }
	
    stage('Run tests') {
        echo 'Running tests'
    }
}