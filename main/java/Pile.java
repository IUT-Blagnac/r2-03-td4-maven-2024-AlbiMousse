public class Pile {
	private int taille;
	private int[] tabPile;
	 /**
     * Définit le type pile.
     * @author Alban-Moussa
     * 
     */
	Pile(){
		this.tabPile = new int[100];
		this.taille = -1;
	}
	
	Pile(int pfTaille){
		this.tabPile = new int[pfTaille];
		this.taille = -1;
	}
	/**
     * Vérifie si la pile est vide.
     * @author Alban-Moussa
     * return true/false selon le statut
     */
	public boolean est_vide(){
		if (this.taille == -1) {
			return true;
		}else {
			return false;
		}
	}
	/**
     * Vérifie si la pile est pleine
     * @author Alban-Moussa
     * return true/false selon le statut
     */
	public boolean estPlein() {
		if (this.taille + 1 == this.tabPile.length) {
			return true;
		}else {
			return false;
		}
	}
	/**
     * Ajoute un élément à la pile
	 * pfObject IN : L'objet à ajouter
	 * @throws Exception e: Si la pile est pleine
     * @author Alban-Moussa
     * return this : la pile modifiée
     */
	public Pile empiler(int pfObject) throws Exception{
		if (this.estPlein()) {
			throw new Exception("Cannot append an element to the pile : Pile is full.");
		}
		this.taille += 1;
		this.tabPile[this.taille] = pfObject;
		return this;
	}
	/**
     * Enleve un element a la pile
	 * @throws Exception e: Si la pile est vide
     * @author Alban-Moussa
     * return value : la valeur retirée
     */
	public int depiler() throws Exception{
		if (this.est_vide()) {
			throw new Exception("Cannot remove element from pile : Pile is empty.");
		}
		int value = this.tabPile[this.taille];
		this.tabPile[this.taille] = 0;
		this.taille -= 1;
		return value;
	}
	/**
     * Ajoute plusisuers fois un element
	 * pfValue IN : La valeur a ajouter
	 * pfAmount IN : Le nombre de fois qu'il faut l'ajouter
	 * return this : La pile modifiée
	 * @throws Exception e: Si la pile ne pourra accepter tout les élements à ajouter
     * @author Alban-Moussa
     * 
     */
	public Pile empilerPlusieursFois(int pfValue, int pfAmount) throws Exception{
		if (this.taille + pfAmount + 1 >= this.tabPile.length) {
			throw new Exception ("Appending the required amount of value will result in an OutOfRange error.");
		}
		for (int i = 0; i <= pfAmount; i++) {
			this.empiler(pfValue);
		}
		return this;
	}
		/**
     * Duplique la pile
     * @author Alban-Moussa
     * return dupe : la pile dupliquée
     */
	public Pile DupliquerPile() {
		Pile dupe = new Pile(this.tabPile.length);
		for (int i = 0; i < dupe.tabPile.length; i++) {
			try {
				dupe.empiler(this.tabPile[i]);
			}catch (Exception e) {}
		}
		dupe.taille = this.taille;
		return dupe;
	}
	/**
     * Renvoie la valeur du sommet
     * @author Alban-Moussa
     * return this.taille : L'index de l'élément le plus haut
     */
	public int sommet() throws Exception{
		if (this.est_vide()) {
			throw new Exception("Cannot collect current height of pile : Pile is empty.");
		}
		return this.taille;
	}
	
	public void printPile() {
		System.out.println("Output :");
		for (int i = 0; i < this.taille; i++) {
			System.out.println(this.tabPile[i]);
		}
		System.out.println(this.taille + " declared values out of "+this.tabPile.length+ " slots.");
	}
	
	public void vider() {
		for (int i = 0; i < this.taille; i++) {
			this.tabPile[i] = 0;
		}
		this.taille = -1;
	}
}