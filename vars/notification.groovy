def call() {
    stage('notify') {
          emailext body: 'success', subject: 'Status', to: 'pratikgondkar4040@gmail.com'
          slackSend channel: '#jenkins-notification', message: 'successfull '
    }
}
