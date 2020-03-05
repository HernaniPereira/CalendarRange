package com.abbott.slycalandarviewandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.slybeaver.slycalendarview.SlyCalendarDialog
import java.util.*

class MainActivity : AppCompatActivity(), SlyCalendarDialog.Callback{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_tv.setOnClickListener {
            SlyCalendarDialog()
                .setSingle(false)
                .setFirstMonday(false)
                .setCallback(this@MainActivity)
                .show(supportFragmentManager, "TAG_SLYCALENDAR")
        }
    }



    override fun onDataSelected(
        firstDate: Calendar?,
        secondDate: Calendar?,
        hours: Int,
        minutes: Int
    ) {
    }

    override fun onCancelled() {
    }
}
