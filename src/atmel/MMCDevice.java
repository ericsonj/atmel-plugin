package atmel;

/**
 * MMC
 * @author ejoseph
 */
public class MMCDevice {
    
    private String code;
    
    private String name;

    public MMCDevice(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
