import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainParty {

	public static void main(String[] args) {
		
		String[] adams = {"Zack", "Arvid", "Wilhem", "Anna", "Adam", "Albert", "Augustine", "Doris"};
		String[] eves = {"Stefan", "Sara", "Sune", "Hugo", "Lotta", "Anna", "Adam", "Albert", "Annton"};
		String[] Zacks = {"Kain", "Gabriel", "Mona", "Anna"};
		
		List<String> adamsFreinds = Arrays.asList(adams);
		List<String> evesFreinds = Arrays.asList(eves);
		List<String> zacksFreinds = Arrays.asList(Zacks);
		
		List<String> annasCloseFreinds = Arrays.asList("Adam", "Hugo", "Sara");
		
		System.out.println("Create a guestlist with zack, Adam and Eves freinds. No one can be invited twice!");
		System.out.print("GuestList: ");
		 Set<String> all = new HashSet(adamsFreinds);
		 all.addAll(evesFreinds);
		 all.addAll(zacksFreinds);
		 
		 all.stream()
		 .sorted((str1, str2) -> str1.compareToIgnoreCase(str2))
		 .forEach(name -> System.out.print(name + " " ));
		 
		 System.out.println("\n\n");
		 System.out.println("Adam and Eve do not like long names the limit is seven! Adam wants to be first in all lists no Name with an A!");
		 System.out.print("New GuestList: ");
		 all.stream()
		 .filter(name -> !name.contains("A") && name.length()<7 )
		 .sorted((str1, str2) -> str1.compareToIgnoreCase(str2))
		 .forEach(name -> System.out.print(name + " " ));
		 
		 System.out.println("\n\n");
		 System.out.println(" Eve had an fight with her closest freinds yesterday so her close freinds are not invited!");
		 
		 Set<String> annasCloseFriensSet = new HashSet(annasCloseFreinds);
		 System.out.print("New GuestList: ");
		 all.stream()
		 .filter(name -> !annasCloseFriensSet.contains(name) )
		 .sorted((str1, str2) -> str1.compareToIgnoreCase(str2))
		 .forEach(name -> System.out.print(name + " " ));
		 
		 System.out.println("\n\n");
		 System.out.println("Sune had an affair with Stefans wife, so if both are invited do not invite Sune!");
		 
		 ArrayList<String> SS = new ArrayList(Arrays.asList("Stefan", "Sune" ));
		 Set<String> SSSet = new HashSet(SS);
		 System.out.print("New GuestList: ");
		 	all.stream()
		 	.filter(name -> !(name.equals("Sune") && all.containsAll(SSSet)) )
		 	.sorted((str1, str2) -> str1.compareToIgnoreCase(str2))
		 	.forEach(name -> System.out.print(name + " " ));


	}

}




