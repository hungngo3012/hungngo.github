package com.company;

public class TestCase2 {
    public static void Unittest() throws Exception{
        String phonenumber ="0986557834";
        String password = "trh4632";
        String uuid ="4f5a831c-3585-11eb-adc1-0242ac120002";
        System.out.println("Test case 2: ");
        ResponseSignUp res = TestCaseSignUpAPI.callAPI(phonenumber, password, uuid);
        if (!"9996".equals(res.code)) throw new AssertionError(res.message + " with code " + res.code);
        if ((!"User existed.".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }

}

