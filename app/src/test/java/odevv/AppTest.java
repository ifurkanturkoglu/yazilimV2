/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package odevv;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test 
    public void sliderCountCalculated(){
        String[] images = {"sa","s","sda","dsad","dsa"};
        ArrayList<String> sliderItems = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };
        
        int baslangic = 0;
        int son = 4;
        int sliderCount = 3;
        assertTrue(App.sliderCountCal(sliderItems, images,baslangic, son, sliderCount));
    }
    // @Test
    // public void imageArrayNull(){
    //     String[] image = {};
    //     ArrayList<String> sliderItems = new ArrayList<String>() {
    //         {
    //             add("Geeks");
    //             add("for");
    //             add("Geeks");
    //         }
    //     };
    //     int baslangic = 0;
    //     int son = 4;
    //     int sliderCount = 3;
    //     assertFalse(App.sliderCountCal(sliderItems, image, baslangic, son, sliderCount));
    // }
    // @Test
    // public void sliderItemArrayLenghtZero(){
    //     String[] image = {"s","s"};
    //     ArrayList<String> sliderItems = new ArrayList<String>() {
    //         {
    //             add("Geeks");
    //             add("for");
    //             add("Geeks");
    //         }
    //     };
    //     int baslangic = 0;
    //     int son = 0;
    //     int sliderCount = 3;
    //     assertFalse(App.sliderCountCal(sliderItems, image,baslangic, son, sliderCount));
    // }
    // @Test
    // public void sliderCountLengthZero(){
    //     String[] b = {"s"};
    //     String[] a = {};
    //     int baslangic = 0;
    //     int son = 4;
    //     int sliderCount = 0;
    //     assertFalse(App.sliderCountCal(a, b,baslangic, son, sliderCount));
    // }
    // @Test
    // public void sliderNull(){
    //     String[] b = {};
    //     String[] a = {};
    //     int baslangic = 0;
    //     int son = 0;
    //     int sliderCount = 3;
    //     assertFalse(App.sliderCountCal(a, b,baslangic, son, sliderCount));
    // }
}