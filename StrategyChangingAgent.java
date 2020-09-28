import java.util.concurrent.*;

public class StrategyChangingAgent implements IAgent {
    private ThreadLocalRandom random;
    private IAgent agent;

    public StrategyChangingAgent() {
        this.random = ThreadLocalRandom.current();
        this.agent = new AlwaysRockAgent();
    }

    public HandShape nextMove() {
        int n = this.random.nextInt(0,8);

        return this.agent.nextMove();
    }

    public String getName() {
        return "StrategyChangingAgent";
    }
}
