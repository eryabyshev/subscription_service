package ru.res.subscription.dto.payment.integration

import com.fasterxml.jackson.annotation.JsonProperty

data class Confirmation(
    @JsonProperty("return_url")
    val return_url: String,
    val type: String = "redirect",
    val enforce: Boolean = false,
)