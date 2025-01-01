package javaPractice.ry;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryRY {
    List<LibraryItemRY> libraryItemRYList = new ArrayList<>();


    public void addItem(LibraryItemRY libraryItemRY){
        this.libraryItemRYList.add(libraryItemRY);
    }

    public List<LibraryItemRY> listAllItems(){
        return this.libraryItemRYList;
    }

    public LibraryItemRY findItemById( int id) {
        return this.libraryItemRYList.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);
    }
}
