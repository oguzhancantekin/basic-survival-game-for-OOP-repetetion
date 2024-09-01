import java.awt.image.PixelInterleavedSampleModel;

public abstract class BattleLoc extends Location {
protected Obstacle obstacle;
protected String itemaward;
	BattleLoc(Player player,String name,Obstacle obstacle,String itemaward) {
		super(player);
		this.name=name;
		this.obstacle=obstacle;
		this.itemaward=itemaward;
	}
	 public boolean getLocation() {
		  int obsCount=obstacle.Count();
	        System.out.println("Şu an " + getName() + " adlı yerdesiniz.");
	        System.out.println("Dikkatli ol burada "+ obsCount+" tane "+obstacle.getName()+" yasiyor!!!");
	        System.out.println("<S>avas  veya <K>ac ");
	        String selCase=scanner.next();
	        selCase=selCase.toUpperCase();
	        if(selCase.equals("S")) {
	        	if(Combat(obsCount)) {
	        		System.out.println(getName()+" Bolgesindeki Tum dusmanlari temizlediniz!!");
	        		if(itemaward.equals("Food")&&player.getInv().isFood()==false) {
	        			
	        		System.out.println(itemaward+" Kazandiniz!!!");
	        			player.getInv().setFood(true);
	        		}
	        		else if(itemaward.equals("Firewood")&&player.getInv().isFirewood()==false) {
	        			
		        		System.out.println(itemaward+" Kazandiniz!!!");
		        			player.getInv().setFirewood(true);
		        		}
	        		else if(itemaward.equals("Water")&&player.getInv().isWater()==false) {
	        			
		        		System.out.println(itemaward+" Kazandiniz!!!");
		        			player.getInv().setWater(true);
		        		}
	        		return true;
	        	}
	        	if(player.getHealth()<=0) {
	        		System.out.println("ÖLDÜNÜZ!!!");
	        		return false;
	        	}
	        }
			return true;
	        
	    }
	 
	 public boolean Combat(int obsCount) {
		 int defobshealth=obstacle.getHealth();
		 for(int i=0;i<obsCount;i++) {
			 playerStats();
			 enemyStats();
			 
			 while(player.getHealth()>0&&obstacle.getHealth()>0) {
				 System.out.println("<V>ur veya <K>ac");
				 String selCase=scanner.next();
				 selCase=selCase.toUpperCase();
			        if(selCase.equals("V")) {
			        	System.out.println("siz vurdunuz");
			        	obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
			        	afterhit();
			        	  if (obstacle.getHealth() > 0) {
			        	        System.out.println("Canavar size vurdu");
			        	        if (obstacle.getDamage()-player.getTotalArmor()<=0) {
			        	        	 player.setHealth(player.getHealth());
					        	        afterhit();
					        	        break;
									
								}
			        	        else {
			        	        player.setHealth(player.getHealth() - (obstacle.getDamage() - player.getTotalArmor()));
			        	        afterhit();
			        	        }
			        	    }}
			        else {
			        	return false;
			        }
			        
			 }
			        if(obstacle.getHealth()<=0&&player.getHealth()>0) {
			        	System.out.println("dusmani yendiniz");
			        	player.setMoney(player.getMoney()+obstacle.getAward());
			        	System.out.println("Guncel Paraniz: "+player.getMoney());
			        	obstacle.setHealth(defobshealth);
			        }
			 
			
		 }
	 
		return true;
	 
	 }
	 public void afterhit() {
		 System.out.println("Sizin caniniz: "+player.getHealth());
		 System.out.println(obstacle.getName()+" cani: "+obstacle.getHealth());
		 System.out.println();
	 }
	 public void playerStats() {
		 System.out.println("---------- Oyuncu Degerleri ----------");
		 System.out.println("Can:"+player.getHealth());
		 
		 System.out.println("Hasar:"+player.getTotalDamage());
		 System.out.println("Para:"+player.getMoney());
		 if(player.getInv().getDamage()>0) {
			 System.out.println("Silah: "+player.getInv().getwName());
		 }
		 if(player.getInv().getArmor()>0) {
			 System.out.println("Zirh: "+player.getInv().getaName());
		 }
		 
	 }
	 public void enemyStats() {
		 System.out.println("\n----------" +obstacle.getName()+ "Degerleri ----------");
		 System.out.println("Can:"+obstacle.getHealth());
		 System.out.println("Hasar:"+obstacle.getDamage());
		 System.out.println("Odul: "+obstacle.getAward());
		 
	 }
	 
	 
	 
	 
}