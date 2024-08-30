def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i inventory /tests/test.yml"
    }
}

