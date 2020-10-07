package mergeapplication;
import java.io.Serializable;
import java.util.Arrays;

public class DogShowEntryModel implements Serializable {
	
	String DogName; 
    String DogBreed; 
    String OwnerName;
    String OwnerPhone; 
    String[] Categories;
	public DogShowEntryModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DogShowEntryModel(String dogName, String dogBreed, String ownerName, String ownerPhone,
			String[] categories) {
		super();
		DogName = dogName;
		DogBreed = dogBreed;
		OwnerName = ownerName;
		OwnerPhone = ownerPhone;
		Categories = categories;
	}
	public String getDogName() {
		return DogName;
	}
	public void setDogName(String dogName) {
		DogName = dogName;
	}
	public String getDogBreed() {
		return DogBreed;
	}
	public void setDogBreed(String dogBreed) {
		DogBreed = dogBreed;
	}
	public String getOwnerName() {
		return OwnerName;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	public String getOwnerPhone() {
		return OwnerPhone;
	}
	public void setOwnerPhone(String ownerPhone) {
		OwnerPhone = ownerPhone;
	}
	public String[] getCategories() {
		return Categories;
	}
	public void setCategories(String[] categories) {
		Categories = categories;
	}
	@Override
	public String toString() {
		return "DogShowEntryModel [DogName=" + DogName + ", DogBreed=" + DogBreed + ", OwnerName=" + OwnerName
				+ ", OwnerPhone=" + OwnerPhone + ", Categories=" + Arrays.toString(Categories) + "]";
	} 


	
     
}
