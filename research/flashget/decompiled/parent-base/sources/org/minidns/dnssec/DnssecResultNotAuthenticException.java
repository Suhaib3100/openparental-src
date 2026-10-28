package org.minidns.dnssec;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.minidns.MiniDnsException;

/* loaded from: classes5.dex */
public final class DnssecResultNotAuthenticException extends MiniDnsException {

    /* renamed from: d, reason: collision with root package name */
    private static final long f87245d = 1;

    /* renamed from: c, reason: collision with root package name */
    private final Set<d> f87246c;

    private DnssecResultNotAuthenticException(String str, Set<d> set) {
        super(str);
        if (set.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f87246c = Collections.unmodifiableSet(set);
    }

    public static DnssecResultNotAuthenticException a(Set<d> set) {
        StringBuilder sb = new StringBuilder("DNSSEC result not authentic. Reasons: ");
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append('.');
        }
        return new DnssecResultNotAuthenticException(sb.toString(), set);
    }

    public Set<d> b() {
        return this.f87246c;
    }
}
