public class Input{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your age? ");
        int age = scanner.nextInt();

        System.out.print("What is your weight (in pounds)? ");
        double weight = scanner.nextDouble();

        System.out.print("Are you a smoker (true or false)? ");
        boolean isSmoker = scanner.nextBoolean();

        System.out.println("Patient's name: " + name);
        System.out.println("Patient's age: " + age);
        System.out.println("Patient's weight: " + weight + " kg");
        System.out.println("Patient is a smoker: " + isSmoker);

        scanner.close();
    }
}
