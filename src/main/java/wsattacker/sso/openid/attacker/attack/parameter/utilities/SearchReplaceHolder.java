package wsattacker.sso.openid.attacker.attack.parameter.utilities;

import javax.xml.bind.annotation.XmlRootElement;
import wsattacker.sso.openid.attacker.composition.AbstractBean;

@XmlRootElement(name = "SearchReplace")
public class SearchReplaceHolder extends AbstractBean {

    public static final String PROP_SEARCH = "search";
    public static final String PROP_REPLACE = "replace";
    public static final String PROP_URLENCODE = "urlEncode";
    private String search = "";
    private String replace = "";
    private boolean urlEncode = true;

    public SearchReplaceHolder() {
    }

    public SearchReplaceHolder(String search, String replace, boolean urlEncode) {
        this();
        this.search = search;
        this.replace = replace;
        this.urlEncode = urlEncode;
    }

    /**
     * Get the value of urlEncode
     *
     * @return the value of urlEncode
     */
    public boolean isUrlEncode() {
        return urlEncode;
    }

    /**
     * Set the value of urlEncode
     *
     * @param urlEncode new value of urlEncode
     */
    public void setUrlEncode(boolean urlEncode) {
        boolean oldUrlEncode = this.urlEncode;
        this.urlEncode = urlEncode;
        firePropertyChange(PROP_URLENCODE, oldUrlEncode, urlEncode);
    }

    /**
     * Get the value of replace
     *
     * @return the value of replace
     */
    public String getReplace() {
        return replace;
    }

    /**
     * Set the value of replace
     *
     * @param replace new value of replace
     */
    public void setReplace(String replace) {
        String oldReplace = this.replace;
        this.replace = replace;
        firePropertyChange(PROP_REPLACE, oldReplace, replace);
    }

    /**
     * Get the value of search
     *
     * @return the value of search
     */
    public String getSearch() {
        return search;
    }

    /**
     * Set the value of search
     *
     * @param search new value of search
     */
    public void setSearch(String search) {
        String oldSearch = this.search;
        this.search = search;
        firePropertyChange(PROP_SEARCH, oldSearch, search);
    }
}
