def call(def SONAR) {
     withCredentials([usernamePassword(credentialsId: "${SONAR}", passwordVariable: 'SONAR_PASSWORD', usernameVariable: 'SONAR_USERNAME')]) {
          sh 'mvn clean install sonar:sonar  -Dsonar.host.url=${SONAR_USERNAME}  -Dsonar.login=${SONAR_PASSWORD}'
	}
}