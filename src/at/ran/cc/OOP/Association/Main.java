package at.ran.cc.OOP.Association;

public class Main {


    public static void main(String[] args) {
        Members member1 = new Members("Sally", "Richardson", 4, "Gardener", 200);
        Members member2 = new Members("Roger", "Johnson", 15, "Business Owner", 200);
        Members member3 = new Members("Kimberly", "Wilks", 29, "Retired", 200);

        Secretaries secretary1 = new Secretaries("Joshua", "Hernandez", 3, "Banker", 200, 50);

        Treasurer treasurer1 = new Treasurer("Ursula", "StickyFingers", 7, "Entrepreneur", 200, 100);

        BoardofDirectors boardMember1 = new BoardofDirectors("Tyson", "Wilder", 10, "Software Engineer", 200, 200);
        BoardofDirectors boardMember2 = new BoardofDirectors("Natasha", "Russia", 10, "Photography", 200, 200);


        System.out.println(secretary1.getActualMembershipFee());
        System.out.println(treasurer1.getActualMembershipFee());

        System.out.println(boardMember1.getLengthOfTenure());
        System.out.println(member2.getFirstName());

        secretary1.importantDuties();
        treasurer1.importantDuties();
        boardMember1.importantDuties();



    }


}

