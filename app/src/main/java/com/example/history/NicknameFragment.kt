package com.example.history

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.history.databinding.FragmentNicknameBinding

class NicknameFragment : Fragment() {
    lateinit var SignUpActivity : LoginActivity
    lateinit var binding: FragmentNicknameBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNicknameBinding.inflate(inflater, container, false)
        var SignUpActivity = LoginActivity()
        binding.signupNicknameEt.onFocusChangeListener = View.OnFocusChangeListener{ p0, p1 ->
            if(p1){

            } else {
                hideKeyboard(binding.signupNicknameEt)
            }

        }
        binding.signupNicknameNextBtn.setOnClickListener {
            if (binding.signupNicknameEt.text.toString().isEmpty()) {
                binding.signupNicknameWarningIv.visibility = View.VISIBLE
                binding.signupNicknameWarningTv.visibility = View.VISIBLE
            }
            else {
                (context as SignUpActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.signup_frm, IdFragment())
                .commitAllowingStateLoss()
            }
        }
        return binding.root
    }
    private fun hideKeyboard(editText: EditText){
        (requireActivity().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).apply {
            hideSoftInputFromWindow(editText.windowToken, 0)
        }
    }
}