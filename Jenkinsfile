// This shows a simple example of how to archive the build output artifacts.
node {
    stage "Apply Patch"

    properties([parameters([[$class: 'PatchParameterDefinition']])])

    sleep 30
    git credentialsId: 'Jenkins 2 Github', url: 'https://github.com/MCMicS/UploadPatchToJenkins.git'
    withMaven(jdk: 'JDK14', maven: 'Maven') {
        bat "mvn -U package"
    }
}
