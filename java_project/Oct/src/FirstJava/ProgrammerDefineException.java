package FirstJava;
 
import java.util.Scanner;
 
public class ProgrammerDefineException {
 
    public static void main(String[] args) throws AgeInputException {

        System.out.println("나이를 입력하세요");
        try {
        int age = readAge();
        System.out.println("나이는 "+ age + "세 입니다.");
        } catch(AgeInputException e) {
            System.out.println(e); // tostring()
        }
    
 
    }
    public static int readAge() throws AgeInputException{
        //throws AgeInputException
        //readAge 메서드 내에서 발생하는 예외중에
        //AgeInputException 타입의 예외가 발생하면
        //readAge()메서드를 호출한 쪽으로 전달
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        // 논리적인 오류에 대한 예외 발생
        if(age<=0) {
            AgeInputException ae=new AgeInputException(age);
            throw ae;
        }
        return age;
    }
}
 