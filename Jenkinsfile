pipeline {
    agent any
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
					mail bcc: '', body: '''Bonjour,
	 
					Vous trouvez ci-dessous l’état de l’application Mon Espace CNFPT Agent :
								
					http://10.200.36.21:8080/job/GatlingDemo/Healthcheck_20HTML_20Report/''', cc: 'mourad.lassoued@open-groupe.com', from: 'monespace@cnfpt.fr', replyTo: '', subject: 'MECA', to: 'mourad.lassoued@cnfpt.fr'
				}
            }
        }
    }
}