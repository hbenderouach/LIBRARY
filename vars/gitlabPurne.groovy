def call(def urlGit) {
     withCredentials([usernamePassword(credentialsId: 'GIT_TEST')]) {
		        bat "git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${url}"	 
		        bat "git fetch --all --prune"
	 }
}