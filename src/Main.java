import java.util.Calendar;

import concretes.BaseEntityRepository;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerCheckManager;
import concretes.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(2005, 8, 9);
		
		Gamer gamer1 = new Gamer(1, "42742461095", "Sezer", "Tetik", dateOfBirth);
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager(), new BaseEntityRepository<Gamer>());
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		
		System.out.println("\n///////////////////////\n");
		
		Calendar releaseDate = Calendar.getInstance();
		releaseDate.set(2021, 1, 1);
		
		Game game1 = new Game(1, "Cyberpunk 2077", releaseDate, 70);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		gameManager.publishGame(game1);
		
		System.out.println("\n///////////////////////\n");
		
		Calendar beginningDateOfCampaign = Calendar.getInstance();
		beginningDateOfCampaign.set(2021, 5, 3);
		
		Calendar endingDateOfCampaign = Calendar.getInstance();
		endingDateOfCampaign.set(2021, 5, 27);
		
		Campaign campaign = new Campaign(1, "Golden Week Sale", beginningDateOfCampaign, endingDateOfCampaign, 20);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		campaignManager.getDetailsOfCampaign(campaign);
		
		System.out.println("\n///////////////////////\n");
		gamerManager.buyGame(gamer1, game1);
	}

}
