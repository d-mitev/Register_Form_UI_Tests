package SeleniumTests;

import Enums.JobTitlesEnum;
import Enums.ProgrammingLanguageEnum;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest{

    @Test
    public void verifySuccessfulRegistration() {

        driver.get(fileUnderTest);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterAllFieldsAndRegister("Ivan",
                                                    "Ivanov",
                                                    "123456",
                                                    JobTitlesEnum.AUTOMATIONQA.getJobTitle(),
                                                    ProgrammingLanguageEnum.JAVA.getLanguageName());

        //TODO: add an assertion after the rest of the pages are implemented

    }

}
