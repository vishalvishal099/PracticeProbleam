//import org.junit.Test;
//
//import static org.assertj.core.api.Assertions.*;
//
//
//public class ParkingLotTest {
//
//    @Test
//    public void parking_lot_Should_get_created() {
//        ParkingLot parkingLot = new ParkingLot(10);
//        // TO DO , swap assertion position
//        assertThat(10).isEqualTo(parkingLot.lotCount());
//        assertThat(10).isEqualTo(parkingLot.availableSlots());
//    }
//
//    @Test
//    public void car_should_get_parked() {
//        ParkingLot parkingLot = new ParkingLot(10);
//
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//
//        assertThat(8).isEqualTo(parkingLot.availableSlots());
//    }
//
//    @Test
//    public void car_should_leave_parkinglot() {
//        ParkingLot parkingLot = new ParkingLot(10);
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//        parkingLot.park(new Car("UP 53 MP 5484", "Blue"));
//
//
//
//        // ?????
//        assertThat("Slot1isfree").isEqualTo((parkingLot.leaveLot("1")).trim().replace(" ", ""));
//
//    }
//
//    @Test
//    public void get_available_parking_lot() {
//        ParkingLot parkingLot = new ParkingLot(10);
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//        parkingLot.park(new Car("UP 53 MP 5484", "Blue"));
//        assertThat(8).isEqualTo(parkingLot.availableSlots());
//    }
//
//    @Test
//    public void should_get_registration_numbers_of_all_cars_of_a_particular_colour() {
//    }
//
//    @Test
//    public void should_get_slot_number_in_which_a_car_with_a_given_registration_number_is_parked() {
//        ParkingLot parkingLot = new ParkingLot(10);
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//        parkingLot.park( new Car("UP 53 MP 5484", "Blue"));
//        parkingLot.park(new Car("KA 01 HQ 1768", "Black"));
//        parkingLot.park(new Car("x5", "Red"));
//
//        assertThat(parkingLot.getSlotForRegNo("UP 53 MP 5484")).isEqualTo("1");
//    }
//
//    @Test
//    public void should_get_slot_numbers_of_all_slots_where_a_car_of_a_particular_colour_is_parked() {
//        ParkingLot parkingLot = new ParkingLot(10);
//        parkingLot.park(new Car("KA 01 HQ 0768", "Grey"));
//        parkingLot.park( new Car("UP 53 MP 5484", "Blue"));
//        parkingLot.park(new Car("KA 01 HQ 1768", "Black"));
//        parkingLot.park(new Car("x5", "Red"));
//
//    }
//
//    @Test
//    public void car_should_park_and_leave_and_park_another_car() {
//        ParkingLot parkingLot = new ParkingLot(3);
//
////        parkingLot.park("KA 01 HQ 0768", "Grey");
////        parkingLot.park("UP 53 MP 5484", "Blue");
////        parkingLot.leaveLot("0").trim().replace(" ", "");
////        parkingLot.park("UP 53 MP 5484", "Blue");
////        parkingLot.park("UP 53 MP 5484", "Blue");
//    }
//}
//
//
