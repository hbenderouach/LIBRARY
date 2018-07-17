def call(def urlGit) {
     withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        bat "git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${url}"	 
		        bat "git fetch --all --prune"
	 }
}