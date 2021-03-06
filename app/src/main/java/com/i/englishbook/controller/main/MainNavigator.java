package com.i.englishbook.controller.main;

import android.view.View;

import com.i.englishbook.model.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huytran on 9/26/2017.
 */

public interface MainNavigator {
    void getCategoriesComplete(List<Category> categories);

    void getCategoriesError(String mess);

    void cateOnClick(View view);
}
