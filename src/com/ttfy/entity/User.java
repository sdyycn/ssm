package com.ttfy.entity;
 
import java.io.Serializable;
 
import org.springframework.stereotype.Repository;
 
/** 
 *  
 * @author mwg 
 * @date 2016-03-05 16:38 
 */  
@Repository(value = "user") 
public class User implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -4615930395278310082L;
	private Integer id;
    private String name;
    private String pass;
    private Integer age;
     
    public User(){}
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
     
     
}
