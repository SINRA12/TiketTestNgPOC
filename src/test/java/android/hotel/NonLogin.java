package android.hotel;

import org.testng.annotations.Test;


@Test(groups = {"Login2"})
public class NonLogin {

    @Test(groups = { "regression" })
    public  void NonLogin1() {
        System.out.println("Hotel NonLogin1");
    }

    @Test(groups = { "regression" })
    public  void NonLogin2() {
        System.out.println("Hotel NonLogin2");

    }

    @Test(groups = { "regression" ,"preProd"})
    public  void NonLogin3() {
        System.out.println("Hotel NonLogin3");

    }


    @Test(groups = { "regression" })
    public  void NonLogin4() {
        System.out.println("Hotel NonLogin4");

    }


    @Test(groups = { "regression" })
    public  void NonLogin5() {
        System.out.println("Hotel NonLogin5");

    }
}
