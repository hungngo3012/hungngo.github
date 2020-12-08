package com.company;

public class TestCase_LO3 {
    public static void Unittest_LO3() throws Exception{
        System.out.println("Test Case 3: ");
        ResponseLogin resA = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        ResponseLogin resB = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        ResponseLogOut reslB = TestCaseLogOutAPI.callAPI(resB.data1.token);
        ResponseLogOut reslA = TestCaseLogOutAPI.callAPI(resA.data1.token);
        if ((!"1000".equals(reslA.code))) throw new AssertionError();
        if ((!"OK".equals(reslA.message))) throw new AssertionError();
        System.out.println("Finished!");

    }
}
