pipelineJob("$PIPELINE_NAME") {
    definition {
        cps {
            script(readFileFromWorkspace('pipeline_workflow.groovy'))
        }
    }
}