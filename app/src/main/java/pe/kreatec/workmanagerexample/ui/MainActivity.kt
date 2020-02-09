package pe.kreatec.workmanagerexample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pe.kreatec.workmanagerexample.R
import pe.kreatec.workmanagerexample.di.Injector
import pe.kreatec.workmanagerexample.work.WorkScheduler
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var workScheduler: WorkScheduler

    init {
        Injector.get().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnScheduleWorker.setOnClickListener {
            workScheduler.scheduleSyncWorker()
        }

        btnScheduleInjectedWorker.setOnClickListener {
            workScheduler.scheduleInjectedSyncWorker()
        }
    }
}
