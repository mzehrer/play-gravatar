package org.zepan.play.gravatar;

import org.zepan.play.gravatar.MD5Util;
import play.templates.JavaExtensions;

public class GravatarExtension extends JavaExtensions {

    public static String gravatarUrl(String email, String s, String d) {

	StringBuffer gravReq = new StringBuffer();

        String gravatarImageBaseUrl = "http://www.gravatar.com/avatar/";
        String md5Email = MD5Util.md5Hex(email);
	gravReq.append(gravatarImageBaseUrl);
	gravReq.append(md5Email + "?");

	if (s != null && Integer.parseInt(s) > 0 && Integer.parseInt(s) < 513)
		gravReq.append("s=" + s + "&");

	if (d != null && d.matches("mm|identicon|monsterid|wavatar|retro"))
		gravReq.append("d=" + d + "&");

        return gravReq.toString();
    }

}
