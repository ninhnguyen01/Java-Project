public class switchExample {
    public static void main(String[] args) {
        char direction = 'E';

        switch (direction) {
            case 'N':
                System.out.println("Going North");
                break;
            case 'E':
                System.out.println("Going East");
                break;
            case 'S':
                System.out.println("Going South");
                break;
            case 'W':
                System.out.println("Going West");
                break;
            default:
                System.out.println("No direction");
        }
    }
}
