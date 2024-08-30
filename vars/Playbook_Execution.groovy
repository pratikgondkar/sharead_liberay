def call() {
    stage('playbook execution') {
        // Assuming the repository is in the Jenkins workspace
        sh "ansible-playbook -i /home/pratik/prometheusrole/tests/inventory /home/pratik/prometheusrole/tests/test.yml"
    }
}

