
package com.mycompany.smarttv;

import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class PruebaSmartTv {
    public static void main(String[] args) {
       SmartTv SmartTv = new SmartTv("LG", 65, 1080);
       SmartTv SmartTv2 = new SmartTv("Samsung", 80, 1720);
       SmartTv SmartTv3 = new SmartTv("Phillips", 80, 1440);
       ArrayList<SmartTv> Teles = new ArrayList<> (); 
       Teles.add(SmartTv);
       Teles.add(SmartTv2);
       Teles.add(SmartTv3);
        System.out.println(Teles);
    }
}
