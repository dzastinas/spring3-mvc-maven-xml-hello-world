package io.web.controller;

//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

public class AddendumResponse {

//    @NotNull
//    @Min(1)
//    @Max(Integer.MAX_VALUE)
    private Integer runRecordID;

//    @NotNull
//    @Size(min = 1, max = 65535)
    private String addendumText;

//    @NotNull
//    @Size(min = 1, max = 20)
    private String crewOwnerUserName;

//    @NotNull
//    @Size(min = 1, max = 255)
    private String pdfLocation;

//    @NotNull
//    @Size(min = 1, max = 255)
    private String pdfFileName;

    public String getPdfLocation() {
        return pdfLocation;
    }

    public void setPdfLocation(String pdfLocation) {
        this.pdfLocation = pdfLocation;
    }

    public String getPdfFileName() {
        return pdfFileName;
    }

    public void setPdfFileName(String pdfFileName) {
        this.pdfFileName = pdfFileName;
    }

    public Integer getRunRecordID() {
        return runRecordID;
    }

    public void setRunRecordID(Integer runRecordID) {
        this.runRecordID = runRecordID;
    }

    public String getAddendumText() {
        return addendumText;
    }

    public void setAddendumText(String addendumText) {
        this.addendumText = addendumText;
    }

    public String getCrewOwnerUserName() {
        return crewOwnerUserName;
    }

    public void setCrewOwnerUserName(String crewOwnerUserName) {
        this.crewOwnerUserName = crewOwnerUserName;
    }

}
