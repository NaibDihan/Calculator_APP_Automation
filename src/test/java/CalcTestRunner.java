import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    @Test(priority = 1, description = "Calculating the series")
    public void doSeries(){
        CalcScreen calcScreen = new CalcScreen(driver);
        String result = calcScreen.doSeries("100/10*5-10+60");
        Assert.assertTrue(result.contains("100"));

    }
}
