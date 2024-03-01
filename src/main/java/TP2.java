public class TP2 {
    /**
     * TP2 Qualite R2. Inutile en soit mais bon..
     * @author Alban-Moussa
     * 
     */
	public static void main(String[] args) {
        Pile maPile = new Pile(10);
        Pile p = new Pile();
        try {
        	if (!maPile.est_vide()) System.out.println("NOK1");
        	maPile.empiler(5);
        	if (maPile.est_vide()) System.out.println("NOK2");
        	int element = maPile.depiler();
        	if (!maPile.est_vide()) System.out.println("NOK3");
        	if (element != 5) System.out.println("NOK4");
        	
            p.empiler(4);
            int elmt = p.depiler();
            System.out.println(elmt);
            
            p.empilerPlusieursFois(4, 8);
            p.printPile();
            
            Pile dupe = p.DupliquerPile();
            dupe.depiler();
            dupe.printPile();
            p.printPile();
        }catch (Exception e) { System.out.println(e);}
	}
}
