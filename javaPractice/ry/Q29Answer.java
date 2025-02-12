package javaPractice.ry;

import java.util.*;
import java.util.stream.Collectors;

public class Q29Answer {
    private List<String> list = new ArrayList<>();


    public List<String> groceryList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select one of the options below...");
        System.out.println("0 - To exit the program");
        System.out.println("1 - To add groceries to the shopping list");
        System.out.println("2 - To remove groceries from the shopping list");
        try{
           int input = sc.nextInt();
           if(!"0_1_2".contains(String.valueOf(input))) {
               throw new Exception("You need to enter a number from this list 0 ,1 ,2");
           }
           if(input == 0) {
               System.out.println("Thanks for shopping with us.");
               sc.close();
           } else if (input == 1) {
               System.out.println("Please enter the items you wish to buy (etc. apple, orange, ...)");
               sc.nextLine();
               String listStr = sc.nextLine();
               String[] listStrArr = listStr.split(",");
               for(String item: listStrArr) {
                   this.list.add(toProperWord(item));
               }
               System.out.println("Here is the list you want to buy");
               System.out.println(list);
               decision(sc);
           } else if (input == 2) {
               if(list.size() == 0) {
                   System.out.println("You need to add some items to your card before removing some or all.");
                   groceryList();
               } else {
                   System.out.println("Please enter the list of items to remove from the shopping list " + this.list);
                   sc.nextLine();
                  String itemsToRemoveStr = sc.nextLine();
                  list = list.stream().filter(item -> !itemsToRemoveStr.toLowerCase(Locale.ROOT).contains(item.toLowerCase(Locale.ROOT))).collect(Collectors.toList());
                   System.out.println("Following items are removed from the list ");
                   System.out.println(Arrays.stream(itemsToRemoveStr.split(",")).map(item -> toProperWord(item)).collect(Collectors.toList()));
                   System.out.println("new shopping list is :" +list);
                   decision(sc);
               }
           }
        } catch (InputMismatchException e ) {
            System.out.println("You need to enter a digit from the list 0, 1, 2");
            groceryList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


public void decision(Scanner sc) {
    System.out.println("What do you want to do? 'Yes' for continue and 'No' for complete the shopping!");
        String result = sc.nextLine();
    if("yes".equals(result.toLowerCase(Locale.ROOT))) {
        groceryList();
    } else if("no".equals(result.toLowerCase(Locale.ROOT))) {
        sc.close();
        System.out.println("Thanks for shopping with us!");
    } else {
        System.out.println("Please enter either 'Yes' or 'No'!!!!");
        decision(sc);
    }
}

public String toProperWord(String str) {
        str = str.trim();
        if(str.length() > 1){
            return str.substring(0,1).toUpperCase(Locale.ROOT)+ str.substring(1).toLowerCase(Locale.ROOT);
        } else {
            return str.toUpperCase(Locale.ROOT);
        }
}

}
