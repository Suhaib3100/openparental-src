package org.ocpsoft.prettytime.i18n;

import java.lang.reflect.Array;
import java.util.ListResourceBundle;
import org.ocpsoft.prettytime.Duration;
import org.ocpsoft.prettytime.TimeFormat;
import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.c;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

/* loaded from: classes9.dex */
public class Resources_kk extends ListResourceBundle implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f87879a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    private static class KkTimeFormat implements TimeFormat {

        /* renamed from: a, reason: collision with root package name */
        private final int f87881a = 50;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f87882b;

        public KkTimeFormat(String... strArr) {
            if (strArr.length != 2) {
                throw new IllegalArgumentException("Future and past forms must be provided for kazakh language!");
            }
            this.f87882b = strArr;
        }

        private String e(boolean z4, boolean z5, long j4, String str) {
            StringBuilder sb = new StringBuilder();
            int i4 = !z4 ? 1 : 0;
            sb.append(str);
            sb.append(' ');
            sb.append(this.f87882b[i4]);
            sb.append(' ');
            if (z4) {
                sb.append("бұрын");
            }
            if (z5) {
                sb.append("кейін");
            }
            return sb.toString();
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String a(Duration duration, String str) {
            return e(duration.e(), duration.b(), duration.d(50), str);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String b(Duration duration) {
            long d5 = duration.d(50);
            StringBuilder sb = new StringBuilder();
            sb.append(d5);
            return sb.toString();
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String c(Duration duration, String str) {
            return e(duration.e(), duration.b(), duration.f(), str);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String d(Duration duration) {
            long f4 = duration.f();
            StringBuilder sb = new StringBuilder();
            sb.append(f4);
            return sb.toString();
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (timeUnit instanceof JustNow) {
            return new TimeFormat() { // from class: org.ocpsoft.prettytime.i18n.Resources_kk.1
                private String e(Duration duration) {
                    if (duration.b()) {
                        return "дәл қазір";
                    }
                    if (duration.e()) {
                        return "жана ғана";
                    }
                    return null;
                }

                @Override // org.ocpsoft.prettytime.TimeFormat
                public String a(Duration duration, String str) {
                    return str;
                }

                @Override // org.ocpsoft.prettytime.TimeFormat
                public String b(Duration duration) {
                    return e(duration);
                }

                @Override // org.ocpsoft.prettytime.TimeFormat
                public String c(Duration duration, String str) {
                    return str;
                }

                @Override // org.ocpsoft.prettytime.TimeFormat
                public String d(Duration duration) {
                    return e(duration);
                }
            };
        }
        if (timeUnit instanceof Century) {
            return new KkTimeFormat("ғасыр", "ғасырдан");
        }
        if (timeUnit instanceof Day) {
            return new KkTimeFormat("күн", "күннен");
        }
        if (timeUnit instanceof Decade) {
            return new KkTimeFormat("онжылдық", "онжылдықтан");
        }
        if (timeUnit instanceof Hour) {
            return new KkTimeFormat("сағат", "сағаттан");
        }
        if (timeUnit instanceof Millennium) {
            return new KkTimeFormat("мыңжылдық", "мыңжылдықтан");
        }
        if (timeUnit instanceof Millisecond) {
            return new KkTimeFormat("миллисекунд", "миллисекундтан");
        }
        if (timeUnit instanceof Minute) {
            return new KkTimeFormat("минут", "минуттан");
        }
        if (timeUnit instanceof Month) {
            return new KkTimeFormat("ай", "айдан");
        }
        if (timeUnit instanceof Second) {
            return new KkTimeFormat("секунд", "секундтан");
        }
        if (timeUnit instanceof Week) {
            return new KkTimeFormat("апта", "аптадан");
        }
        if (timeUnit instanceof Year) {
            return new KkTimeFormat("жыл", "жылдан");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    protected Object[][] getContents() {
        return f87879a;
    }
}
