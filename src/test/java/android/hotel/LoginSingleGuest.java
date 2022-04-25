package android.hotel;

import org.testng.annotations.Test;


@Test(groups = {"Login1"})
public class LoginSingleGuest {

    @Test(groups = { "sanity" })
    public  void LoginSingleGuest1() {
        System.out.println("Hotel LoginSingleGuest1");

    }


    @Test(groups = { "sanity" })
    public  void LoginSingleGuest2() {
        System.out.println("Hotel LoginSingleGuest2");

    }

    @Test(groups = { "regression" ,"preProd"})
    public  void LoginSingleGuest3() {
        System.out.println("Hotel LoginSingleGuest3");

    }


    @Test(groups = { "regression" })
    public  void LoginSingleGuest4() {
        System.out.println("Hotel LoginSingleGuest4");

    }


    @Test(groups = { "regression" ,"preProd"})
    public  void LoginSingleGuest5() {
        System.out.println("Hotel LoginSingleGuest5");

    }
}
