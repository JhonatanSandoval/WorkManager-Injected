package pe.kreatec.workmanagerexample

import android.app.Application
import androidx.work.Configuration
import com.vikingsen.inject.worker.WorkerFactory
import pe.kreatec.workmanagerexample.di.AppModule
import pe.kreatec.workmanagerexample.di.Injector
import javax.inject.Inject

class App : Application(), Configuration.Provider {

    @Inject lateinit var workerFactory: WorkerFactory

    init {
        Injector.init(AppModule(this))
    }

    override fun onCreate() {
        super.onCreate()

        // initialize dagger
        Injector.get().inject(this)
    }

    override fun getWorkManagerConfiguration(): Configuration =
        Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()
}