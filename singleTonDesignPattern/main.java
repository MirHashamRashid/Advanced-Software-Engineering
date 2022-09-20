package singleTonDesignPattern;

import singleTonDesignPattern.myPages.calender;
import singleTonDesignPattern.myPages.homePage;
import singleTonDesignPattern.myPages.settings;

public class main {
    public static void main(String[] args) {
        // in homepage we change the settings and displaying
        homePage hp = new homePage();
        hp.homeSettings();
        // settings changed again in calender
        calender cal = new calender();
        cal.calenderSettings();

        // and here is the theme in the settings class
        settings obj = settings.createInstance();
        System.out.println(obj.getTheme());
    }
}
