package com.binar.challenge3

import android.opengl.Visibility
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.binar.challenge3.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
    private lateinit var binding : FragmentThirdBinding
    private val arguments : ThirdFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)
        //
        val name = arguments.parcel.name
        binding.setNameTextView.text = name
        //button
        binding.button3.setOnClickListener{
            val nameTo4 = name
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToFourthFragment(nameTo4))
        }
        //
        val age = arguments.parcel.age
        val ege= binding.ageTextView
        val tentuUmur = if(age==0){
            ""
        }else{
            if (age%2==0){
                "$age , Usia anda bernilai genap"
            }else{
                "$age , Usia anda bernilai ganjil"
            }
        }
        Log.d("age",age.toString())
        //
        //tampil dari 4
        binding.setNameTextView.text=arguments.parcel.name
        binding.ageTextView.text=tentuUmur.toString()
        binding.addressTextView.text = arguments.parcel.address
        binding.jobTextView.text = arguments.parcel.job


        }
    }



