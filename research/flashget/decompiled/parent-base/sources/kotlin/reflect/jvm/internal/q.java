package kotlin.reflect.jvm.internal;

import java.util.Comparator;

/* loaded from: classes7.dex */
class q implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    private final ld.p f78793b;

    public q(ld.p pVar) {
        this.f78793b = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int Q;
        Q = r.Q(this.f78793b, obj, obj2);
        return Q;
    }
}
