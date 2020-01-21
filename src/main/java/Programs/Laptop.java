package Programs;

public class Laptop {
    String brandName;
    int ramSize;
    int hardDisk;


    public Laptop(String brandName, int ramSize, int hardDisk) {
        this.brandName = brandName;
        this.ramSize = ramSize;
        this.hardDisk = hardDisk;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDisk() {
        return hardDisk;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", ramSize=" + ramSize +
                ", hardDisk=" + hardDisk +
                '}';
    }

//    @Override
//    public int compareTo(Laptop lap2) {
//
//        if(this.getHardDisk() > lap2.getHardDisk()){
//            return 1;
//        } else {
//            return -1;
//        }
//
//    }
}
