package com.becker.aston_hw_5_1_navigation_navcomp_safeArgs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.becker.aston_hw_5_1_navigation_navcomp_safeArgs.databinding.FragmentBBinding


class FragmentB : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            buttonBtoC.setOnClickListener {
                val action = FragmentBDirections.actionFragmentBToFragmentC("Hello Fragment C")
                findNavController().navigate(action)
            }

            buttonBack.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
}