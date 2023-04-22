package simpleManager;

import java.awt.Container;
import java.util.Map;

import javax.swing.JFrame;

import simpleManager.api.controller.ViewControllerDispatcher;
import simpleManager.api.view.perspective.Perspective;
import simpleManager.api.view.perspective.PerspectiveConstraint;


/**
 * This interface should be implemented by classes used for managing
 * several views.<br/><br/>
 * Views can be added to the manager and then re-arranged before it can
 * be shown.
 * 
 * @author Mario Garcia
 * @since 1.0
 *
 */
public interface ViewManager 
{
	public static final String ROOT_VIEW_ID = "rootViewId";

	/**
	 * Adds a view to the manager
	 * 
	 * @param view
	 * @throws
	 */
	public void addView(ViewContainer view) ;
	public void addView(ViewContainer view, PerspectiveConstraint constraint) ;
	
	
	public void setFrame(JFrame view);
	public JFrame getFrame();
	public void setControllerDispatcher(ViewControllerDispatcher dispatcher);
	
	/**
	 * @return
	 */
	public Perspective getPerspective();
	/**
	 * @param viewLayout
	 */
	public void setPerspective(Perspective perspective);
	
	/**
	 * @return
	 */
	public Map<Object,ViewContainer> getViews();
	
	public Container arrangeViews();
	
	
}