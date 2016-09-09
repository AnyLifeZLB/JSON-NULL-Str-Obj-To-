package com.anylife.jsont.json_null_str_obj_to;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		String result="{\n" +
				"     \"firstName\": \"John\",\n" +
				"     \"lastName\": null,\n" +
				"     \"sex\": \"male\",\n" +
				"     \"age\": 25,\n" +
				"     \"isVip\":true,\n" +
				"     \"address\": \n" +
				"     {\n" +
				"         \"streetAddress\": \"21 2nd Street\",\n" +
				"         \"city\": \"New York\",\n" +
				"         \"state\": \"NY\",\n" +
				"         \"postalCode\": \"10021\"\n" +
				"     },\n" +
				"     \"phoneNumber\": \n" +
				"     [\n" +
				"         {\n" +
				"           \"type\": \"home\",\n" +
				"           \"number\": \"212 555-1234\"\n" +
				"         },\n" +
				"         {\n" +
				"           \"type\": \"fax\",\n" +
				"           \"number\": \"646 555-4567\"\n" +
				"         }\n" +
				"     ]\n" +
				" }";




		Gson gson  = new GsonBuilder().registerTypeAdapterFactory(new NullStringToEmptyAdapterFactory()).create();
		Result resultObj=gson.fromJson(result, Result.class);

		Log.e("boolean&Null",resultObj.toString());

	}
}
