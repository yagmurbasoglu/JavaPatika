public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkVerbalNote(int verbMat, int verbFizik, int verbKimya) {
        if (verbMat >= 0 && verbMat <= 100) {
            this.mat.verbalNote = verbMat;
        }

        if (verbFizik >= 0 && verbFizik <= 100){
            this.fizik.verbalNote = verbFizik;
        }

        if (verbKimya >= 0 && verbKimya <= 100){
            this.kimya.verbalNote = verbKimya;
        }
    }


    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        double fizik_Ave = this.fizik.note *0.8 + this.fizik.verbalNote * 0.2;
        double mat_Ave = this.mat.note *0.85 + this.mat.verbalNote * 0.15;
        double kimya_Ave = this.kimya.note *0.7 + this.kimya.verbalNote * 0.3;
        double newAverage = (fizik_Ave + kimya_Ave + mat_Ave) / 3;
        this.average = newAverage;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik , sinav notu : " + this.mat.note   +" , Sozlu notu : "+ this.mat.verbalNote   +"   Oran ==> sinav %80  sozlu %20");
        System.out.println("Fizik     , sinav notu : " + this.fizik.note +" , Sozlu notu : "+ this.fizik.verbalNote +"   Oran ==> sinav %85  sozlu %15");
        System.out.println("Kimya     , sinav notu : " + this.kimya.note +" , Sozlu notu : "+ this.kimya.verbalNote +"   Oran ==> sinav %70  sozlu %30");
    }

}