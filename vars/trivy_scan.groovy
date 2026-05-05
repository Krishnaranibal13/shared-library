def call() {
    sh 'trivy image --exit-code 0 ${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}'
}
