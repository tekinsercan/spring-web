package org.spring.webapp.springweb.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Recipe {
    // Mandatory database related
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Main properties
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    // ToDo: Create enum for difficulty
    //private Difficulty difficulty
    // Lob: Large object
    @Lob
    private Byte[] image;

    // Relations
    // Cascade specifies that Recipe owns Notes
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    // Getters and setters
    // Generated automatically by "ALT + insert"
    // Standard Java Bean so that 3rd part serializers/deserializers can map
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }
}
