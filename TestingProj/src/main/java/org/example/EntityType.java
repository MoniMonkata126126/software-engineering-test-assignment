package org.example;

public class EntityType {
    private AnimalType animalType;

    public EntityType(){}

    public EntityType( AnimalType animalType ){
        this.animalType = animalType;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
}
