package tr.com.atmosware.externalizedconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mail.service")
public class MailServiceConfiguration {
    private String url;
    private String address;
    private String password;
    private String port;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "MailServiceConfiguration{" +
                "url='" + url + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
