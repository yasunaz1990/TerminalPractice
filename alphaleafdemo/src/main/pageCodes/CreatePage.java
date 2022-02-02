package pages;

import org.openqa.selenium.By;
import static utils.UiActions.*;
import static utils.Logs.*;

public class CreatePage {

    private final By use_case = By.cssSelector("select#useCases");
    private final By breast_density = By.cssSelector("option[value='16']");
    private final By training_data = By.cssSelector("#datapercentage");
    private final By mammo_img_10000 = By.cssSelector("select#datapercentage > option[value='1000']");
    private final By augmentation = By.cssSelector("#augmentation");
    private final By random_flip = By.cssSelector("#augmentation [value='true']");
    private final By start_processing = By.cssSelector("#btnStartProcessing");
    private final By configure_model_title = By.xpath("//h5[text()='Configure Model']");
    private final By architecture = By.cssSelector("select#architecture");
    private final By resnet_option = By.cssSelector("[value='resnet']");
    private final By sampling_method = By.cssSelector("#equalsampling");
    private final By equal_class_ratio = By.cssSelector("#equalsampling [value='true']");
    private final By loss_function = By.cssSelector("#lossfunction");
    private final By categorical_crossentropy = By.cssSelector("[value='categorical-crossentropy']");
    private final By pre_training = By.cssSelector("#pretraining");
    private final By pre_training_weights = By.cssSelector("#pretraining [value='true']");
    private final By early_stopping = By.cssSelector("select#earlystopping");
    private final By early_stopping_true = By.cssSelector("#earlystopping [value='true']");
    private final By train_test = By.cssSelector("button#btnTrainAndTest");
    private final By accuracy_overview_title = By.xpath("//div[text()='Accuracy Overview']");
    private final By loss_overview_title = By.xpath("//div[text()='Loss Overview']");
    private final By performance_testing_title = By.xpath("//div[text()='Performance Testing']");
    private final By prediction_title = By.xpath("//div[text()='Predictions']");
    private final By prediction_text = By.xpath("//div[@id='app']//div[contains(text(), 'Data Sampling')]");
    private final By run_prediction_btn = By.xpath("//button[text()='Run Prediction']");
    private final By prediction_results = By.xpath("//div[@id='divtrain_sivc11']//span");


    public void prepareBreastDensityModel() {
        _logpage("CREATE");
        click(use_case);
        click(breast_density);
        click(training_data);
        pause();
        click(mammo_img_10000);
        click(augmentation);
        pause();
        click(random_flip);
        click(start_processing);
        pause();
        isVisible(configure_model_title);
    }

    public void configureBreastDensityModel() {
        click(architecture);
        click(resnet_option);
        pause();
        click(sampling_method);
        click(equal_class_ratio);
        pause();
        click(loss_function);
        click(categorical_crossentropy);
        click(pre_training);
        pause();
        click(pre_training_weights);
        click(early_stopping);
        click(early_stopping_true);
    }

    public boolean trainBreastDensityModel() {
        click(train_test);
        highlight(accuracy_overview_title);
        pause();
        highlight(loss_overview_title);
        highlight(performance_testing_title);
        pause();
        litBackground(prediction_text);
        pause();
        highlight(run_prediction_btn);
        click(run_prediction_btn);
        multiHighlight(prediction_results);
        return isVisible(prediction_title);
    }
}