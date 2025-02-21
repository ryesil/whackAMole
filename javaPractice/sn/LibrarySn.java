package javaPractice.sn;

import java.util.ArrayList;
import java.util.List;

public class LibrarySn {

    List<LibraryItemSn> itemSns = new ArrayList<>();

    public void addItem(LibraryItemSn libraryItemSn){
        itemSns.add(libraryItemSn);
    }
    public void listAllItems(){
        for (LibraryItemSn item : itemSns) {
            System.out.println(item.getDetails());
        }
    }
    public String findItemById(int id){
        for (LibraryItemSn item : itemSns) {
            if (item.getId() == id) {
                return item.getDetails();
            }
        }
        return "Item not found!";
    }
}
