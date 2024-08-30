def call() {
    stage('Clone Repository') {
        git branch: 'main', url: 'https://github.com/pratikgondkar/prometheus_role.git'
    }
}
