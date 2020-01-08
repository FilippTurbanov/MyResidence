package garage.parts;

import garage.parts.api.IDriverLicence;

public class DriverLicence implements IDriverLicence {
    String category;
    String requiredCategory;

    @Override
    public String getCategory(String category) {
        this.category = category;
        return category;
    }

    @Override
    public boolean categoryCheck(String category, String requiredCategory) {
        this.category = category;
        this.requiredCategory = requiredCategory;
        return (category.equals(requiredCategory));
    }

    @Override
    public void categoryCheckFailed() {
        System.out.println("Не могу поехать на этой машине, т.к. у меня нет прав требуемой категории.");
    }

    @Override
    public void categoryCheckSuccess() {
        System.out.println("Права при себе - можно ехать.");
    }
}
