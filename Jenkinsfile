node('master') {
	
	stage('Clone source') {		 
        git url: 'https://github.com/munugotik/Selenium-Cucumber.git' 
	} 
	
	stage('Maven build') {
        bat 'mvn clean install' 
    }
	
    stage('Run tests') {
       bat 'mvn -Dtest=runTest test' 
    }
}