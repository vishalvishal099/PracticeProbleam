import java.util.*;

public class ParkingLot {


    private final int lotCount;
    private ArrayList<Integer> availableSlot;
    private Map<String, Car> map;

    public ParkingLot(int size) {
        this.lotCount = size;
        createParking();
    }



    private void createParking() {
        // Available slots list
        availableSlot = new ArrayList<Integer>() ;

        for (int i = 0; i < this.lotCount ; i++) {
            availableSlot.add(i);
        }
        //Map for slot, car
        map = new HashMap<String, Car>();

        System.out.println("Created parking lot with  " + this.lotCount + "  slots");

        System.out.println();

    }

    public void park(Car car) {
        if (lotCount <= 0) {
            System.out.println("Parking Lot is not available or not created ");
        } else if (lotCount == map.size()) {
            System.out.println("Sorry Parking lot is full");
        } else {
            Collections.sort(availableSlot);
            String slot = availableSlot.get(0).toString();
            map.put(slot, car);
            System.out.println("Allocated slot number: " + slot);
            availableSlot.remove(0);
        }
    }

    public String leaveLot(String lotTobeEmpty) {
        if (lotCount <= 0) {
            return "Parking Lot is not available or not created ";
        } else if (map.size() > 0) {
            Car carLeaveLot = map.get(lotTobeEmpty);
            if (carLeaveLot != null) {
                map.remove(lotTobeEmpty);
              int  lotTobeEmptyInt = Integer.parseInt(lotTobeEmpty);
                availableSlot.add(lotTobeEmptyInt);
               return "Slot "+ lotTobeEmpty +" is free";

            } else {
                 return "Slot number " + lotTobeEmpty + " is already empty";
            }
        }
        return  "Nothing has done";
    }

    public int lotCount() {
        return lotCount;
    }

    public int availableSlots() {
        return availableSlot.size();
    }

    public String getSlotForRegNo(String registationNumber) {
        String slotNomber ="";
        for(Map.Entry<String, Car> entry :map.entrySet()){
            if(entry.getValue().getCarNumber().equalsIgnoreCase(registationNumber)){
                slotNomber = entry.getKey().toString();
            }
        }
           return slotNomber;

    }
}


//    public int getSlotForRegNo(String RegistrationNo) {
//        int slot =0;
////        for (Map.Entry<String,Car> entry : map.entrySet())
////            System.out.println("Key = " + entry.getKey() +
////                    ", Value = " + entry.getValue());
//        System.out.println(car.getCarNumber());
//        return   slot;
//    }