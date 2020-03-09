package ru.job4j;

public class ImmutableCat {
    private String breed;
    private String eyeColor;

    public ImmutableCat(String breed, String eyeColor) {
        this.breed = breed;
        this.eyeColor = eyeColor;
        System.out.println("Новый кот создан. Порода кота: " + this.breed + ". Цвет глаз: " + this.eyeColor + ".");
    }

    public ImmutableCat setBreed(String breed) {
        ImmutableCat c = new ImmutableCat(breed, this.eyeColor);
        return c;
    }

    public ImmutableCat setEyeColor(String eyeColor) {
        ImmutableCat c = new ImmutableCat(this.breed, eyeColor);
        return c;
    }
}

class Test {
    public static void main(String[] args) {
        ImmutableCat first = new ImmutableCat("Мейн-кун", "Карие глаза");
        ImmutableCat second = first.setBreed("Сиамский");
        ImmutableCat third = first.setEyeColor("Голубые");
    }
}
