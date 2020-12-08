
package com.company;


public class TestCase_LO4 {
    public static void UnitTest() throws Exception{
        System.out.println("Test Case 4: Log Out Success ");
        //Đăng nhập trên máy A
        ResponseLogin res = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        //Đăng nhập trên máy B
        ResponseLogin res1 = TestCaseLoginAPI.callAPI("0986557834", "trh4632","4f5a831c-3585-11eb-adc1-0242ac120002");
        //Đăng xuất trên máy B
        ResponseLogOut ressB = TestCaseLogOutAPI.callAPI(res1.data1.token);
        if ((!"1000".equals(ressB.code))) throw new AssertionError();
        if ((!"OK".equals(ressB.message))) throw new AssertionError();
        System.out.println("Finished!");
    }
}