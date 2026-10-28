package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzf {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("찪"));

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb = null;
        int i4 = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            int start = matcher.start();
            int i5 = start;
            while (i5 >= 0 && str.charAt(i5) == '\\') {
                i5--;
            }
            if ((start - i5) % 2 != 0) {
                int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((CharSequence) str, i4, matcher.start());
                if (parseInt == 92) {
                    sb.append(ProtectedSandApp.s("찫"));
                } else {
                    sb.append(Character.toChars(parseInt));
                }
                i4 = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (i4 < matcher.regionEnd()) {
            sb.append((CharSequence) str, i4, matcher.regionEnd());
        }
        return sb.toString();
    }
}
