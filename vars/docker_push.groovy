def call(Map config) {
    withCredentials([usernamePassword(credentialsId: config.credentials, usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh """
        docker login -u $USER -p $PASS
        docker push ${config.imageName}:${config.imageTag}
        """
    }
}
