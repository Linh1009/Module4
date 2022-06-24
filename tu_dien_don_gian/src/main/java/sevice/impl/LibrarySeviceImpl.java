package sevice.impl;

import bean.Library;
import reponsitory.impl.LibraryReponsitoryImpl;
import sevice.LibrarySevice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrarySeviceImpl implements LibrarySevice {

    private LibraryReponsitoryImpl libraryReponsitory = new LibraryReponsitoryImpl();

    @Override
    public List<Library> findAll() {
        return libraryReponsitory.findAll();
    }
}
