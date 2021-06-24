package uz.developer.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo{

    public Long id;
    public String owner;
    public String secret;
    public Long server;
    public Long farm;
    public String title;
    public int ispublic;
    public int isfriend;
    public int isfamily;
}
