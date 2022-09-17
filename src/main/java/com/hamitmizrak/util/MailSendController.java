package com.hamitmizrak.util;

import org.apache.commons.lang3.CharEncoding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.File;

@Controller
public class MailSendController {

  /*  @Autowired
    private JavaMailSender mailSender;

    //http://localhost:8080/contact1
    @GetMapping("/contact1")
    @ResponseBody
    public String showContactForm() {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("hamitmizrak@gmail.com");
        message.setTo("hrpmuhendislik44@gmail.com");

        String mailSubject = "fullname" + " gönderdi";
        message.setSubject(mailSubject);

        String mailContent = "Hamit Mızrak" + "\n" + "<h4>Merhabalar</h4>" + "\n" + " mail:" + "hrpmuhendislik44@gmail.com";
        message.setText(mailContent);
        mailSender.send(message);
        return "mail gönderildi";
    }

    //http://localhost:8080/contact2
    @GetMapping("/contact2")
    @ResponseBody
    public String showContactForm2() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new  MimeMessageHelper(mimeMessage, true, CharEncoding.UTF_8);

        String from = "hamitmizrak@gmail.com";
        String to = "hrpmuhendislik44@gmail.com";
        String content = "<b>Merhabalar</b>,<br><i>Please look at this nice picture:.</i>" + "<br><img src='cid:image001'/><br><b>Best Regards</b>";

        try {
            messageHelper.setSubject("Konu alanı");
            messageHelper.setFrom(from);
            messageHelper.setTo(to);
            messageHelper.setText(content, true);

            //pdf txt resim göndermek
            FileSystemResource pdf = new FileSystemResource(new File("C:\\fileio\\document.pdf"));
            messageHelper.addAttachment("document.pdf", pdf);

            messageHelper.addAttachment("deneme.txt", new FileSystemResource(new File("C:\\fileio\\deneme.txt")));

            FileSystemResource resim = new FileSystemResource(new File("C:\\fileio\\document.pdf"));
            messageHelper.addAttachment("picture.png",  resim);
            messageHelper.addInline("image001", resim);
        } catch (MessagingException e) {
            e.printStackTrace();
            return "Gönderim Sırasında hata meydana geldi.";
        }
        mailSender.send(mimeMessage);
        return "Mail Gönderildi";
    }

*/
}
