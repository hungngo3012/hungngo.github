package com.company;

public class TestCase_L3 {
    public static void Unittest3() throws Exception{
        String phonenumber = "9745501291";
        String password = "trh4632";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        char comp = phonenumber.charAt(0);
        System.out.println("Unit test 3: Invalid Phonenumber");
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();

        System.out.println("Finished!");

    }
}