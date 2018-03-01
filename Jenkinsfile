#!/usr/bin/env groovy
// Declarative //
pipeline {
agent any
stages {
stage('Build') {
steps {
bat 'make'
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
}
}
}
}
// Script //
node {
stage('Build') {
bat 'make'
archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
}
}