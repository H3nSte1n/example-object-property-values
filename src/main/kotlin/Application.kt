import data.User

fun main(args: Array<String>) {
    val user: User = User("foo", "bar", 20)
    val values = ClassHelper.getAllPropertyValues(user)
    println("values: $values")
}
