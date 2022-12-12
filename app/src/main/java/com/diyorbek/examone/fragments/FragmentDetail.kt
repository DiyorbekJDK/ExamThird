package com.diyorbek.examone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.diyorbek.examone.R
import com.diyorbek.examone.databinding.FragmentDetailBinding
import com.diyorbek.examone.model.Planet

class FragmentDetail : Fragment(R.layout.fragment_detail) {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!
    private var planet: Planet? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        planet = arguments?.getParcelable("planet")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetailBinding.bind(view)
        skf()
    }

    private fun skf() {
        planet?.let { p ->
            binding.imageView.setImageResource(p.img)
            binding.textView.text = p.name
        }
    }

}