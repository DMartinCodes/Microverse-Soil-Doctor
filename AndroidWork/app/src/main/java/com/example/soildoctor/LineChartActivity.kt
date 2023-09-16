import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet

class LineChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_line_chart)

        // Initialize the LineChart view
        val lineChart = findViewById<LineChart>(R.id.lineChart)

        // Create a list of Entry objects to hold your data points
        val entries = ArrayList<Entry>()
        entries.add(Entry(1f, 100f)) // X-axis value and Y-axis value
        entries.add(Entry(2f, 150f))
        entries.add(Entry(3f, 80f))
        // Add more entries as needed...

        // Create a LineDataSet to hold your data and customize its appearance
        val dataSet = LineDataSet(entries, "Sample Data")
        dataSet.color = Color.BLUE
        dataSet.valueTextColor = Color.RED
        dataSet.lineWidth = 2f
        dataSet.setCircleColor(Color.GREEN)
        dataSet.circleRadius = 4f

        // Create an ArrayList of LineDataSet (you can add multiple datasets if needed)
        val dataSets: ArrayList<ILineDataSet> = ArrayList()
        dataSets.add(dataSet)

        // Create a LineData object from the LineDataSet(s)
        val lineData = LineData(dataSets)

        // Set data to the LineChart
        lineChart.data = lineData

        // Customize the appearance and behavior of the LineChart as needed
        lineChart.description.text = "Sample Line Chart"
        lineChart.xAxis.labelCount = entries.size
        lineChart.invalidate() // Refresh the chart
    }
}