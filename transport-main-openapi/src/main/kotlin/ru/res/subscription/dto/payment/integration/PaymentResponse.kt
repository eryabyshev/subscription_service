package ru.res.subscription.dto.payment.integration

import com.fasterxml.jackson.annotation.JsonProperty
import ru.res.subscription.domain.payment.PaymentStatus
import java.util.*

/** link https://yookassa.ru/developers/payment-acceptance/integration-scenarios/checkout-js/payments-with-tokens */
class PaymentResponse(
    val id: String,
    status: PaymentStatus,
    val paid: Boolean,
    val amount: Amount,
    val confirmation: Confirmation,
    @JsonProperty("created_at")
    val created: Date,
    val description: String,
    val metadata: Any? = null,
    val recipient: Recipient,
) {
    val status = status.name.lowercase(Locale.getDefault())
}

data class Recipient(
    @JsonProperty("account_id") val accountId: String,
    @JsonProperty("gateway_id") val gatewayId: String,
)