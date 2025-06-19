class YamlLogParser {
    String parse(String rawGitLog) {
        def commits = rawGitLog.split('\n').collect { line ->
            def parts = line.split(' \\| ')
            [
                    commit: [
                            hash: parts[0],
                            author: parts[1],
                            date: parts[2],
                            message: parts[3]
                    ]
            ]
        }
        return new groovy.yaml.YamlBuilder(commits).toString()
    }
}
