package org.apache.http.util;

import androidx.compose.runtime.changelist.j;
import java.util.Collection;

/* loaded from: classes3.dex */
public class Args {
    public static void check(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T extends CharSequence> T notBlank(T t4, String str) {
        if (t4 == null) {
            throw new IllegalArgumentException(j.a(str, " may not be null"));
        }
        if (TextUtils.isBlank(t4)) {
            throw new IllegalArgumentException(j.a(str, " may not be blank"));
        }
        return t4;
    }

    public static <T extends CharSequence> T notEmpty(T t4, String str) {
        if (t4 == null) {
            throw new IllegalArgumentException(j.a(str, " may not be null"));
        }
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException(j.a(str, " may not be empty"));
        }
        return t4;
    }

    public static int notNegative(int i4, String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be negative"));
    }

    public static <T> T notNull(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be null"));
    }

    public static int positive(int i4, String str) {
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be negative or zero"));
    }

    public static void check(boolean z4, String str, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static long notNegative(long j4, String str) {
        if (j4 >= 0) {
            return j4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be negative"));
    }

    public static long positive(long j4, String str) {
        if (j4 > 0) {
            return j4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be negative or zero"));
    }

    public static <E, T extends Collection<E>> T notEmpty(T t4, String str) {
        if (t4 != null) {
            if (t4.isEmpty()) {
                throw new IllegalArgumentException(j.a(str, " may not be empty"));
            }
            return t4;
        }
        throw new IllegalArgumentException(j.a(str, " may not be null"));
    }
}
