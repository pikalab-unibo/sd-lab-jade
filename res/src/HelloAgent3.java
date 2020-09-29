public class ExampleAgent extends Agent {
  @Override
  protected void setup() { addBehaviour(mainBehaviour()); }

  private int rising, falling; // initialised to 0

  @Override private Behaviour risingCount() {
    return new CyclicBehaviour() {
      @Override
      public void action() { log("Hello world! (%d)", round++); }
    };
  }

  @Override private Behaviour fallingCount() {
    return new CyclicBehaviour() {
      @Override
      public void action() { log("Hello world! (%d)", round++); }
    };
  }
}