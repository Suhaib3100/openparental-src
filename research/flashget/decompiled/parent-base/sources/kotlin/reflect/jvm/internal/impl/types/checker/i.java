package kotlin.reflect.jvm.internal.impl.types.checker;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: NewCapturedType.kt */
@r1({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
/* loaded from: classes7.dex */
public final class i extends p0 implements ce.d {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final ce.b f78353c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final j f78354d;

    /* renamed from: e, reason: collision with root package name */
    @fg.m
    private final w1 f78355e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final d1 f78356f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f78357g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f78358h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(ce.b r8, kotlin.reflect.jvm.internal.impl.types.checker.j r9, kotlin.reflect.jvm.internal.impl.types.w1 r10, kotlin.reflect.jvm.internal.impl.types.d1 r11, boolean r12, boolean r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto Ld
            kotlin.reflect.jvm.internal.impl.types.d1$a r11 = kotlin.reflect.jvm.internal.impl.types.d1.f78389c
            r11.getClass()
            kotlin.reflect.jvm.internal.impl.types.d1 r11 = kotlin.reflect.jvm.internal.impl.types.d1.i()
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.i.<init>(ce.b, kotlin.reflect.jvm.internal.impl.types.checker.j, kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.d1, boolean, boolean, int, kotlin.jvm.internal.w):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        return this.f78356f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public h1 O0() {
        return this.f78354d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return this.f78357g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("絺\u0001"));
        return new i(this.f78353c, this.f78354d, this.f78355e, d1Var, this.f78357g, this.f78358h);
    }

    @fg.l
    public final ce.b X0() {
        return this.f78353c;
    }

    @fg.l
    public j Y0() {
        return this.f78354d;
    }

    @fg.m
    public final w1 Z0() {
        return this.f78355e;
    }

    public final boolean a1() {
        return this.f78358h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public i V0(boolean z4) {
        return new i(this.f78353c, this.f78354d, this.f78355e, this.f78356f, z4, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public i Y0(@fg.l g gVar) {
        l0.p(gVar, ProtectedSandApp.s("絻\u0001"));
        ce.b bVar = this.f78353c;
        j a5 = this.f78354d.a(gVar);
        w1 w1Var = this.f78355e;
        return new i(bVar, a5, w1Var != null ? gVar.a(w1Var).R0() : null, this.f78356f, this.f78357g, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return kotlin.reflect.jvm.internal.impl.types.error.k.a(kotlin.reflect.jvm.internal.impl.types.error.g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public i(@fg.l ce.b bVar, @fg.l j jVar, @fg.m w1 w1Var, @fg.l d1 d1Var, boolean z4, boolean z5) {
        l0.p(bVar, ProtectedSandApp.s("絵\u0001"));
        l0.p(jVar, ProtectedSandApp.s("絶\u0001"));
        l0.p(d1Var, ProtectedSandApp.s("絷\u0001"));
        this.f78353c = bVar;
        this.f78354d = jVar;
        this.f78355e = w1Var;
        this.f78356f = d1Var;
        this.f78357g = z4;
        this.f78358h = z5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@fg.l ce.b bVar, @fg.m w1 w1Var, @fg.l l1 l1Var, @fg.l f1 f1Var) {
        this(bVar, new j(l1Var, null, null, f1Var, 6, null), w1Var, null, false, false, 56, null);
        l0.p(bVar, ProtectedSandApp.s("絵\u0001"));
        l0.p(l1Var, ProtectedSandApp.s("絸\u0001"));
        l0.p(f1Var, ProtectedSandApp.s("絹\u0001"));
    }
}
