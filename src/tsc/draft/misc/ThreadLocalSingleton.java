package tsc.draft.misc;

public class ThreadLocalSingleton{
	  private static ThreadLocal initHolder = new ThreadLocal();
	  private static ThreadLocalSingleton instance=null;

	  public static ThreadLocalSingleton getInstance(){
	    if (initHolder.get() == null){
	      synchronized (ThreadLocalSingleton.class){
	        if (instance== null)
	          instance = new ThreadLocalSingleton();
	        initHolder.set(Boolean.TRUE);
	      }
	    }
	    return instance;
	  }
	}