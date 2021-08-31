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
			}
			
			steps {
				withSonarQubeEnv('SONAR_LOCAL'){
				
					bat "${scannerHome}/bin/sonar-scanner -e -Dsonar.projectKey=deploy_teste1 -Dsonar.host.url=http://localhost:9000 -Dsonar.login=303d72ccf3909bac85a6bd332b21e31bfab461cf -Dsonar.java.binaries=target -Dsonar.jacoco.reportPaths=C:/Users/Felipe/eclipse-workspace/testeIntegration/target/jacoco.exec -Dsonar.global.exclusions=**/*.js,**/*Test.java,target/**"
				}
			}
		}
		
		stage('Fim da Esteira'){
			steps {
				bat 'echo FIM'
			}
		}
		

	}
	
}