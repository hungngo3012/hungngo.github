package com.company;

public class TestCase_LO1 {
    public static void UnitTest_LO1() throws Exception{
        System.out.println("Unit test 1: Log Out Success ");
        ResponseLogin res = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        System.out.println("User log out");
        ResponseLogOut ress = TestCaseLogOutAPI.callAPI(res.data1.token);
        if ((!"1000".equals(ress.code))) throw new AssertionError();
        if ((!"OK".equals(ress.code))) throw new AssertionError();
        System.out.println("Finished!");
    }
}
