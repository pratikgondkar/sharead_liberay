def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i /var/lib/jenkins/workspace/prometheus/Assignment05/prometheusrole/tests/inventory /var/lib/jenkins/workspace/prometheus/Assignment05/prometheusrole/tests/test.yml"
    }
}

