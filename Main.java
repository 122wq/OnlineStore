public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book();
        Movie c = new Movie();
        s.addItem(b);
        s.addItem(c);
        s.showItems();
        System.out.println(b.getBirDates());
        System.out.println(s.sellItem("testBook"));
        s.showItems();
        System.out.println(s.sellItem("testMovie"));
        System.out.println(b instanceof ItemForSale);
     }
}
