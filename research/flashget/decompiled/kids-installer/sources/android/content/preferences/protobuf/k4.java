package android.content.preferences.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes3.dex */
class k4 extends i4<j4, j4> {
    k4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public j4 g(Object obj) {
        return ((i1) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(j4 j4Var) {
        return j4Var.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(j4 j4Var) {
        return j4Var.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public j4 k(j4 j4Var, j4 j4Var2) {
        return j4Var2.equals(j4.e()) ? j4Var : j4.o(j4Var, j4Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public j4 n() {
        return j4.p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, j4 j4Var) {
        p(obj, j4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, j4 j4Var) {
        ((i1) obj).unknownFields = j4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public j4 r(j4 j4Var) {
        j4Var.j();
        return j4Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(j4 j4Var, s4 s4Var) throws IOException {
        j4Var.t(s4Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(j4 j4Var, s4 s4Var) throws IOException {
        j4Var.w(s4Var);
    }

    @Override // android.content.preferences.protobuf.i4
    void j(Object obj) {
        g(obj).j();
    }

    @Override // android.content.preferences.protobuf.i4
    boolean q(h3 h3Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(j4 j4Var, int i5, int i6) {
        j4Var.r(q4.c(i5, 5), Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(j4 j4Var, int i5, long j5) {
        j4Var.r(q4.c(i5, 1), Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(j4 j4Var, int i5, j4 j4Var2) {
        j4Var.r(q4.c(i5, 3), j4Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(j4 j4Var, int i5, w wVar) {
        j4Var.r(q4.c(i5, 2), wVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(j4 j4Var, int i5, long j5) {
        j4Var.r(q4.c(i5, 0), Long.valueOf(j5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.content.preferences.protobuf.i4
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public j4 f(Object obj) {
        j4 g5 = g(obj);
        if (g5 != j4.e()) {
            return g5;
        }
        j4 p5 = j4.p();
        p(obj, p5);
        return p5;
    }
}
