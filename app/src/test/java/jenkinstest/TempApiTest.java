package jenkinstest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.FileSystemResource;

public class TempApiTest {
    
    @Test void tempTest() {
        FileSystemResource file = new FileSystemResource(TempApi.TEMP_FILE_PATH);
        assertTrue(file.exists());
    }

}
