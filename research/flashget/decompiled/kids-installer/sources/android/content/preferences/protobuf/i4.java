package android.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes.dex */
abstract class i4<T, B> {
    i4() {
    }

    abstract void a(B b6, int i5, int i6);

    abstract void b(B b6, int i5, long j5);

    abstract void c(B b6, int i5, T t5);

    abstract void d(B b6, int i5, w wVar);

    abstract void e(B b6, int i5, long j5);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t5);

    abstract int i(T t5);

    abstract void j(Object obj);

    abstract T k(T t5, T t6);

    final void l(B b6, h3 h3Var) throws IOException {
        while (h3Var.C() != Integer.MAX_VALUE && m(b6, h3Var)) {
        }
    }

    final boolean m(B b6, h3 h3Var) throws IOException {
        int a6 = h3Var.a();
        int a7 = q4.a(a6);
        int i5 = a6 & 7;
        if (i5 == 0) {
            e(b6, a7, h3Var.P());
            return true;
        }
        if (i5 == 1) {
            b(b6, a7, h3Var.e());
            return true;
        }
        if (i5 == 2) {
            d(b6, a7, h3Var.F());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b6, a7, h3Var.k());
            return true;
        }
        B n5 = n();
        int i6 = 4 | (a7 << 3);
        l(n5, h3Var);
        if (i6 != h3Var.a()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b6, a7, r(n5));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b6);

    abstract void p(Object obj, T t5);

    abstract boolean q(h3 h3Var);

    abstract T r(B b6);

    abstract void s(T t5, s4 s4Var) throws IOException;

    abstract void t(T t5, s4 s4Var) throws IOException;
}
