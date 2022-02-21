package com.umc.history

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.umc.history.databinding.ActivityTestBinding


class TestActivity : AppCompatActivity() {
    private var mBinding: ActivityTestBinding?=null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testExitLy.setOnClickListener{
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        binding.testAllIv.setOnClickListener {
            Toast.makeText(this,"현재 준비중인 기능입니다.",Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext,QuestionActivity::class.java)
//            startActivity(intent)
        }
        binding.testKoreanHistoryIv.setOnClickListener {
            Toast.makeText(this,"현재 준비중인 기능입니다.",Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext,QuestionActivity::class.java)
//            startActivity(intent)
        }
        binding.testOrientalIv.setOnClickListener {
            Toast.makeText(this,"현재 준비중인 기능입니다.",Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext,QuestionActivity::class.java)
//            startActivity(intent)
        }
        binding.testWesternIv.setOnClickListener {
            Toast.makeText(this,"현재 준비중인 기능입니다.",Toast.LENGTH_SHORT).show()
//            val intent = Intent(applicationContext,QuestionActivity::class.java)
//            startActivity(intent)
        }





    }



}