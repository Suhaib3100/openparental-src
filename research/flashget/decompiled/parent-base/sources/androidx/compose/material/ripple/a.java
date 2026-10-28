package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.p3;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.d2;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.graphics.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.r0;

/* compiled from: Ripple.android.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0010*\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0012J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010\u0012J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R/\u00106\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010.8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010;\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010=R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/o;", "Landroidx/compose/runtime/p3;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Landroid/view/ViewGroup;Lkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "k", "()V", "Landroidx/compose/material/ripple/k;", "m", "()Landroidx/compose/material/ripple/k;", "Landroidx/compose/ui/graphics/drawscope/c;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/foundation/interaction/m$b;", "interaction", "Lkotlinx/coroutines/r0;", "scope", "e", "(Landroidx/compose/foundation/interaction/m$b;Lkotlinx/coroutines/r0;)V", "g", "(Landroidx/compose/foundation/interaction/m$b;)V", "b", "d", "c", "o", "Z", "F", "f", "Landroidx/compose/runtime/b5;", "h", "Landroid/view/ViewGroup;", "i", "Landroidx/compose/material/ripple/k;", "rippleContainer", "Landroidx/compose/material/ripple/n;", "<set-?>", "j", "Landroidx/compose/runtime/k2;", "n", "()Landroidx/compose/material/ripple/n;", "q", "(Landroidx/compose/material/ripple/n;)V", "rippleHostView", "l", "()Z", "p", "(Z)V", "invalidateTick", "Li0/n;", "J", "rippleSize", "", "I", "rippleRadius", "Lkotlin/Function0;", "Lld/a;", "onInvalidateRipple", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,263:1\n81#2:264\n107#2,2:265\n81#2:267\n107#2,2:268\n137#3:270\n246#4:271\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n127#1:264\n127#1:265,2\n135#1:267\n135#1:268,2\n160#1:270\n174#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class a extends o implements p3 {

    /* renamed from: o, reason: collision with root package name */
    public static final int f9278o = 8;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<d2> color;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b5<h> rippleAlpha;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ViewGroup view;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k rippleContainer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 rippleHostView;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 invalidateTick;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int rippleRadius;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<kotlin.k2> onInvalidateRipple;

    /* compiled from: Ripple.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.ripple.a$a, reason: collision with other inner class name */
    static final class C0202a extends n0 implements ld.a<kotlin.k2> {
        C0202a() {
            super(0);
        }

        public final void a() {
            a.this.p(!r0.l());
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ a(boolean z4, float f4, b5 b5Var, b5 b5Var2, ViewGroup viewGroup, w wVar) {
        this(z4, f4, b5Var, b5Var2, viewGroup);
    }

    private final void k() {
        k kVar = this.rippleContainer;
        if (kVar != null) {
            kVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    private final k m() {
        k kVar = this.rippleContainer;
        if (kVar != null) {
            l0.m(kVar);
            return kVar;
        }
        int childCount = this.view.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = this.view.getChildAt(i4);
            if (childAt instanceof k) {
                this.rippleContainer = (k) childAt;
                break;
            }
            i4++;
        }
        if (this.rippleContainer == null) {
            k kVar2 = new k(this.view.getContext());
            this.view.addView(kVar2);
            this.rippleContainer = kVar2;
        }
        k kVar3 = this.rippleContainer;
        l0.m(kVar3);
        return kVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final n n() {
        return (n) this.rippleHostView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean z4) {
        this.invalidateTick.setValue(Boolean.valueOf(z4));
    }

    private final void q(n nVar) {
        this.rippleHostView.setValue(nVar);
    }

    @Override // androidx.compose.foundation.o1
    public void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        this.rippleSize = cVar.e();
        this.rippleRadius = Float.isNaN(this.radius) ? kotlin.math.b.L0(j.a(cVar, this.bounded, cVar.e())) : cVar.q2(this.radius);
        long M = this.color.getValue().M();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        cVar.G6();
        f(cVar, this.radius, M);
        v1 i4 = cVar.getDrawContext().i();
        l();
        n n4 = n();
        if (n4 != null) {
            n4.h(cVar.e(), this.rippleRadius, M, pressedAlpha);
            n4.draw(h0.d(i4));
        }
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        k();
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        k();
    }

    @Override // androidx.compose.material.ripple.o
    public void e(@fg.l m.b interaction, @fg.l r0 scope) {
        n b5 = m().b(this);
        b5.b(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().M(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        q(b5);
    }

    @Override // androidx.compose.material.ripple.o
    public void g(@fg.l m.b interaction) {
        n n4 = n();
        if (n4 != null) {
            n4.e();
        }
    }

    public final void o() {
        q(null);
    }

    private a(boolean z4, float f4, b5<d2> b5Var, b5<h> b5Var2, ViewGroup viewGroup) {
        super(z4, b5Var2);
        k2 g4;
        k2 g5;
        this.bounded = z4;
        this.radius = f4;
        this.color = b5Var;
        this.rippleAlpha = b5Var2;
        this.view = viewGroup;
        g4 = t4.g(null, null, 2, null);
        this.rippleHostView = g4;
        g5 = t4.g(Boolean.TRUE, null, 2, null);
        this.invalidateTick = g5;
        i0.n.INSTANCE.getClass();
        this.rippleSize = i0.n.f74171c;
        this.rippleRadius = -1;
        this.onInvalidateRipple = new C0202a();
    }
}
