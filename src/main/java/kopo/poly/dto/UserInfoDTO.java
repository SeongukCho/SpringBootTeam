package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class UserInfoDTO {
    private String user_id;
    private String user_name;
    private String password;
    private String email;
    private String addr1;
    private String addr2;
    private String reg_id;
    private String reg_dt;
    private String chg_id;
    private String chg_dt;
    private String exists_yn;
    private int authNumber;
}
