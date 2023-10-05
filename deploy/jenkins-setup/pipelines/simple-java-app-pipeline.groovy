pipelineJob('simple-java-app') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/vlad-lavrynovych/simple-java-app')
                    }
                    branch('*/master')
                    scriptPath('deploy/Jenkinsfile')
                }
            }
            lightweight()
        }
    }
}