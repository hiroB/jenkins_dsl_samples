job = freeStyleJob("$NAME")

job.with {
    steps {
        shell 'echo test1'
    }
    steps {
        shell 'echo test2'
    }
}