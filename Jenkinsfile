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
			
			environment {
				scannerHome =  tool 'SONAR_SCANNER'
				javatool =  tool 'JAVA_11'
			}
			
			tools {
                   jdk "JAVA_11"
                }
                
			
			steps {
				
				bat 'java -version'
				
			}
		}
		
		stage('Fim da Esteira'){
			steps {
				bat 'echo FIM'
			}
		}
		

	}
	
}