package pl.arturborowy.vvmpim.global.navigator

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pl.arturborowy.vvmpim.form.address.FormAddressActivity
import pl.arturborowy.vvmpim.form.contact.FormContactActivity
import pl.arturborowy.vvmpim.form.name.FormNameActivity

class ActivityNavigator(private val context: Context) : Navigator {

    override fun goToFormName() = startActivity<FormNameActivity>()

    override fun goToFormAddress() = startActivity<FormAddressActivity>()

    override fun goToFormContact() = startActivity<FormContactActivity>()

    private inline fun <reified ActivityT : AppCompatActivity> startActivity(
        bundle: Bundle? = null
    ) {
        context.startActivity(
            Intent(context, ActivityT::class.java)
                .apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) },
            bundle
        )
    }
}