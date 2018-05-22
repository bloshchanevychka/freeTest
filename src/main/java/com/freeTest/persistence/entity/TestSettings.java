package com.freeTest.persistence.entity;

import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @OneToMany(mappedBy = "settingSet")
    private List<TestSettingsSet> testSettingSetsSets;

    public TestSettings(Long timeSettings, boolean securitySettings, boolean showAnsw, String help, boolean showRules) {
        this.timeSettings = timeSettings;
        this.securitySettings = securitySettings;
        this.showAnsw = showAnsw;
        this.help = help;
        this.showRules = showRules;
    }

    public Long getTestSettingId() {return testSettingId;}

    public void setTestSettingId(Long testSettingId) {this.testSettingId = testSettingId;}

    public Long getTimeSettings() {return timeSettings;}

    public void setTimeSettings(Long timeSettings) {this.timeSettings = timeSettings;}

    public Boolean getSecuritySettings() {return securitySettings;}

    public void setSecuritySettings(Boolean securitySettings) {this.securitySettings = securitySettings;}

    public Boolean getShowAnsw() {return showAnsw;}

    public void setShowAnsw(Boolean showAnsw) {this.showAnsw = showAnsw;}

    public String getHelp() {return help;}

    public void setHelp(String help) {this.help = help;}

    public Boolean getShowRules() {return showRules;}

    public void setShowRules(Boolean showRules) {this.showRules = showRules;}

    public List<TestSettingsSet> getTestSettingSetsSets() {return testSettingSetsSets;}

    public void setTestSettingSetsSets(List<TestSettingsSet> testSettingSetsSets) {this.testSettingSetsSets = testSettingSetsSets;}
}
