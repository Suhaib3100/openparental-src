package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes7.dex */
public final class a extends p0 implements ce.d {

    /* renamed from: c, reason: collision with root package name */
    @l
    private final l1 f77864c;

    /* renamed from: d, reason: collision with root package name */
    @l
    private final b f77865d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f77866e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final d1 f77867f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(kotlin.reflect.jvm.internal.impl.types.l1 r1, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r2, boolean r3, kotlin.reflect.jvm.internal.impl.types.d1 r4, int r5, kotlin.jvm.internal.w r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L9
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r2 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c
            r2.<init>(r1)
        L9:
            r6 = r5 & 4
            if (r6 == 0) goto Le
            r3 = 0
        Le:
            r5 = r5 & 8
            if (r5 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.types.d1$a r4 = kotlin.reflect.jvm.internal.impl.types.d1.f78389c
            r4.getClass()
            kotlin.reflect.jvm.internal.impl.types.d1 r4 = kotlin.reflect.jvm.internal.impl.types.d1.i()
        L1b:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a.<init>(kotlin.reflect.jvm.internal.impl.types.l1, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b, boolean, kotlin.reflect.jvm.internal.impl.types.d1, int, kotlin.jvm.internal.w):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @l
    public List<l1> M0() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @l
    public d1 N0() {
        return this.f77867f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public h1 O0() {
        return this.f77865d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return this.f77866e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @l
    /* renamed from: W0 */
    public p0 U0(@l d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("硽\u0001"));
        return new a(this.f77864c, this.f77865d, this.f77866e, d1Var);
    }

    @l
    public b X0() {
        return this.f77865d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @l
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public a V0(boolean z4) {
        return z4 == this.f77866e ? this : new a(this.f77864c, this.f77865d, z4, this.f77867f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @l
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public a Y0(@l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("硾\u0001"));
        l1 a5 = this.f77864c.a(gVar);
        l0.o(a5, ProtectedSandApp.s("硿\u0001"));
        return new a(a5, this.f77865d, this.f77866e, this.f77867f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @l
    public h q() {
        return k.a(kotlin.reflect.jvm.internal.impl.types.error.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @l
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("碀\u0001"));
        sb.append(this.f77864c);
        sb.append(')');
        sb.append(this.f77866e ? ProtectedSandApp.s("碁\u0001") : "");
        return sb.toString();
    }

    public a(@l l1 l1Var, @l b bVar, boolean z4, @l d1 d1Var) {
        l0.p(l1Var, ProtectedSandApp.s("硺\u0001"));
        l0.p(bVar, ProtectedSandApp.s("硻\u0001"));
        l0.p(d1Var, ProtectedSandApp.s("硼\u0001"));
        this.f77864c = l1Var;
        this.f77865d = bVar;
        this.f77866e = z4;
        this.f77867f = d1Var;
    }
}
