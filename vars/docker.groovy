def call(Map config = [:]) {


docker build -t omair950/${config.tag} .
sh "Docker Build successfully with version omair950/${config.tag}"
}
