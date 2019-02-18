/**
 * 
 */
package shapes;

import javax.swing.JOptionPane;

/**
 * @author mmarx
 *
 */
public class MessageBox implements Dialog{

	@Override
	public int show(String message, String title) {
		
		JOptionPane.showMessageDialog(null, message, title, 1);
		return JOptionPane.OK_OPTION;
	}

}
