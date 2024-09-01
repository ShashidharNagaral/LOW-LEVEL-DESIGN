package AbstractFactoryPattern;

public class PaintApplication extends Application{
    public PaintApplication(UI ui) {
        super(ui);
    }

    @Override
    protected void renderApplication() {
        checkbox = ui.renderCheckbox();
        dropDown = ui.renderDropDown();
        button = ui.renderButton();
        inputBox = ui.renderInputBox();

        checkbox.render();
        dropDown.render();
        button.render();
        inputBox.render();
        System.out.println("rendering completed");
    }
}
