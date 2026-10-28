package android.content.preferences.protobuf;

import android.content.preferences.protobuf.a2;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes3.dex */
class d2 implements c2 {
    d2() {
    }

    private static <K, V> int i(int i5, Object obj, Object obj2) {
        b2 b2Var = (b2) obj;
        a2 a2Var = (a2) obj2;
        int i6 = 0;
        if (b2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : b2Var.entrySet()) {
            i6 += a2Var.a(i5, entry.getKey(), entry.getValue());
        }
        return i6;
    }

    private static <K, V> b2<K, V> j(Object obj, Object obj2) {
        b2<K, V> b2Var = (b2) obj;
        b2<K, V> b2Var2 = (b2) obj2;
        if (!b2Var2.isEmpty()) {
            if (!b2Var.p()) {
                b2Var = b2Var.u();
            }
            b2Var.s(b2Var2);
        }
        return b2Var;
    }

    @Override // android.content.preferences.protobuf.c2
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // android.content.preferences.protobuf.c2
    public Object b(Object obj) {
        ((b2) obj).q();
        return obj;
    }

    @Override // android.content.preferences.protobuf.c2
    public a2.b<?, ?> c(Object obj) {
        return ((a2) obj).d();
    }

    @Override // android.content.preferences.protobuf.c2
    public Map<?, ?> d(Object obj) {
        return (b2) obj;
    }

    @Override // android.content.preferences.protobuf.c2
    public Object e(Object obj) {
        return b2.k().u();
    }

    @Override // android.content.preferences.protobuf.c2
    public int f(int i5, Object obj, Object obj2) {
        return i(i5, obj, obj2);
    }

    @Override // android.content.preferences.protobuf.c2
    public boolean g(Object obj) {
        return !((b2) obj).p();
    }

    @Override // android.content.preferences.protobuf.c2
    public Map<?, ?> h(Object obj) {
        return (b2) obj;
    }
}
