import data.User

fun main(args: Array<String>) {
    val user: User = User("foo", "bar")
    val values = ClassHelper.getAllPropertyValues<String>(user)
    println("values: $values")
}
