package smtpTest.springbootsmtpmailer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmtpController {

    @Autowired
    SmtpService smtpService;

    @GetMapping("/")
    public Boolean index(){
        Request r=new Request();
        r.setBody("test");
        r.setFrom("support@nextprimecloud.com");
        r.setSubject("test subject");
        r.setTo("amreshpattnaik6@gmail.com");
        smtpService.send(r);
        return true;
    }
    @PostMapping("/send")
    public void send(@RequestBody Request request){
        smtpService.send(request);
       // return request;
    }
}
