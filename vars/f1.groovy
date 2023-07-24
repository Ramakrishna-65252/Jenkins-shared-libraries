//def call () {
//sh 'echo Team'
//}
def call() {
        stages {
            stage('Fetch Code') {
                steps {
                    sh 'git clone https://github.com/Zensar-FXCM-Project/cx_ui.git'
                }
            }
        }
}
