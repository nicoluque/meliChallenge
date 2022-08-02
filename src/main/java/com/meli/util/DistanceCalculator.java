package com.meli.util;

public class DistanceCalculator {

	private static final double LAT_BS_AS = -34;
    private static final double LON_BS_AS = -64;

    public static String distance(double lat2, double lon2) {
        if ((LAT_BS_AS == lat2) && (LON_BS_AS == lon2)) {
            return "0 Km";
        } else {
        	double radioTierra = 6371;/*en kilómetros*/  
            double dLat = Math.toRadians(lat2 - LAT_BS_AS);  
            double dLng = Math.toRadians(lon2 - LON_BS_AS);  
            double sindLat = Math.sin(dLat / 2);  
            double sindLng = Math.sin(dLng / 2);  
            double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                    * Math.cos(Math.toRadians(LON_BS_AS)) * Math.cos(Math.toRadians(lat2));  
            double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
            double distancia = radioTierra * va2;
            String distanciaKm = String.valueOf((int)distancia) + " KM";
       
            return distanciaKm;  
            
        }
    }
}
