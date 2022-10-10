package inverterapp.inverterapp.core.service;


import inverterapp.inverterapp.core.model.InverterDevice;
import inverterapp.inverterapp.core.repo.InvRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InvService {
    private final InvRepo invRepo;

    @Autowired
    public InvService(InvRepo invRepo){
        this.invRepo = invRepo;
    }

    public List<InverterDevice> getAllData(){
        return invRepo.findAll();
    }


}
