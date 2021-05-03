package concretes;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealInformation(Gamer gamer) {
		int range = (2 - 1) + 1;     
		var result = (int)(Math.random() * range) == 1 ? true : false;
		return result;
	}

}
