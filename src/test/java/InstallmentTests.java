import constants.DataHelper;
import constants.Groups;
import io.restassured.response.Response;
import model.installment.ResponseDTO;
import model.installment.DataDTO;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import services.BaseServiceTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class InstallmentTests extends BaseServiceTest {

    @Test( priority = 1 , description = "shouldn't return any installment option" , dataProvider = "firstInstallmentGroup", dataProviderClass = DataHelper.class)
    public void getInstallmentForZero(Groups groups){

        DataDTO responseDTO = installmentApiService.getInstallments(
            groups.getInstallment()).as(ResponseDTO.class).getProducts();

        Assertions.assertThat(responseDTO.getProducts()).isIn("gr1700" , "y" , "{\n" +
                "\t\t\t\t\t\"current\": 49.99,\n" +
                "\t\t\t\t\t\"total\": 49.99,\n" +
                "\t\t\t\t\t\"currency\": \"TL\",\n" +
                "\t\t\t\t\t\"currencyCode\": \"TRY\"\n" +
                "\t\t\t\t}" , false , " " , 2 , "gr1700" , "Ücretsiz Teslimat");

        assertThat("shouldn't return any installment" ,
                responseDTO.getProducts(), is(Matchers.equalTo(false)));

    }

    @Test(priority = 2 , description = "should return installment option" , dataProviderClass = DataHelper.class , dataProvider = "secondInstallmentGroup")
    public void getInstallmentForOne(Groups groups){

        DataDTO responseDTO = installmentApiService.getInstallments(
                groups.getInstallment()).as(ResponseDTO.class).getProducts();


        Assertions.assertThat(responseDTO.getProducts()).isIn("at773" , "y" , "{\n" +
                "\t\t\t\t\t\"current\": 79.99,\n" +
                "\t\t\t\t\t\"total\": 79.99,\n" +
                "\t\t\t\t\t\"currency\": \"TL\",\n" +
                "\t\t\t\t\t\"currencyCode\": \"TRY\"\n" +
                "\t\t\t\t}" , true , " " , 1 , "at773" , "Ücretsiz Teslimat");
    }

    @Test(priority = 3 , description = "should return installment option" , dataProviderClass = DataHelper.class , dataProvider = "secondInstallmentGroup")
    public void getInstallmentForNull(Groups groups){

        DataDTO responseDTO = installmentApiService.getInstallments(
                groups.getInstallment()).as(ResponseDTO.class).getProducts();

        Assertions.assertThat(responseDTO.getProducts()).isIn("gr1700" , "y" , "{\n" +
                "\t\t\t\t\t\"current\": 49.99,\n" +
                "\t\t\t\t\t\"total\": 49.99,\n" +
                "\t\t\t\t\t\"currency\": \"TL\",\n" +
                "\t\t\t\t\t\"currencyCode\": \"TRY\"\n" +
                "\t\t\t\t}" , false , " " , 2 , "gr1700-1" , "Ücretsiz Teslimat");
    }
}
