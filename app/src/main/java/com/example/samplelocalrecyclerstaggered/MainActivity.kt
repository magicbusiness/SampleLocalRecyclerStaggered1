package com.example.samplelocalrecyclerstaggered

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.samplelocalrecyclerstaggered.`object`.SampleObject
import com.example.samplelocalrecyclerstaggered.adapter.SampleAdapter
import com.example.samplelocalrecyclerstaggered.databinding.ActivityMainBinding
import com.example.samplelocalrecyclerstaggered.modal.Sheets
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    //
    private lateinit var binding: ActivityMainBinding

    //
    private var listSheets: ArrayList<Sheets> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
        listSheets.addAll(SampleObject.dataList)

        //
        showStaggeredRecycler()
    }

    private fun showStaggeredRecycler()
    {
        sample_recycler.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        sample_recycler.adapter = SampleAdapter(listSheets)
    }
}