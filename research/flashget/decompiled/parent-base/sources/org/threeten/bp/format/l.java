package org.threeten.bp.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: SimpleDateTimeFormatStyleProvider.java */
/* loaded from: classes9.dex */
final class l extends b {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, Object> f88218a = new ConcurrentHashMap(16, 0.75f, 2);

    l() {
    }

    private int d(i iVar) {
        return iVar.ordinal();
    }

    @Override // org.threeten.bp.format.b
    public Locale[] a() {
        return DateFormat.getAvailableLocales();
    }

    @Override // org.threeten.bp.format.b
    public c b(i iVar, i iVar2, org.threeten.bp.chrono.j jVar, Locale locale) {
        if (iVar == null && iVar2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        String str = jVar.t() + '|' + locale.toString() + '|' + iVar + iVar2;
        ConcurrentMap<String, Object> concurrentMap = f88218a;
        Object obj = concurrentMap.get(str);
        if (obj != null) {
            if (obj.equals("")) {
                throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
            }
            return (c) obj;
        }
        DateFormat dateTimeInstance = iVar != null ? iVar2 != null ? DateFormat.getDateTimeInstance(iVar.ordinal(), iVar2.ordinal(), locale) : DateFormat.getDateInstance(iVar.ordinal(), locale) : DateFormat.getTimeInstance(iVar2.ordinal(), locale);
        if (!(dateTimeInstance instanceof SimpleDateFormat)) {
            concurrentMap.putIfAbsent(str, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
        c Q = new d().o(((SimpleDateFormat) dateTimeInstance).toPattern()).Q(locale);
        concurrentMap.putIfAbsent(str, Q);
        return Q;
    }
}
