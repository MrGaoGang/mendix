// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import communitycommons.Logging;

public class CreateLogNode extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String logNode;

	public CreateLogNode(IContext context, java.lang.String logNode)
	{
		super(context);
		this.logNode = logNode;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Logging.createLogNode(logNode);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CreateLogNode";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
