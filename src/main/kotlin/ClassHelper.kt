import kotlin.reflect.KProperty1
import kotlin.reflect.full.memberProperties

object ClassHelper {

    fun <T> getPropertyValue(instance: Any, property: KProperty1<Any, *>): T {
        return property.get(instance) as T
    }

    fun getAllPropertyValues(instance: Any): Map<String, Any> {
        val inputs = mutableMapOf<String, Any>()
        instance::class.memberProperties.forEach {
            val propertyValue: Any = getPropertyValue(instance, it as KProperty1<Any, *>)
            inputs[it.name] = propertyValue
        }

        return inputs
    }
}
