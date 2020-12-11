package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.DTO.UserDto;
import org.academiadecodigo.bootcamp.converters.DtoToUser;
import org.academiadecodigo.bootcamp.converters.UserToDto;
import org.academiadecodigo.bootcamp.persistence.model.*;
import org.academiadecodigo.bootcamp.services.ActionService;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("user")
public class LoginController {

    private LoginService loginService;
    private UserService userService;
    private ActionService actionService;
    private UserToDto userToDto;
    private DtoToUser dtoToUser;

    @Autowired
    //Set Login Service
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setDtoToUser(DtoToUser dtoToUser) {
        this.dtoToUser = dtoToUser;
    }

    @Autowired
    public void setUserToDto(UserToDto userToDto) {
        this.userToDto = userToDto;
    }

    @Autowired
    public void setActionService(ActionService actionService) {
        this.actionService = actionService;
    }

    //get sign up page
    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String signUpButton(Model model) {

        model.addAttribute("user", new UserDto());

        return "sign-up";
    }


    //add new user
    @RequestMapping(method = RequestMethod.POST, path = "/signup")
    public String signUpButtonRedirect(@Valid @ModelAttribute("user") UserDto userDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "sign-up";
        }

        User user = dtoToUser.convert(userDto);
        userService.add(user);
        redirectAttributes.addFlashAttribute("lastAction", "You have been added to our community");


        return "redirect:/main/" + user.getId();
    }

    //get page login
    @RequestMapping(method = RequestMethod.GET, path = "/login")
    public String getLoginPage(Model model) {

        model.addAttribute(new UserDto());

        return "login";
    }


    //authenticate user and get page of user
    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String authenticateUser(Model model, @ModelAttribute UserDto user) {

        if (loginService.authenticateUser(user.getUsername(), user.getPassword())) {

            UserDto userDto = userToDto.convert(loginService.getUserOnLogin());
            model.addAttribute("user", userDto);
            return "redirect:/main/" + userDto.getId();
        }

        return "redirect:/login";
    }


    //get user page
    @RequestMapping(method = RequestMethod.GET, path = "/main/{id}")
    public String getUserPage(@PathVariable Integer id, Model model) {

        UserDto userDto = userToDto.convert(userService.getUser(id));

        model.addAttribute("user", userDto);

        return "main";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String userList(Model model) {

        model.addAttribute("users", userService.getUsersList());

        return "list";

    }

    @RequestMapping(method = RequestMethod.GET, path = "/main")
    public String getMainPage(Model model) {


        model.addAttribute("user", userService.getUser(1));
        model.addAttribute("actions", actionService.getAction(1));

        return "main";
    }




}
