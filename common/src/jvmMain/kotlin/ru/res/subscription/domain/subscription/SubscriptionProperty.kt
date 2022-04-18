package ru.res.subscription.domain.subscription

data class SubscriptionProperty(
    val type: SubscriptionPropertyType,
    val value: Any,
    val maxValue: Int? = null,
    val minValue: Int? = null,
) {

    init {
        when (type) {
            SubscriptionPropertyType.BOOLEAN -> value as Boolean
            SubscriptionPropertyType.STRING -> value as String
            SubscriptionPropertyType.NUMBER -> value as Number
        }
    }

}