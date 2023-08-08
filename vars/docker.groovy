def call(Map config = [:]) {


docker build -t ${config.tag} .
sh "Docker Build successfully with version omair950/${config.tag}"
}
