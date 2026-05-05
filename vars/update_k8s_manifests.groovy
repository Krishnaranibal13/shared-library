def call(Map config) {
    echo "Updating Kubernetes manifests with image tag: ${config.imageTag}"

    sh """
    sed -i 's|image:.*|image: krishnaranibal5/easyshop-app:12|g' kubernetes/08-easyshop-deployment.yaml
    """
}
