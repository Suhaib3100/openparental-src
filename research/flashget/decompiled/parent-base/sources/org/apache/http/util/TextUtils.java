package org.apache.http.util;

/* loaded from: classes3.dex */
public final class TextUtils {
    public static boolean isBlank(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!Character.isWhitespace(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
