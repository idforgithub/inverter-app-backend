package inverterapp.inverterapp.core.repo;

import inverterapp.inverterapp.core.model.InverterDevice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvRepo extends JpaRepository<InverterDevice, Long> {

}
