package android.hotel;

import org.testng.annotations.Test;


@Test(groups = {"Login2"})
public class NonLoginSingleGuest {

    @Test(groups = { "regression" })
    public  void NonLoginSingleGuest1() {
        System.out.println("Hotel NonLoginSingleGuest1");

    }



    @Test(groups = { "regression","preProd" })
    public  void NonLoginSingleGuest2() {
        System.out.println("Hotel NonLoginSingleGuest2");

    }

    @Test(groups = { "regression" })
    public  void NonLoginSingleGuest3() {
        System.out.println("Hotel NonLoginSingleGuest3");

    }


    @Test(groups = { "regression" })
    public  void NonLoginSingleGuest4() {
        System.out.println("Hotel NonLoginSingleGuest4");

    }


    @Test(groups = { "regression" ,"preProd"})
    public  void NonLoginSingleGuest5() {
        System.out.println("Hotel NonLoginSingleGuest5");

    }
}
