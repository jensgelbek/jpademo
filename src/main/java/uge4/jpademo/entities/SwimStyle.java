/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uge4.jpademo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author PC
 */
@Entity
public class SwimStyle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String styleName;
    @ManyToMany
    private List<Person> persons;

    public SwimStyle() {
    }

    public SwimStyle(String styleName) {
        this.styleName = styleName;
        this.persons=new ArrayList<>();
    }
    
    
}
