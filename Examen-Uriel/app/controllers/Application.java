package controllers;

import com.avaje.ebean.Model;
import models.Persona;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import java.util.List;
import static play.libs.Json.*;

public class Application extends Controller {

    public Result index() {

        return ok(index.render("Hello World"));
    }

    public Result addPerson(){
        Persona persona = Form.form(Persona.class).bindFromRequest().get();
        persona.save();
        return  redirect(routes.Application.index());
    }

    public Result getPersons(){
        List<Persona> personas = new Model.Finder(String.class,Persona.class).all();
        return  ok(toJson(personas));
    }

    public Result delPerson(){
        List<Persona> personas = new Model.Finder(String.class,Persona.class).all();
        for(Persona persona : personas) {
            if (persona != null) {
                persona.delete();
                break;
            }
        }
        return  redirect(routes.Application.index());
    }

}
