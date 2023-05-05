package Java.OODPFINAL;

//import javax.print.DocFlavor.STRING;

public class Member implements Human {
 
    private String id;
    private String name;
    private String phoneNumber;
    

    public  Member(String id, String name,String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
       
      
    }
    public static Member[] getMembers(){
        Member[] member= new Member[5];
        member[0] = new Member("6531503044","Khaophon","0919254551");
        member[1] = new Member("6531503045", "Irin", "0984561489");
        member[2] = new Member("6531503064", "Tqura Esterfans", "0915492115");
        member[3] = new Member("6531503047","James","0861297854");
        member[4] = new Member("6531503125", "BaiBua", "0919854462");
        return member;
        
    }

    public String getid(String id){
        Member[] members = getMembers();
          for (Member member : members) {
        if (member.id.equals(id)) {
            return member.id;
        }  
    }
    return "";  
    }










    @Override
    public String showName (String id) {
        // TODO Auto-generated method stub
    
        Member[] members = getMembers();
          for (Member member : members) {
        if (member.id.equals(id)) {
            return member.name;
        }
    }
    return ""; // ID not found
}
        
     @Override
    public String showPhoneNumber(String id) {
        Member [] members = getMembers();
            for (Member member : members){
                if (member.id.equals(id)){
                    return member.phoneNumber;
                }

            }
       return "";
    }   

    
}
