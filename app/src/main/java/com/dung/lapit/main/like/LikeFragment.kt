package com.example.dung.applabit.main.like


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dung.lapit.R

class LikeFragment : Fragment() {

    companion object {
        val newFragment = LikeFragment()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_like, container, false)
    }

    private fun init() {
//        var count = 0
//        val runnable = Runnable {
//
//
//            while (true){
//                count++
//                Log.d("a", "LikeFragment" + count.toString())
//
//            }
//
//            Thread.sleep(1000)
//
//        }
//        val thread = Thread(runnable)
//        thread.start()
    }

}
