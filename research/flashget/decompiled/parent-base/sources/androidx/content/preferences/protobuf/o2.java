package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.c1;
import androidx.content.preferences.protobuf.s1;
import androidx.content.preferences.protobuf.t4;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes3.dex */
final class o2<T> implements m3<T> {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f28831a;

    /* renamed from: b, reason: collision with root package name */
    private final l4<?, ?> f28832b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28833c;

    /* renamed from: d, reason: collision with root package name */
    private final t0<?> f28834d;

    private o2(l4<?, ?> l4Var, t0<?> t0Var, i2 i2Var) {
        this.f28832b = l4Var;
        this.f28833c = t0Var.e(i2Var);
        this.f28834d = t0Var;
        this.f28831a = i2Var;
    }

    private <UT, UB> int k(l4<UT, UB> l4Var, T t4) {
        return l4Var.i(l4Var.g(t4));
    }

    private <UT, UB, ET extends c1.c<ET>> void l(l4<UT, UB> l4Var, t0<ET> t0Var, T t4, k3 k3Var, s0 s0Var) throws IOException {
        UB f4 = l4Var.f(t4);
        c1<ET> d5 = t0Var.d(t4);
        do {
            try {
                if (k3Var.H() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                l4Var.o(t4, f4);
            }
        } while (n(k3Var, s0Var, t0Var, d5, l4Var, f4));
    }

    static <T> o2<T> m(l4<?, ?> l4Var, t0<?> t0Var, i2 i2Var) {
        return new o2<>(l4Var, t0Var, i2Var);
    }

    private <UT, UB, ET extends c1.c<ET>> boolean n(k3 k3Var, s0 s0Var, t0<ET> t0Var, c1<ET> c1Var, l4<UT, UB> l4Var, UB ub) throws IOException {
        int tag = k3Var.getTag();
        if (tag != t4.f28974q) {
            if ((tag & 7) != 2) {
                return k3Var.M();
            }
            Object b5 = t0Var.b(s0Var, this.f28831a, tag >>> 3);
            if (b5 == null) {
                return l4Var.m(ub, k3Var);
            }
            t0Var.h(k3Var, b5, s0Var, c1Var);
            return true;
        }
        Object obj = null;
        int i4 = 0;
        w wVar = null;
        while (k3Var.H() != Integer.MAX_VALUE) {
            int tag2 = k3Var.getTag();
            if (tag2 == t4.f28976s) {
                i4 = k3Var.h();
                obj = t0Var.b(s0Var, this.f28831a, i4);
            } else if (tag2 == t4.f28977t) {
                if (obj != null) {
                    t0Var.h(k3Var, obj, s0Var, c1Var);
                } else {
                    wVar = k3Var.o();
                }
            } else if (!k3Var.M()) {
                break;
            }
        }
        if (k3Var.getTag() != t4.f28975r) {
            throw InvalidProtocolBufferException.b();
        }
        if (wVar != null) {
            if (obj != null) {
                t0Var.i(wVar, obj, s0Var, c1Var);
            } else {
                l4Var.d(ub, i4, wVar);
            }
        }
        return true;
    }

    private <UT, UB> void o(l4<UT, UB> l4Var, T t4, v4 v4Var) throws IOException {
        l4Var.s(l4Var.g(t4), v4Var);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void a(T t4, T t5) {
        o3.J(this.f28832b, t4, t5);
        if (this.f28833c) {
            o3.H(this.f28834d, t4, t5);
        }
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void b(T t4, k3 k3Var, s0 s0Var) throws IOException {
        l(this.f28832b, this.f28834d, t4, k3Var, s0Var);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void c(T t4) {
        this.f28832b.j(t4);
        this.f28834d.f(t4);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public final boolean d(T t4) {
        return this.f28834d.c(t4).E();
    }

    @Override // androidx.content.preferences.protobuf.m3
    public int e(T t4) {
        int k4 = k(this.f28832b, t4);
        return this.f28833c ? k4 + this.f28834d.c(t4).v() : k4;
    }

    @Override // androidx.content.preferences.protobuf.m3
    public T f() {
        return (T) this.f28831a.w().l1();
    }

    @Override // androidx.content.preferences.protobuf.m3
    public int g(T t4) {
        int hashCode = this.f28832b.g(t4).hashCode();
        return this.f28833c ? (hashCode * 53) + this.f28834d.c(t4).hashCode() : hashCode;
    }

    @Override // androidx.content.preferences.protobuf.m3
    public void h(T t4, v4 v4Var) throws IOException {
        Iterator<Map.Entry<?, Object>> H = this.f28834d.c(t4).H();
        while (H.hasNext()) {
            Map.Entry<?, Object> next = H.next();
            c1.c cVar = (c1.c) next.getKey();
            if (cVar.O() != t4.c.MESSAGE || cVar.F() || cVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof s1.b) {
                v4Var.b(cVar.getNumber(), ((s1.b) next).a().n());
            } else {
                v4Var.b(cVar.getNumber(), next.getValue());
            }
        }
        o(this.f28832b, t4, v4Var);
    }

    @Override // androidx.content.preferences.protobuf.m3
    public boolean i(T t4, T t5) {
        if (!this.f28832b.g(t4).equals(this.f28832b.g(t5))) {
            return false;
        }
        if (this.f28833c) {
            return this.f28834d.c(t4).equals(this.f28834d.c(t5));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[EDGE_INSN: B:24:0x00c3->B:25:0x00c3 BREAK  A[LOOP:1: B:10:0x0069->B:18:0x0069], SYNTHETIC] */
    @Override // androidx.content.preferences.protobuf.m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(T r11, byte[] r12, int r13, int r14, androidx.datastore.preferences.protobuf.l.b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            androidx.datastore.preferences.protobuf.i1 r0 = (androidx.content.preferences.protobuf.i1) r0
            androidx.datastore.preferences.protobuf.m4 r1 = r0.unknownFields
            androidx.datastore.preferences.protobuf.m4 r2 = androidx.content.preferences.protobuf.m4.e()
            if (r1 != r2) goto L11
            androidx.datastore.preferences.protobuf.m4 r1 = androidx.content.preferences.protobuf.m4.p()
            r0.unknownFields = r1
        L11:
            androidx.datastore.preferences.protobuf.i1$e r11 = (androidx.datastore.preferences.protobuf.i1.e) r11
            androidx.datastore.preferences.protobuf.c1 r11 = r11.J2()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Lce
            int r4 = androidx.content.preferences.protobuf.l.I(r12, r13, r15)
            int r13 = r15.f28728a
            int r3 = androidx.content.preferences.protobuf.t4.f28974q
            r5 = 2
            if (r13 == r3) goto L67
            r3 = r13 & 7
            if (r3 != r5) goto L62
            androidx.datastore.preferences.protobuf.t0<?> r2 = r10.f28834d
            androidx.datastore.preferences.protobuf.s0 r3 = r15.f28731d
            androidx.datastore.preferences.protobuf.i2 r5 = r10.f28831a
            int r6 = r13 >>> 3
            java.lang.Object r2 = r2.b(r3, r5, r6)
            r8 = r2
            androidx.datastore.preferences.protobuf.i1$h r8 = (androidx.datastore.preferences.protobuf.i1.h) r8
            if (r8 == 0) goto L58
            androidx.datastore.preferences.protobuf.f3 r13 = androidx.content.preferences.protobuf.f3.a()
            androidx.datastore.preferences.protobuf.i2 r2 = r8.c()
            java.lang.Class r2 = r2.getClass()
            androidx.datastore.preferences.protobuf.m3 r13 = r13.i(r2)
            int r13 = androidx.content.preferences.protobuf.l.p(r13, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.i1$g r2 = r8.f28710d
            java.lang.Object r3 = r15.f28730c
            r11.O(r2, r3)
        L56:
            r2 = r8
            goto L19
        L58:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = androidx.content.preferences.protobuf.l.G(r2, r3, r4, r5, r6, r7)
            goto L56
        L62:
            int r13 = androidx.content.preferences.protobuf.l.N(r13, r12, r4, r14, r15)
            goto L19
        L67:
            r13 = 0
            r3 = r0
        L69:
            if (r4 >= r14) goto Lc3
            int r4 = androidx.content.preferences.protobuf.l.I(r12, r4, r15)
            int r6 = r15.f28728a
            int r7 = r6 >>> 3
            r8 = r6 & 7
            if (r7 == r5) goto La4
            r9 = 3
            if (r7 == r9) goto L7b
            goto Lb9
        L7b:
            if (r2 == 0) goto L99
            androidx.datastore.preferences.protobuf.f3 r6 = androidx.content.preferences.protobuf.f3.a()
            androidx.datastore.preferences.protobuf.i2 r7 = r2.c()
            java.lang.Class r7 = r7.getClass()
            androidx.datastore.preferences.protobuf.m3 r6 = r6.i(r7)
            int r4 = androidx.content.preferences.protobuf.l.p(r6, r12, r4, r14, r15)
            androidx.datastore.preferences.protobuf.i1$g r6 = r2.f28710d
            java.lang.Object r7 = r15.f28730c
            r11.O(r6, r7)
            goto L69
        L99:
            if (r8 != r5) goto Lb9
            int r4 = androidx.content.preferences.protobuf.l.b(r12, r4, r15)
            java.lang.Object r3 = r15.f28730c
            androidx.datastore.preferences.protobuf.w r3 = (androidx.content.preferences.protobuf.w) r3
            goto L69
        La4:
            if (r8 != 0) goto Lb9
            int r4 = androidx.content.preferences.protobuf.l.I(r12, r4, r15)
            int r13 = r15.f28728a
            androidx.datastore.preferences.protobuf.t0<?> r2 = r10.f28834d
            androidx.datastore.preferences.protobuf.s0 r6 = r15.f28731d
            androidx.datastore.preferences.protobuf.i2 r7 = r10.f28831a
            java.lang.Object r2 = r2.b(r6, r7, r13)
            androidx.datastore.preferences.protobuf.i1$h r2 = (androidx.datastore.preferences.protobuf.i1.h) r2
            goto L69
        Lb9:
            int r7 = androidx.content.preferences.protobuf.t4.f28975r
            if (r6 != r7) goto Lbe
            goto Lc3
        Lbe:
            int r4 = androidx.content.preferences.protobuf.l.N(r6, r12, r4, r14, r15)
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
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r11 = androidx.content.preferences.protobuf.InvalidProtocolBufferException.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.content.preferences.protobuf.o2.j(java.lang.Object, byte[], int, int, androidx.datastore.preferences.protobuf.l$b):void");
    }
}
