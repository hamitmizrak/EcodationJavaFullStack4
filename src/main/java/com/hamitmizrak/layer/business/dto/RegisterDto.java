package com.hamitmizrak.layer.business.dto;

import com.hamitmizrak.layer.annotation.AnnotationRegisterUniqueEmailAddress;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto implements Serializable {
    public static final long serialVersionUID=1L;

    private Long id;

    @NotEmpty(message = "{register.name}")
    private String name;

    @NotEmpty(message = "{register.surname}")
    private String surname;

    @NotEmpty(message = "{register.email}")
    @Email(message = "email uygun formatta yazmadınız")
    @AnnotationRegisterUniqueEmailAddress
    private String email;

    @NotEmpty(message = "{register.password}")
    @Size(min = 7,max = 20,message = "Şifre en az 7 en fazla 20 olabilir")
    //@Pattern(regexp = "^[a-zA-Z0-9]{7}]")
    private String password;

    //now date
    private String date=nowDate();
    private String nowDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        return simpleDateFormat.format(new Date());
    }
}
