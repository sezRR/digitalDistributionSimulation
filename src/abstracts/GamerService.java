package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface GamerService {
	void buyGame(Gamer gamer, Game game, Campaign campaign);
}
