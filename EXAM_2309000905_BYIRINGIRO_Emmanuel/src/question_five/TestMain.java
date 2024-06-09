//BYIRINGIRO EMMANUEL
package question_five;

public class TestMain {
    public static void main(String[] args) {
       
        Care myCar = new Care("BMW", 2019);
        System.out.println("My car is a " + myCar.getMake() + " " + myCar.getYearModel());

        
        CellPhone myPhone = new CellPhone("Tecno", "pop 1", 150000);
        System.out.println("My phone is a " + myPhone.getManufacturer() + " " + myPhone.getModel() + " which costs rwfr" + myPhone.getRetailPrice());
    }
}

