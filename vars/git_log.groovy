// Не используйте static для методов в Jenkins Shared Library!
def startStage(String stageName) {
    println "==================== Start stage ${stageName} ===================="
}

def endStage(String stageName) {
    println "==================== End stage ${stageName} ===================="
}

// Возвращаем this, чтобы можно было использовать git_log.* в Pipeline
return this
