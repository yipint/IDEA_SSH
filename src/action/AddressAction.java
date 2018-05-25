package action;

import bean.Addresslist;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.AddressImpl;

import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 * Created by 89345 on 2018-5-23.
 */
public class AddressAction extends ActionSupport{
    private String name;
    private String phone;
    @Autowired
    private AddressImpl address;


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {

        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String add()
    {
        Addresslist al = new Addresslist();
        al.setName(getName());
        al.setPhone(getPhone());
        address.add(al);
        return SUCCESS;
    }

    public void setAddress(AddressImpl address) {
        this.address = address;
    }
}
