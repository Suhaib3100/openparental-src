package androidx.core.telephony.mbms;

import android.content.Context;
import android.os.Build;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: MbmsHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: MbmsHelper.java */
    @x0(28)
    static class a {
        private a() {
        }

        static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set namedContentLocales;
            Set namedContentLocales2;
            CharSequence nameForLocale;
            namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            namedContentLocales2 = serviceInfo.getNamedContentLocales();
            Iterator it = namedContentLocales2.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                strArr[i5] = ((Locale) it.next()).toLanguageTag();
                i5++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            nameForLocale = serviceInfo.getNameForLocale(firstMatch);
            return nameForLocale;
        }
    }

    private c() {
    }

    @q0
    public static CharSequence a(@o0 Context context, @o0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(context, serviceInfo);
        }
        return null;
    }
}
