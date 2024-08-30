def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i inventory test.yml"
    }
}

