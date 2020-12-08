package com.company;

public class TestCase3 {
    public static void Unittest() throws Exception{
        String phonenumber ="9364787322";
        String password = "trh4632";
        String uuid ="4f5a831c-3585-11eb-adc1-0242ac120002";
        System.out.println("Test case 3: Phonenumber is invalid");
        ResponseSignUp res = TestCaseSignUpAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();

        System.out.println("Finished");


    }
}