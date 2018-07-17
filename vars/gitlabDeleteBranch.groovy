def call(def releaseVersionParam) {
	   println "${releaseVersionParam}"
       bat "git branch -D ${releaseVersionParam}"
}