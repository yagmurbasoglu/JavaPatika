public class TekrarEdenCiftSayilar {
    static boolean isFind(int[] arr,int value){
        for (int i :arr ){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list ={2,7,5,2,8,3,6,8,6};
        int[] dublicate = new int[list.length];
        int start = 0;

        for (int i=0;i< list.length;i++){
            for (int j=0;j< list.length;j++){
                if ((i !=j) && (list[i]==list[j])){
                    if (!isFind(dublicate,list[i])){
                        dublicate[start++]=list[i];
                        break;
                    }
                }
            }
        }
        for (int value : dublicate){
            if ((value != 0) && (value % 2 != 1)){
                System.out.print(value + " ");
            }
        }
    }
}
