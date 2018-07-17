def call(def AEM_ENV, def URL_AEM, def PROFIL) {
     withCredentials([usernamePassword(credentialsId: "${AEM_ENV}", passwordVariable: 'AEM_PASSWORD', usernameVariable: 'AEM_USERNAME')]) {
	      sh "mvn clean install -Dcq.url=${URL_AEM} -Dcq.user=${AEM_USERNAME} -Dcq.password=${AEM_PASSWORD} -P${PROFIL}"
	}
}