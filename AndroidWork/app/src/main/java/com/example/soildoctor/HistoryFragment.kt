package com.example.soildoctor
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class HistoryFragment : Fragment() {

    private lateinit var textMoisture: TextView
    private lateinit var textTemperature: TextView
    private lateinit var textPH: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_history, container, false)

        textMoisture = view.findViewById(R.id.textMoisture)
        textTemperature = view.findViewById(R.id.textTemperature)
        textPH = view.findViewById(R.id.textPH)

        val btnMoisture = view.findViewById<Button>(R.id.btnMoisture)
        val btnTemperature = view.findViewById<Button>(R.id.btnTemperature)
        val btnPH = view.findViewById<Button>(R.id.btnPH)

        btnMoisture.setOnClickListener {
            // Simulate getting moisture data (replace "N/A" with actual data)
            textMoisture.text = "Moisture: 50%" // Replace with actual data
        }

        btnTemperature.setOnClickListener {
            // Simulate getting temperature data (replace "N/A" with actual data)
            textTemperature.text = "Temperature: 25°C" // Replace with actual data
        }

        btnPH.setOnClickListener {
            // Simulate getting pH data (replace "N/A" with actual data)
            textPH.text = "pH: 7.0" // Replace with actual data
        }

        return view
    }
}
