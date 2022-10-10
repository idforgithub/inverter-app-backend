package inverterapp.inverterapp.core;

import inverterapp.inverterapp.core.model.InverterDevice;
import inverterapp.inverterapp.core.service.InvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inverters")
public class InvResource {
    private final InvService invService;

    public InvResource(InvService invService){
        this.invService = invService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<InverterDevice>> getAllInverterDevices(){
        List<InverterDevice> invertes = invService.getAllData();
        return  new ResponseEntity<>(invertes, HttpStatus.OK);
    }
}
