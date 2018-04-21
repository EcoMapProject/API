package api.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(
        name = "users"
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(
            //updatable = false,
            //insertable = false,
            name = "username"
    )
    private String userName;

    @NotNull
    @Column
    private String password;
    @Transient
    private String matchingPassword;

    @NotNull
    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private Boolean enabled;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getId() {
        return id;
    }
}
