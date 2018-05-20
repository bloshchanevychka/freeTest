package com.freeTest.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
public class TestSettings implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long testSettingId;
    private Long timeSettings;
    private Boolean securitySettings;
    private Boolean showAnsw;
    private String help;
    private Boolean showRules;

    //protected TestSettings() {}

    public TestSettings(Long timeSettings, boolean securitySettings, boolean showAnsw, String help, boolean showRules) {
        this.timeSettings = timeSettings;
        this.securitySettings = securitySettings;
        this.showAnsw = showAnsw;
        this.help = help;
        this.showRules = showRules;
    }
}
