package com.binar.challenge3

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.binar.challenge3.databinding.FragmentFourthBinding
import com.binar.challenge3.databinding.FragmentThirdBinding


class FourthFragment : Fragment() {
    private lateinit var binding : FragmentFourthBinding
    private val arguments : FourthFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFourthBinding.bind(view)

        binding.button4.setOnClickListener{

            val person = Person(
                name = arguments.nameto4,
                age = binding.getAgeEditText.text.toString().toInt(),
                address = binding.getAddressEditText.text.toString(),
                job = binding.getJobEditText.text.toString()
            )


            findNavController().navigate(FourthFragmentDirections.actionFourthFragmentToThirdFragment(person))
            Log.d("person",person.toString())


        }
        //buat


    }
}