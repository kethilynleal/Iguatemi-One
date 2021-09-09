package paginas;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static org.testng.Assert.assertEquals;
import static java.time.Duration.ofMillis;

public class Metodos {

    public static AndroidDriver driver;

    /**
     * Abrir Aplicativo
     *
     * @author Phelipe S Miranda
     *
     */
    public void abrirAplicativo(String platformVersion, String appPackage, String appActivity, String descricaoPasso) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", platformVersion);
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("appPackage", appPackage);
        desiredCapabilities.setCapability("appActivity", appActivity);
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteUrl, desiredCapabilities);

    }

    /**
     * Capturar Tela Logins
     *
     * @author Phelipe S Miranda
     *
     */
    public void capturarTelaLogins(String nomePrint) throws IOException {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./target/Evidencias/Logins/" + nomePrint + ".png"));
    }

    /**
     * Capturar Tela de Erros
     *
     * @author Phelipe S Miranda
     *
     */
    public void capturarTelaErros(String nomePrint) throws IOException {

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./target/Evidencias/Erros/" + nomePrint + ".png"));
    }

    /**
     * Toque
     *
     * @author Phelipe S Miranda
     *
     */
    public void toque(By elemento, String descricaoPasso) throws IOException {
        try {
            driver.findElement(elemento).click();
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Toque e Desliza
     *
     * @author Phelipe S Miranda
     *
     */
    public void toqueDesliza(int xEntrada, int yEntrada, int xSaida, int ySaida, String descricaoPasso) throws IOException {
        try {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(xEntrada,yEntrada));
            action.waitAction(waitOptions(ofMillis(800)));
            action.moveTo(PointOption.point(xSaida,ySaida));
            action.release();
            action.perform();
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Clique por Coordenada
     *
     * @author Phelipe S Miranda
     *
     */
    public void cliqueCoordenada(int xCoord, int yCoord, String descricaoPasso) throws IOException {
        try {
            TouchAction action = new TouchAction(driver);
            action.tap(PointOption.point(xCoord,yCoord));
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Pausa
     *
     * @author Phelipe S Miranda
     *
     */
    public void pausa(int tempo, String descricaoPasso) throws InterruptedException, IOException {
        try {
            Thread.sleep(tempo);
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Validar Texto
     *
     * @author Phelipe S Miranda
     *
     */
    public void validarTexto(By elemento, String texto, String descricaoPasso) throws IOException {
        try {
            String msg = driver.findElement(elemento).getText();
            assertEquals(texto, msg);
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Pressionar tecla Seta Direita
     *
     * @author Phelipe S Miranda
     *
     */
    public void teclaSetaDireita(String descricaoPasso) throws IOException {

        try {
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ARROW_RIGHT).perform();
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Limpar texto
     *
     * @author Phelipe S Miranda
     *
     */
    public void limparTexto(By elemento, String descricaoPasso) throws IOException {

        try {
            driver.findElement(elemento).clear();

        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Escrever
     *
     * @author Phelipe S Miranda
     *
     */
    public void escrever(By elemento, String texto, String descricaoPasso) throws IOException {
        try {
            driver.findElement(elemento).sendKeys(texto);
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Esperar Elemento Presente na Tela
     *
     * @author Phelipe S Miranda
     *
     */

    public void esperarElemento(By elemento, String descricaoPasso) throws IOException {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

    /**
     * Fechar Aplicativo
     *
     * @author Phelipe S Miranda
     *
     */
    public void fecharAplicativo(String descricaoPasso) throws IOException {
        try {
            driver.quit();
        } catch (Exception e) {
            capturarTelaErros("Erro_ao-tentar_" + descricaoPasso);
            Assert.fail(LocalDateTime.now() + "Erro_ao-tentar_" + descricaoPasso);
        }
    }

}