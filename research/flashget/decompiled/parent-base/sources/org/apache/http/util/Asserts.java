package org.apache.http.util;

import androidx.compose.runtime.changelist.j;

/* loaded from: classes3.dex */
public class Asserts {
    public static void check(boolean z4, String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    public static void notBlank(CharSequence charSequence, String str) {
        if (TextUtils.isBlank(charSequence)) {
            throw new IllegalStateException(j.a(str, " is blank"));
        }
    }

    public static void notEmpty(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalStateException(j.a(str, " is empty"));
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(j.a(str, " is null"));
        }
    }

    public static void check(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
