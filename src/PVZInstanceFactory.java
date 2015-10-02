import java.io.File;
import java.util.ArrayList;


public class PVZInstanceFactory {
	File pvzLocation;
	
	public PVZInstanceFactory(File f) {
		this.pvzLocation = f;
	}

	public PVZInstance[] getInstances() {
		ArrayList<PVZInstance> pvzInstances = new ArrayList<PVZInstance>();
		return null;
		//return (PVZInstance[]) pvzInstances.toArray();
	}

}
