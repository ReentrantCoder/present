import javax.persistence.*;

@Entity
@Table(name = "Behm_Book")
class Book extends Media
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int ISBN;
	
	private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	}
	public int compareTo(Media o) {
		if (o instanceof DVD) {return 1;}
		
		if (this.getTitle().equals(o.getTitle()))
			return this.getAuthor().compareTo(((Book)o).getAuthor());
		return this.getTitle().compareTo(o.getTitle());
	}
}

