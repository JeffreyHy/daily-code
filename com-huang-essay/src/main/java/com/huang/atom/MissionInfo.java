package com.huang.atom;

/**
 * Created by JeffreyHy on 2018/1/9.
 */
public class MissionInfo {
    private Integer missionId;
    private String name;

    public MissionInfo(Integer missionId,String name) {
        this.missionId = missionId;
        this.name=name;
    }

    public Integer getMissionId() {
        return missionId;
    }

    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
