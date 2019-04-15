package com.employee.management.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Entity(name = "collaborators")
public class CollaboratorEntity implements Serializable {
    private static final long serialVersionUID = 6835192601898364280L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

//    @ManyToMany()
    private EmployerEntity employers;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public EmployerEntity getEmployers() {
        return employers;
    }
    public void setEmployers(EmployerEntity employers) {
        this.employers = employers;
    }
}
