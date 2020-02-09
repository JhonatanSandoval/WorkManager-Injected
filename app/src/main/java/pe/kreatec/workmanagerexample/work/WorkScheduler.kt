package pe.kreatec.workmanagerexample.work

import android.content.Context
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WorkScheduler
@Inject constructor(
    private val context: Context
) {

    private val workManager by lazy { WorkManager.getInstance(context) }

    private val networkConstraint by lazy {
        Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
    }

    fun scheduleSyncWorker() {
        val workRequest = OneTimeWorkRequestBuilder<SyncWorker>()
            .setConstraints(networkConstraint)
            .build()

        workManager.apply {
            enqueue(workRequest)
        }
    }

    fun scheduleInjectedSyncWorker() {
        val workRequest = OneTimeWorkRequestBuilder<InjectedSyncWorker>()
            .setConstraints(networkConstraint)
            .build()

        workManager.apply {
            enqueue(workRequest)
        }
    }

}