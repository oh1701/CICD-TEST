package gyu.practice.cicdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gyu.practice.cicdtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        //qqq
    }
}