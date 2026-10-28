package android.content.preferences.protobuf;

import android.content.preferences.protobuf.c1;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.r1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes3.dex */
final class l2<T> implements j3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final h2 f7323a;

    /* renamed from: b, reason: collision with root package name */
    private final i4<?, ?> f7324b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f7325c;

    /* renamed from: d, reason: collision with root package name */
    private final t0<?> f7326d;

    private l2(i4<?, ?> i4Var, t0<?> t0Var, h2 h2Var) {
        this.f7324b = i4Var;
        this.f7325c = t0Var.e(h2Var);
        this.f7326d = t0Var;
        this.f7323a = h2Var;
    }

    private <UT, UB> int k(i4<UT, UB> i4Var, T t5) {
        return i4Var.i(i4Var.g(t5));
    }

    private <UT, UB, ET extends c1.c<ET>> void l(i4<UT, UB> i4Var, t0<ET> t0Var, T t5, h3 h3Var, s0 s0Var) throws IOException {
        UB f6 = i4Var.f(t5);
        c1<ET> d6 = t0Var.d(t5);
        do {
            try {
                if (h3Var.C() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                i4Var.o(t5, f6);
            }
        } while (n(h3Var, s0Var, t0Var, d6, i4Var, f6));
    }

    static <T> l2<T> m(i4<?, ?> i4Var, t0<?> t0Var, h2 h2Var) {
        return new l2<>(i4Var, t0Var, h2Var);
    }

    private <UT, UB, ET extends c1.c<ET>> boolean n(h3 h3Var, s0 s0Var, t0<ET> t0Var, c1<ET> c1Var, i4<UT, UB> i4Var, UB ub) throws IOException {
        int a6 = h3Var.a();
        if (a6 != q4.f7486q) {
            if ((a6 & 7) != 2) {
                return h3Var.K();
            }
            Object b6 = t0Var.b(s0Var, this.f7323a, a6 >>> 3);
            if (b6 == null) {
                return i4Var.m(ub, h3Var);
            }
            t0Var.h(h3Var, b6, s0Var, c1Var);
            return true;
        }
        Object obj = null;
        int i5 = 0;
        w wVar = null;
        while (h3Var.C() != Integer.MAX_VALUE) {
            int a7 = h3Var.a();
            if (a7 == q4.f7488s) {
                i5 = h3Var.q();
                obj = t0Var.b(s0Var, this.f7323a, i5);
            } else if (a7 == q4.f7489t) {
                if (obj != null) {
                    t0Var.h(h3Var, obj, s0Var, c1Var);
                } else {
                    wVar = h3Var.F();
                }
            } else if (!h3Var.K()) {
                break;
            }
        }
        if (h3Var.a() != q4.f7487r) {
            throw InvalidProtocolBufferException.b();
        }
        if (wVar != null) {
            if (obj != null) {
                t0Var.i(wVar, obj, s0Var, c1Var);
            } else {
                i4Var.d(ub, i5, wVar);
            }
        }
        return true;
    }

    private <UT, UB> void o(i4<UT, UB> i4Var, T t5, s4 s4Var) throws IOException {
        i4Var.s(i4Var.g(t5), s4Var);
    }

    @Override // android.content.preferences.protobuf.j3
    public void a(T t5, T t6) {
        l3.J(this.f7324b, t5, t6);
        if (this.f7325c) {
            l3.H(this.f7326d, t5, t6);
        }
    }

    @Override // android.content.preferences.protobuf.j3
    public void b(T t5, h3 h3Var, s0 s0Var) throws IOException {
        l(this.f7324b, this.f7326d, t5, h3Var, s0Var);
    }

    @Override // android.content.preferences.protobuf.j3
    public void c(T t5) {
        this.f7324b.j(t5);
        this.f7326d.f(t5);
    }

    @Override // android.content.preferences.protobuf.j3
    public final boolean d(T t5) {
        return this.f7326d.c(t5).E();
    }

    @Override // android.content.preferences.protobuf.j3
    public void e(T t5, s4 s4Var) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.f7326d.c(t5).H();
        while (H.hasNext()) {
            Map.Entry<?, Object> next = H.next();
            c1.c cVar = (c1.c) next.getKey();
            if (cVar.e() != q4.c.MESSAGE || cVar.a() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof r1.b) {
                s4Var.c(cVar.getNumber(), ((r1.b) next).a().n());
            } else {
                s4Var.c(cVar.getNumber(), next.getValue());
            }
        }
        o(this.f7324b, t5, s4Var);
    }

    @Override // android.content.preferences.protobuf.j3
    public boolean f(T t5, T t6) {
        if (!this.f7324b.g(t5).equals(this.f7324b.g(t6))) {
            return false;
        }
        if (this.f7325c) {
            return this.f7326d.c(t5).equals(this.f7326d.c(t6));
        }
        return true;
    }

    @Override // android.content.preferences.protobuf.j3
    public int g(T t5) {
        int k5 = k(this.f7324b, t5) + 0;
        return this.f7325c ? k5 + this.f7326d.c(t5).v() : k5;
    }

    @Override // android.content.preferences.protobuf.j3
    public T h() {
        return (T) this.f7323a.x().N0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[EDGE_INSN: B:24:0x00c3->B:25:0x00c3 BREAK  A[LOOP:1: B:10:0x0069->B:18:0x0069], SYNTHETIC] */
    @Override // android.content.preferences.protobuf.j3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(T r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.l.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            androidx.datastore.preferences.protobuf.i1 r0 = (android.content.preferences.protobuf.i1) r0
            androidx.datastore.preferences.protobuf.j4 r1 = r0.unknownFields
            androidx.datastore.preferences.protobuf.j4 r2 = android.content.preferences.protobuf.j4.e()
            if (r1 != r2) goto L11
            androidx.datastore.preferences.protobuf.j4 r1 = android.content.preferences.protobuf.j4.p()
            r0.unknownFields = r1
        L11:
            androidx.datastore.preferences.protobuf.i1$e r11 = (androidx.datastore.preferences.protobuf.i1.e) r11
            androidx.datastore.preferences.protobuf.c1 r11 = r11.K2()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lce
            int r4 = android.content.preferences.protobuf.l.I(r12, r13, r15)
            int r13 = r15.f7317a
            int r3 = android.content.preferences.protobuf.q4.f7486q
            r5 = 2
            if (r13 == r3) goto L67
            r3 = r13 & 7
            if (r3 != r5) goto L62
            androidx.datastore.preferences.protobuf.t0<?> r2 = r10.f7326d
            androidx.datastore.preferences.protobuf.s0 r3 = r15.f7320d
            androidx.datastore.preferences.protobuf.h2 r5 = r10.f7323a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            androidx.datastore.preferences.protobuf.i1$h r8 = (androidx.datastore.preferences.protobuf.i1.h) r8
            if (r8 == 0) goto L57
            androidx.datastore.preferences.protobuf.c3 r13 = android.content.preferences.protobuf.c3.a()
            androidx.datastore.preferences.protobuf.h2 r2 = r8.c()
            java.lang.Class r2 = r2.getClass()
            androidx.datastore.preferences.protobuf.j3 r13 = r13.i(r2)
            int r13 = android.content.preferences.protobuf.l.p(r13, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.i1$g r2 = r8.f7255d
            java.lang.Object r3 = r15.f7319c
            r11.O(r2, r3)
            goto L60
        L57:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = android.content.preferences.protobuf.l.G(r2, r3, r4, r5, r6, r7)
        L60:
            r2 = r8
            goto L19
        L62:
            int r13 = android.content.preferences.protobuf.l.N(r13, r12, r4, r14, r15)
            goto L19
        L67:
            r13 = 0
            r3 = r0
        L69:
            if (r4 >= r14) goto Lc3
            int r4 = android.content.preferences.protobuf.l.I(r12, r4, r15)
            int r6 = r15.f7317a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La4
            r9 = 3
            if (r7 == r9) goto L7b
            goto Lb9
        L7b:
            if (r2 == 0) goto L99
            androidx.datastore.preferences.protobuf.c3 r6 = android.content.preferences.protobuf.c3.a()
            androidx.datastore.preferences.protobuf.h2 r7 = r2.c()
            java.lang.Class r7 = r7.getClass()
            androidx.datastore.preferences.protobuf.j3 r6 = r6.i(r7)
            int r4 = android.content.preferences.protobuf.l.p(r6, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.i1$g r6 = r2.f7255d
            java.lang.Object r7 = r15.f7319c
            r11.O(r6, r7)
            goto L69
        L99:
            if (r8 != r5) goto Lb9
            int r4 = android.content.preferences.protobuf.l.b(r12, r4, r15)
            java.lang.Object r3 = r15.f7319c
            androidx.datastore.preferences.protobuf.w r3 = (android.content.preferences.protobuf.w) r3
            goto L69
        La4:
            if (r8 != 0) goto Lb9
            int r4 = android.content.preferences.protobuf.l.I(r12, r4, r15)
            int r13 = r15.f7317a
            androidx.datastore.preferences.protobuf.t0<?> r2 = r10.f7326d
            androidx.datastore.preferences.protobuf.s0 r6 = r15.f7320d
            androidx.datastore.preferences.protobuf.h2 r7 = r10.f7323a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            androidx.datastore.preferences.protobuf.i1$h r2 = (androidx.datastore.preferences.protobuf.i1.h) r2
            goto L69
        Lb9:
            int r7 = android.content.preferences.protobuf.q4.f7487r
            if (r6 != r7) goto Lbe
            goto Lc3
        Lbe:
            int r4 = android.content.preferences.protobuf.l.N(r6, r12, r4, r14, r15)
            goto L69
        Lc3:
            if (r3 == 0) goto Lcb
            int r13 = r13 << 3
            r13 = r13 | r5
            r1.r(r13, r3)
        Lcb:
            r13 = r4
            goto L19
        Lce:
            if (r13 != r14) goto Ld1
            return
        Ld1:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r11 = android.content.preferences.protobuf.InvalidProtocolBufferException.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.content.preferences.protobuf.l2.i(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):void");
    }

    @Override // android.content.preferences.protobuf.j3
    public int j(T t5) {
        int hashCode = this.f7324b.g(t5).hashCode();
        return this.f7325c ? (hashCode * 53) + this.f7326d.c(t5).hashCode() : hashCode;
    }
}
