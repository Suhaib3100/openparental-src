package android.content.preferences.protobuf;

import android.content.preferences.protobuf.c1;
import androidx.datastore.preferences.protobuf.c1.c;
import java.io.IOException;
import java.util.Map;

/* compiled from: ExtensionSchema.java */
/* loaded from: classes.dex */
abstract class t0<T extends c1.c<T>> {
    t0() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(s0 s0Var, h2 h2Var, int i5);

    abstract c1<T> c(Object obj);

    abstract c1<T> d(Object obj);

    abstract boolean e(h2 h2Var);

    abstract void f(Object obj);

    abstract <UT, UB> UB g(h3 h3Var, Object obj, s0 s0Var, c1<T> c1Var, UB ub, i4<UT, UB> i4Var) throws IOException;

    abstract void h(h3 h3Var, Object obj, s0 s0Var, c1<T> c1Var) throws IOException;

    abstract void i(w wVar, Object obj, s0 s0Var, c1<T> c1Var) throws IOException;

    abstract void j(s4 s4Var, Map.Entry<?, ?> entry) throws IOException;

    abstract void k(Object obj, c1<T> c1Var);
}
