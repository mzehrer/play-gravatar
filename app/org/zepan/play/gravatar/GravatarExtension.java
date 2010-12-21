package org.zepan.play.gravatar;

import org.zepan.play.gravatar.MD5Util;
import play.templates.JavaExtensions;

public class GravatarExtension extends JavaExtensions {

    public static String gravatarUrl(String email, String size, String d) {

	if (d == null)
		d="mm";

        String gravatarImageBaseUrl = "http://www.gravatar.com/avatar/";
        String md5Email = MD5Util.md5Hex(email);

        return gravatarImageBaseUrl + md5Email + "?s=" + size + "&d=" + d;
    }

}
