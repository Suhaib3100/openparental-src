package org.threeten.bp.zone;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ZoneRulesProvider.java */
/* loaded from: classes9.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArrayList<i> f88470a = new CopyOnWriteArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, i> f88471b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        h.a();
    }

    protected i() {
    }

    public static Set<String> a() {
        return Collections.unmodifiableSet(f88471b.keySet());
    }

    private static i b(String str) {
        ConcurrentMap<String, i> concurrentMap = f88471b;
        i iVar = concurrentMap.get(str);
        if (iVar != null) {
            return iVar;
        }
        if (concurrentMap.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        throw new ZoneRulesException(androidx.constraintlayout.core.motion.key.c.a("Unknown time-zone ID: ", str));
    }

    public static f c(String str, boolean z4) {
        ng.d.j(str, "zoneId");
        return b(str).f(str, z4);
    }

    public static NavigableMap<String, f> d(String str) {
        ng.d.j(str, "zoneId");
        return b(str).g(str);
    }

    public static boolean i() {
        Iterator<i> it = f88470a.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= it.next().e();
        }
        return z4;
    }

    public static void j(i iVar) {
        ng.d.j(iVar, "provider");
        k(iVar);
        f88470a.add(iVar);
    }

    private static void k(i iVar) {
        for (String str : iVar.h()) {
            ng.d.j(str, "zoneId");
            if (f88471b.putIfAbsent(str, iVar) != null) {
                throw new ZoneRulesException("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
            }
        }
    }

    protected boolean e() {
        return false;
    }

    protected abstract f f(String str, boolean z4);

    protected abstract NavigableMap<String, f> g(String str);

    protected abstract Set<String> h();
}
