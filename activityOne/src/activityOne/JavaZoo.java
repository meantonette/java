package activityOne;

import javax.swing.JOptionPane;

public class JavaZoo {

	public static void main(String[] args) throws InterruptedException {

		String input = JOptionPane.showInputDialog("Enter the ID Number: ");
		int Output = Integer.parseInt(input);
		
		if (Output == 1){
			ZooAnimal hayop = new ZooAnimal("Chips", "Dog", 10, true);
			Cage kulungan = new Cage(10, 10, 10, true, true);
			ZooKeeper tao = new ZooKeeper("Hudson", "Mr.", 15, true);
			
			tao.feedAnimal();
			System.out.print(hayop.kain2("The Zoo Animal is Eating. "));
			
			if(!hayop.isHungry()) {
				System.out.print("The Zoo animal is no longer hungry. ");
			}
			System.out.println("");
			
			tao.cleanCage();
			hayop.sleep();
			if(hayop.isHungry()) {
				System.out.print("The Zoo animal is hungry. ");
			}
			System.out.println("");
			
			tao.feedAnimal(tao.getName(), hayop.getName());

			System.out.print(hayop.kain2("Chips is eating." ));
			
			if(!hayop.isHungry()) {
				System.out.print("Chips is no longer hungry. ");
			}
		}
		else
		{
			ZooAnimal hayop = new ZooAnimal("Layla", "Dog", 7, true);
			Cage kulungan = new Cage(10, 10, 10, true, true);
			ZooKeeper tao = new ZooKeeper("Jake", "Mr.", 15, true);
			
			tao.feedAnimal();
			System.out.print(hayop.kain2("The Zoo Animal is Eating. "));
			
			if(!hayop.isHungry()) {
				System.out.print("The Zoo animal is no longer hungry. ");
			}
			System.out.println("");
			
			tao.cleanCage();
			hayop.sleep();
			if(hayop.isHungry()) {
				System.out.print("The Zoo animal is hungry. ");
			}
			System.out.println("");
			
			tao.feedAnimal(tao.getName(), hayop.getName());
			hayop.kain2("Chips");
			System.out.print(hayop.kain2("Chips is eating." ));
			
			if(!hayop.isHungry()) {
				System.out.print("Chips is no longer hungry. ");
			}
			
		}
	return;
	}
}
