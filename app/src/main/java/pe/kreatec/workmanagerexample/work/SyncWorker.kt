package pe.kreatec.workmanagerexample.work

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class SyncWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {

    override fun doWork(): Result {
        Log.i(TAG, "ejecutando $TAG")
        return Result.success()
    }

    companion object {
        private const val TAG = "SyncWorker"
    }

}