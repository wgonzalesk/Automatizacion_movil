package support;

import definitions.Hooks;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class evidencias {

    public static void captura() throws IOException {
        String ruta="D:\\ALP - Agile Learning Perú\\Consultorias\\mobile\\target\\cucumber-reports\\"+Math.random()*6+"captura_pantalla.jpg";
        File scrFile = ((TakesScreenshot) Hooks.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(ruta));
    }
}
