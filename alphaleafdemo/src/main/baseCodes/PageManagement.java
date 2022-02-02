package base;

import pages.CreatePage;
import pages.EvaluatePage;
import pages.HomePage;
import pages.RunPage;

public class PageManagement {

    // ---- Fields
    private HomePage home;
    private CreatePage create;
    private EvaluatePage evaluate;
    private RunPage run;


    // ---- Methods
    public HomePage homePage() {
        home = (home == null) ? new HomePage() : home;
        return home;
    }

    public CreatePage createPage() {
        create = (create == null) ? new CreatePage() : create;
        return create;
    }

    public EvaluatePage evaluatePage() {
        evaluate = (evaluate == null) ? new EvaluatePage() : evaluate;
        return evaluate;
    }

    public RunPage runPage() {
        run = (run == null) ? new RunPage() : run;
        return run;
    }
}
