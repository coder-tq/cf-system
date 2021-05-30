package cn.coder_tq.core.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author coder_tq
 * @Date 2021/5/30 18:27
 */
@Component
public class EmailUtil {
    @Resource
    private JavaMailSender mailSender;

    @Value(value = "${spring.mail.email-from}")
    private String emailFrom;

    public boolean sendEmail(String to, String subject, String text){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        // 设置收件人，寄件人
        simpleMailMessage.setTo(to);
        simpleMailMessage.setFrom(emailFrom);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(text);
        // 发送邮件
        mailSender.send(simpleMailMessage);
        return true;
    }
}
