	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double salary = 0.0;
        int adjustment = 4;
        try {
            System.out.print("Digite seu salário (utilize '.' ao invés de vírgulas): ");
            salary = scanner.nextDouble();

            if (salary <= 0) {
                throw new IllegalArgumentException("O salário não pode ser zero ou negativo.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Por favor digite um valor válido para o salário.");
            scanner.nextLine();
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        if (salary <= 400.00) {
            adjustment = 15;
        } else if (salary <= 800.00) {
            adjustment = 12;
        } else if (salary <= 1200.00) {
            adjustment = 10;
        } else if (salary <= 2000.00) {
            adjustment = 7;
        }

        salary = salary * (100 + adjustment) / 100;
        System.out.printf("Você receberá: R$ %.2f (%d%%)", salary, adjustment);