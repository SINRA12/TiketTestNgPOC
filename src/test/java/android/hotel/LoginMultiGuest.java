package android.hotel;

import org.testng.annotations.Test;

@Test(groups = {"Login1"})
public class LoginMultiGuest {

    @Test(groups = { "sanity","smoke" })
    public  void LoginMultiGuest1() {
        System.out.println("Hotel LoginMultiGuest1");

    }


    @Test(groups = { "sanity" })
    public  void LoginMultiGuest2() {
        System.out.println("Hotel LoginMultiGuest2");

    }

    @Test(groups = { "sanity","preProd" })
    public  void LoginMultiGuest3() {
        System.out.println("Hotel LoginMultiGuest3");

    }


    @Test(groups = { "regression" })
    public  void LoginMultiGuest4() {
        System.out.println("Hotel LoginMultiGuest4");

    }


    @Test(groups = { "regression" })
    public  void LoginMultiGuest5() {
        System.out.println("Hotel LoginMultiGuest5");

    }
}
