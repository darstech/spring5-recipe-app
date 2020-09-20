package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());

    }

    @Test
    public void getDescription() throws Exception {
        String desc = "TestRecipe";

        category.setDescription(desc);

        assertEquals(desc, category.getDescription());
    }

    @Test
    public void getRecipes() throws Exception {
    }
}