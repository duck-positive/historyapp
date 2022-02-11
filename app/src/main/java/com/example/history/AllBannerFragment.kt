package com.example.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.history.databinding.FragmentAllBannerBinding

class AllBannerFragment : Fragment() {
    lateinit var binding : FragmentAllBannerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllBannerBinding.inflate(inflater,container,false)

        return binding.root
    }
}