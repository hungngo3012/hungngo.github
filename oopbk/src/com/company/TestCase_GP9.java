package com.company;

public class TestCase_GP9 {
    public static void UnitTest9() throws Exception {
        ResponseLogin resp = TestCaseLoginAPI.callAPI("0965223417", "308abcd910", "12rt");
        String token = resp.data1.token;
        String id = "06";
        System.out.println("Unit test 9:Wrong author");
        ResponseGetPost res = TestCaseGetPost.callAPI(id, token);
        if (res.author.name == null || res.author.avatar==null || res.author.online==null) {
            System.out.println(res.author.name.equals("Người dùng"));
            System.out.println(res.author.avatar);
        }
    }
}
