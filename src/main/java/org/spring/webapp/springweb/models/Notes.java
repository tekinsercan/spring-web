package org.spring.webapp.springweb.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Notes {
    // Mandatory database related
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Main properties
    // Lob: Large object
    @Lob
    private String notes;

    // Relations
    @OneToOne
    private Recipe recipe;

    // Getters and setters
    // Generated automatically by "ALT + insert"
    // Standard Java Bean so that 3rd part serializers/deserializers can map
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
