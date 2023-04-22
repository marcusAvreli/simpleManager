package simpleManager.api.view.delegator;

import simpleManager.ViewContainer;

public interface Delegator {
	
	public void inject(ViewContainer viewContainer);
	public void clean(ViewContainer viewContainer);

}