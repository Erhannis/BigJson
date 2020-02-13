/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.bigjson;

import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author erhannis
 */
public class JsonStringWrapper {
  public final Object obj;

  public JsonStringWrapper(Object obj) {
    this.obj = obj;
  }

  public static String calcString(Object obj) {
    if (obj instanceof JSONArray) {
      return ("+ [" + ((JSONArray) obj).size() + "]");
    } else if (obj instanceof JSONObject) {
      return ("+ {" + ((JSONObject) obj).size() + "}" + checkTab((JSONObject)obj));
    } else if (obj instanceof Map.Entry) {
      return ("\"" + ((Map.Entry) obj).getKey() + "\" : " + calcString(((Map.Entry) obj).getValue()));
    } else {
      return ("" + obj);
    }
  }

  public static String checkTab(JSONObject obj) {
    tryblock:
    try {
      Object o;
      o = obj.entrySet().stream().filter(e -> "entries".equals(((Map.Entry) e).getKey())).map(e -> ((Map.Entry) e).getValue()).findFirst().orElse(null);
      if (o == null || !(o instanceof JSONArray)) {
        return "";
      }
      JSONArray ja = (JSONArray) o;
      int i = ja.size() - 1;
      Object o2 = ja.get(i);
      if (o2 instanceof JSONObject) {
        Object title = ((JSONObject) o2).entrySet().stream().filter(e -> "title".equals(((Map.Entry) e).getKey())).map(e -> ((Map.Entry) e).getValue()).findFirst().orElse(null);
        Object url = ((JSONObject) o2).entrySet().stream().filter(e -> "url".equals(((Map.Entry) e).getKey())).map(e -> ((Map.Entry) e).getValue()).findFirst().orElse(null);
        return " - " + title + " @ " + url;
      }
    } catch (Throwable t) {
      //t.printStackTrace();
    }
    return "";
  }

  @Override
  public String toString() {
    return calcString(obj);
  }
}
