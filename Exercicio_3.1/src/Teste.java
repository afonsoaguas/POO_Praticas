
public class Teste {

	public static void main(String[] args) {
		SortedIntArray list = new SortedIntArray(new Ascending());
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(9);
		
		System.out.println("Lista Crescente: " + list);
		
		SortedIntArray list2 = new SortedIntArray(new AscendingEven());
		list2.add(3);
		list2.add(2);
		list2.add(4);
		list2.add(9);
		
		System.out.println("Lista Crescente: " + list2);
	}

}
