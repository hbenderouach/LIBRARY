def call(def releaseVersionParam, def developmentVersionParam) {
     withCredentials([usernamePassword(credentialsId: 'GIT_TEST', passwordVariable: 'AEM_PASSWORD', usernameVariable: 'AEM_USERNAME')]) {
     bat "mvn clean jgitflow:release-start -Dusername='${AEM_USERNAME}' -Dpassword='${AEM_PASSWORD}' -DreleaseVersion='${releaseVersionParam}' -DdevelopmentVersion='${developmentVersionParam}'"
    }
}