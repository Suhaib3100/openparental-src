package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.c1.c;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchema.java */
/* loaded from: classes3.dex */
abstract class t0<T extends c1.c<T>> {
    t0() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(s0 s0Var, i2 i2Var, int i4);

    abstract c1<T> c(Object obj);

    abstract c1<T> d(Object obj);

    abstract boolean e(i2 i2Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(k3 k3Var, Object obj, s0 s0Var, c1<T> c1Var, UB ub, l4<UT, UB> l4Var) throws IOException;

    abstract void h(k3 k3Var, Object obj, s0 s0Var, c1<T> c1Var) throws IOException;

    abstract void i(w wVar, Object obj, s0 s0Var, c1<T> c1Var) throws IOException;

    abstract void j(v4 v4Var, Map.Entry<?, ?> entry) throws IOException;

    abstract void k(Object obj, c1<T> c1Var);
}
