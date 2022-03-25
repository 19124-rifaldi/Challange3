package com.binar.challenge3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.binar.challenge3.databinding.FragmentFirstBinding
import com.binar.challenge3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding : FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding = FragmentSecondBinding.bind(view)

        binding.button2.setOnClickListener{

            val name = binding.getNameEditText.text.toString().trim()
            val person1 = Person(
                name= name,
                age = 0,
                address = "",
                job = ""
            )
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment2(person1))
            Log.d("test",person1.toString())
        }

    }

}