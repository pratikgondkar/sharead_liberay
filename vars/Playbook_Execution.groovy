def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i /home/pratik/prometheusrole/tests/inventory /home/pratik/prometheusrole/tests/test.yml"
    }
}

