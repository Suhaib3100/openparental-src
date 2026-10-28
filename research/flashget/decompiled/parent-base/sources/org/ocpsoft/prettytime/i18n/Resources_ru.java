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
public class Resources_ru extends ListResourceBundle implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[][] f87892a = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private static final int f87893b = 50;

    /* renamed from: c, reason: collision with root package name */
    private static final int f87894c = 3;

    private static class TimeFormatAided implements TimeFormat {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f87896a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length != 3) {
                throw new IllegalArgumentException("Wrong plural forms number for russian language!");
            }
            this.f87896a = strArr;
        }

        private String e(boolean z4, boolean z5, long j4, String str) {
            char c5;
            long j5 = j4 % 10;
            if (j5 != 1 || j4 % 100 == 11) {
                if (j5 >= 2 && j5 <= 4) {
                    long j6 = j4 % 100;
                    if (j6 < 10 || j6 >= 20) {
                        c5 = 1;
                    }
                }
                c5 = 2;
            } else {
                c5 = 0;
            }
            if (c5 > 3) {
                throw new IllegalStateException("Wrong plural index was calculated somehow for russian language");
            }
            StringBuilder sb = new StringBuilder();
            if (z5) {
                sb.append("через ");
            }
            sb.append(str);
            sb.append(' ');
            sb.append(this.f87896a[c5]);
            if (z4) {
                sb.append(" назад");
            }
            return sb.toString();
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String a(Duration duration, String str) {
            return e(duration.e(), duration.b(), duration.d(50), str);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String b(Duration duration) {
            return String.valueOf(duration.d(50));
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String c(Duration duration, String str) {
            return e(duration.e(), duration.b(), Math.abs(duration.f()), str);
        }

        @Override // org.ocpsoft.prettytime.TimeFormat
        public String d(Duration duration) {
            return String.valueOf(Math.abs(duration.f()));
        }
    }

    @Override // org.ocpsoft.prettytime.impl.c
    public TimeFormat a(TimeUnit timeUnit) {
        if (timeUnit instanceof JustNow) {
            return new TimeFormat() { // from class: org.ocpsoft.prettytime.i18n.Resources_ru.1
                private String e(Duration duration) {
                    if (duration.b()) {
                        return "сейчас";
                    }
                    if (duration.e()) {
                        return "только что";
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
            return new TimeFormatAided("век", "века", "веков");
        }
        if (timeUnit instanceof Day) {
            return new TimeFormatAided("день", "дня", "дней");
        }
        if (timeUnit instanceof Decade) {
            return new TimeFormatAided("десятилетие", "десятилетия", "десятилетий");
        }
        if (timeUnit instanceof Hour) {
            return new TimeFormatAided("час", "часа", "часов");
        }
        if (timeUnit instanceof Millennium) {
            return new TimeFormatAided("тысячелетие", "тысячелетия", "тысячелетий");
        }
        if (timeUnit instanceof Millisecond) {
            return new TimeFormatAided("миллисекунду", "миллисекунды", "миллисекунд");
        }
        if (timeUnit instanceof Minute) {
            return new TimeFormatAided("минуту", "минуты", "минут");
        }
        if (timeUnit instanceof Month) {
            return new TimeFormatAided("месяц", "месяца", "месяцев");
        }
        if (timeUnit instanceof Second) {
            return new TimeFormatAided("секунду", "секунды", "секунд");
        }
        if (timeUnit instanceof Week) {
            return new TimeFormatAided("неделю", "недели", "недель");
        }
        if (timeUnit instanceof Year) {
            return new TimeFormatAided("год", "года", "лет");
        }
        return null;
    }

    @Override // java.util.ListResourceBundle
    public Object[][] getContents() {
        return f87892a;
    }
}
