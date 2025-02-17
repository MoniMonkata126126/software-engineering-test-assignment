package org.example;

public class AnimalType {
    private String animalType;

    public AnimalType(){}

    public AnimalType( String animalType ){
        if ( isValidAnimalType(animalType) ){
            this.animalType = animalType;
        }
    }

    public String getAnimalType(){
        return animalType;
    }

    public void setAnimalType(String animalType){
        if( isValidAnimalType(animalType)){
            this.animalType = animalType;
        }
    }

    private boolean isValidAnimalType(String animalType){
        if ( animalType.equals(AnimalTypeEnum.DOG.name()) ){
            return true;
        } else if ( animalType.equals(AnimalTypeEnum.CAT.name()) ) {
            return true;
        } else if ( animalType.equals(AnimalTypeEnum.WOLF.name()) ) {
            return true;
        } else if ( animalType.equals(AnimalTypeEnum.BEAR.name()) ) {
            return true;
        } else if ( animalType.equals(AnimalTypeEnum.TIGER.name()) ) {
            return true;
        } else return animalType.equals(AnimalTypeEnum.JAGUAR.name());
    }
}
