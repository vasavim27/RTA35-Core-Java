package encapsulationexamples;

public class Voter {
    private String name;
    private int age;
    private boolean hasVoted;

    public Voter(String name,int age){
        this.name=name;
        this.age=age;
        this.hasVoted=false;
    }
    public String getName()
    {
        return name;
    }
    public int getAge(){
        return age;
    }
    public boolean hasVoted(){
        return hasVoted;
    }
    public void checkVotingEligibility(){
        if(age>=18 && !hasVoted){
            System.out.println("person "+name+" is eligibile to vote");
            hasVoted=true;
        }
        else if(age<18){
            System.out.println("person "+name+" is not eligibile to vote");
        }
        else if(hasVoted){
            System.out.println("person "+name+" has voted already");
        }

    }
    public static void main(String[] args){
        Voter voter1=new Voter("Vasavi",18);
        voter1.checkVotingEligibility();
        Voter voter2=new Voter("Vedaanth",14);
        voter2.checkVotingEligibility();
        Voter voter3=new Voter("Viaan",20);
        voter3.checkVotingEligibility();
        voter3.checkVotingEligibility();
    }
}
