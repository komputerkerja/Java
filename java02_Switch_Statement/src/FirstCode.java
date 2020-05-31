
public class FirstCode {

    public static void main(String[] args){
        int x = 4;

        switch (x) {
            case 1 -> System.out.println("Hasilnya " + x);
            case 2 -> System.out.println("Hasilnya " + x);
            case 3 -> System.out.println("Hasilnya " + x);
            case 4 -> System.out.println("Hasilnya " + x);
            default -> System.out.println("Hasilnya " + x);
        }
        //================================================
        switch (x){
            case 1 :
                System.out.println("Hasilnya " + x);
                break;
            case 2 :
                System.out.println("Hasilnya " + x);
                break;
            default:
                System.out.println("Hasilnya dst/ tidak ada yang benar");
        }
    }

}
