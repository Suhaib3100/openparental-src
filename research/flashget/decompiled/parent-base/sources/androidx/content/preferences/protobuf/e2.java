package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.b2;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes3.dex */
class e2 implements d2 {
    e2() {
    }

    private static <K, V> int i(int i4, Object obj, Object obj2) {
        c2 c2Var = (c2) obj;
        b2 b2Var = (b2) obj2;
        int i5 = 0;
        if (c2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : c2Var.entrySet()) {
            i5 += b2Var.a(i4, entry.getKey(), entry.getValue());
        }
        return i5;
    }

    private static <K, V> c2<K, V> j(Object obj, Object obj2) {
        c2<K, V> c2Var = (c2) obj;
        c2<K, V> c2Var2 = (c2) obj2;
        if (!c2Var2.isEmpty()) {
            if (!c2Var.n()) {
                c2Var = c2Var.q();
            }
            c2Var.p(c2Var2);
        }
        return c2Var;
    }

    @Override // androidx.content.preferences.protobuf.d2
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.content.preferences.protobuf.d2
    public b2.b<?, ?> b(Object obj) {
        return ((b2) obj).d();
    }

    @Override // androidx.content.preferences.protobuf.d2
    public Map<?, ?> c(Object obj) {
        return (c2) obj;
    }

    @Override // androidx.content.preferences.protobuf.d2
    public Object d(Object obj) {
        return c2.i().q();
    }

    @Override // androidx.content.preferences.protobuf.d2
    public Map<?, ?> e(Object obj) {
        return (c2) obj;
    }

    @Override // androidx.content.preferences.protobuf.d2
    public Object f(Object obj) {
        ((c2) obj).o();
        return obj;
    }

    @Override // androidx.content.preferences.protobuf.d2
    public int g(int i4, Object obj, Object obj2) {
        return i(i4, obj, obj2);
    }

    @Override // androidx.content.preferences.protobuf.d2
    public boolean h(Object obj) {
        return !((c2) obj).n();
    }
}
