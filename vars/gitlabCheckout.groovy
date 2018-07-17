def call(def branchGit ,def urlGit) {
      git branch: "${branchGit}", credentialsId: 'GIT_AEM', url: "https://${urlGit}"
}