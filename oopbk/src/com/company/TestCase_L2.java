package com.company;

public class TestCase_L2 {
    public static void Unittest2() throws Exception{
        String phonenumber = "0974000129";
        String password = "trh4632";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        System.out.println("Unit test 2: Phonenumber does not exist");
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1003".equals(res.code))) throw new AssertionError();
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}