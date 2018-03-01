#!/usr/bin/env groovy
// Declarative //
pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'make'
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
}
}
}
}
// Script //
node {
stage('Build') {
sh 'make'
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
}
}