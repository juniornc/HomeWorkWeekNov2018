import baseTest.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankOfAmerica extends BaseTest {


    @BeforeMethod
    public  void  openBankOfAmericaPage(){
        driver().get("http://BankOfAmerica.com");
    }

    @Test
    public void  testAccountBalance(String username,String password,String account,String expectedBalance){






    }





}
