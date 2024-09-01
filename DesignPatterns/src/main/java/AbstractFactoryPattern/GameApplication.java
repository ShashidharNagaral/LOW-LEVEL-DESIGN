package AbstractFactoryPattern;

public class GameApplication extends Application{
    public GameApplication(UI ui) {
        super(ui);
    }

    @Override
    protected void renderApplication() {
        checkbox = ui.renderCheckbox();
        dropDown = ui.renderDropDown();
        checkbox.render();
        dropDown.render();
        System.out.println("rendering complete");
    }
}
