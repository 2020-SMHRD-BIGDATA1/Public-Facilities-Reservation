package Controller;

import Model.MatchingDAO;
import Model.MatchingVO;

public class MatchingSystem {
	private MatchingDAO dao = new MatchingDAO();
	private MatchingVO area_name;

	public boolean name(MatchingVO area) {
		area_name = dao.check(area);
		if (area_name == null) {
			return false;
		} else {
			return false;
		}
	}
}
