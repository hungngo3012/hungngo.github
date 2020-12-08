package com.company;

public class TestCase_SB7 {
    public static void UnitTest_SB7() throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "ac389d10-3933-11eb-adc1-0242ac120002";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);

        String user_id = "29";
        String type = "1";
        String token = resp.data1.token;
        System.out.println("Unit test 7: User id was locked");
        ResponseSetBlock rp = TestCaseSetBlockAPI.callAPI(user_id, type, token);
        if (!"9995".equals(rp.code)) throw new AssertionError("wrong code");
        if ((!"User is not validated".equals(rp.message))) throw new AssertionError("wrong message");
        System.out.println("This user was locked by server");
    }
}
