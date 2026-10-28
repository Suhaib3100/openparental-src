package androidx.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes3.dex */
class n4 extends l4<m4, m4> {
    n4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m4 g(Object obj) {
        return ((i1) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m4 m4Var) {
        return m4Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m4 m4Var) {
        return m4Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m4 k(m4 m4Var, m4 m4Var2) {
        return m4Var2.equals(m4.e()) ? m4Var : m4.o(m4Var, m4Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m4 n() {
        return m4.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m4 m4Var) {
        p(obj, m4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m4 m4Var) {
        ((i1) obj).unknownFields = m4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m4 r(m4 m4Var) {
        m4Var.j();
        return m4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m4 m4Var, v4 v4Var) throws IOException {
        m4Var.t(v4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m4 m4Var, v4 v4Var) throws IOException {
        m4Var.w(v4Var);
    }

    @Override // androidx.content.preferences.protobuf.l4
    void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.content.preferences.protobuf.l4
    boolean q(k3 k3Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m4 m4Var, int i4, int i5) {
        m4Var.r(t4.c(i4, 5), Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m4 m4Var, int i4, long j4) {
        m4Var.r(t4.c(i4, 1), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m4 m4Var, int i4, m4 m4Var2) {
        m4Var.r(t4.c(i4, 3), m4Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m4 m4Var, int i4, w wVar) {
        m4Var.r(t4.c(i4, 2), wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m4 m4Var, int i4, long j4) {
        m4Var.r(t4.c(i4, 0), Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.content.preferences.protobuf.l4
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m4 f(Object obj) {
        m4 g4 = g(obj);
        if (g4 != m4.e()) {
            return g4;
        }
        m4 p4 = m4.p();
        p(obj, p4);
        return p4;
    }
}
