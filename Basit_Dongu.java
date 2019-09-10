package Volkan_Istek_Bolum_5;

public class Basit_Dongu {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++);{
		System.out.println("Merhaba java");
		
		/*int a=0;
		while(a<100) {
			System.out.println("Merhaba Java");
			a++;*/
			
			int c =0;  // sag tiklayip refactor sonra Rename yaparsak ayni anda isimleri degistirebiliriz
			while(c<16) {
				System.out.println("Her sey guzel olacak");
				c++;
				
			}
			System.out.println("--------------------------------------");{ //bu parentezi kullanirsak iyi olur
			for(int a=0;a<5;a++) 
				System.out.println(a);
			}
			
			System.out.println("----------------------");
			int m=0;
			while(m<7) {  // buraya parentezi koymazsam sonsuz dongu olur 
				m++;
				System.out.println(m);
		}
			System.out.println("--------------------");
			int sum = 0, i = 1;		// 0 1 2 3 4 5 6 7 8 9
			while (i < 10) { 		// 0+1+3+6+10+15+21+28+36+45
			sum = sum + i;
			i++;
			}
			System.out.println("sum is " + sum); // sum is 45

	}
}
}