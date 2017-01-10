public class Aloha{
	 public static void main(String[] args) {
    Alohaman am = new Alohaman(args[0],args[1]);
    //am.sayAloha();

    am.sayAloha(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
      }
}

class Alohaman {
	private String msg;
  	private String msg2;
  	private int n;

 public Alohaman(){
    this.msg = "ALOHA!";
    this.msg2 = "青木！";

  }
 public Alohaman(String m1, String m2){
    this.msg = m1;
    this.msg2 = m2;

  }


public void sayAloha(){
	for (int i=0; i<20; i++) {
		if (i%3 == 0) {
			System.out.println(this.msg2);	
		}else{System.out.println(this.msg);
			}
		}
	}
public void sayAloha(int n){
		for (int i=0; i<n; i++) {
			System.out.println(i+this.msg2);	
			
	}
	}
public void sayAloha(int n, int x){
		for (int i=0; i<n; i++) {
			if (i%x==0) {
				System.out.println(i+this.msg2);
				
			}else{
			System.out.println(i+this.msg);
		}
		}
	}
}


	
