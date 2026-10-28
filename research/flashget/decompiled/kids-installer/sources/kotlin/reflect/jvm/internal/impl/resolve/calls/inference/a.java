package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.error.g;
import kotlin.reflect.jvm.internal.impl.types.error.k;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes6.dex */
public final class a extends p0 implements h4.d {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final l1 f25887p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final b f25888q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f25889r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final d1 f25890s;

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
            kotlin.reflect.jvm.internal.impl.types.d1$a r4 = kotlin.reflect.jvm.internal.impl.types.d1.f26381p
            r4.getClass()
            kotlin.reflect.jvm.internal.impl.types.d1 r4 = kotlin.reflect.jvm.internal.impl.types.d1.h()
        L1b:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a.<init>(kotlin.reflect.jvm.internal.impl.types.l1, kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b, boolean, kotlin.reflect.jvm.internal.impl.types.d1, int, kotlin.jvm.internal.w):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h C() {
        return k.a(g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        return this.f25890s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public h1 U0() {
        return this.f25888q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return this.f25889r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("虉"));
        return new a(this.f25887p, this.f25888q, this.f25889r, d1Var);
    }

    @d5.d
    public b d1() {
        return this.f25888q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public a b1(boolean z5) {
        return z5 == this.f25889r ? this : new a(this.f25887p, this.f25888q, z5, this.f25890s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public a e1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("虊"));
        l1 a6 = this.f25887p.a(gVar);
        l0.o(a6, ProtectedSandApp.s("虋"));
        return new a(a6, this.f25888q, this.f25889r, this.f25890s);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("虌"));
        sb.append(this.f25887p);
        sb.append(')');
        sb.append(this.f25889r ? ProtectedSandApp.s("虍") : "");
        return sb.toString();
    }

    public a(@d5.d l1 l1Var, @d5.d b bVar, boolean z5, @d5.d d1 d1Var) {
        l0.p(l1Var, ProtectedSandApp.s("虆"));
        l0.p(bVar, ProtectedSandApp.s("虇"));
        l0.p(d1Var, ProtectedSandApp.s("虈"));
        this.f25887p = l1Var;
        this.f25888q = bVar;
        this.f25889r = z5;
        this.f25890s = d1Var;
    }
}
