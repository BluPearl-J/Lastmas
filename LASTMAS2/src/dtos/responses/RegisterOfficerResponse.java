package dtos.responses;

public class RegisterOfficerResponse {

    int officerId;
    String officerName;
    String officerRank;
    String officerEmail;

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }



    public String getOfficerRank() {
        return officerRank;
    }

    public void setOfficerRank(String officerRank) {
        this.officerRank = officerRank;
    }


    public String getOfficerEmail() {
        return officerEmail;
    }
    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }


    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }




}
