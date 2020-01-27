package constants;

import org.testng.annotations.DataProvider;

import static constants.Groups.*;

public class DataHelper {

    @DataProvider(name = "firstInstallmentGroup")
    public Object[][] getGroupOne() {
        return new Object[][]{
                {no_installment}
        };
    }

    @DataProvider(name = "secondInstallmentGroup")
    public Object[][] getGroupSecond() {
        return new Object[][]{
                {single_installment}
        };
    }

    @DataProvider(name = "thirdInstallmentGroup")
    public Object[][] getGroupThird() {
        return new Object[][]{
                {wrong_installment}
        };
    }
}
