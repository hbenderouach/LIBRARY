def call(def urlGit) {
     withCredentials([usernamePassword(credentialsId: 'GIT_AEM', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
		        sh "git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@${urlGit}" 
		         sh 'git push origin develop'
		        //merge master
		        sh 'git push origin master'
                //tags
		        sh 'git push origin --tags'
	 }
}