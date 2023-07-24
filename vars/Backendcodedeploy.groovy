def call () {
 sh '''
 cd fxcm-datazoo/target
 eb init backendservercicd --region eu-west-2 --platform Corretto
 eb use backendservercicd-env --region eu-west-2
 eb deploy
'''
}
