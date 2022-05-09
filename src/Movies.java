public class Movies {

	private String title;
	private String category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String make) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String make) {
		this.category = category;
	}

	public Movies() {

	}

	public Movies(String title, String category)// other constructor
	{
		this.title = title;
		this.category = category;
	}

	@Override
	public String toString() {
		return String.format("%-40s%-30s\n", title, category);
	}

}
