def call () {
sh "echo building code"
sh '''
  cd fxcm-datazoo
  mvn clean install
  ls -all
 chmod 700 target/*.jar
  '''
  }
