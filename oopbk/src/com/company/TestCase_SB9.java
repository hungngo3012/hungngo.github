package com.company;

public class TestCase_SB9 {
    public static void UnitTest_SB9() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "94830";
        String type = "12";
        String token = resp.data1.token;
        System.out.println("Unit test 9: Block-Unblock ");
        ResponseSetBlock rp = TestCaseSetBlockAPI.callAPI(user_id, type,token);
        if ((!"1010".equals(rp.message))) throw new AssertionError("wrong code");
        if ((!"Action has been done previously by this user".equals(rp.message))) throw new AssertionError("wrong message");
    }
}
