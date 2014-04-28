package classes;

import classes.manager.CVManager;
import classes.model.CV;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Emilie on 01/04/14.
 */
@Controller
@RequestMapping
public class XMLController {

    /*@RequestMapping(value="{nom}", method = RequestMethod.GET)
    public @ResponseBody
    CV getCVInXML(@PathVariable String nom) {
        CV cv = new CV(nom,"");
        return cv;
    }*/

    private CVManager manager  = new CVManager();

    @RequestMapping(value="/cv", method = RequestMethod.GET)
    public @ResponseBody
    CVManager getCVManagerInXML() {
       // CVManager manager = new CVManager();
        return manager;
    }

    @RequestMapping(value="/cv/{id}", method = RequestMethod.GET)
    public @ResponseBody
    CV getCVManagerInXML(@PathVariable int id) {
       // CVManager manager = new CVManager();
        return manager.getResume(id);
    }

    @RequestMapping(value = "put", method = RequestMethod.PUT)
    public void putCvInXML(@RequestBody CV cv) {
       // CVManager manager = new CVManager();
        manager.addResume(cv);
    }

}
