/* ******************************************************************************
 * Copyright (c) 2006-2010 XMind Ltd. and others.
 * 
 * This file is a part of XMind 3. XMind releases 3 and
 * above are dual-licensed under the Eclipse Public License (EPL),
 * which is available at http://www.eclipse.org/legal/epl-v10.html
 * and the GNU Lesser General Public License (LGPL), 
 * which is available at http://www.gnu.org/licenses/lgpl.html
 * See http://www.xmind.net/license.html for details.
 * 
 * Contributors:
 *     XMind Ltd. - initial API and implementation
 *******************************************************************************/
package net.xmind.signin;

public interface IAuthenticationListener {

    /**
     * Called when user retrieved authentication from XMind.net.
     * 
     * @param accountInfo
     *            the account info of the current user who just signed in
     */
    void postSignIn(IAccountInfo accountInfo);

    /**
     * Called when user cleared authentication info on this computer.
     * 
     * @param oldAccountInfo
     *            the account info of the last user who just signed out
     */
    void postSignOut(IAccountInfo oldAccountInfo);

}