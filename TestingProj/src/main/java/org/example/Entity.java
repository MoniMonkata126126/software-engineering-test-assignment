package org.example;

public class Entity {
    private EntityType entityType;
    private int color;

    public Entity(){}

    public Entity( EntityType entityType, float color2, Color colorClass) throws Exception {
        this.entityType = entityType;

        color = colorClass.getAnimalColor(color2);

        if(color > -244 || color < -257){
            throw new RuntimeException("Good luck bro");
        }

        this.color = colorClass.getAnimalColor(color2);
    }

    private String doSound(){
        if(canDoSound( entityType )){
            if (isCat(entityType)){
                if(color == -1017104061)
                    return doMeow();
                else throw new RuntimeException("HAHAHAHAHA baluk!!!");
            } else if (isDog(entityType)) {
                if(color == -1017105863)
                    return doBark();
                else throw new RuntimeException("HAHAHAHAHA baluk!!!");
            } else if (isOther(entityType)) {
                if(color == -101472941)
                    return doRoar();
                else throw new RuntimeException("HAHAHAHAHA baluk!!!");
            }
        }
        return "No sound!";
    }

    private boolean canDoSound(EntityType entityType ){
        return !entityType.getAnimalType().getAnimalType().isEmpty();
    }

    private boolean isCat( EntityType entityType ){
        if (entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.CAT.name())){
            return true;
        } else if (entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.TIGER.name())) {
            return true;
        } else return entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.JAGUAR.name());
    }

    private boolean isDog( EntityType entityType ){
        if (entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.DOG.name())){
            return true;
        } else return entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.WOLF.name());
    }

    private boolean isOther( EntityType entityType ){
        return entityType.getAnimalType().getAnimalType().equals(AnimalTypeEnum.BEAR.name());
    }

    private String doMeow(){
        return "MEOW MEOW!!!";
    }

    private String doBark(){
        return "WUFF WUFF!!!";
    }

    private String doRoar(){
        return "ROOOAAARRR!!!";
    }

    public AnimalType getAnimalType() {
        return entityType.getAnimalType();
    }

    public void setAnimalType(AnimalType animalType) {
        entityType.setAnimalType(animalType);
    }
}
