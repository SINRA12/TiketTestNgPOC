package android.hotel;

import org.testng.annotations.Test;

@Test(groups = {"Login1"})
public class Login {

    @Test(groups = { "sanity"})
    public  void Login1() {
        System.out.println("Hotel Login1");
    }


    @Test(groups = { "smoke" })
    public  void Login2() {
        System.out.println("Hotel Login2");

    }

    @Test(groups = { "regression" })
    public  void Login3() {
        System.out.println("Hotel Login3");
    }



    @Test(groups = { "regression" })
    public  void Login4() {
        System.out.println("Hotel Login4");

    }


    @Test(groups = { "regression"})
    public  void Login5() {
        System.out.println("Hotel Login5");

    }



    @Test(groups = { "regression","preProd" })
    public  void Login6() {
        System.out.println("Hotel Login6");

    }
}
