package no.steria.tddkurs.skuddår;

public class SkuddårVerktøy {

	public boolean erSkuddår(int årstall) {
		if(årstall < 0) {
			throw new IllegalArgumentException("Årstall er negativt");
		}
		
		if (deleligMed(årstall, 400)) {
			return true;
		} else {
			return !deleligMed(årstall, 100) && deleligMed(årstall, 4);
		}
	}

	private boolean deleligMed(int årstall, int tall) {
		return årstall % tall == 0;
	}
}
