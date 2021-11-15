package blehblu.com;

public class ModelClassWonder {

    private String imgName;
    private String categoryName;

    public ModelClassWonder(String imgName, String categoryName) {
        this.imgName = imgName;
        this.categoryName = categoryName;
    }

    public String getImgName() {
        return imgName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
