package arrays;
public class arrayss {
     public void traversal(int [] a){
            System.out.println("the elemnts are :");
            for (int e:a) {
                System.out.println(e);


                
            }

        }
        public void insertion(int [] a,int pos,int value){
            for (int i=a.length-1;i>pos;i--){
                a[i]=a[i-1];
            }
            a[pos]=value;
        }
        public void reverse(int [] a){
            System.out.println("the reverse elemnts are :");
            for (int i=a.length-1;i>=0;i--){
                System.out.println(a[i]);
            }
        }


    
}