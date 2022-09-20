package singleTonDesignPattern.myPages;

public class calender {
    public void calenderSettings() {
        settings obj = settings.createInstance();
        obj.setTheme("blueLight theme");
        obj.language = "pashto";
        System.out.println("calender:" + obj.language + obj.theme);
    }
}
