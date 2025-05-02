import java.util.Scanner;
class ProgramThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a  = sc.nextInt();

        for(int i=0;i<=a;i++){
            int odd = 2*i+1;
            if(odd > 2 * ((a-1)/2) + 1){
                break;
            }

            System.out.print(odd);
            if(i < a-1 && odd < 2 * ((a-1)/2) + 1){
                System.out.print(", ");
            }
        }

        sc.close();
    }
}