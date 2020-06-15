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
					publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: true, reportDir: 'target/gatling_results/', reportFiles: 'index.html', reportName: 'Healthcheck HTML Report', reportTitles: ''])
                }
            }
        }
    }
}