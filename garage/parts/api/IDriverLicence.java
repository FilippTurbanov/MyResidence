package garage.parts.api;

public interface IDriverLicence {
    char categoryRequirements();
    boolean categoryCheck();
    void categoryCheckFailed();
    void categoryCheckSuccess();
}
