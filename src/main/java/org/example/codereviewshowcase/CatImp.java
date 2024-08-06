package org.example.codereviewshowcase;

public class CatImp implements animal {

    public CatImp(String weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int weight;
    private String colour;
    @Override
    public int animalVoice() {
        return 0;
    }

    @Override
    public void animalColour() {
        return colour;
    }

    @Override
    public String getAnimalWeight() {
        return weight;
    }
}
