node('master') {
	
	stage('Clone source') {		 
        git url: 'https://github.com/munugotik/Selenium-Cucumber.git' 
	} 
	
	stage('Maven build') {
        bat 'mvn -Dmaven.test.failure.ignore=true clean install test' 
    }
	
    stage('Run tests') {
       echo 'Running Cucumber tests ... '
    }
}