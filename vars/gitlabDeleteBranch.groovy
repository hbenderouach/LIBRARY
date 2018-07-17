def call(def releaseVersionParam) {
       sh "git branch -D ${releaseVersionParam}"
}