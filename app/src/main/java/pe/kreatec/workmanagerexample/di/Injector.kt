package pe.kreatec.workmanagerexample.di

object Injector {

    private var appComponent: AppComponent? = null

    @JvmStatic
    @Synchronized
    fun init(appModule: AppModule) {
        appComponent = DaggerAppComponent.builder()
            .appModule(appModule)
            .build()
    }

    @JvmStatic
    @Synchronized
    fun get(): AppComponent {
        appComponent?.let { return it }
        throw IllegalStateException("appComponent is null. Call init() prior to calling get()")
    }
}
