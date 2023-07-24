def call () {
sh "echo building code"
sh '''
  cd cx_ui/fxcm-ui
  npm install 
  npm run build
  ls -all
  cp -rf build ../
  cd ../ 
  '''
  }
