package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.persistence.model.User;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    private ActionController actionController;


    //set user
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setActionController(ActionController actionController) {
        this.actionController = actionController;
    }




    //delete the account of user
    @RequestMapping(method = RequestMethod.GET, path = "/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {

        userService.delete(id);

        return "redirect:/index";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/edituser1/{id}")
    public String updateInfoUserPage(@PathVariable Integer id, Model model) {

        model.addAttribute("user", userService.getUser(id));

        return "edituser";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/edituser/{id}")
    public String updateInfoUser(@ModelAttribute User user, @PathVariable Integer id, RedirectAttributes redirectAttributes, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "edituser";
        }

        User updateUser = userService.getUser(id);
        redirectAttributes.addFlashAttribute("lastAction", "Update successful to " + updateUser.getUsername());

        return "redirect:/userpage";
    }

    //see the actions list the user has to do
    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public String actionsList(Model model, @PathVariable Integer id) {

        model.addAttribute("action5");
        model.addAttribute("action10");

        return "actionlist";
    }


}
