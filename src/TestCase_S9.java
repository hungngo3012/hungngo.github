package com.company;

public class TestCase_S9 {
    public static void Unittest_S9() throws Exception{
        ResponseLogin res = TestCaseLoginAPI.callAPI("0965223417","308abcd910","12rt");
        String token = res.token;
        String keyword = "hb";
        String user_id = "348147";
        int index = 4;
        int count = 2;
        int i;
        System.out.println("Unit test 8: image, video, describe error");
        ResponseSearch ress = TestCaseSearchAPI.callAPI(token, keyword, user_id, index, count);
        if(ress.data[1].equals("")){
            ress.data[1] = "djsahfie3";
        }
        if(ress.data[7].equals("")){
            ress.data[7] = "No describe";
        }
        for (i = 0; i <= 7; i++) {
            System.out.println(ress.data[i]);
        }
    }
}
