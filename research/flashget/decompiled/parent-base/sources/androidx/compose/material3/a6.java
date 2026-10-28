package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/q;", "f", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Landroidx/compose/runtime/a3;", "", "a", "Landroidx/compose/runtime/a3;", "b", "()Landroidx/compose/runtime/a3;", "c", "()V", "LocalMinimumInteractiveComponentEnforcement", "d", "e", "LocalMinimumTouchTargetEnforcement", "Landroidx/compose/ui/unit/l;", "J", "minimumInteractiveComponentSize", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,171:1\n154#2:172\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material3/InteractiveComponentSizeKt\n*L\n170#1:172\n*E\n"})
/* loaded from: classes.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<Boolean> f9771a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<Boolean> f9772b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f9773c;

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f9774b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final Boolean a() {
            return Boolean.TRUE;
        }

        @Override // ld.a
        public Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        androidx.compose.runtime.a3<Boolean> f4 = androidx.compose.runtime.f0.f(a.f9774b);
        f9771a = f4;
        f9772b = f4;
        float f5 = 48;
        f9773c = androidx.compose.ui.unit.i.b(androidx.compose.ui.unit.h.g(f5), f5);
    }

    @fg.l
    @f5
    public static final androidx.compose.runtime.a3<Boolean> b() {
        return f9771a;
    }

    @f5
    public static /* synthetic */ void c() {
    }

    @fg.l
    @f5
    public static final androidx.compose.runtime.a3<Boolean> d() {
        return f9772b;
    }

    @f5
    @kotlin.k(level = kotlin.m.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @kotlin.x0(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    public static /* synthetic */ void e() {
    }

    @androidx.compose.runtime.x4
    @fg.l
    public static final androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar) {
        return qVar.w3(MinimumInteractiveModifier.f9407d);
    }
}
