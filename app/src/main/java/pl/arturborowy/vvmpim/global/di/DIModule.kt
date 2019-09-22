package pl.arturborowy.vvmpim.global.di

import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import pl.arturborowy.vvmpim.form.address.FormAddressPresenter
import pl.arturborowy.vvmpim.form.address.FormAddressUiEventHandler
import pl.arturborowy.vvmpim.form.address.FormAddressViewModel
import pl.arturborowy.vvmpim.form.contact.FormContactPresenter
import pl.arturborowy.vvmpim.form.contact.FormContactUiEventHandler
import pl.arturborowy.vvmpim.form.contact.FormContactViewModel
import pl.arturborowy.vvmpim.form.name.*
import pl.arturborowy.vvmpim.global.navigator.ActivityNavigator
import pl.arturborowy.vvmpim.global.navigator.Navigator

val DI_MODULE = module {
    single { FormNameViewModel() }
    single<FormNameUiEventHandler> { FormNamePresenter(get(), get(), get()) }

    single { NameInteractor(get()) }
    single { NameRepository() }

    single<Navigator> { ActivityNavigator(androidContext()) }

    single { FormAddressViewModel() }
    single<FormAddressUiEventHandler> { FormAddressPresenter(get()) }

    single { FormContactViewModel() }
    single<FormContactUiEventHandler> { FormContactPresenter() }
}