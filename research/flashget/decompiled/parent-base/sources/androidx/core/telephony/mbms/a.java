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
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: MbmsHelper.java */
    @x0(28)
    /* renamed from: androidx.core.telephony.mbms.a$a, reason: collision with other inner class name */
    static class C0430a {
        private C0430a() {
        }

        static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                strArr[i4] = it.next().toLanguageTag();
                i4++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private a() {
    }

    @q0
    public static CharSequence a(@o0 Context context, @o0 ServiceInfo serviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0430a.a(context, serviceInfo);
        }
        return null;
    }
}
