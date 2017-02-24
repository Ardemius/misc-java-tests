package tsc.patterns;

/**
 * Implementor
 */
interface CallerAPI {
   public void callUsingProtocol(final String someArgs);
}

/**
 * ConcreteImplementor 1
 */
class CallerAPIREST implements CallerAPI {
   @Override
   public void callUsingProtocol(final String someArgs) {
      System.out.printf("Call micro-service with REST protocol and the args: %s\n", someArgs);
   }
}

/**
 * ConcreteImplementor 2
 */
class CallerAPIJMS implements CallerAPI {
   @Override
   public void callUsingProtocol(final String someArgs) {
      System.out.printf("Call micro-service with JMS protocol and the args: %s\n", someArgs);
   }
}

/**
 * Abstraction
 */
abstract class Caller {
   protected CallerAPI callerAPI;

   protected Caller(final CallerAPI callerAPI) {
      this.callerAPI = callerAPI;
   }

   /**
    * Implementation specific
    */
   public abstract void call();
}

/**
 * Refined Abstraction
 */
class RefinedCaller extends Caller {
   public RefinedCaller(final CallerAPI callerAPI) {
      super(callerAPI);
   }

   // Implementation specific
   @Override
   public void call() {
      callerAPI.callUsingProtocol("blablabla");
   }
}

/**
 * Client
 */
public class BridgePattern {
   public static void main(final String[] args) {
      Caller[] callers = new Caller[] { new RefinedCaller(new CallerAPIJMS()), new RefinedCaller(new CallerAPIREST()) };

      for (Caller caller : callers) {
         caller.call();
      }
   }
}