package com.company;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;
import com.company.ResponseSetBlock;


public class TestCaseSetBlockAPI {
    public static ResponseSetBlock callAPI(Object token, Object uuid, Object type) throws IOException {
        URL url = new URL(Contanst.set_blockAPI +
                "?token"+token
                + "&uuid="+uuid
                + "&type="+ type);
        System.out.println("CALL API: " + url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            return g.fromJson(content.toString(), ResponseSetBlock.class);
        } finally {
            connection.disconnect();
        }
    }





    private static void testCase3() throws IOException {

    }

}