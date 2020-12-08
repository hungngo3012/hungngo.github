package com.company;

public class TestCase_SB8 {
    public static void UnitTest_SB8() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "4f5a831c-3585-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "30";
        String type = "12";
        String token = resp.data1.token;
        System.out.println("Unit test 8: Type incorrect");
        ResponseSetBlock rp = TestCaseSetBlockAPI.callAPI(user_id, type,token);
        if ((!"1003".equals(rp.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(rp.message))) throw new AssertionError("wrong message");
        System.out.println("Block type incorrect");
        System.out.println("Finished");
    }
}
