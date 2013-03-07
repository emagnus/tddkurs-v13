package no.steria.tddkurs.skudd�r;

public class Skudd�rVerkt�y {

	public boolean erSkudd�r(int �rstall) {
		if(�rstall < 0) {
			throw new IllegalArgumentException("�rstall er negativt");
		}
		
		if (deleligMed(�rstall, 400)) {
			return true;
		} else {
			return !deleligMed(�rstall, 100) && deleligMed(�rstall, 4);
		}
	}

	private boolean deleligMed(int �rstall, int tall) {
		return �rstall % tall == 0;
	}
}
