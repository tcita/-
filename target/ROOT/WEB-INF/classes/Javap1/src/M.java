

public class M {
static void sort(int arr[]){
    for(int index=2;index<arr.length;index++){
        int key=arr[index];
        int before_key=index-1;
        while(before_key>0&&arr[before_key]>key){
            arr[index]=arr[before_key];
            before_key--;
        }

        arr[index]=key;
    }
    for(int e:arr){
        System.out.println(e);
    }

}

    public static void main(String[] args) {
        int A[]={5,2,4,6,1,3};
        sort(A);

    }

}