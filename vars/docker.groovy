

def dev(Map config = [:]) {

sh "echo ${config.DOCKERHUB_CREDENTIALS_PSW} | sudo docker login -u ${config.DOCKERHUB_CREDENTIALS_USR} --password-stdin"
echo 'Login Completed to Dev'   
echo "Docker Build successfully with version omair950/${config.tag} to Dev"
}

def prod(Map config = [:]) {

sh "echo ${config.DOCKERHUB_CREDENTIALS_PSW} | sudo docker login -u ${config.DOCKERHUB_CREDENTIALS_USR} --password-stdin"
echo 'Login Completed to Prod '   
echo "Docker Build successfully with version omair950/${config.tag} to Prod "
}
