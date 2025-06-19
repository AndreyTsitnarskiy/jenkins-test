// Форматирование git-лога
def formatGitLog(String rawLog) {
    def commits = rawLog.split('\n')
    echo "=== Анализ коммитов ==="
    commits.each { commit ->
        echo "🔹 ${commit}"
    }
    echo "Найдено коммитов: ${commits.size()}"
}

// Дополнительные методы (по желанию)
def filterByAuthor(String rawLog, String author) {
    def filtered = rawLog.split('\n').findAll { it.contains(author) }
    echo "Коммиты автора ${author}:"
    filtered.each { echo it }
}