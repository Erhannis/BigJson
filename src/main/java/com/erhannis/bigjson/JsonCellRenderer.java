/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erhannis.bigjson;

import java.awt.Color;
import java.awt.Component;
import java.util.Map.Entry;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author erhannis
 */
public class JsonCellRenderer extends JLabel implements ListCellRenderer<JsonStringWrapper> {
  public JsonCellRenderer() {
    this.setOpaque(true);
  }
  
  @Override
  public Component getListCellRendererComponent(JList<? extends JsonStringWrapper> list, JsonStringWrapper value, int index, boolean isSelected, boolean cellHasFocus) {
    this.setText(""+value);
    this.setBackground(isSelected ? Color.CYAN : Color.WHITE);
    return this;
  }
}
