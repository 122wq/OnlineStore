/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{
  double profit;
  ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();

  public Store()
  {
    profit = 0.0;
  }

  public void showItems()
  {
    String allNames = "";
    for (int i = 0; i < items.size(); i++)
    {
      allNames += items.get(i).getName() + " ";
    }
    System.out.println(allNames);
  }

  public void addItem(ItemForSale au)
  {
    items.add(au);
  }

  public double sellItem(String itemName)
  {
    for (int i = 0; i < items.size(); i++)
    {
      if (items.get(i).equals(itemName))
      {
        profit += items.get(i).getPrice();
        items.remove(i);
        i--;
      }
    }
    return profit;
  }

  public String creator(String itemName)
  {
    for (int i = 0; i < items.size(); i++)
    {
      if (items.get(i).equals(itemName))
      {
        return items.get(i).getCreator();
      }
    }
    return "Item does not exist";
  }
}
