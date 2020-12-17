package com.company;

import java.io.IOException;

public class TestCaseSignUp {
    public static void UnitTest1(ResponseSignUp RES) throws IOException {
        System.out.println("Test case 1: SignUp satisfied ");
        ResponseSignUp res = RES;
        if (!"1000".equals(res.code)) throw new AssertionError(res.message + " with code " + res.code);
        if ((!"OK".equals(res.message))) throw new AssertionError();
        System.out.println("Sign Up Complete");
    }
    public static void UnitTest2(ResponseSignUp RES) throws IOException {
        System.out.println("Test case 2: User exit");
        ResponseSignUp res = RES;
        if (!"9996".equals(res.code)) throw new AssertionError(res.message + " with code " + res.code);
        if ((!"User existed".equals(res.message))) throw new AssertionError();
        System.out.println("User exited, code and message correct");
    }
    public static void UnitTest3(ResponseSignUp RES) throws IOException {
        System.out.println("Test case 3: Phonenumber is invalid");
        ResponseSignUp res = RES;
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong message");

        System.out.println("Finished, code and message correct");
    }
    public static void UnitTest4(ResponseSignUp RES) throws IOException {
        System.out.println("Test case 4: Password is invalid");
        ResponseSignUp res = RES;
        if ((!"1003".equals(res.code))) throw new AssertionError("wrong code");
        if ((!"Parameter type is invalid".equals(res.message))) throw new AssertionError("wrong messaage");
        System.out.println("Finished, code and message correct");
    }
    public static void UnitTest5(ResponseSignUp RES) throws IOException {
        System.out.println("Unit test 5: ");
        ResponseSignUp res = RES;
        if ((!"1004".equals(res.code))) throw new AssertionError();
        if ((!"Parameter value is invalid".equals(res.message))) throw new AssertionError();
        System.out.println("Finished, code and message correct");
    }
}
