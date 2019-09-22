package pl.arturborowy.vvmpim

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class VvmpimApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            printLogger()
            androidContext(this@VvmpimApplication)
            modules(DI_MODULE)
        }
    }
}