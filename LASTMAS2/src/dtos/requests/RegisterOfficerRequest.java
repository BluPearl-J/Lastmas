package dtos.requests;

public class RegisterOfficerRequest {



    private int officerId;
    private String officerName;
    private String officerRank;


    public String getOfficerName() {
        return officerName;
    }
    public void setOfficerName(String  officerName) {
        this.officerName = officerName;
    }


    public String getOfficerRank() {
        return officerRank;
    }
    public void setOfficerRank(String officerRank) {
        this.officerRank = officerRank;
    }



    public int getOfficerId() {
        return officerId;
    }

    public void setOfficerId(int officerId) {
        this.officerId = officerId;
    }
}
