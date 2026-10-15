package com.runoops.patterns.mvc;

/**
 * MVC architectural pattern demo (client)
 * Article: https://runoops.com/architectural-pattern-mvc.html
 *
 * Simulate request: Controller -> Model -> View render.
 */
public class MvcDemo {

    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserController controller = new UserController(model);
        UserView view = new UserView();

        User user = controller.getUserInfo(1001);
        view.render(user);
    }
}
