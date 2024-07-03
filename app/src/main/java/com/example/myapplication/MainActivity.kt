package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.os.SystemClock
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.myapplication.R.layout.activity_main
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    override  fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(activity_main)

        SystemClock.sleep(10000)

        // delayMethod()

        lifecycleScope.launch {
            doWork()
            val intent = Intent(baseContext, MainActivity2::class.java)
            startActivity(intent)
        }




        /* fun main() = runBlocking {

            }


        }*/

    }

    suspend fun doWork() = coroutineScope {
        launch {
            for (i in 0..5) {

                delay(timeMillis = 400L)
            }
        }

    }
}

