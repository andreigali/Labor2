package Controller;

import Model.Auto;
import View.AutoView;

public class CourseController
{
    private Auto model;
    private AutoView view;

    public CourseController(Auto model, AutoView view){
        this.model = model;
        this.view = view;
    }

    public void setCourseName(String name){
        model.setName(name);
    }

    public String getCourseName(){
        return model.getName();
    }

    public void setCourseId(String id){
        model.setId(id);
    }

    public String getCourseId(){
        return model.getId();
    }

    public void setCourseCategory(String category){
        model.setCategory(category);
    }

    public String getCourseCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printCourseDetails(model.getName(), model.getId(), model.getCategory());
    }
}
