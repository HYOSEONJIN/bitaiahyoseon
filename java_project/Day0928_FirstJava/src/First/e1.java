package First;

import java.util.Arrays;
import java.util.Scanner;

public class e1 {

		public static void main(String[] args) {
			 
	        String s; // 학생수
	        int stu; // 학생수
	        boolean b; // 학생수 숫자입력 판별 boolean
	        
	        
	        Scanner sc= new Scanner(System.in);
	        
	        // 1. 몇명의 성적을 입력할 것인지 묻기
	        while(true) {
	            b=false;        
	        System.out.print("몇명의 성적을 입력하겠습니까?");
	                s=sc.next();
	                for(int i=0 ; i<s.length() ; i++) {
	                    char a = s.charAt(i); // 숫자가 아닌 다른 수를 입력했을 경우 찾기
	                    int asc = (int)a; // 아스키코드로 변경
	                    if(asc<48 || asc>57) {
	                        System.out.println("숫자만 입력해주세요.");
	                        b=true;
	                        break;
	                }
	                
	        }
	                if(b==false) { // 숫자를 입력했음
	                //    System.out.println("OK");
	                    stu=Integer.parseInt(s); // 제대로 된 숫자임을 확인한 후 String을 int로 바꿔준다
	                //    System.out.println(stu);// 숫자를 제대로 입력했음을 확인하기 위해 삽입해놓음
	                     break;
	                }
	        }
	        // 2. 사람 수에 맞게 배열 확보
	        
	        int soo[]= new int[stu]; // 입력받은 사람 수만큼의 배열 확보
	            System.out.println(soo.length); // 제대로 받았는지 확인해보기
	        
	        // 3. 각각의 학생의 점수 입력받기
	        
	            
	            String sco; // 점수
	            int sco2; // 점수
	            boolean c; // 성적수 숫자입력 판별 boolean
	            
	                for(int i=0; i<soo.length ; i++) {
	                    while(true){
	                        c=false;
	                    System.out.print((i+1)+"번째 학생의 성적 = ");
	                        sco = sc.next(); // String 점수에 넣어준다.
	                        for(int j = 0 ; j<sco.length(); j++) {
	                            char m = sco.charAt(j);
	                            int asc = (int)m; // 아스키코드로 변경
	                            if(asc<48 || asc>57) {
	                                System.out.println("숫자만 입력해주세요.");
	                                c=true;
	                                break;                            
	                                }                        
	                        }
	                        if (c==false) {
	                            sco2=Integer.parseInt(sco);
	                            soo[i]=sco2;
	                            System.out.println("입력된 성적은" + soo[i]);
	                            break;
	                        }
	                }
	                }
	                
	                for(int i=0; i<soo.length;i++) {
	                	
	                }
	                
	                
	                
	                System.out.println(); 
	        // 4. 총점
	                int sum = 0;
	                for(int i=0;i<soo.length;i++) {
	                	sum +=soo[i];	                	
	                }
	                
	                System.out.println("총점 = " + sum);
	        // 5. 평균
	        
	                System.out.println("평균은 = " + (sum/soo.length));
	                
	        // 6. 최고점수 최소점수
	                Arrays.sort(soo);
	                System.out.println("최고점수는 " + soo[soo.length-1]);
	                System.out.println("최저점수는 " + soo[0]);

	}

}
