import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public WebDriver driver;

    @FindBy(xpath = "//h2")
    WebElement mainHeading;
    @FindBy(id = "usr")
    WebElement firstNameField;
    @FindBy(id = "usr2")
    WebElement lastNameField;
    @FindBy(id = "pwd")
    WebElement passwordField;
    @FindBy(id = "sel1")
    WebElement jobTitleDropdownElement;
    @FindBy(id = "sel2")
    WebElement programmingLanguageDropdownElement;
    @FindBy(xpath = "//button[text()='Register']")
    WebElement registerButton;
    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement cancelButton;


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getMainHeadingText() {
        return mainHeading.getText();
    }

    public void enterFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void selectJobTitle(String jobTitle) {
        Select jobTitleDropdown = new Select(jobTitleDropdownElement);
        jobTitleDropdown.selectByVisibleText(jobTitle);
    }

    public void selectProgrammingLanguage(String language) {
        Select selectProgrammingLanguageDropdown = new Select(programmingLanguageDropdownElement);
        selectProgrammingLanguageDropdown.selectByVisibleText(language);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickCancelButton() {
        cancelButton.click();
    }

    public void enterAllFieldsAndRegister(String firstName,
                                          String lastName,
                                          String password,
                                          String jobTitle,
                                          String programmingLanguage) {
        this.enterFirstName(firstName);
        this.enterLastName(lastName);
        this.enterPassword(password);
        this.selectJobTitle(jobTitle);
        this.selectProgrammingLanguage(programmingLanguage);
        this.clickRegisterButton();
    }
}
