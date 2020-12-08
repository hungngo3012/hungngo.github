package com.company;

public class TestCase_SAF4 {
    public static void main(String[] args) throws Exception {
        String phonenumber = "0974553829";
        String password = "09821agb";
        String uuid = "13df";
        ResponseLogin resp = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        String token = resp.data1.token;
        String user_id = "5fbdcf81c8accf0017c07e0a";
        String is_accepted = "1";
        ResponseSetAcceptFriend res = TestCaseSetAcceptFriendApi.callAPI(token,user_id,is_accepted);
        if (!(res.code.equals("9995"))&&!("User is not validated".equals(res.message))) throw new AssertionError();
        ResponseLogin resp1 = TestCaseLoginAPI.callAPI(phonenumber, password, uuid);
        if (!(resp1.code.equals("1000"))&&!("OK".equals(res.message))) throw new AssertionError();
        System.out.println("Satisfied! Finished");
    }
}
