package AbstractFactoryPattern;

import AbstractFactoryPattern.ApplicationUI.LinuxUI;
import AbstractFactoryPattern.ApplicationUI.MacUI;
import AbstractFactoryPattern.ApplicationUI.WindowsUI;

public class Main {
    public static void main(String[] args) {
        /*
           NOTE:
           Application is an abstract factory for concrete factory
           UI is an abstract factory for concrete classes
         */
        UI ui = new LinuxUI();
        Application application = new GameApplication(ui);
        application.renderApplication();

        ui = new MacUI();
        application = new GameApplication(ui);
        application.renderApplication();

        application = new PaintApplication(new WindowsUI());
        application.renderApplication();
    }
}
