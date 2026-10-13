import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTOURISM AND AGRICULTURE");
            System.out.println("1. Single Inheritance");
            System.out.println("2. Multiple Inheritance");
            System.out.println("3. Multilevel Inheritance");
            System.out.println("4. Hierarchical Inheritance");
            System.out.println("5. Hybrid Inheritance");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    TouristSpot spot = new TouristSpot();
                    spot.showPlace();
                    spot.showSpot();
                    break;

                case 2:
                    TourismPackage tour = new TourismPackage();
                    tour.book();
                    tour.guide();
                    break;

                case 3:
                    SmartFarm farm = new SmartFarm();
                    farm.showFarm();
                    farm.showOrganicFarm();
                    farm.showSmartFarm();
                    break;

                case 4:
                    CropFarm crop = new CropFarm();
                    crop.showAgriculture();
                    crop.showCropFarm();

                    System.out.println();

                    DairyFarm dairy = new DairyFarm();
                    dairy.showAgriculture();
                    dairy.showDairyFarm();
                    break;

                case 5:
                    SmartFarm smart = new SmartFarm();
                    smart.showFarm();
                    smart.showOrganicFarm();
                    smart.showSmartFarm();

                    TourismPackage package1 = new TourismPackage();
                    package1.book();
                    package1.guide();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}