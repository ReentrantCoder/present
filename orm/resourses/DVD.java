import javax.persistence.*;

@Entity
@Table(name = "Behm_DVD")
class DVD extends Media
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int ISBN;
	
	@Column(name = "Year", nullable = false)
	private int year;
	
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
	public int getYear() 	 { return year;  }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
	public int compareTo(Media o) {
		if (o instanceof Book) {return -1;}
		
		if (this.getTitle().equals(o.getTitle()))
			return this.getYear() - ((DVD)o).getYear();
		return this.getTitle().compareTo(o.getTitle());
	}	
}
