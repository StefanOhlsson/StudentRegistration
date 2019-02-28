package student;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Stefan Ohlsson
 */
@Named(value = "studentBean")
@RequestScoped
public class StudentBean {

    private String firstName;
    private String lastName;
    private Integer age;
    private String ort;
    
    // a bean Subject
    @Inject
    private Subject subject;
    
    
    @Inject 
    private NavigationController nav;
    
    public NavigationController getNavigationController(){
        return nav;
    }
    
    public void setNavigationController(NavigationController navigationController){
        this.nav=navigationController;
    }

    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

   

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public NavigationController getNav() {
        return nav;
    }

    public void setNav(NavigationController nav) {
        this.nav = nav;
    }



   

}
