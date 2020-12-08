package com.company;

public class TestCase_GVC3 {
    public static void Unittest_GVC3() throws Exception{
        System.out.println("Test case 3: Verifying has been done before");
        String phonenumber = "0974553829";
        ResponseGetVCAPI res1 = getvcAPI.callAPI(phonenumber);
        ResponseGetVCAPI res2 = getvcAPI.callAPI(phonenumber);
        if ((!"1010".equals(res2.code))) throw new AssertionError();
        if ((!"action has been done  previously by this user".equals(res2.message))) throw new AssertionError();
        System.out.println("Finished");
    }
}
