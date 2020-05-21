package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsTracker() {
        String html =
                "<html>" +
                        "<body>" +
                        "<h1 style='font-size:10vw;text-align:center'>Skills Tracker</h1>" +
                        "<h2 style='font-size:5vw;text-align:center'>Some cool programming languages to learn!</h2>" +
                        "<ol style='font-size:2vw;text-align:center'>" +
                        "<li>JavaScript</li>" +
                        "<li>Java</li>" +
                        "<li>Python</li>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("language")
    public static String displayMessage(ServletRequest request) {
        String lang1 = request.getParameter("Language");
        String lang2 = request.getParameter("Language2");
        String lang3 = request.getParameter("Language3");
        String name = request.getParameter("name");
        String display = "<html" +
                "<body>" +
                "<h1 style='font-size:7vw;text-align:center'>" + name + "</h1>" +
                "<ol style='font-size:2vw;text-align:center'>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</body>" +
                "</html>";
        return display;
    }

    @GetMapping("form")
    public String usersChoice(){
        String html =
                "<html>" +
                        "<body style='text-align:center'>" +
                        "<form method = 'post' action='language'>" +
                        "<label for 'Name' style='font-size:2vw'>Name:</label>" +
                        "<br>" +
                        "<input type='text' name='name'/>" +
                        "<br>" +
                        "<label for='Language' style='font-size:2vw'>My favorite language:</label>" +
                        "<br>" +
                        "<select name='Language' id='Language'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='PHP'>PHP</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='Language' style='font-size:2vw'>My second favorite language:</label>" +
                        "<br>" +
                        "<select name='Language2' id='Language2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='PHP'>PHP</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select>" +
                        "<br>" +
                        "<label for='Language' style='font-size:2vw'>My third favorite language:</label>" +
                        "<br>" +
                        "<select name='Language3' id='Language3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='PHP'>PHP</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<input type='submit' value='Submit' style='font-size:2vw'/>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }
}
