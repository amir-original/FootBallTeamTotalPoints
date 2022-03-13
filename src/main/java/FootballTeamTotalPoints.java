public class FootballTeamTotalPoints {

    public int countsTotalPoints(String[] matchesResult) {
        String[] teamsGoal;
        int firstTeamGoalCount;
        int secondTeamGoalCount;
        int totalCount = 0;
        for (int pointer = 0; pointer < matchesResult.length ; pointer++){
           teamsGoal = getTheNumberOfGoalsOfEachTeam(matchesResult[pointer]);
           firstTeamGoalCount  = convertStringToInteger(teamsGoal[0]);
           secondTeamGoalCount = convertStringToInteger(teamsGoal[1]);

            if(isTheMatchDraws(firstTeamGoalCount, secondTeamGoalCount)){
                totalCount ++;
            }
            else if(didTheOurTeamWin(firstTeamGoalCount, secondTeamGoalCount)){
               totalCount += 3;
           }else{
                totalCount +=0;
            }
        }
        return totalCount;
    }

    private int convertStringToInteger(String stringNumber) {
        return Integer.parseInt(stringNumber);
    }


    private String[] getTheNumberOfGoalsOfEachTeam(String stringMatchResult) {
        return stringMatchResult.split(":");
    }

    private boolean didTheOurTeamWin(int firstTeamGoalCount, int secondTeamGoalCount) {
        return firstTeamGoalCount > secondTeamGoalCount;
    }

    private boolean didTheOurTeamLose(int firstTeamGoalCount, int secondTeamGoalCount) {
        return firstTeamGoalCount < secondTeamGoalCount;
    }

    private boolean isTheMatchDraws(int firstTeamGoalCount, int secondTeamGoalCount) {
        return firstTeamGoalCount == secondTeamGoalCount;
    }
}
