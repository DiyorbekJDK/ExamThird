package com.diyorbek.examone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.diyorbek.examone.R
import com.diyorbek.examone.adapter.RvAdapter
import com.diyorbek.examone.util.Constantas

class HomeFragment : Fragment(R.layout.fragment_home) {
   private val rvAdapter by lazy { RvAdapter() }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rv: RecyclerView = view.findViewById(R.id.rv)
        rv.apply {
            adapter = rvAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        rvAdapter.submitList(Constantas.list())
        rvAdapter.onClick ={
            val bundle = bundleOf("planet" to it)
            findNavController().navigate(R.id.action_nav_main_to_fragmentDetail,bundle)
        }
    }
}