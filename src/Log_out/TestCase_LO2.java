
package com.company;


public class TestCase_LO2 {
    public static void UnitTest_LO2() throws Exception{
        System.out.println("Test case 2: Log Out Success ");
        //Đăng nhập trên máy A
        ResponseLogin resA = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        ResponseLogin resB = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        ResponseLogOut reslA = TestCaseLogOutAPI.callAPI(resA.data1.token);
        if ((!"1000".equals(reslA.code))) throw new AssertionError();
        if ((!"OK".equals(reslA.message))) throw new AssertionError();
        System.out.println("Finished!");
    }

}