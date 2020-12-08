
package com.company;


public class TestCase_L1 {
    public static void Unittest_L1() throws Exception{
        System.out.println("Test Case 1: Login success");
        String phonenumber = "0986557834";
        String password = "trh4632";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        ResponseLogin res = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!"1000".equals(res.code))) throw new AssertionError();
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}