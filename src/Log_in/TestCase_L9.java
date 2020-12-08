package com.company;

public class TestCase_L9 {
    public static void Unittest_L9() throws Exception{
        System.out.println("Test Case 9: Missing field uuid");
        String phonenumber = "0986557834";
        String password = "trh4632";
        String uuid = "";
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}
