package pl.arturborowy.vvmpim

import android.content.Context
import android.content.Intent
import android.os.Bundle
import kotlin.reflect.KClass

class ActivityNavigator(private val context: Context) : Navigator {

    override fun goToFormName() = startActivity<MainActivity>()

    override fun goToFormAddress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private inline fun <reified ActivityT> startActivity(bundle: Bundle? = null) {
        context.startActivity(Intent(context, ActivityT::class.java), bundle)
    }
}