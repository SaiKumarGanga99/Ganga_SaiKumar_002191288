/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author saikumarganga
 *
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Patient extends Person {
    static ArrayList<VitalSigns> array = new ArrayList<VitalSigns>();
   
    static Map<Patient, ArrayList<VitalSigns>> encounterHistory = new HashMap<Patient,ArrayList<VitalSigns>>();

    public static Map<Patient, ArrayList<VitalSigns>> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(Map<Patient, ArrayList<VitalSigns>> encounterHistory) {
        Patient.encounterHistory = encounterHistory;
    }
   
    
    
    
    
    public static ArrayList<VitalSigns> getArray() {
        //if(array.size() == 1)
        //return array;
        //else
        //Collections.sort(array,Patient.dateComparator);
        return array;
    }


    public static void setArray(ArrayList<VitalSigns> array) {
        Patient.array = array;
    }
    
    public static void addVitalSigns(VitalSigns vs)
    {
        array.add(vs);
    }
    
   public static Comparator<VitalSigns> dateComparator = (VitalSigns v1, VitalSigns v2) -> {
       LocalDateTime date1 = v1.getEntryDateTime();
       LocalDateTime date2 = v2.getEntryDateTime();
       //descending  order
       return date2.compareTo(date1);
       
       
   
       
    };
}
