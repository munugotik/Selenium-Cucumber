#!groovy

node('master') {

    stage('Clone sources') {
		echo 'Code checkout from Github ...Starting'
        git url: 'https://github.com/munugotik/Selenium-Cucumber.git'
        echo 'Code checkout from Github ... completed'
	} 
    stage('Run tests') {
        echo 'Running tests'
    }
}
