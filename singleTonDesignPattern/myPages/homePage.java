package singleTonDesignPattern.myPages;

public class homePage {
    // here we have a methode for settings
    public void homeSettings() {
        // here we use object of the class settings
        settings obj = settings.createInstance();
        // sets the theme value
        obj.setTheme("DarkTheme");
        obj.language = "Dari";
        // and here we print the theme
        System.out.println("home page themes:" + obj.getTheme() + obj.language);
    }
}
