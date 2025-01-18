package com.example.sentrypresentation

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.sentry.android.core.SentryAndroid
import io.sentry.android.core.SentryAndroidOptions
import com.example.sentrypresentation.databinding.ActivityMainBinding
import io.sentry.Sentry
import kotlin.system.exitProcess
import io.github.cdimascio.dotenv.dotenv


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        SentryAndroid.init(this) { options: SentryAndroidOptions ->
            options.dsn = BuildConfig.SENTRY_URL
            options.isDebug = true
        }

        binding.button.setOnClickListener() {
            throw RuntimeException("This is a test exception")
        }

        binding.button2.setOnClickListener() {
            Sentry.captureMessage("This is a test message")
        }

        binding.button3.setOnClickListener() {
            throw RuntimeException("Not Implemented Error")
        }

        binding.button4.setOnClickListener() {
            exitProcess(0)
        }
    }
}