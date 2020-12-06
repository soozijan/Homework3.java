 //Targil
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter temperature");
        float temperature = scanner.nextFloat();

        if (temperature > 36.5) {
               System.out.println("Hot");
        }

         if (temperature <= 36.5) {
               System.out.println("cold");

         }

         System.out.println("Please Enter your age");
         int my_age = scanner.nextInt();

         if (my_age > 18) {
             System.out.println("Grow up");
         }

         if (my_age <= 13) {
             System.out.println("child");
         }

         System.out.println("Please Enter number for a");
         double a = scanner.nextDouble();

         System.out.println("Please Enter number for b");
         double b = scanner.nextDouble();

         if (a > b) {
             System.out.println("a is bigger");
             System.out.println(a);
         }

         if (a <= b) {
             System.out.println("b is bigger");
             System.out.println(b);
         }
