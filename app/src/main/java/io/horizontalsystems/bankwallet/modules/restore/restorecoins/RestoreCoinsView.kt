package io.horizontalsystems.bankwallet.modules.restore.restorecoins

import androidx.lifecycle.MutableLiveData
import io.horizontalsystems.bankwallet.modules.createwallet.view.CoinManageViewItem
import io.horizontalsystems.core.SingleLiveEvent

class RestoreCoinsView : RestoreCoinsModule.IView {
    val coinsLiveData = MutableLiveData<List<CoinManageViewItem>>()
    val proceedButtonEnabled = MutableLiveData<Boolean>()
    val setProceedButtonAsDone = SingleLiveEvent<Unit>()

    override fun setItems(coinViewItems: List<CoinManageViewItem>) {
        coinsLiveData.postValue(coinViewItems)
    }

    override fun setProceedButton(enabled: Boolean) {
        proceedButtonEnabled.postValue(enabled)
    }

    override fun setProceedButtonTitleAsDone() {
        setProceedButtonAsDone.call()
    }
}
