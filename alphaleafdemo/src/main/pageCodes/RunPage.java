package pages;


import org.openqa.selenium.By;

import static utils.TestListener.*;
import static utils.UiActions.*;
import static utils.Logs.*;

public class RunPage {

    private final By usecase_dorpdown = By.cssSelector("select#useCases");
    private final By macular_disease_detection = By.xpath("//select[@id='useCases']//option[@value='25']");
    private final By image_prediction_title = By.xpath("//h5[text()='Image Prediction']");
    private final By sample_img = By.xpath("(//div[@id='imageList']//img)[2]");
    private final By run_prediction_button = By.cssSelector("#btnPredictionModelDesktop");
    private final By img_prediction_result = By.cssSelector("#btnImagePredictionDisplay");


    public void runMacularDiseaseDetectionInference() {
        _logpage("RUN");
        click(usecase_dorpdown);
        click(macular_disease_detection);
        pause();
        _log("User is initiating Macular Disease Detection inference");
        isVisible(image_prediction_title);
        click(sample_img);
        pause();
        click(run_prediction_button);
        _log("Running the inference...");
    }

    public boolean verifyInferenceResult() {
        _log("Verifying the inference results...");
        pause(1);
        boolean result = isVisible(img_prediction_result);
        return result;
    }
}
