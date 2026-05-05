def call(Map config) {
    echo "Updating Kubernetes manifests with image tag: ${config.imageTag}"

    sh """
    sed -i 's|image:.*|image: ${env.DOCKER_IMAGE_NAME}:${config.imageTag}|g' ${config.manifestsPath}/deployment.yaml
    """
}
