/**
 * 
 */
package caf.war.TesteAppPortlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author admin
 *
 */
@ManagedBean(name = "TesteAppPortlet")
@ApplicationScoped
@DTManagedBean(displayName = "TesteAppPortlet", beanType = BeanType.APPLICATION)
public class TesteAppPortlet extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public TesteAppPortlet()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "TesteAppPortlet" );
	}
}