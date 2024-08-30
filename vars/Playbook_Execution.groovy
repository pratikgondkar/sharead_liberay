def call() {
    stage('playbook execution') {
        // Assuming the repository is in the Jenkins workspace
        sh "ansible-playbook -i /var/lib/jenkins/workspace/prometheus/tests/inventory /var/lib/jenkins/workspace/prometheus/tests/test.yml"
    }
}

