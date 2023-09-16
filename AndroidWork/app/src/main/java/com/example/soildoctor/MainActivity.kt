import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.ServerSocket

class MainActivity : AppCompatActivity() {

    private val port = 12345 // Choose a port number
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Thread {
            try {
                val serverSocket = ServerSocket(port)
                val socket = serverSocket.accept()
                val input = BufferedReader(InputStreamReader(socket.getInputStream()))

                while (true) {
                    val data = input.readLine() // Read data from Raspberry Pi
                    handler.post {
                        // Update UI with the received data
                        textView.text = "Received Data: $data"
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }
}
