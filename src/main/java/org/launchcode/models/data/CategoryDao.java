package org.launchcode.models.data;

import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jarrett on 6/19/2017.
 */
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
