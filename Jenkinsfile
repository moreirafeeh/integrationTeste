pipeline {
	agent any
	stages{
		stage('inicio'){
			steps {
				bat 'echo inicio'
			}
		}
		stage('Rodando MAVEN clean'){
			steps {
				bat 'mvn clean'
			}
		}
		stage('Rodando MAVEN TESTE'){
			steps {
				bat 'mvn test'
			}
		}
		stage('Passando Sonar'){
			steps {
				bat 'echo inicio'
			}
		}

	}
	
}