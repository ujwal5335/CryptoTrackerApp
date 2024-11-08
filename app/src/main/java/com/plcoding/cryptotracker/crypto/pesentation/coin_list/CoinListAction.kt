package com.plcoding.cryptotracker.crypto.pesentation.coin_list

import com.plcoding.cryptotracker.crypto.pesentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}