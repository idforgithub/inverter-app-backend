package inverterapp.inverterapp.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.HashMap;

@Entity
public class InverterDevice implements Serializable {
    public InverterDevice(){}

    public InverterDevice(String device, InverterModel[] data){
        this.device = device;
        this.data = data;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public InverterModel[] getData() {
        return data;
    }

    public void setData(InverterModel[] data) {
        this.data = data;
    }

    @Id
    @Column(nullable = false, updatable = false)
    public String device;
    public InverterModel[] data;

}
