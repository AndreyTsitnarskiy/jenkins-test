class GitUtils {
    static String getGitLog(String since = "1 week ago") {
        return "git log --since='${since}' --pretty=format:'%h | %an | %ad | %s' --date=short"
                .execute().text.trim()
    }
}