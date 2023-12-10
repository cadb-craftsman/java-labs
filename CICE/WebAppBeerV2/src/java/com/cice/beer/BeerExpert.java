/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cice.beer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cice
 */
public class BeerExpert {

    public List getBrands(String color){

        List listBrands = new ArrayList();

        if(color.equals("amber")){
           listBrands.add("Jack Amber");
           listBrands.add("Red Moose");
        }else{
            listBrands.add("Jail Pale Ale");
            listBrands.add("Gout Sout");
        }

        return listBrands;
    }

}
