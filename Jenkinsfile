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
}