import javax.sound.midi.Soundbank;

/**
 * Created by graver_mc on 13.05.2018.
 */
public class CarLogic {

    public static void printCars(Car arr[]){
        System.out.println("Все автомобили:\n");
        for(Car c:arr){
            System.out.println(c);
        }
        System.out.println();
    }

    public static void printCarsByBrand(Car arr[],String brand){
        System.out.println("Все автомобили марки "+brand+":\n");
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getBrand()==brand){
                flag=true;
                System.out.println(arr[i]);
            }
        }
        if(flag=false) {
            System.out.println("Ничего не найдено!");
        }
        System.out.println();
    }

    public static void printCarsByModelAndYear(Car arr[], String model,int year){
        System.out.println("Все автомобили модели "+model+" которые эксплуатируются больше "+year+" лет:\n");
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i].getModel()==model){
                if((2018-arr[i].getYear())>year){
                    flag = true;
                    System.out.println(arr[i]);
                }
            }
        }
        if(flag==false) {
            System.out.println("Ничего не найдено!");
        }
        System.out.println();
    }

    public static void printCarsByPriceAndYear(Car arr[], int price,int year){
        System.out.println("Все автомобили которые эксплуатируются больше "+year+" лет и стоят больше "+price+":\n");
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
                if((2018-arr[i].getYear())>year){
                    if(arr[i].getPrice()>price){
                        flag = true;
                        System.out.println(arr[i]);
                    }
                }
        }
        if(flag==false) {
            System.out.println("Ничего не найдено!");
        }
        System.out.println();
    }

}
