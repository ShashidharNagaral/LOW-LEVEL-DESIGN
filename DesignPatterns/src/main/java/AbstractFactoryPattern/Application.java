package AbstractFactoryPattern;

public abstract class Application {
    protected UI ui;
    protected Button button;
    protected Checkbox checkbox;
    protected DropDown dropDown;
    protected InputBox inputBox;

    public Application(UI ui) {
        this.ui = ui;
    }

    protected abstract void renderApplication();
}
