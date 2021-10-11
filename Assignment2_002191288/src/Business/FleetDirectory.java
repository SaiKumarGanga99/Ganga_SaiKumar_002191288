/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author saikumarganga
 */
public class FleetDirectory {
    
    private ArrayList<Car> carList;
    
    private String fleetUpdatedDate;
    
    public FleetDirectory() throws ParseException {
        this.carList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Car car1 = new Car("SEDAN", "BN9123", "BENTLEY", 2018, 2, "Boston", true, true, simpleDateFormat.parse("10/07/2001 00:00:00"));
        Car car2 = new Car("SUV", "BM3987", "BMW", 2018, 4, "New York", true, true, simpleDateFormat.parse("10/07/2002 00:00:00"));
        Car car3 = new Car("SEDAN", "FR099", "FORD", 2018, 4, "Boston", true, true, simpleDateFormat.parse("10/07/2003 00:00:00"));
        Car car4 = new Car("SUV", "AUj9480", "AUDI", 2018, 4, "New York", true, true, simpleDateFormat.parse("10/07/2004 00:00:00"));
        Car car5 = new Car("SPORT", "T0T567", "TOYOTA", 2017, 4, "califonia", true, true, simpleDateFormat.parse("10/07/2005 00:00:00"));
        Car car6 = new Car("SUV", "POR678", "PORSCHE", 2017, 4, "califonia", true, true, simpleDateFormat.parse("10/07/2006 00:00:00"));
        Car car7 = new Car("SPORT", "FER654", "FERRARI", 2016, 6, "Seattle", true, true, simpleDateFormat.parse("10/07/2007 00:00:00"));
        Car car8 = new Car("SEDAN", "TA345", "TATA", 2016, 7, "Seattle", true, true, simpleDateFormat.parse("10/07/2008 00:00:00"));
        Car car9 = new Car("SPORT", "TON567", "MCLAREN", 2019, 2, "Virginia", true, true, simpleDateFormat.parse("10/07/2009 00:00:00"));
        Car car10 = new Car("SUV", "HY098", "HYUNDAI", 2019, 4, "Virginia", true, true, simpleDateFormat.parse("10/07/2010 00:00:00"));
        Car car11 = new Car("SUV", "AU099", "AUDI", 2019, 4, "MA", false, false, simpleDateFormat.parse("10/07/2022 00:00:00"));
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        
    }
    
    public ArrayList<Car> getCarList() {
        return carList;
    }
    
    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
        
    }
    
    public String getFleetUpdatedDate() {
        return fleetUpdatedDate;
    }
    
    public void setFleetUpdatedDate(String fleetUpdatedDate) {
        this.fleetUpdatedDate = fleetUpdatedDate;
    }
    
    public Car addCar() {
        Car car = new Car();
        car.setLastUpdatedDate(new Date());
        carList.add(car);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();   
        setFleetUpdatedDate(dtf.format(now));
        return car;
    }
    
    public void deleteAccount(Car car) {
        carList.remove(car);
        updatedTime();
    }
    
    public void updatedTime() {
        List<Date> datesList = new ArrayList<>();
        for (Car a : carList) {
            datesList.add(a.getLastUpdatedDate());
        }
        Collections.sort(datesList, Comparator.reverseOrder());
        setFleetUpdatedDate(datesList.get(0).toString());
    }

}
