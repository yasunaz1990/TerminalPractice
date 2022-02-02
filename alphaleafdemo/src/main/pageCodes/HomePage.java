package pages;

import org.openqa.selenium.By;

import static utils.TestListener._log;
import static utils.UiActions.*;
import static utils.Logs.*;


public class HomePage {
    // -- Fields
    private final String url = "https://ailab.acr.org/";
    private final By enter_btn = By.xpath("//div[@id='div_slideshow']//button");
    private final By page_banner = By.xpath("(//h1)[1]");
    private final By tab_create = By.xpath("//li/a/span[text()='Create']");
    private final By create_page_banner = By.xpath("//h5[text()='Define Problem']");
    private final By tab_evaluate = By.xpath("//li/a/span[text()='Evaluate']");
    private final By tab_run = By.xpath("//li/a/span[text()='Run']");
    private final By welcome_txt = By.xpath("//div[contains(text(), 'The ACR Data')]");
    private final By learn_txt = By.xpath("//div[contains(text(), 'Learn how AI')]");
    private final By fd_txt = By.xpath("//p[contains(text(), 'Beginning in')]");
    private final By oph_txt = By.xpath("//p[contains(text(), 'In a cutting')]");
    private final By menu_bar = By.xpath("//div[@class='site-menubar']//span");

    // -- Methods
    public void open() {
        _logpage("HOME");
        gotoSite(url);
        highlight(enter_btn);
        pause();
        click(enter_btn);
        isVisible(page_banner);
        pause();
        litBackground(page_banner);
        _log("User is on Ailab home page");
    }

    public void visitCreate() {
        click(tab_create);
        pause();
        isVisible(create_page_banner);
        _log("User is on Ailab create page");
    }

    public void visitEvaluate() {
        click(tab_evaluate);
        _log("User is on Ailab evaluate page");
    }

    public void visitRun() {
        click(tab_run);
        _log("User is on Ailab run page");
    }

    public void verifyHomePage() {
        _log("About to verify each sections in home page...");
        litBackground(welcome_txt);
        litBackground(fd_txt);
        pause();
        scrollToView(oph_txt);
        litBackground(oph_txt);
        pause();
        litBackground(learn_txt);
        pause();
        multiHighlightYellow(menu_bar);
    }
}
