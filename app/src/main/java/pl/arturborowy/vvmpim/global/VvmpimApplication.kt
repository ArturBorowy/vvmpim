package pl.arturborowy.vvmpim.global

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pl.arturborowy.vvmpim.global.di.DI_MODULE

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