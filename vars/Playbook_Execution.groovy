def call() {
    stage('playbook execution') {
        sh "ansible-playbook -i  /home/pratik/assignment/Ansible/Assignment05/prometheusrole/tests/inventory  /home/pratik/assignment/Ansible/Assignment05/prometheusrole/tests/test.yml"
    }
}

