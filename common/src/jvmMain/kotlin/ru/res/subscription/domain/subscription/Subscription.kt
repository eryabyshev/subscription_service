package ru.res.subscription.domain.subscription

import ru.res.subscription.domain.payment.Money
import java.util.*

data class Subscription(
    val id: UUID,
    val state: Map<SubscriptionPropertyName, SubscriptionProperty>,
    val price: Money
)
