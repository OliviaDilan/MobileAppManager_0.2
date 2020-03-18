package ru.rache.calendartemplate.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ru.rache.calendartemplate.R
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar



class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        //
        val collapsibleCalendar: CollapsibleCalendar = root.findViewById(R.id.calendarView)
        collapsibleCalendar.setCalendarListener(object : CollapsibleCalendar.CalendarListener {
            override fun onClickListener() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDayChanged() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDaySelect() {
//                val day = viewCalendar.getSelectedDay()
//                Log.i(
//                    javaClass.name, "Selected Day: "
//                            + day.getYear() + "/" + (day.getMonth() + 1) + "/" + day.getDay()
//                )
            }

            override fun onItemClick(view: View) {

            }

            override fun onDataUpdate() {

            }

            override fun onMonthChange() {

            }

            override fun onWeekChange(i: Int) {

            }
        })
        //
        return root
    }
}