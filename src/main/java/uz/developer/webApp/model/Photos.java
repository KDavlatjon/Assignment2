package uz.developer.webApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photos{

    public Long page;
    public Long pages;
    public Long perpage;
    public Long total;
    public List<Photo> photo;
}