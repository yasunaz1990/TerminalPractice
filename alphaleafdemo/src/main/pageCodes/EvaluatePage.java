package pages;

import org.openqa.selenium.By;

import static utils.TestListener._log;
import static utils.TestListener.step;
import static utils.UiActions.*;
import static utils.Logs.*;

public class EvaluatePage {

    // --- Elemetns
    private final By usecase_dropdown = By.cssSelector("select#useCases");
    private final By breast_density = By.xpath("//select[@id='useCases']//option[@value='16']");
    private final By validation_dataset = By.cssSelector("#useCaseSelect");
    private final By site_a = By.xpath("//option[ contains(@value, 'Site A') ]");
    private final By company_1 = By.xpath("(//tr/td//span)[1]");
    private final By company_2 = By.xpath("(//tr/td//span)[2]");
    private final By company_3 = By.xpath("(//tr/td//span)[3]");
    private final By company_4 = By.xpath("(//tr/td//span)[4]");
    private final By evaluate_button = By.xpath("//button[text()='Evaluate Models']");
    private final By confusion_matrix_1 = By.cssSelector("div#matrix3");


    // --- Methods
    public void validateBreasetDensityModel() {
        _logpage("EVALUATE");
        _log("User has initiated Breast Density model evaluation...");
        click(usecase_dropdown);
        click(breast_density);
        click(validation_dataset);
        click(site_a);
        _log("Selecting the validated datasets");
        click(company_1);
        click(company_2);
        click(company_3);
        click(company_4);
        click(evaluate_button);
        _log("Evaluation is in progress...");
    }

    public boolean verifyValidationResult() {
        pause(1);
        _log("Verifying the evaluation result...");
        return isVisible(confusion_matrix_1);
    }

}
