package com.enum1;




final class Season
{

	 static final Season WINTER = new Season();
     static final Season SUMMER = new Season();


}

public class EnumTest1 {
//	enum Level {
//		HIGH(3),
//		MEDIUM(2),
//		LOW(1);
//		private int level;
//		Level(){
//
//		}
//		private Level(int i){
//			this.level=i;
//		}
//	}
//
//	public static void main(String[] args) {
//
//		System.out.println(Level.HIGH);
//		for (Level s : Level.values())
//			System.out.println(s+" "+s.level);
//
//			}


//	enum Season{
//		WINTER(10),SUMMER(20);
//		private int value;
//		Season(int value){
//		this.value=value;
//		}
//		}
//	}

	public static void main(String[] args) {

				System.out.println(Season.WINTER);
//				for (Season s : Season.values())
//				System.out.println(s);

				String s="123456789";
				System.out.println(s.substring(0, 10));
						}

}


