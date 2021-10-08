package 게임캐릭터;

public abstract class PlayerLevel {


    
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    
    public abstract void showMessageLevel();

    final public void go(int count) {
    	
    	run();
    	for(int i=0;i<count;i++) {jump();}
    	turn();	
    }
	

}