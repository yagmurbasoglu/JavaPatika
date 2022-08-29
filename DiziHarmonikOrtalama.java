public class Main {
    public static void main(String[] args) {
        double[] list = {1,2,3};
        double harmonicSum = 0;
        double harmonicAverage = 0;
        for (int i=0;i< list.length;i++){
            harmonicSum += (1/list[i]);
        }
        harmonicAverage = (list.length/harmonicSum);
        System.out.println("Harmonik Ortalama : " + harmonicAverage);
    }
}

