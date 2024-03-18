import com.fazecast.jSerialComm.SerialPort;

import java.io.IOException;
import java.io.OutputStream;

public class SerialCommunicator {
    private final SerialPort serialPort;
    public SerialCommunicator(SerialPort serialPort) {
        this.serialPort = serialPort;
    }

    public void sendData(String data) {
        try (OutputStream outputStream = serialPort.getOutputStream()) {
            outputStream.write(data.getBytes());
            System.out.println("Data verzonden: " + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
