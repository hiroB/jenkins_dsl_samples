pipelineJob($PIPELINE_NAME) {
    definition {
        cps {
            script(readFileFromWorkspace('templates/pipeline_workflow.groovy'))
        }
    }
}