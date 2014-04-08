package classes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Emilie on 01/04/14.
 */
@Controller
@RequestMapping("/cv")
public class XMLController {

    @RequestMapping(value="{nom}", method = RequestMethod.GET)
    public @ResponseBody
    CV getCVInXML(@PathVariable String nom) {
        CV cv = new CV(nom,"");
        return cv;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    CVManager getCVManagerInXML() {
        CVManager manager = new CVManager();
        return manager;
    }

}
