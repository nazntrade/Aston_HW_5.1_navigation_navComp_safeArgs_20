package com.becker.aston_hw_5_1_navigation_navcomp_safeArgs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.becker.aston_hw_5_1_navigation_navcomp_safeArgs.databinding.FragmentCBinding

class FragmentC : Fragment() {

    private val args: FragmentCArgs by navArgs()
    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            textFromB.text = args.someMessage
            buttonBack.setOnClickListener {
                findNavController().popBackStack()
            }
            buttonCtoD.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentC_to_fragmentD)
            }
        }
    }
}