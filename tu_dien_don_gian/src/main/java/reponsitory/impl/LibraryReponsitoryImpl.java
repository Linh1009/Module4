package reponsitory.impl;

import bean.Library;
import reponsitory.LibraryReponsitory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryReponsitoryImpl implements LibraryReponsitory {
    private static Map<Integer, Library> librarys = new HashMap<>();
    static {
        librarys.put(1, new Library("1", "one"));
        librarys.put(2, new Library("2", "two"));
        librarys.put(3, new Library("cat", "con meo"));
        librarys.put(4, new Library("dog", "con cho"));
        librarys.put(5, new Library("goodbye", "tam biet"));
        librarys.put(6, new Library("rat", "con chuot"));
    }
    @Override
    public List<Library> findAll() {
        return new ArrayList<>(librarys.values());
    }
}
