package br.com.fabricions.javademo.model;

import br.com.fabricions.javademo.model.converters.HashMapConverter;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "aircrafts_data", schema = "bookings")
public class Aircraft {

    @Id
    @Column(name = "aircraft_code")
    private String id;

    @Column(name = "model")
    @Convert(converter = HashMapConverter.class)
    private Map<String, Object> model;

    @Column(name = "range")
    private Integer range;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
