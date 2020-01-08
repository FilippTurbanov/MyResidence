package garage.parts.api;

public interface IDriverLicence {
    String getCategory(String category);
    boolean categoryCheck(String category, String requiredCategory);
    void categoryCheckFailed();
    void categoryCheckSuccess();
}
