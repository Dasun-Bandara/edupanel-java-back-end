package lk.ijse.dep11.edupanel.to.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LecturerResTO implements Serializable {
    Integer id;
    String name;
    String designation;
    String qualifications;
    String type;
    String pictureUrl;
    String linkedin;
}
