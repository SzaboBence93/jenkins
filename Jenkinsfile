#!/usr/bin/env groovy
// Declarative //
pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'make' ①
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true ②
}
}
}
}
// Script //
node {
stage('Build') {
sh 'make' ①
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true ②
}
}