// Script //

def depl = 'deploy'
node {

stage('SCM') {
    checkout scm
}

stage('BUILD') {
    sh """
        chmod a+x ./gradlew
        ./gradlew clean build
    """
}
stage('Deploy') {
    if (currentBuild.result == null || currentBuild.result == 'SUCCESS') {
         echo "i could ${depl} this"
    }
}

}