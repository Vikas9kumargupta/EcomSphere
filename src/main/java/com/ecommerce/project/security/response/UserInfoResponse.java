package com.ecommerce.project.security.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class UserInfoResponse {

    private Long id;
    //private String jwtToken;   No need to use it as we are using jwt-Cookie based authentication
    private String username;
    private List<String> roles;

    public UserInfoResponse(Long id, String username, List<String> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
    }

    public Long getId(){ return id;}
    public void setId(Long id){this.id = id;}
    public List<String> getRoles() {return roles;}
    public void setRoles(List<String> roles) {this.roles = roles;}
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
//    public String getJwtToken() { return jwtToken; }
//    public void setJwtToken(String jwtToken) {this.jwtToken = jwtToken;}

//    public UserInfoResponse(Long id,String username, List<String> roles, String jwtToken){
//        this.id = id;
//        this.username = username;
//        this.roles = roles;
////        this.jwtToken = jwtToken;
//    }

}