package pl.arturborowy.vvmpim.global.navigator

import android.content.Context
import android.content.Intent
import android.os.Bundle
import pl.arturborowy.vvmpim.form.address.FormAddressActivity
import pl.arturborowy.vvmpim.formname.FormNameActivity

class ActivityNavigator(private val context: Context) : Navigator {

    override fun goToFormName() = startActivity<FormNameActivity>()

    override fun goToFormAddress() = startActivity<FormAddressActivity>()

    private inline fun <reified ActivityT> startActivity(bundle: Bundle? = null) {
        context.startActivity(Intent(context, ActivityT::class.java), bundle)
    }
}