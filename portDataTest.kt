import java.net.Socket
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.EOFException
import java.io.IOException


// This is a simple Kotlin client that connects to a server running on a Raspberry Pi
fun porter() {
    val port = 5000
    val ip = "YOUR_RASPBERRY_PI_IP_ADDRESS" // Replace with the actual IP address

    try {
        val socket = Socket(ip, port)

        socket.use { // Ensure the socket is closed when done
            val input = DataInputStream(socket.getInputStream())
            val output = DataOutputStream(socket.getOutputStream())

            var data = ""

            while (true) { // Use a boolean flag to control the loop
                try {
                    data = input.readUTF()
                    println(data)
                } catch (e: EOFException) {
                    println("EOFException: ${e.message}")
                    break // Break the loop when EOF is encountered
                }
            }
        }
    } catch (e: IOException) {
        println("IOException: ${e.message}")
    }
}


//Main function that calls the porter function
fun main() {
    porter()
}
