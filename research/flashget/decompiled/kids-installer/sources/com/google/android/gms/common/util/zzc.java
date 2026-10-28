package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzc {
    private static final Pattern zza = Pattern.compile(ProtectedSandApp.s("ಖ"));

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        int i5 = 0;
        StringBuilder sb = null;
        while (matcher.find()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            int start = matcher.start();
            int i6 = start;
            while (i6 >= 0 && str.charAt(i6) == '\\') {
                i6--;
            }
            if ((start - i6) % 2 != 0) {
                int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((CharSequence) str, i5, matcher.start());
                if (parseInt == 92) {
                    sb.append(ProtectedSandApp.s("ಗ"));
                } else {
                    sb.append(Character.toChars(parseInt));
                }
                i5 = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (i5 < matcher.regionEnd()) {
            sb.append((CharSequence) str, i5, matcher.regionEnd());
        }
        return sb.toString();
    }
}
