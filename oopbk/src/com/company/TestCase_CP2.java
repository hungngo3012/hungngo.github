package com.company;

public class TestCase_CP2 {
    public static void UnitTest_CP2() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        String pass = "trh4632";
        String newpass ="402avf6781";
        String token = "";
        System.out.println("Unit test 2: Token is incorrect");
        ResponseChangePassAPI ress = TestCaseChangePassword.callAPI(pass,newpass,token);
        if (!(ress.code.equals("1003"))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(ress.message))) throw new AssertionError();
        ResponseLogin resp = TestCaseLoginAPI.callAPI( "0986557834","trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        if (((!resp.code.equals("1000")))) throw new AssertionError();
        if ((!"OK".equals(resp.message))) throw new AssertionError();
        System.out.println("Finished");

    }
}
