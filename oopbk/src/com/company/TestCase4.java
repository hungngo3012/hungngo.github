package com.company;

public class TestCase4 {
    public static void Unittest() throws Exception{
        String phonenumber ="90986557834";
        String password = "trh46";
        String uuid ="4f5a831c-3585-11eb-adc1-0242ac120002";
        System.out.println("Test case 4: Password is invalid");
        ResponseSignUp res = TestCaseSignUpAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");


    }
}