pipeline {
    agent any
	environment {
        EMAIL_FROM = 'monespace@cnfpt.fr'
        EMAIL_TO = 'mourad.lassoued@cnfpt.fr'
        BUILD_DATE = sh(returnStdout: true, script: 'date +%d/%m/%Y').trim()
        EMAIL_BODY = """Bonjour,
             
Vous trouvez ci-dessous l’état de l’application Mon Espace CNFPT Agent au ${BUILD_DATE}:
            			
http://10.200.36.21:8080/job/GatlingDemo/Healthcheck_20HTML_20Report/
            
Cdt,"""
	}
    stages {
        stage("Build Maven") {
            steps {
                sh 'mvn -B clean package'
            }
        }
        stage("Run Gatling") {
            steps {
                sh 'mvn gatling:test'
            }
            post {
                always {
                    gatlingArchive()
					sh 'rm -rf target/gatling_results/* && mkdir -p target/gatling_results/ && cp -r target/gatling/*/. target/gatling_results/'
					publishHTML([allowMissing: true, alwaysLinkToLastBuild: true, keepAll: true, reportDir: 'target/gatling_results/', reportFiles: 'index.html', reportName: 'Healthcheck HTML Report', reportTitles: ''])
				}
				success {
					emailext body: "${EMAIL_BODY}", subject: 'MECA [OK]', to: "${EMAIL_TO}",from: "${EMAIL_FROM}"
				}
				failure {
					emailext body: "${EMAIL_BODY}", subject: 'MECA [KO]', to: "${EMAIL_TO}",from: "${EMAIL_FROM}"
				}
            }
        }
    }
}