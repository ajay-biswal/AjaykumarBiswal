import java.util.Scanner;
class ProgramTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        for(int i=0;i<=a;i++){
            System.out.print(2*i+1);
            if(i<a){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}