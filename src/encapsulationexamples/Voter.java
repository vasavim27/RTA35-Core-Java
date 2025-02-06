package encapsulationexamples;

public class EncapsulatedVotingSystem {
    private String name;
    private int age;
    private boolean hasVoted;

    public voter(String name,int age){
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
        if(age>=18 && !hasvoted){
            System.out.println("person"+name+"is eligibile too vote");
            hasVoted=true;
        }
        else
    }
}
