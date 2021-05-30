package com.coder_tq.core;

import cn.coder_tq.core.CoreApplication;
import cn.coder_tq.core.DO.UserInfo;
import cn.coder_tq.core.service.UserInfoService;
import cn.coder_tq.core.utils.EmailUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

/**
 * @author coder_tq
 * @Date 2021/5/30 18:34
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreApplication.class)
public class TestEmailUtil {

    @Test
    public void contextLoads() {
    }


    @Resource
    private JavaMailSender mailSender;

    @Autowired
    private EmailUtil emailUtil;

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 发送包含简单文本的邮件
     */
    @Test
    public void sendTxtMail() {
//        emailUtil.sendEmail("909413805@qq.com","test","hello!");
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        // 设置收件人，寄件人
//        simpleMailMessage.setTo(new String[]{"909413805@qq.com", "sqx2211@qq.com"});
//        simpleMailMessage.setFrom("admin@coder-tq.cn");
//        simpleMailMessage.setSubject("Spring Boot Mail 邮件测试【文本】");
//        simpleMailMessage.setText("这里是一段简单文本。");
//        // 发送邮件
//        mailSender.send(simpleMailMessage);

        System.out.println("邮件已发送");
    }

    /**
     * 发送包含HTML文本的邮件
     *
     * @throws Exception
     */
    @Test
    public void sendHtmlMail() throws Exception {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
        mimeMessageHelper.setTo("909413805@qq.com");
        mimeMessageHelper.setFrom("admin@coder-tq.cn");
        mimeMessageHelper.setSubject("Spring Boot Mail 邮件测试【HTML】");

        StringBuilder sb = new StringBuilder();
        sb.append("<html><head></head>");
        sb.append("<body><h1>spring 邮件测试</h1><p>hello!this is spring mail test。</p></body>");
        sb.append("</html>");

        // 启用html
        mimeMessageHelper.setText(sb.toString(), true);
        // 发送邮件
        mailSender.send(mimeMessage);

        System.out.println("邮件已发送");

    }

}
