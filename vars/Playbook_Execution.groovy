def call() {
    stage('playbook execution') {
        sh " ansible-playbook -i prometheusrole/tests/inventory prometheusrole/tests/test.yml"
    }
}

