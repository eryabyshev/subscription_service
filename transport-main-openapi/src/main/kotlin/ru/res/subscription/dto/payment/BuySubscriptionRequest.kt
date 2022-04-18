package ru.res.subscription.dto.payment

import java.util.*

data class BuySubscriptionRequest(
    val paymentToken: String,
    val subscriptionId: UUID,
)