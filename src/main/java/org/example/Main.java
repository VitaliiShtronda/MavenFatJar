package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main
{
    public static void main( String[] args )
    {

        UserName user = new UserName("Vitalii", "Shtronda");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String userJson = gson.toJson(user);

        System.out.println(userJson);
    }
}
