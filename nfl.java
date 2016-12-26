public class nfl{

	public static void main(String[] args){
	RacerCanvas race = new RacerCanvas(800,800);
	race.setFiles("racer1.jpg","racer2.jpg","racer3.png");

	race.moveRacer1(0,600);
	race.moveRacer2(0,400);
	race.moveRacer3(0,200);

	int x = 1;
	while(x<=800){
		x++;
		int speed = (int)(Math.random()*10)+1;
		x+=speed;
		race.moveRacer1(x,600);
		race.repaint();
		race.delay(5);
		int speed2 = (int)(Math.random()*10)+1;
		int two = x;
		two+=speed2;
		race.moveRacer2(two,400);
		race.repaint();
		race.delay(5);
		int speed3 = (int)(Math.random()*10)+1;
		int three = x;
		three+=speed3;
		race.moveRacer3(three,200);
		race.repaint();
		race.delay(5);
	}

}


}