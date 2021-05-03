package concretes;

import java.util.Calendar;

import abstracts.GameService;
import entities.Game;

public class GameManager extends BaseEntityRepository<Game> implements GameService {

	@Override
	public void publishGame(Game game) {
		System.out.println(game.getGameName() + " is going to publish to gamer community on " + game.getReleaseDate().get(Calendar.YEAR) + "/" + game.getReleaseDate().get(Calendar.MONTH) + "/" + game.getReleaseDate().get(Calendar.DATE) + "! (YYYY/MM/DD)");
	}

}
