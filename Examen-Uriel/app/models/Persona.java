package models;

import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by urielefrencarballido on 16/10/15.
 */
@Entity
public class Persona extends Model{
    @Id
    public String rfc;

    public String nombre;

    public int edad;
}
