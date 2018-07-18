def call(def releaseVersionParam,def urlGit, def liveCycle) {
     withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        bat "git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${url}"	 
		        bat "git push --set-upstream origin ${liveCycle}-1.0.0"
	 }
}