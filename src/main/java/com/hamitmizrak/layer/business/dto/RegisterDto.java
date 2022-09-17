package com.hamitmizrak.layer.business.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterDto {

    private Long id;

    @NotEmpty(message = "üye adı boş geçilemez")
    private String registerName;

    @NotEmpty(message = "üye soyadı boş geçilemez")
    private String registerSurname;

    @NotEmpty(message = "üye email adresi boş geçilemez")
    @Email(message = "email uygun formatta yazmadınız")
    private String registerEmail;

    @NotEmpty(message = "üye şifre boş geçilemez")
    @Size(min = 7,max = 20,message = "Şifre en az 7 en fazla 20 olabilir")
    @Pattern(regexp = "^[a-zA-Z09]{7}]")
    private String registerPassword;

    private String getName=nowDate();

    private String nowDate() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        return simpleDateFormat.format(new Date());
    }
}
