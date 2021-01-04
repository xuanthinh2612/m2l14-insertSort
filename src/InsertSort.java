import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class InsertSort {
    public static void insertSortMethod(double[] list){
        for (int i = 1; i < list.length; i++) {
            double temp = list[i];
            int j;
            for ( j = i-1; j >=0&&list[j]>temp ; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = temp;
            System.out.printf("list after %d times of sorting ",i);
            System.out.println();
            for (double v : list) {
                System.out.print(v+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("list before sorting");
        for (double v : list) {
            System.out.print(v+"\t");
        }
        System.out.println();
        insertSortMethod(list);
        System.out.println("list after % sorting");
        for (double v : list) {
            System.out.print(v+"\t");
        }


    }
}
