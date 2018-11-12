node('master') {
	
	stage('Clone source') {		 
        git url: 'https://github.com/munugotik/Selenium-Cucumber.git' 
	} 
	
	stage('Maven build') {
        buildInfo = rtMaven.run pom: 'SeleniumCucumber/pom.xml', goals: 'clean install'
    }
	
    stage('Run tests') {
        echo 'Running tests'
    }
}