package androidx.compose.material3;

import android.os.Build;
import android.text.format.DateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CalendarModel.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "Landroidx/compose/material3/s0;", "a", "(Ljava/util/Locale;)Landroidx/compose/material3/s0;", "", "utcTimeMillis", "", "skeleton", "", "", "cache", "b", "(JLjava/lang/String;Ljava/util/Locale;Ljava/util/Map;)Ljava/lang/String;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCalendarModel.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,67:1\n361#2,7:68\n*S KotlinDebug\n*F\n+ 1 CalendarModel.android.kt\nandroidx/compose/material3/CalendarModel_androidKt\n*L\n58#1:68,7\n*E\n"})
/* loaded from: classes.dex */
public final class i2 {
    @fg.l
    @f5
    public static final s0 a(@fg.l Locale locale) {
        return Build.VERSION.SDK_INT >= 26 ? new g2(locale) : new f6(locale);
    }

    @fg.l
    @f5
    public static final String b(long j4, @fg.l String str, @fg.l Locale locale, @fg.l Map<String, Object> map) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        if (obj == null) {
            obj = DateFormat.getBestDateTimePattern(locale, str);
            map.put(str2, obj);
        }
        String obj2 = obj.toString();
        return Build.VERSION.SDK_INT >= 26 ? g2.INSTANCE.a(j4, obj2, locale, map) : f6.INSTANCE.a(j4, obj2, locale, map);
    }
}
