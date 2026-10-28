package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.annotation.q0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: DateStrings.java */
/* loaded from: classes2.dex */
class d {
    private d() {
    }

    static androidx.core.util.m<String, String> a(@q0 Long l5, @q0 Long l6) {
        return b(l5, l6, null);
    }

    static androidx.core.util.m<String, String> b(@q0 Long l5, @q0 Long l6, @q0 SimpleDateFormat simpleDateFormat) {
        if (l5 == null && l6 == null) {
            return new androidx.core.util.m<>(null, null);
        }
        if (l5 == null) {
            return new androidx.core.util.m<>(null, d(l6.longValue(), simpleDateFormat));
        }
        if (l6 == null) {
            return new androidx.core.util.m<>(d(l5.longValue(), simpleDateFormat), null);
        }
        Calendar t5 = q.t();
        Calendar w5 = q.w(null);
        w5.setTimeInMillis(l5.longValue());
        Calendar w6 = q.w(null);
        w6.setTimeInMillis(l6.longValue());
        if (simpleDateFormat != null) {
            return new androidx.core.util.m<>(simpleDateFormat.format(new Date(l5.longValue())), simpleDateFormat.format(new Date(l6.longValue())));
        }
        return w5.get(1) == w6.get(1) ? w5.get(1) == t5.get(1) ? new androidx.core.util.m<>(f(l5.longValue(), Locale.getDefault()), f(l6.longValue(), Locale.getDefault())) : new androidx.core.util.m<>(f(l5.longValue(), Locale.getDefault()), k(l6.longValue(), Locale.getDefault())) : new androidx.core.util.m<>(k(l5.longValue(), Locale.getDefault()), k(l6.longValue(), Locale.getDefault()));
    }

    static String c(long j5) {
        return d(j5, null);
    }

    static String d(long j5, @q0 SimpleDateFormat simpleDateFormat) {
        Calendar t5 = q.t();
        Calendar w5 = q.w(null);
        w5.setTimeInMillis(j5);
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j5)) : t5.get(1) == w5.get(1) ? e(j5) : j(j5);
    }

    static String e(long j5) {
        return f(j5, Locale.getDefault());
    }

    static String f(long j5, Locale locale) {
        return q.c(locale).format(new Date(j5));
    }

    static String g(long j5) {
        return h(j5, Locale.getDefault());
    }

    static String h(long j5, Locale locale) {
        return q.d(locale).format(new Date(j5));
    }

    static String i(Context context, long j5) {
        return DateUtils.formatDateTime(context, j5 - TimeZone.getDefault().getOffset(j5), 36);
    }

    static String j(long j5) {
        return k(j5, Locale.getDefault());
    }

    static String k(long j5, Locale locale) {
        return q.x(locale).format(new Date(j5));
    }

    static String l(long j5) {
        return m(j5, Locale.getDefault());
    }

    static String m(long j5, Locale locale) {
        return q.y(locale).format(new Date(j5));
    }
}
