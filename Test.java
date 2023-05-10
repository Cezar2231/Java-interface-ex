package Interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Magazine> magazines = new ArrayList<>();
		magazines.add(new Magazine("Weekend",new ArrayList<>(Arrays.asList(new Article(new Author(),"Page 1",LocalDate.of(2022, 10, 12))))));
		magazines.add(new Magazine("24 hours",new ArrayList<>(Arrays.asList(new Article(new Author(),"New Age",LocalDate.of(2022, 10, 19))))));
		Frequency f1= Frequency.Weekly;
		magazines.add(new PaperMagazine("New York Times", null, f1, 2 , LocalDate.of(2022,11, 17)));
		magazines.add(new PaperMagazine("Trud", null, f1, 1 , LocalDate.of(2022,11, 12)));
		for(Magazine m: magazines) {
			System.out.println(m);
	}
		magazines.sort(new Comparator<Magazine>() {

			@Override
			public int compare(Magazine o1, Magazine o2) {
				return o1.getMagName().compareTo(o2.getMagName());
			}
});
		System.out.println("\nMagazines sort by Name: ");
		for(Magazine m1 : magazines) {
			System.out.println(m1.toString());
		}
		
		Frequency f2= Frequency.Monthly;
		List<PaperMagazine> Pmagazines = new ArrayList<>();
		Pmagazines.add(new PaperMagazine("Off News",null,f1,4,LocalDate.of(2022,11, 19)));
		Pmagazines.add(new PaperMagazine("B News",null,f2,4,LocalDate.of(2022,12, 10)));
		Pmagazines.add(new PaperMagazine("iNews",null,f2,4,LocalDate.of(2021,11, 19)));
		System.out.println("\n\n");
		for(PaperMagazine mp : Pmagazines) {
			System.out.println(mp);
		}
		Pmagazines.sort(new Comparator<PaperMagazine>() {

			@Override
			public int compare(PaperMagazine p1, PaperMagazine p2) {
				return p2.getOutDate().compareTo(p1.getOutDate());
			}
		
});
		System.out.println("\nMagazines sort by Release Date: ");
		for(PaperMagazine m1 : Pmagazines) {
			System.out.println(m1.toString());
		}
}
}
