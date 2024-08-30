import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id="com.google.android.calculator:id/digit_0")
    WebElement btn0;

    @FindBy(id="com.google.android.calculator:id/digit_1")
    WebElement btn1;

    @FindBy(id="com.google.android.calculator:id/digit_2")
    WebElement btn2;

    @FindBy(id="com.google.android.calculator:id/digit_3")
    WebElement btn3;
    @FindBy(id="com.google.android.calculator:id/digit_4")
    WebElement btn4;
    @FindBy(id="com.google.android.calculator:id/digit_5")
    WebElement btn5;
    @FindBy(id="com.google.android.calculator:id/digit_6")
    WebElement btn6;
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;

    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnSub;

    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;

    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;

    AndroidDriver driver;
    public CalcScreen(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSeries(String series) {
        for (char c : series.toCharArray()) {
            if (c == '0') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
            } else if (c == '1') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
            } else if (c == '2') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
            } else if (c == '3') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
            } else if (c == '4') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
            } else if (c == '5') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
            } else if (c == '6') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
            } else if (c == '7') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
            } else if (c == '8') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
            } else if (c == '9') {
                driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
            } else if (c == '+') {
                driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
            } else if (c == '-') {
                driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
            } else if (c == '*') {
                driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
            } else if (c == '/') {
                driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
            } else {
                System.out.println("Invalid character: " + c);
            }
        }


        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        String result = driver.findElement(By.id("com.google.android.calculator:id/result_final")).getText();
        return result;
    }
}
