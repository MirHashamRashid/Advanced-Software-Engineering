package singleTonDesignPattern.myPages;

public class settings {
    // here we initialized our varibles
    static settings obj = null;
    public String theme = "Dark theme";
    public String language;

    // here I defined the constructor to private:
    private settings() {

    }

    // this function which is a type of our class makes one object which then we can
    // use it anywhere!
    public static settings createInstance() {
        if (obj == null) {
            obj = new settings();
        }
        return obj;
    }

    // this method sets the value of theme
    public void setTheme(String theme) {

        this.theme = theme;
    }

    // and this method returns the value of theme.
    public String getTheme() {
        return theme;
    }
}
