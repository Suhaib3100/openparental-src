package androidx.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes3.dex */
abstract class l4<T, B> {
    l4() {
    }

    abstract void a(B b5, int i4, int i5);

    abstract void b(B b5, int i4, long j4);

    abstract void c(B b5, int i4, T t4);

    abstract void d(B b5, int i4, w wVar);

    abstract void e(B b5, int i4, long j4);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t4);

    abstract int i(T t4);

    abstract void j(Object obj);

    abstract T k(T t4, T t5);

    final void l(B b5, k3 k3Var) throws IOException {
        while (k3Var.H() != Integer.MAX_VALUE && m(b5, k3Var)) {
        }
    }

    final boolean m(B b5, k3 k3Var) throws IOException {
        int tag = k3Var.getTag();
        int a5 = t4.a(tag);
        int i4 = tag & 7;
        if (i4 == 0) {
            e(b5, a5, k3Var.Q());
            return true;
        }
        if (i4 == 1) {
            b(b5, a5, k3Var.b());
            return true;
        }
        if (i4 == 2) {
            d(b5, a5, k3Var.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b5, a5, k3Var.y());
            return true;
        }
        B n4 = n();
        int i5 = 4 | (a5 << 3);
        l(n4, k3Var);
        if (i5 != k3Var.getTag()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b5, a5, r(n4));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b5);

    abstract void p(Object obj, T t4);

    abstract boolean q(k3 k3Var);

    abstract T r(B b5);

    abstract void s(T t4, v4 v4Var) throws IOException;

    abstract void t(T t4, v4 v4Var) throws IOException;
}
