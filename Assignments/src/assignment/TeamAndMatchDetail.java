package assignment;

class Player1{                                              
	   private String name;                                    
	   private String country;                                 
	   private String skill;                                    
	                                                           
	   public Player1(String name,String country,String skill) { 
		   super();                                            
		   this.name=name;                                     
		   this.country=country;                                                      
		   this.skill=skill;                                   
	   }                                                       
	   public String getName(){                                
		   return name;                                        
	   }                                                       
	   public String getCountry(){                             
		   return country;                                     
	   }                                                       
	   public String getSkill() {                               
		   return skill;                                       
	   }                                                       
	   public void setName(String name) {                      
		   this.name=name;                                     
	   }                                                       
	   public void setCountry(String country) {                
		   this.country=country;                               
	   }                                                       
	   public void setSkill(String skill) {                     
		   this.skill=skill;                                   
	   }                                                       
		   
	   }

class Team{
	private String name;
	private Player1 player;
	
	public Team(String name,Player1 player) {
		this.name=name;
		this.player=player;
	}
	
	public String getName(){                                
		   return name;                                        
	   }        
	
	public Player1 getPlayer(){                                
		   return player;                                        
	   }     
	
	public void setName(String name) {                      
		   this.name=name;                                     
	   }                                      
	
	public void setPlayer(Player1 player) {                      
		   this.player=player;                                     
	   }                                      
}


class Match {
	private String date;
	private Team teamOne;
	private Team teamTwo;
	private String venue;
	private Team team;
	
	public Match(String date,Team teamOne,Team teamTwo,String venue) {
		super();
		this.date=date;
		this.teamOne=teamOne;
		this.teamTwo=teamTwo;
		this.venue=venue;
	}
	public String getData() {
		return date;
	}
	public Team getTeamOne() {
		return teamOne;
	}
	public Team getTeamTwo() {
		return teamTwo;
	}
	public String getVenue() {
		return venue;
	}
	public Team getTeam() {
		return team;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public void setTeamOne(Team teamOne) {
		this.teamOne=teamOne;
	}
	public void setTeamTwo(Team teamTwo) {
		this.teamTwo=teamTwo;
	}
	public void setVenue(String venue) {
		this.venue=venue;
	}
	public void setTeam(Team team) {
		this.team=team;
	}
}

public class TeamAndMatchDetail {

	public static void main(String[] args) {
		System.out.println("Hiiiiiiiii");

	}

}
