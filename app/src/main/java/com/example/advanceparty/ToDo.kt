package com.example.advanceparty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advanceparty.databinding.FragmentBookMarkBinding
import com.example.advanceparty.databinding.FragmentTodoBinding

class ToDo : Fragment() {
    private var _binding: FragmentTodoBinding? = null
    private val binding get() = _binding!!

    private lateinit var toDoAdapter: ToDoAdapter
    private val datas = mutableListOf<ListSetData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTodoBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {
        toDoAdapter = ToDoAdapter(requireContext())
        binding.todoListSet.adapter = toDoAdapter

        datas.apply {
            add(ListSetData( name = "ToDo"))
            add(ListSetData( name = "ToDo"))
            add(ListSetData( name = "ToDo"))
            add(ListSetData( name = "ToDo"))
            add(ListSetData( name = "ToDo"))
        }

        toDoAdapter.datas = datas
        toDoAdapter.notifyDataSetChanged()
    }
}