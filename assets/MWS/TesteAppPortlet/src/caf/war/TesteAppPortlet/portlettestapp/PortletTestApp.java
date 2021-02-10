/**
 * 
 */
package caf.war.TesteAppPortlet.portlettestapp;

/**
 * @author admin
 *
 */

import javax.portlet.PortletPreferences;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "PortletTestApp")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "PortletTestApp", beanType = BeanType.PORTLET)
public class PortletTestApp  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private transient caf.war.TesteAppPortlet.TesteAppPortlet testeAppPortlet = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public PortletTestApp() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public caf.war.TesteAppPortlet.TesteAppPortlet getTesteAppPortlet()  {
		if (testeAppPortlet == null) {
		    testeAppPortlet = (caf.war.TesteAppPortlet.TesteAppPortlet)resolveExpression("#{TesteAppPortlet}");
		}
		return testeAppPortlet;
	}
}