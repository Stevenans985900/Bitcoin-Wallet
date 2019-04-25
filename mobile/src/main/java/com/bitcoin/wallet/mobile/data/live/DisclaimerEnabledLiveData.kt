package com.bitcoin.wallet.mobile.data.live

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import com.bitcoin.wallet.mobile.BitcoinApplication
import com.bitcoin.wallet.mobile.utils.Configuration

class DisclaimerEnabledLiveData(application: BitcoinApplication) : LiveData<Boolean>(),
    SharedPreferences.OnSharedPreferenceChangeListener {
    private val config: Configuration = application.config

    override fun onActive() {
        config.registerOnSharedPreferenceChangeListener(this)
        value = config.disclaimerEnabled
    }

    override fun onInactive() {
        config.unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String) {
        if (Configuration.PREFS_KEY_DISCLAIMER == key)
            value = config.disclaimerEnabled
    }
}
