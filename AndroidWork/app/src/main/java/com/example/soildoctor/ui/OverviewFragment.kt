package com.example.soildoctor.ui
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView
import com.example.soildoctor.R

class OverviewFragment : Fragment() {

    private lateinit var textMoisture: TextView
    private lateinit var textTemperature: TextView
    private lateinit var textPH: TextView

    // Add more TextViews for other sensor data as needed

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.sensor_frag, container, false)

        textMoisture = view.findViewById(R.id.textMoisture)
        textTemperature = view.findViewById(R.id.textTemperature)
        textPH = view.findViewById(R.id.textPH)

        // Initialize and update sensor data here (replace "N/A" with actual data)

        return view
    }
}
