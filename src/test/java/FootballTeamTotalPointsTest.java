import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FootballTeamTotalPointsTest {

    /*
    if x>y - 3 points
    if x<y - 0 point
    if x=y - 1 point
     */
    @Test
    void should_Return_0_If_The_Team_Lose_All_Ten_Matches() {
        String[] matchesResult = {"1:3","0:1","1:2","0:2","2:3","1:4","2:4","3:4","1:2","0:1"};
        
        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(0,result);
    }

    @Test
    void should_Return_10_If_The_Team_Draws_all_Ten_Matches() {
        String[] matchesResult = {"1:1","0:0","0:0","2:2","3:3","1:1","3:3","1:1","0:0","2:2"};

        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(10,result);
    }

    @Test
    void should_return_30_If_The_Team_Wins_all_Ten_Matches() {
        String[] matchesResult = {"1:0","2:0","3:1","2:1","3:0","1:0","3:2","2:1","1:0","2:1"};

        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(30,result);
    }

    @Test
    void should_return_20_If_The_Team_Wins_Half_Of_The_Matches_And_Draws_Other_Match() {
        String[] matchesResult = {"1:0","2:0","3:1","2:1","3:0","1:1","3:3","2:2","1:1","0:0"};

        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(20,result);
    }

    @Test
    void should_Return_15_If_The_Team_Wins_Half_Of_The_Matches_And_Lose_Other_Match() {
        String[] matchesResult = {"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"};
        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(15,result);
    }

    @Test
    void should_Return_12_if_The_Team_Win_In_Three_Match_And_Lose_In_Other_Match() {
        String[] matchesResult =  {"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"};
        FootballTeamTotalPoints footballTeamTotalPoints = new FootballTeamTotalPoints();

        int result = footballTeamTotalPoints.countsTotalPoints(matchesResult);

        Assertions.assertEquals(12,result);
    }
}
