import java.util.Scanner;
class first{
public static void main(String args[]){
System.out.print("enter the size of the array : ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("enter the elements of the array");
int arr[0] = sc.nextInt();
n--;
int a = 1;
while(n--){
int b = sc.nextInt();
if(b!=arr[a-1]){
arr[a] = b;
a++;
}
}
for(int i = 0;i<a;i++){
System.out.print(arr[i] + " ");
}
}
}