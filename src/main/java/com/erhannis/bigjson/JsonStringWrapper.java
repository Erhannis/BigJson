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

  private static String calcString(Object obj) {
    if (obj instanceof JSONArray) {
      return ("+ [" + ((JSONArray) obj).size() + "]");
    } else if (obj instanceof JSONObject) {
      return ("+ {" + ((JSONObject) obj).size() + "}");
    } else if (obj instanceof Map.Entry) {
      return ("\"" + ((Map.Entry) obj).getKey() + "\" : " + calcString(((Map.Entry) obj).getValue()));
    } else {
      return ("" + obj);
    }
  }

  @Override
  public String toString() {
    return calcString(obj);
  }
}
