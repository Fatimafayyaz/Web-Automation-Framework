package appointments;

import authentication.popup.HandlePopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduleAppointment extends HandlePopup {
    @FindBy(xpath = "//*[@id=\"logged_in_topnav\"]")
    public WebElement goToAppointmentLink;
    @FindBy(linkText = "Appointments")
    public WebElement scheduleAppointmentLink;
    @FindBy(css=".button.js")
    public WebElement scheduleAppointment;
    public WebElement getScheduleAppointment() {
        return scheduleAppointment;
    }
    public void setScheduleAppointment(WebElement scheduleAppointment) {
        this.scheduleAppointment = scheduleAppointment;
    }

    public WebElement getGoToAppointmentLink() {
        return goToAppointmentLink;
    }
    public void setGoToAppointmentLink(WebElement goToAppointmentLink) {
        this.goToAppointmentLink = goToAppointmentLink;
    }
    public WebElement getScheduleAppointmentLink() {
        return scheduleAppointmentLink;
    }
    public void setScheduleAppointmentLink(WebElement scheduleAppointmentLink) {
        this.scheduleAppointmentLink = scheduleAppointmentLink;
    }
    public void getAppointmentLink()
    {
        getGoToAppointmentLink().click();
    }
    public void getAppointment()throws InterruptedException{
        getScheduleAppointmentLink().click();
        Thread.sleep(2000);
        getScheduleAppointment().click();
    }
    public void scheduleAppointment(WebDriver driver) throws InterruptedException
    {
        getAppointmentLink();
        getAppointment();
    }

}
