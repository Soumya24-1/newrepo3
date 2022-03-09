package assignment;

import java.util.Scanner;
class Player{
   private String name;
   private String country;
   private Skill skill;
   
   public Player(String name,String country,Skill skill) {
	   super();
	   this.name=name;
	   this.country=country;
	   this.skill=new Skill();
	   this.skill=skill;
   }
   public String getName(){
	   return name;
   }
   public String getCountry(){
	   return country;
   }
   public Skill getSkill() {
	   return skill;
   }
   public void setName(String name) {
	   this.name=name;
   }
   public void setCountry(String country) {
	   this.country=country;
   }
   public void setSkill(Skill skill) {
	   this.skill=skill;
   }
   public String toString() {
	   String str;
	   str=(String)String.format("%-15s %-15s %-15s",this.name,this.country,this.skill.getSkillName());
	   return str;
   }
}

class Skill{
	private String skillName;
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName=skillName;
	}
}

class PlayerBo{
	public void viewDetails(Player[] playerList) {
		System.out.format("%-15s %-15s %-15s","Player","Country","Skill");
		System.out.println();
		for(int i=0;i<playerList.length;i++) {
			System.out.println(playerList[i].toString());
		}
	}
	
	public void printPlayerDetailswithSkill(Player[] playerList,String skill) {
		for(int i=0;i<playerList.length;i++) {
			if(playerList[i].getSkill().getSkillName().equals(skill)) {
				viewDetails(playerList);
			}
			else {
				System.out.println("Skill not found...");
			}
		}
	}
}

public class PlayerSkills {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter number of players");
		int players=ip.nextInt();
	    
		Player[] p1=new Player[players];
		Skill[] s1=new Skill[players];
		PlayerBo pB=new PlayerBo();
		String name,country,skill;
		for(int i=0;i<players;i++) {
			System.out.println("Enter the players "+(i+1)+" details");
			System.out.println("Enter player name:");
			name=ip.next();
			System.out.println("Enter country name:");
			country=ip.next();
			System.out.println("Enter skill name:");
			skill=ip.next();
			s1[i]=new Skill();
			s1[i].setSkillName(skill);
			p1[i]=new Player(name,country,s1[i]);
			System.out.println(name+" "+country+" "+skill+"\n");
		}
		pB.viewDetails(p1);
		int ch;
		do {
			System.out.println("Menu:");
			System.out.println("1.View Details\n2.Filter Players with skill\n3.Exit\n");
			System.out.println("Enter your choice");
			ch=ip.nextInt();
			switch(ch) {
			case 1:pB.viewDetails(p1);
			break;
			case 2:System.out.println("Enter the skill:");
			String sk=ip.next();
			pB.printPlayerDetailswithSkill(p1, sk);
			break;
			}
		}
		while(ch!=3);
ip.close();
	}

}

