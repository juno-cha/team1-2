package team.infra;
import team.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ManagementHateoasProcessor implements RepresentationModelProcessor<EntityModel<Management>>  {

    @Override
    public EntityModel<Management> process(EntityModel<Management> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/bikearrival").withRel("bikearrival"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/bikerepair").withRel("bikerepair"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/bikerepaircomplete").withRel("bikerepaircomplete"));

        
        return model;
    }
    
}
