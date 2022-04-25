package android.hotel;

import org.testng.annotations.Test;


@Test(groups = {"Login2"})
public class NonLoginMultiGuest {

    @Test(groups = { "regression","preProd" })
    public  void NonLoginMultiGuest1() {
        System.out.println("Hotel NonLoginMultiGuest1");

    }



    @Test(groups = { "regression" })
    public  void NonLoginMultiGuest2() {
        System.out.println("Hotel NonLoginMultiGuest2");

    }

    @Test(groups = { "regression" })
    public  void NonLoginMultiGuest3() {
        System.out.println("Hotel NonLoginMultiGuest3");

    }


    @Test(groups = { "regression","preProd" })
    public  void NonLoginMultiGuest4() {
        System.out.println("Hotel NonLoginMultiGuest4");

    }


    @Test(groups = { "sanity" })
    public  void NonLoginMultiGuest5() {
        System.out.println("Hotel NonLoginMultiGuest5");

    }
}
