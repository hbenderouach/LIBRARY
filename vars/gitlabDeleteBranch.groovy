def call(def releaseVersionParam) {
       bat "git branch -D ${releaseVersionParam}"
}