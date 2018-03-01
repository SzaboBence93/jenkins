// Script //
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
when {
expression {
currentBuild.result == null || currentBuild.result == 'SUCCESS'
}
}
steps {
echo 'i could deploy this'
}
}
}