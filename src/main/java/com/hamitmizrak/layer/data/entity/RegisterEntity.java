package com.hamitmizrak.layer.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//Entity
@Entity
@Table(name="register")
public class RegisterEntity extends BaseEntity implements Serializable {
    public static final long serialVersionUID=1L;

    private String name;
    private String surname;
    private String email;

    @Column(name = "password",length =20,nullable = false,unique = true )
    private String password;

    //Database ekleme yapmaz
    @Transient
    private String justJava;

}
