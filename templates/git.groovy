job("$NAME") {
  parameters{
    stringParam('BUILD_TAG', 'develop', 'Description')
  }
  // リポジトリの設定
  scm {
    git {
      remote {
        url("https://github.com/hiroB/$GIT_REPO_URL")
        credentials("$CREDENTAILS")
      }
      branch('$BUILD_TAG')
    }
  }
}