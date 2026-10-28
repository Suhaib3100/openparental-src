package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes6.dex */
public final class i extends p0 implements h4.d {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final h4.b f26345p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final j f26346q;

    /* renamed from: r, reason: collision with root package name */
    @d5.e
    private final w1 f26347r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final d1 f26348s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f26349t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f26350u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(h4.b r8, kotlin.reflect.jvm.internal.impl.types.checker.j r9, kotlin.reflect.jvm.internal.impl.types.w1 r10, kotlin.reflect.jvm.internal.impl.types.d1 r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.d1$a r11 = kotlin.reflect.jvm.internal.impl.types.d1.f26381p
            r11.getClass()
            kotlin.reflect.jvm.internal.impl.types.d1 r11 = kotlin.reflect.jvm.internal.impl.types.d1.h()
        Ld:
            r4 = r11
            r11 = r14 & 16
            r15 = 0
            if (r11 == 0) goto L15
            r5 = r15
            goto L16
        L15:
            r5 = r12
        L16:
            r11 = r14 & 32
            if (r11 == 0) goto L1c
            r6 = r15
            goto L1d
        L1c:
            r6 = r13
        L1d:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.i.<init>(h4.b, kotlin.reflect.jvm.internal.impl.types.checker.j, kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.d1, boolean, boolean, int, kotlin.jvm.internal.w):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return EmptyList.f23167o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        return this.f26348s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public h1 U0() {
        return this.f26346q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return this.f26349t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("袟"));
        return new i(this.f26345p, this.f26346q, this.f26347r, d1Var, this.f26349t, this.f26350u);
    }

    @d5.d
    public final h4.b d1() {
        return this.f26345p;
    }

    @d5.d
    public j e1() {
        return this.f26346q;
    }

    @d5.e
    public final w1 f1() {
        return this.f26347r;
    }

    public final boolean g1() {
        return this.f26350u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public i b1(boolean z5) {
        return new i(this.f26345p, this.f26346q, this.f26347r, this.f26348s, z5, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    /* renamed from: i1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i e1(@d5.d g gVar) {
        l0.p(gVar, ProtectedSandApp.s("袠"));
        h4.b bVar = this.f26345p;
        j a6 = this.f26346q.a(gVar);
        w1 w1Var = this.f26347r;
        return new i(bVar, a6, w1Var != null ? gVar.a(w1Var).X0() : null, this.f26348s, this.f26349t, false, 32, null);
    }

    public i(@d5.d h4.b bVar, @d5.d j jVar, @d5.e w1 w1Var, @d5.d d1 d1Var, boolean z5, boolean z6) {
        l0.p(bVar, ProtectedSandApp.s("袙"));
        l0.p(jVar, ProtectedSandApp.s("袚"));
        l0.p(d1Var, ProtectedSandApp.s("袛"));
        this.f26345p = bVar;
        this.f26346q = jVar;
        this.f26347r = w1Var;
        this.f26348s = d1Var;
        this.f26349t = z5;
        this.f26350u = z6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@d5.d h4.b bVar, @d5.e w1 w1Var, @d5.d l1 l1Var, @d5.d f1 f1Var) {
        this(bVar, new j(l1Var, null, null, f1Var, 6, null), w1Var, null, false, false, 56, null);
        l0.p(bVar, ProtectedSandApp.s("袜"));
        l0.p(l1Var, ProtectedSandApp.s("袝"));
        l0.p(f1Var, ProtectedSandApp.s("袞"));
    }
}
