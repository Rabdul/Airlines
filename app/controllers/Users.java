package controllers;

/**
 * Created by abdul on 10/21/15.
 */

import models.User;
import play.mvc.Result;
import play.mvc.Controller;

import java.util.List;

public class Users extends Controller{

    public Result list(int page) {
        List<User> list = User.findPage(page, 10);
        //return ok(list.render);
        return TODO;
    }

    public Result newUser() {
        return TODO;
    }

    public Result details(int id) {
        return TODO;
    }

    public Result save() {
        return TODO;
    }

    public Result delete(int id) {
        return TODO;
    }

}
