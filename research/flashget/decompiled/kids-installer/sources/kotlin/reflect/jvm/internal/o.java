package kotlin.reflect.jvm.internal;

import java.util.Comparator;

/* loaded from: classes5.dex */
class o implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    private final q3.p f26775o;

    public o(q3.p pVar) {
        this.f26775o = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int V;
        V = p.V(this.f26775o, obj, obj2);
        return V;
    }
}
