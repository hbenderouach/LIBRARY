def call(def urlGit) {
     withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        bat "git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${urlGit}" 
		        bat 'git push origin develop'
		        //merge master
		        bat 'git push origin master'
                //tags
		        bat 'git push origin --tags'
	 }
}