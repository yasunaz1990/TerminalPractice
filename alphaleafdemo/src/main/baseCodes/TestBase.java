package base;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.DriverUtil;

public class TestBase {

    private PageManagement pages;

    public PageManagement at() {
        pages = (pages == null) ? pages = new PageManagement() : pages;
        return pages;
    }

    @BeforeTest
    public void setUp() {
        DriverUtil.openBrowser();
    }

    @BeforeMethod
    public void refresh() {
        DriverUtil.deleteSession();
    }

    @AfterTest
    public void clean() {
        DriverUtil.closeBrowser();
    }
}