def call(Map config = [:]) {

sh "echo ${config.DOCKERHUB_CREDENTIALS_PSW} | sudo docker login -u ${config.DOCKERHUB_CREDENTIALS_USR} --password-stdin"
echo 'Login Completed'   
sh "Docker Build successfully with version omair950/${config.tag}"
}
