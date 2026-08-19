package interfaces;

import java.util.List;

public interface Searchable<Type> {
    Type searchById(Integer id);
    List<Type> search(String keyword);
}
