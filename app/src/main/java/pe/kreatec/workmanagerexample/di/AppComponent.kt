package pe.kreatec.workmanagerexample.di

import dagger.Component
import pe.kreatec.workmanagerexample.App
import pe.kreatec.workmanagerexample.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: App)
    fun inject(mainActivity: MainActivity)
}
