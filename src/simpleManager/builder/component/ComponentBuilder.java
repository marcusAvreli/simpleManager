package simpleManager.builder.component;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import simpleManager.builder.Builder;
import simpleManager.builder.SwingBuilderAware;


/**
 * @author mgg
 *
 * @param <T>
 */
//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/swing/src/main/java/org/viewaframework/swing/builder/component/ComponentBuilder.java
public interface ComponentBuilder<T extends Component> extends Builder<T>,SwingBuilderAware {

	/**
	 * @param name
	 * @return
	 */
	public ComponentBuilder<T> setName(String name);
	/**
	 * @param font
	 * @return
	 */
	public ComponentBuilder<T> setFont(Font font);
	/**
	 * @param enabled
	 * @return
	 */
	public ComponentBuilder<T> setEnabled(boolean enabled);
	/**
	 * @param dimension
	 * @return
	 */
	public ComponentBuilder<T> setPreferredSize(Dimension dimension);
}
