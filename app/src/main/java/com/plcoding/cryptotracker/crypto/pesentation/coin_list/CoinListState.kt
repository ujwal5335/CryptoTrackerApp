package com.plcoding.cryptotracker.crypto.pesentation.coin_list

import androidx.compose.runtime.Immutable
import com.plcoding.cryptotracker.crypto.pesentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)
