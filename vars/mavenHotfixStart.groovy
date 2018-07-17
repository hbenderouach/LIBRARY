def call(def releaseVersionParam) {
      withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'AEM_PASSWORD', usernameVariable: 'AEM_USERNAME')]) {
      sh "mvn clean jgitflow:hotfix-start -Dusername=${AEM_USERNAME} -Dpassword=${AEM_PASSWORD} -DreleaseVersion=${releaseVersionParam}"
	}
}