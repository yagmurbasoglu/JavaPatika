public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0 ;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    double bonus() {
        if (workHours > 40) {
            double bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Gecersiz yıl girisi.");
        } else {
            int yearDiff = 2021 - hireYear;
            double zam;
            if (yearDiff > 0 && yearDiff < 10) {
                zam = salary * 0.05;
                return zam;
            } else if (yearDiff > 9 && yearDiff < 20) {
                zam = salary * 0.1;
                return zam;
            } else if (yearDiff > 19) {
                zam = salary * 0.15;
                return zam;
            }
        }
        return 0;
    }
    void printSalary(){
        double total = salary -tax()+bonus()+raiseSalary();
        double total2 = salary +bonus()-tax();
        System.out.println("Adi : "+name);
        System.out.println("Maasi : "+ salary);
        System.out.println("Calisma Saati : "+ workHours);
        System.out.println("Baslangic Yili : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maas artisi : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + total2);
        System.out.println("Toplam Maas : " + total);
    }
}
