package registrydesignpattern;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
private static Map<String, Notebook> map=new HashMap<>();
private static NotebookRegistry notebookRegistry;

public static NotebookRegistry getInstance() {
	if(notebookRegistry==null) {
		notebookRegistry=new NotebookRegistry();
	}
	return notebookRegistry;
}

public  void register(String key, Notebook notebook) {
	map.put(key, notebook);
}

public  Notebook get(String key) {
	return map.get(key);
}
		

}
