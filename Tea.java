package task10;

public class Tea {

	public void maketype() {
		System.out.println("The tea make a Type");
		
		
	}
	}

    //Black .java
    //Sub class Black 	
    public class  Black extends Tea {
	@Override
	public   makeBlack() {
    System.out.println("Black colour");
	}
	}
    //Green.java
    //Subclass Green
    
    public class  Green extends Tea {
    	@Override
    	public  make  Green() {
        System.out.println("Green  colour");
    	}
    }
    public class  Herbal extends Tea {
    	@Override
    	public  make Herbal() {
        System.out.println("Brown colour");t
    	}
    }
    
    public class Total {
    	public static void main(String[] args) {
    		Black black = new Black ();
    		 Green green = new Green();
    		 Herbal herbal = new Herbal();
    		 
    		 black.make black();
    		 green.make green();
    		 herbal.make herbal();
    		 
    	}
    }
    
    
