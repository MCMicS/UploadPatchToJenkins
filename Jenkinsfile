// This shows a simple example of how to archive the build output artifacts.
node {
    stage "Apply Patch"

    properties([parameters([[$class: 'PatchParameterDefinition']])])

    bat "mvn -U package"
}
