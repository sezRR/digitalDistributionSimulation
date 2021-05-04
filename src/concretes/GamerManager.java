package concretes;

import java.util.Calendar;

import abstracts.EntityRepositoryService;
import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GamerManager extends BaseEntityRepository<Gamer> implements GamerService {

	GamerCheckService gamerCheckService;
	EntityRepositoryService<Gamer> entityRepositoryService;
	
	public GamerManager(GamerCheckService gamerCheckService, EntityRepositoryService<Gamer> entityRepositoryService) {
		this.gamerCheckService = gamerCheckService;
		this.entityRepositoryService = entityRepositoryService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealInformation(gamer)) {
			this.entityRepositoryService.add(gamer);
			return;
		} else {
			System.err.println("Not a valid person");
			return;
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(this.gamerCheckService.checkIfRealInformation(gamer)) {
			this.entityRepositoryService.update(gamer);
			return;
		} else {
			System.err.println("Not a valid person");
			return;
		}
	}

	@Override
	public void delete(Gamer gamer) {
		this.entityRepositoryService.delete(gamer);
	}

	@Override
	public void buyGame(Gamer gamer, Game game) {
		Calendar now = Calendar.getInstance();
		var month = now.get(Calendar.MONTH) + 1;

		System.out.println("\nNEW PURCHASE");
		System.out.println("---------------------------------");
		System.out.println("Game: " + game.getGameName());
		System.out.println("Price: " + game.getGamePrice() + "$");
		System.out.println("Purchased at: " + now.get(Calendar.YEAR) + "/" + month + "/" + now.get(Calendar.DATE) + " " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		System.out.println("---------------------------------");
		System.out.println("Purchased by: " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void buyGame(Gamer gamer, Game game, Campaign campaign) {
		Calendar now = Calendar.getInstance();
		var month = now.get(Calendar.MONTH) + 1;
		
		var gamePrice = game.getGamePrice();

		var discountAmount = (campaign.getPercentageOfDiscount()*game.getGamePrice()) / 100;
		gamePrice = game.getGamePrice() - discountAmount;

		System.out.println("\nNEW PURCHASE | " + campaign.getCampaignName());
		System.out.println("---------------------------------");
		System.out.println("Game: " + game.getGameName());
		System.out.println("Price ("+ campaign.getPercentageOfDiscount() +"% | +"+discountAmount+"$): " + gamePrice + "$ paid" + " (Discountless: " + game.getGamePrice() + "$)");
		System.out.println("Purchased at: " + now.get(Calendar.YEAR) + "/" + month + "/" + now.get(Calendar.DATE) + " " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		System.out.println("---------------------------------");
		System.out.println("Purchased by: " + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
}
