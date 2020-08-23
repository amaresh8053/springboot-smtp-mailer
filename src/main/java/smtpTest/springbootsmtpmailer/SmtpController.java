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
    public String index(){
       return "Spring Boot & Amazon SES Example;";
    }
    @PostMapping("/send")
    public void send(@RequestBody Request request){
        smtpService.send(request);
       // return request;
    }
}
