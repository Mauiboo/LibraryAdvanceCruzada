public class Book {
	private String title;
    private String author;
    private int numCopies;
    
    public Book(String title, String author, int numCopies) {
        this.title = title;
        this.author = author;
        this.numCopies = numCopies;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getNumCopies() {
        return numCopies;
    }
    
    public void rentCopy() {
    	if (numCopies > 0)
        numCopies--;
    }
    
    public void returnCopy() {
        numCopies++;
    }
}

