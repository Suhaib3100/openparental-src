package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.x0;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: LocaleOverlayHelper.java */
@x0(24)
/* loaded from: classes.dex */
final class x {
    private x() {
    }

    private static androidx.core.os.p a(androidx.core.os.p pVar, androidx.core.os.p pVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i4 = 0;
        while (i4 < pVar2.l() + pVar.l()) {
            Locale d5 = i4 < pVar.l() ? pVar.d(i4) : pVar2.d(i4 - pVar.l());
            if (d5 != null) {
                linkedHashSet.add(d5);
            }
            i4++;
        }
        return androidx.core.os.p.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.p b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? androidx.core.os.p.g() : a(androidx.core.os.p.o(localeList), androidx.core.os.p.o(localeList2));
    }

    static androidx.core.os.p c(androidx.core.os.p pVar, androidx.core.os.p pVar2) {
        return (pVar == null || pVar.j()) ? androidx.core.os.p.g() : a(pVar, pVar2);
    }
}
