pipeline {
    agent any
    parameters {
      string name: 'BUILD_VERSION_CODE'
      string name: 'WCHILL_BUILD'
      string name: 'RADAR_VERSION'
      string name: 'CATALOG_VERSION'
      string name: 'DAVIS_VERSION'
      string name: 'HECTOR_RESULT_DEV_BUILD'
      string name: 'HECTOR_PROJECT'
      string name: 'KEYCLOAK_AUTH_TYPE'
      string name: 'KEYCLOAK_URL'
      string name: 'KEYCLOAK_USERNAME'
      password defaultValue: '', name: 'KEYCLOAK_PASSWORD'
      string name: 'KEYCLOAK_ADMIN_USERNAME'
      password defaultValue: '', name: 'KEYCLOAK_ADMIN_PASSWORD'
      string name: 'AZUREAD_AUTH_TYPE'
      string name: 'AZUREAD_URL'
      string name: 'AZUREAD_USERNAME'
      password defaultValue: '', name: 'AZUREAD_PASSWORD'
      string name: 'AZUREAD_ADMIN_USERNAME'
      password defaultValue: '', name: 'AZUREAD_ADMIN_PASSWORD'
      string name: 'ATLASIAM_AUTH_TYPE'
      string name: 'ATLASIAM_URL'
      string name: 'ATLASIAM_USERNAME'
      password defaultValue: '', name: 'ATLASIAM_PASSWORD'
      string name: 'ATLASIAM_ADMIN_USERNAME'
      password defaultValue: '', name: 'ATLASIAM_ADMIN_PASSWORD'
    }

    stages {
        stage('Trigger Keycloak Run') {
            steps {
                    // Create variables from parameters
                    // def AUTH_TYPE = params.KEYCLOAK_AUTH_TYPE
                    // def WINDCHILL_URL = params.KEYCLOAK_URL
                    // def USERNAME = params.KEYCLOAK_USERNAME
                    // def PASSWORD = env.KEYCLOAK_PASSWORD
                    // def ADMI

                    // Pass variables as parameters to build job
                    build job: 'SmokeTest_Toaster_Execution', parameters: [
                        string(name: 'AUTH_TYPE', value: params.KEYCLOAK_AUTH_TYPE),
                        string(name: 'WINDCHILL_URL', value: params.KEYCLOAK_URL),
                        string(name: 'USERNAME', value: params.KEYCLOAK_USERNAME),
                        password(name: 'PASSWORD', value: env.KEYCLOAK_PASSWORD),
                        string(name: 'ADMIN_USERNAME',value: params.KEYCLOAK_ADMIN_USERNAME),
                        password(name: 'ADMIN_PASSWORD', value; env.KEYCLOAK_ADMIN_PASSWORD)
                    ]
            
        }
        }
        stage('Trigger Keycloak Run') {
            steps {
                    // Create variables from parameters
                    // def AUTH_TYPE = params.KEYCLOAK_AUTH_TYPE
                    // def WINDCHILL_URL = params.KEYCLOAK_URL
                    // def USERNAME = params.KEYCLOAK_USERNAME
                    // def PASSWORD = env.KEYCLOAK_PASSWORD
                    // def ADMI

                    // Pass variables as parameters to build job
                    build job: 'SmokeTest_Toaster_Execution', parameters: [
                        string(name: 'AUTH_TYPE', value: params.KEYCLOAK_AUTH_TYPE),
                        string(name: 'WINDCHILL_URL', value: params.KEYCLOAK_URL),
                        string(name: 'USERNAME', value: params.KEYCLOAK_USERNAME),
                        password(name: 'PASSWORD', value: env.KEYCLOAK_PASSWORD),
                        string(name: 'ADMIN_USERNAME',value: params.KEYCLOAK_ADMIN_USERNAME),
                        password(name: 'ADMIN_PASSWORD', value; env.KEYCLOAK_ADMIN_PASSWORD)
                    ]
            
        }
        
    }
}
