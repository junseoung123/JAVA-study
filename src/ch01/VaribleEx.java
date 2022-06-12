package ch01;

public class VaribleEx {
             //º¯¼ö Á¤ÇÏ±â
	static int sa=200; //ÄÄÆÄÀÏÇÒ ¶§ ¸Ş¸ğ¸® ÇÒ´çµÇ°í ÇÁ·Î±×·¥ÀÌ ³¡³¯¶§±îÁö ¸Ş¸ğ¸®¿¡ °è¼Ó ³²¾ÆÀÖ´Ù
	//staticÀ» »ç¿ëÇÏ´Â º¯¼ö´Â °è¼Ó º¯¼öÀÇ °ªÀ» À¯ÁöÇØ¾ßÇÏ´Â º¯¼ö
	int ia=100;
	//ÀÓ½Ã·Î »ç¿ëÇÏ°í ¹ö·Áµµ µÇ´Â º¯¼ö
	
	public       static              void        main(String[] args) {
	//Á¢±ÙÁ¦ÇÑÀÚ, Á¤Àû ½ºÅÃ¿µ¿ª ÇÒ´çÇØ¶ó	    ¸®ÅÏÅ¸ÀÔ          ¸Ş¼Òµå¸í
		Ex01 ex01 = new Ex01();
        ex01.ex01Method();
        
        System.out.println(sa); //sa°ªÀ» Ãâ·ÂÇØ¶ó
        
        VaribleEx ve = new VaribleEx(); //VaribleEx¶ó´Â Å¬·¡½º°ªÀ» ve·Î Á¤ÇÏ±â
        System.out.println(ve.ia); //ve¾È¿¡ ÀÖ´Â ia°ªÀ» Ãâ·ÂÇØ¶ó
        
        int returnVar = ve.method2(); //¸Ş¼Òµå È£ÃâÇÏ¿©¼­ ¸®ÅÏ¹Ş¾Æ º¯¼ö¿¡ ´ã±â
        System.out.println(returnVar); //Ãâ·ÂÇÏ±â
        
        String returnName = ve.method3();
        System.out.println(returnName);
        
        boolean returnBoolean =ve.method4();
        System.out.println(returnBoolean);
        
        double returnDouble =ve.method5();
        System.out.println(returnDouble);
        
        float returnFloat =ve.method6();
        System.out.println(returnFloat);
	}
	//¸®ÅÏÅ¸ÀÔÀº ¸Ş¼Òµå¸¦ ¼öÇàÇÏ°í ³ª¸é ¸Ş¼Òµå È£­„ÇÏ´Â °÷À¸·Î µÇµ¹·ÁÁÖ¾î¾ßÇÏ´Â ÀÚ·áÇü
        public int method2() {
        	return 300; //¸®ÅÏ°ª
        	
        }
        public String method3() {
        	return "È«±æµ¿";
        }
        //true false return ÇÏ´Â ¸Ş¼Òµå ¼±¾ğÇÏ±â
        public boolean method4() {
        	return true;
        }
        //3.14¼ıÀÚ returnÇÏ´Â ¸Ş¼Òµå ¼±¾ğÇÏ±â
        public double method5() {
        	return 3.14;
        }
        //500.78f ¼ıÀÚ¸¦ returnÇÏ´Â ¸Ş¼Òµå ¼±¾ğÇÏ±â float
        public float method6() {
        	return 500.78f;
        }
}
