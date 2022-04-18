package ru.res.subscription.dto.subscription

import ru.res.subscription.domain.payment.Money
import ru.res.subscription.domain.subscription.SubscriptionProperty
import ru.res.subscription.domain.subscription.SubscriptionPropertyName
import java.util.*

data class SubscriptionDto(
    val id: UUID,
    val state: Map<SubscriptionPropertyName, SubscriptionProperty>,
    val price: Money
)