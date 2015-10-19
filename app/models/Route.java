package models;

/**
 * Created by randomlocks on 10/20/2015.
 */

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Route extends Model {


    @Id
    public Long id;

    @OneToOne
    public Airport airport;

    @ManyToOne
    Fare fare;

    @OneToMany(mappedBy = "route")
    public List<Flight> flights;




}