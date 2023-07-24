def call () {
 sh '''
 eb init frontendservercicd --region eu-west-2 --platform node.js
  eb use frontendservercicd-env --region eu-west-2
  eb deploy --staged
'''
}

