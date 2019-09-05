package com.kefei.demo.model;
/**
 * @author liukai
 * @Title: Cat
 * @ProjectName examination
 * @Description: 考点维护
 * @date 2019/9/510:17
 */
public class ExamAddressMaintain {
    //主键id
    private Integer id;
    //考区代码
    private String examAreaCode;
    //考区名称
    private String examAreaName;
    //考点编号
    private String examAddressNumber;
    //容纳考场数量
    private String containExamroomQuantity;
    //标准考场人数
    private String standardExamroomPeople;
    //考场默认起始编号
    private String examroomDefaultStatNumber;
    //考点名称
    private String examAddressName;
    //考点地址
    private String examAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamAreaCode() {
        return examAreaCode;
    }

    public void setExamAreaCode(String examAreaCode) {
        this.examAreaCode = examAreaCode;
    }

    public String getExamAreaName() {
        return examAreaName;
    }

    public void setExamAreaName(String examAreaName) {
        this.examAreaName = examAreaName;
    }

    public String getExamAddressNumber() {
        return examAddressNumber;
    }

    public void setExamAddressNumber(String examAddressNumber) {
        this.examAddressNumber = examAddressNumber;
    }

    public String getContainExamroomQuantity() {
        return containExamroomQuantity;
    }

    public void setContainExamroomQuantity(String containExamroomQuantity) {
        this.containExamroomQuantity = containExamroomQuantity;
    }

    public String getStandardExamroomPeople() {
        return standardExamroomPeople;
    }

    public void setStandardExamroomPeople(String standardExamroomPeople) {
        this.standardExamroomPeople = standardExamroomPeople;
    }

    public String getExamroomDefaultStatNumber() {
        return examroomDefaultStatNumber;
    }

    public void setExamroomDefaultStatNumber(String examroomDefaultStatNumber) {
        this.examroomDefaultStatNumber = examroomDefaultStatNumber;
    }

    public String getExamAddressName() {
        return examAddressName;
    }

    public void setExamAddressName(String examAddressName) {
        this.examAddressName = examAddressName;
    }

    public String getExamAddress() {
        return examAddress;
    }

    public void setExamAddress(String examAddress) {
        this.examAddress = examAddress;
    }
}
