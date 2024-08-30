def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i inventory prometheusrole/tests/test.yml"
    }
}

