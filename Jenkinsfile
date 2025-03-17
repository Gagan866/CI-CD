pipeline{
    agent any


    environment{
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-21"
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages{
        stage("Cloning into git repository"){
            steps{
                script{
                    echo "Fetching latest code from gti repo"
                    checkout scm
                }
            }
        }
        stage("Compiling java code"){
            steps{
                script{
                    echo "Compiling java file"
                    bat "javac hello.java"
                }
            }
        } 
        stage("Run java file"){
            steps{
                script{
                    echo "Running your java file "
                    bat "java hello.java"
                }
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}