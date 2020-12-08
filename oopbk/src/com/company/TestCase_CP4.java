package com.company;

import java.io.IOException;

public class TestCase_CP4 {
    public static void UnitTest_CP4() throws Exception {
        ResponseLogin ress = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String passwd = "trh4632";
        String newpass ="308abcd910";
        String token = ress.data1.token ;
        System.out.println("Unit test 4: The account is blocked");
        ResponseChangePassAPI res = TestCaseChangePassword.callAPI( passwd, newpass,token);
        if (((!res.code.equals("9995")))) throw new AssertionError();
        if ((!"User is not validated".equals(res.message))) throw new AssertionError();
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        System.out.println("Finished");

    }
}
