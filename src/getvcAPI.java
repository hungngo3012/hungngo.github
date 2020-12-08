package com.company;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class getvcAPI {
    public static ResponseGetVCAPI callAPI(String phonenumber) throws Exception{
        URL url = new URL(Contanst.GET_VERIFY_CODE + "?phonenumber=" + phonenumber);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(con.getOutputStream())) {
            StringBuilder content;
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String line;
            content = new StringBuilder();
            while ((line = in.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), ResponseGetVCAPI.class);
        } finally {
            con.disconnect();
        }
    }
}