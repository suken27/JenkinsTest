package jenkinstest;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempApi {

    public static final String TEMP_FILE_PATH = "/sys/class/thermal/thermal_zone0/temp";

    public TempApi() {
        super();
    }
    
    @GetMapping("/temp")
    public float temp() {
        File tempFile = new FileSystemResource(TEMP_FILE_PATH).getFile();
        float currentTemp;
        try {
            byte[] tempBytes = Files.readAllBytes(tempFile.toPath());
            ByteBuffer byteBuffer = ByteBuffer.wrap(tempBytes);
            int unformattedTemp = byteBuffer.getInt();
            currentTemp = unformattedTemp / 1000F;
        } catch (IOException e) {
            currentTemp = -1;
        }
        return currentTemp;
    }

}
