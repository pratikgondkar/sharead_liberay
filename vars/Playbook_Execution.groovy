def call() {
    stage('playbook execution') {
        // Assuming the repository is in the Jenkins workspace
        sh "ansible-playbook -i ${WORKSPACE}/prometheusrole/tests/inventory ${WORKSPACE}/prometheusrole/tests/test.yml"

    }
}

