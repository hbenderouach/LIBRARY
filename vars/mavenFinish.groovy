def call(def liveCycle) {
      withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'AEM_PASSWORD', usernameVariable: 'AEM_USERNAME')]) {
      sh "mvn clean jgitflow:${liveCycle}-finish -Dusername=${AEM_USERNAME} -Dpassword=${AEM_PASSWORD}"
	}
}