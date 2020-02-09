package pe.kreatec.workmanagerexample.work

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.squareup.inject.assisted.Assisted
import com.vikingsen.inject.worker.WorkerInject
import pe.kreatec.workmanagerexample.repository.UserRepository

class InjectedSyncWorker
@WorkerInject constructor(
    @Assisted appContext: Context, @Assisted workerParams: WorkerParameters,
    private val userRepository: UserRepository
) : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        Log.i(TAG, "ejecutando $TAG")

        val user = userRepository.getUser()
        Log.i(TAG, "user obtenido: $user")

        return Result.success()
    }

    companion object {
        private const val TAG = "InjectedSyncWorker"
    }
}