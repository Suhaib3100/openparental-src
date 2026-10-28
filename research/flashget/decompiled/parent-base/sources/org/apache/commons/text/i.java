package org.apache.commons.text;

import java.util.Formattable;
import java.util.Formatter;

/* compiled from: FormattableUtils.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f86456a = "%s";

    public static Formatter a(CharSequence charSequence, Formatter formatter, int i4, int i5, int i6) {
        return c(charSequence, formatter, i4, i5, i6, ' ', null);
    }

    public static Formatter b(CharSequence charSequence, Formatter formatter, int i4, int i5, int i6, char c5) {
        return c(charSequence, formatter, i4, i5, i6, c5, null);
    }

    public static Formatter c(CharSequence charSequence, Formatter formatter, int i4, int i5, int i6, char c5, CharSequence charSequence2) {
        if (charSequence2 != null && i6 >= 0 && charSequence2.length() > i6) {
            throw new IllegalArgumentException(String.format("Specified ellipsis '%s' exceeds precision of %s", charSequence2, Integer.valueOf(i6)));
        }
        StringBuilder sb = new StringBuilder(charSequence);
        if (i6 >= 0 && i6 < charSequence.length()) {
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            sb.replace(i6 - charSequence2.length(), charSequence.length(), charSequence2.toString());
        }
        boolean z4 = (i4 & 1) == 1;
        for (int length = sb.length(); length < i5; length++) {
            sb.insert(z4 ? length : 0, c5);
        }
        formatter.format(sb.toString(), new Object[0]);
        return formatter;
    }

    public static Formatter d(CharSequence charSequence, Formatter formatter, int i4, int i5, int i6, CharSequence charSequence2) {
        return c(charSequence, formatter, i4, i5, i6, ' ', charSequence2);
    }

    public static String e(Formattable formattable) {
        return String.format("%s", formattable);
    }
}
