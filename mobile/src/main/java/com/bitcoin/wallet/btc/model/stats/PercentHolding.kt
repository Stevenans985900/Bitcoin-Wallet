package com.bitcoin.wallet.btc.model.stats

import com.google.gson.annotations.SerializedName

data class PercentHolding(

    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("value")
    val value: Double? = null
)