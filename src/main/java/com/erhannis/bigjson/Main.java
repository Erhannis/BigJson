/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.bigjson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Set;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author erhannis
 */
public class Main {
  public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
    /*
    JSONObject obj = (JSONObject)new JSONParser().parse(new FileReader("/home/erhannis/.mozilla/firefox/glt72ri8.default/sessionstore.json"));
    Set keys = obj.keySet();
    JSONArray windows = ((JSONArray)obj.get("windows"));
    JSONObject window = (JSONObject)windows.get(0);
    JSONArray tabs = (JSONArray)window.get("tabs");
    JSONObject tabObj = (JSONObject)tabs.get(0);
    JSONObject formdataObj = (JSONObject)tabObj.get("formdata");
    //System.out.println("" + formdataObj.get("url"));
    JSONObject idObj = (JSONObject)formdataObj.get("id");
    JSONObject sessionDataObj = (JSONObject)idObj.get("sessionData");
    for (Object e : sessionDataObj.entrySet()) {
      System.out.println(((Entry)e).getKey() + " " + ((Entry)e).getValue().getClass());
      if (((Entry)e).getValue() instanceof JSONArray) {
        System.out.println("  size " + ((JSONArray)((Entry)e).getValue()).size());
      }
      if (((Entry)e).getValue() instanceof JSONObject) {
        System.out.println("  size " + ((JSONObject)((Entry)e).getValue()).size());
      }
    }
    System.out.println("keys " + keys);
  */
    new MainFrame().setVisible(true);
  }
}
