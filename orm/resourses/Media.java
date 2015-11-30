import javax.persistence.MappedSuperclass;

@MappedSuperclass
abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }
	public abstract int compareTo(Media o);
}
