package student;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Stefan Ohlsson
 */
//@Named(value = "navigationController")
@Named
@RequestScoped
public class NavigationController {

    private String location;

    public String navigate() {

        if (this.location.equals("Göteborg")) {
            return "confirmation";
        } else {
            return "confirmation2";
        }
    }

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
