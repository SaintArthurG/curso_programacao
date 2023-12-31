package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date bithday;

    public Client() {
    }

    public Client(String name, String email, Date bithday) {
        this.name = name;
        this.email = email;
        this.bithday = bithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "(" + sdf.format(bithday) + ")" + email);
        return sb.toString();
    }
}
