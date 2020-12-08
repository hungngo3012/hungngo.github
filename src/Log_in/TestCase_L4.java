package com.company;

public class TestCase_L4 {
    public static void Unittest_L4() throws Exception{
        System.out.println("Test Case 4: Invalid password");
        String password = "0986557834";
        String phonenumber = "0986557834";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}
