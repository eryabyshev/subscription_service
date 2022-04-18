package ru.res.subscription.domain.payment

import ru.res.subscription.domain.subscription.Subscription
import java.util.*

data class Payment(
    val id: UUID,
    val amount: Money,
    val description: String,
    val subscription: Subscription,
)