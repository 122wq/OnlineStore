public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book();
        Movie c = new Movie();
        b.addAuthor(new Author("James Joyce", "02/02/1882"));
        b.setName("Dubliners");
        b.setPrice(99.21);
        System.out.println(b.getAuthNames());
        System.out.println(b.getBirDates());
        s.addItem(b);
        s.addItem(c);
        s.showItems();

        System.out.println(s.sellItem("testBook"));
        s.showItems();
        System.out.println(s.sellItem("Dubliners"));
        System.out.println(b instanceof ItemForSale);

        System.out.println(s.creator("asdsadas"));
        System.out.println(s.creator("testMovie"));
        System.out.println(s.sellItem("testMovie"));
     }
}
