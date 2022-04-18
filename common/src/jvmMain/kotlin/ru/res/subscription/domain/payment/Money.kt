package ru.res.subscription.domain.payment

import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String)