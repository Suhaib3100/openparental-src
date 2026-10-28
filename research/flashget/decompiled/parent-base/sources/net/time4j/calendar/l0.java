package net.time4j.calendar;

import com.android.internal.telephony.SmsConstants;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Map;
import net.time4j.engine.r;

/* compiled from: RelatedGregorianYearRule.java */
/* loaded from: classes7.dex */
final class l0<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, Integer> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f82594d = ProtectedSandApp.s("鄓\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, ? extends net.time4j.engine.l<T>> f82595b;

    /* renamed from: c, reason: collision with root package name */
    private final net.time4j.engine.q<Integer> f82596c;

    l0(net.time4j.engine.l<T> lVar, net.time4j.engine.q<Integer> qVar) {
        this.f82595b = Collections.singletonMap(ProtectedSandApp.s("鄓\u0001"), lVar);
        this.f82596c = qVar;
    }

    private net.time4j.engine.l<T> b(T t4) {
        return t4 instanceof net.time4j.engine.m ? this.f82595b.get(((net.time4j.engine.m) net.time4j.engine.m.class.cast(t4)).getVariant()) : this.f82595b.get(ProtectedSandApp.s("鄓\u0001"));
    }

    private static Integer k(long j4) {
        long j5;
        long f4 = net.time4j.base.c.f(net.time4j.engine.b0.MODIFIED_JULIAN_DATE.transform(j4, net.time4j.engine.b0.UTC), 678881L);
        long b5 = net.time4j.base.c.b(f4, 146097);
        int d5 = net.time4j.base.c.d(f4, 146097);
        if (d5 == 146096) {
            j5 = (b5 + 1) * 400;
        } else {
            int i4 = d5 / 36524;
            int i5 = d5 % 36524;
            int i6 = i5 / 1461;
            int i7 = i5 % 1461;
            if (i7 == 1460) {
                j5 = (b5 * 400) + (i4 * 100) + ((i6 + 1) * 4);
            } else {
                j5 = (b5 * 400) + (i4 * 100) + (i6 * 4) + (i7 / 365);
                if (((((i7 % 365) + 31) * 5) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) + 2 > 12) {
                    j5++;
                }
            }
        }
        return Integer.valueOf(net.time4j.base.c.g(j5));
    }

    public net.time4j.engine.q<?> c(T t4) {
        return null;
    }

    public net.time4j.engine.q<?> f(T t4) {
        return null;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer getMaximum(T t4) {
        net.time4j.engine.l<T> b5 = b(t4);
        return k(b5.f(((net.time4j.engine.r) b5.e(b5.d())).K(this.f82596c, 1)));
    }

    @Override // net.time4j.engine.a0
    public net.time4j.engine.q getChildAtCeiling(Object obj) {
        return null;
    }

    @Override // net.time4j.engine.a0
    public net.time4j.engine.q getChildAtFloor(Object obj) {
        return null;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getMinimum(T t4) {
        net.time4j.engine.l<T> b5 = b(t4);
        return k(b5.f(((net.time4j.engine.r) b5.e(b5.g())).K(this.f82596c, 1)));
    }

    @Override // net.time4j.engine.a0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer getValue(T t4) {
        return k(b(t4).f(t4.K(this.f82596c, 1)));
    }

    @Override // net.time4j.engine.a0
    public boolean j(T t4, Integer num) {
        return getValue(t4).equals(num);
    }

    @Override // net.time4j.engine.a0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public T withValue(T t4, Integer num, boolean z4) {
        if (j(t4, num)) {
            return t4;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("鄔\u0001"));
    }

    l0(Map<String, ? extends net.time4j.engine.l<T>> map, net.time4j.engine.q<Integer> qVar) {
        this.f82595b = map;
        this.f82596c = qVar;
    }
}
