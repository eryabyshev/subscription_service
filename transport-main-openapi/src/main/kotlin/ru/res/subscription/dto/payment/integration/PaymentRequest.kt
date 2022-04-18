package ru.res.subscription.dto.payment.integration

import com.fasterxml.jackson.annotation.JsonProperty

/** link https://yookassa.ru/developers/payment-acceptance/integration-scenarios/checkout-js/payments-with-tokens */
data class PaymentDetails(
    @JsonProperty("payment_token")
    val paymentToken: String,
    val amount: Amount,
    val confirmation: Confirmation,
    val description: String,
    val capture: Boolean = false,
)