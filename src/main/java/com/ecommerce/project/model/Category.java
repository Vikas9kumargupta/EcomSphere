package com.ecommerce.project.model;



public class Category {


    private Long id;
    private String categoryName;

    public Category(){
    }

    public Category(Long categoryId, String categoryName){
        this.id=categoryId;
        this.categoryName=categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
