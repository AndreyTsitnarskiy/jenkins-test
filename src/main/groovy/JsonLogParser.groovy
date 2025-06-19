class JsonLogParser {
    String parse(String rawGitLog) {
        def commits = rawGitLog.split('\n').collect { line ->
            def parts = line.split(' \\| ')
            [
                    hash: parts[0],
                    author: parts[1],
                    date: parts[2],
                    message: parts[3]
            ]
        }
        return groovy.json.JsonOutput.toJson(commits)
    }
}