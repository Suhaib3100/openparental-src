package androidx.compose.foundation.layout;

import androidx.compose.runtime.t4;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010$\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\"\u0004\b#\u0010\u0007R+\u0010'\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b\u001d\u0010\"\"\u0004\b&\u0010\u0007R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/r0;", "Landroidx/compose/ui/layout/b0;", "Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/modifier/l;", "Landroidx/compose/foundation/layout/n2;", "insets", "<init>", "(Landroidx/compose/foundation/layout/n2;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/modifier/n;", "scope", "Lkotlin/k2;", "e4", "(Landroidx/compose/ui/modifier/n;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Landroidx/compose/foundation/layout/n2;", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "()Landroidx/compose/foundation/layout/n2;", "g", "unconsumedInsets", "d", "e", "consumedInsets", "Landroidx/compose/ui/modifier/p;", "getKey", "()Landroidx/compose/ui/modifier/p;", "key", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 1)
@kotlin.jvm.internal.r1({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,286:1\n81#2:287\n107#2,2:288\n81#2:290\n107#2,2:291\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n139#1:287\n139#1:288,2\n140#1:290\n140#1:291,2\n*E\n"})
/* loaded from: classes.dex */
public final class r0 implements androidx.compose.ui.layout.b0, androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.l<n2> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f5300e = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n2 insets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 unconsumedInsets;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 consumedInsets;

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f5304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5305c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5306d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.i1 i1Var, int i4, int i5) {
            super(1);
            this.f5304b = i1Var;
            this.f5305c = i4;
            this.f5306d = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f5304b, this.f5305c, this.f5306d, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public r0(@fg.l n2 n2Var) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        this.insets = n2Var;
        g4 = t4.g(n2Var, null, 2, null);
        this.unconsumedInsets = g4;
        g5 = t4.g(n2Var, null, 2, null);
        this.consumedInsets = g5;
    }

    private final n2 b() {
        return (n2) this.consumedInsets.getValue();
    }

    private final n2 c() {
        return (n2) this.unconsumedInsets.getValue();
    }

    private final void e(n2 n2Var) {
        this.consumedInsets.setValue(n2Var);
    }

    private final void g(n2 n2Var) {
        this.unconsumedInsets.setValue(n2Var);
    }

    @fg.l
    public n2 d() {
        return b();
    }

    @Override // androidx.compose.ui.modifier.d
    public void e4(@fg.l androidx.compose.ui.modifier.n scope) {
        n2 n2Var = (n2) scope.v(d3.c());
        g(new c0(this.insets, n2Var));
        e(new i2(n2Var, this.insets));
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof r0) {
            return kotlin.jvm.internal.l0.g(((r0) other).insets, this.insets);
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.b0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        int d5 = c().d(o0Var, o0Var.getLayoutDirection());
        int a5 = c().a(o0Var);
        int b5 = c().b(o0Var, o0Var.getLayoutDirection()) + d5;
        int c5 = c().c(o0Var) + a5;
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(androidx.compose.ui.unit.c.i(j4, -b5, -c5));
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.c.g(j4, m02.getWidth() + b5), androidx.compose.ui.unit.c.f(j4, m02.getHeight() + c5), null, new a(m02, d5, a5), 4, null);
    }

    @Override // androidx.compose.ui.modifier.l
    @fg.l
    public androidx.compose.ui.modifier.p<n2> getKey() {
        return d3.c();
    }

    @Override // androidx.compose.ui.modifier.l
    public n2 getValue() {
        return b();
    }

    public int hashCode() {
        return this.insets.hashCode();
    }
}
