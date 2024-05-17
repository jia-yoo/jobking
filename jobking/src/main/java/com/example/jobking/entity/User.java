package com.example.jobking.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "user")
public class User extends BaseEntity {

	@Id
    @Column(name = "uid", nullable = false, unique = true, length = 20)
    private String uid;
    
    @Column(name = "uname", nullable = false, length = 50)
    private String uname;
    
    @Column(name = "upw", nullable = false)
    private String upw;
    
    @Column(name = "birthDate", nullable = false)
    private Date birthDate;
    
    @Column(name = "gender", nullable = false)
    private String gender;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "tel", nullable = false)
    private String tel;
    
    @Column(name = "uaddr", nullable = false)
    private String uaddr;
    
    @Column(name = "photo")
    private String photo;
}