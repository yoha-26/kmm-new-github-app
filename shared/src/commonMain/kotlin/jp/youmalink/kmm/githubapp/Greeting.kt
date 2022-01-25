package jp.youmalink.kmm.githubapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}