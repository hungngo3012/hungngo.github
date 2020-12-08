package com.company;

public class TestCase_SAF2 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = "";
        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "1";
        ResponseSetAcceptFriend res = TestCaseSetAcceptFriendApi.callAPI(token,user_id,is_accepted);
        if (!("9998".equals(res.code))&&!("Token is invalid.".equals(res.message))) throw new AssertionError();
        ResponseLogin res1 = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if ((!res1.code.equals("1000"))&& !("OK".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}