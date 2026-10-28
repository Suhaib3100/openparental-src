package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.annotation.q0;
import androidx.core.util.s;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateStrings.java */
/* loaded from: classes6.dex */
class d {
    private d() {
    }

    static s<String, String> a(@q0 Long l4, @q0 Long l5) {
        return b(l4, l5, null);
    }

    static s<String, String> b(@q0 Long l4, @q0 Long l5, @q0 SimpleDateFormat simpleDateFormat) {
        if (l4 == null && l5 == null) {
            return new s<>(null, null);
        }
        if (l4 == null) {
            return new s<>(null, d(l5.longValue(), simpleDateFormat));
        }
        if (l5 == null) {
            return new s<>(d(l4.longValue(), simpleDateFormat), null);
        }
        Calendar t4 = q.t();
        Calendar w4 = q.w(null);
        w4.setTimeInMillis(l4.longValue());
        Calendar w5 = q.w(null);
        w5.setTimeInMillis(l5.longValue());
        if (simpleDateFormat != null) {
            return new s<>(simpleDateFormat.format(new Date(l4.longValue())), simpleDateFormat.format(new Date(l5.longValue())));
        }
        return w4.get(1) == w5.get(1) ? w4.get(1) == t4.get(1) ? new s<>(f(l4.longValue(), Locale.getDefault()), f(l5.longValue(), Locale.getDefault())) : new s<>(f(l4.longValue(), Locale.getDefault()), k(l5.longValue(), Locale.getDefault())) : new s<>(k(l4.longValue(), Locale.getDefault()), k(l5.longValue(), Locale.getDefault()));
    }

    static String c(long j4) {
        return d(j4, null);
    }

    static String d(long j4, @q0 SimpleDateFormat simpleDateFormat) {
        Calendar t4 = q.t();
        Calendar w4 = q.w(null);
        w4.setTimeInMillis(j4);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j4)) : t4.get(1) == w4.get(1) ? e(j4) : j(j4);
    }

    static String e(long j4) {
        return f(j4, Locale.getDefault());
    }

    static String f(long j4, Locale locale) {
        return q.c(locale).format(new Date(j4));
    }

    static String g(long j4) {
        return h(j4, Locale.getDefault());
    }

    static String h(long j4, Locale locale) {
        return q.d(locale).format(new Date(j4));
    }

    static String i(Context context, long j4) {
        return DateUtils.formatDateTime(context, j4 - TimeZone.getDefault().getOffset(j4), 36);
    }

    static String j(long j4) {
        return k(j4, Locale.getDefault());
    }

    static String k(long j4, Locale locale) {
        return q.x(locale).format(new Date(j4));
    }

    static String l(long j4) {
        return m(j4, Locale.getDefault());
    }

    static String m(long j4, Locale locale) {
        return q.y(locale).format(new Date(j4));
    }
}
