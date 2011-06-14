/*
 * Copyright (C) 2011 samirfor
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package util;

/**
 * This class is responsible for opening a URL in the default browser.
 * 
 * @author samirfor
 */
public class OpenDefaultBrowser {

    private String url;

    public OpenDefaultBrowser(String url) {
        this.url = url;
    }

    public void open() {
        if (!java.awt.Desktop.isDesktopSupported()) {
            System.err.println("Desktop is not supported (fatal)");
            return;
        }

        java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

        if (!desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
            System.err.println("Desktop doesn't support the browse action (fatal)");
            return;
        }

        try {
            java.net.URI uri = new java.net.URI(this.url);
            desktop.browse(uri);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public String getUrl() {
        return url;
    }
}
