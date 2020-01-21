package DailyProgramP.HashcodeAndEquals;

public class StudentD {
    private String id;
    private String name;

    StudentD(String id) {
        String data = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(o!=null && o instanceof StudentD){
            String id = ((StudentD)o).getId();
            if(id !=null && id.equals(this.getId())){
                return true;
            }
        }
        return false;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    @Override
    public int hashCode(){
        return  id.hashCode();
    }
}