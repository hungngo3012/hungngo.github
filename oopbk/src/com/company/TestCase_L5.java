package com.company;

public class TestCase_L5 {
    public static void Unittest_L9() throws Exception{
        String phonenumber = "";
        String password = "";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        System.out.println("Unit test 5: Missing field phonenumber and password");
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");

    }
}
