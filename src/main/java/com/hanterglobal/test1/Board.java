package com.hanterglobal.test1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private Map<String, Category> categories;
    private List<Post> posts;

    public Board() {

        this.categories = new HashMap<>();
        this.posts = new ArrayList<>();
        registeredCategories();
    }

    public void addPost(String title, String content, String categoryId) throws IllegalAccessException {

        Category category = categories.get(categoryId);
        if(category == null) {
            throw new IllegalAccessException("카테고리 아이디가 유효하지 않습니다.");
        }
        Post post = new Post(title, content, categoryId);
        posts.add(post);
    }

    public List<Post> getPost(String categoryId) throws IllegalAccessException {

        List<Post> searchPost = new ArrayList<>();
        for(Post post : posts) {
            if(checkCategory(post.getCategory(), categoryId)) {
                searchPost.add(post);
            }
        }
        return searchPost;
    }

    public String getJson(List<Post> searchPost) {
        return new Gson().toJson(searchPost);
    }

    private boolean checkCategory(String parentIdx, String childId) throws IllegalAccessException {

        if(parentIdx.equals(childId)) {
            return true;
        }

        Category category = categories.get(childId);
        if(category == null) {
            throw new IllegalAccessException("childId가 유효하지 않습니다.");
        }
        while(category.getParentIdx() != 0) {
            if(String.valueOf(category.getParentIdx()).equals(parentIdx)) {
                return true;
            }
            category = categories.get(String.valueOf(category.getParentIdx()));
        }
        return false;
    }

    private void registeredCategories() {
        categories.put("male", new Category(0, 1));
        categories.put("female", new Category(0, 2));
        categories.put("boyGroup", new Category(1, 3));
        categories.put("girlGroup", new Category(2, 4));
        categories.put("boyIdol", new Category(3, 5));
        categories.put("girlIdol", new Category(4, 6));
        categories.put("anonymous", new Category(0, 7));
    }
}
