package pl.arturborowy.vvmpim

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import pl.arturborowy.vvmpim.formname.*

val DI_MODULE = module {
    single { FormNameViewModel() }
    single<FormNameUiEventHandler> { FormNamePresenter(get(), get(), get()) }
    single { NameInteractor(get()) }
    single { NameRepository() }
    single<Navigator> { ActivityNavigator(androidContext()) }
}