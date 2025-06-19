def call(Map config) {
    def rawLog = new GitUtils().getGitLog(config.since)
    def parser = createParser(config.format)
    def result = parser.parse(rawLog)

    echo "Результат в формате ${config.format.toUpperCase()}:\n${result}"
    return result
}

private GitLogParser createParser(String format) {
    switch (format.toLowerCase()) {
        case "json":
            return new JsonLogParser()
        case "yaml":
            return new YamlLogParser()
        default:
            return new TextLogParser()  // Реализуйте аналогично
    }
}