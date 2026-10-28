package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.m;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.p3;
import androidx.compose.runtime.snapshots.d0;
import androidx.compose.ui.graphics.d2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.r0;

/* compiled from: CommonRipple.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000f*\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010$R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/material/ripple/c;", "Landroidx/compose/material/ripple/o;", "Landroidx/compose/runtime/p3;", "", "bounded", "Landroidx/compose/ui/unit/h;", "radius", "Landroidx/compose/runtime/b5;", "Landroidx/compose/ui/graphics/d2;", "color", "Landroidx/compose/material/ripple/h;", "rippleAlpha", "<init>", "(ZFLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "j", "(Landroidx/compose/ui/graphics/drawscope/f;J)V", "Landroidx/compose/ui/graphics/drawscope/c;", "a", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "Landroidx/compose/foundation/interaction/m$b;", "interaction", "Lkotlinx/coroutines/r0;", "scope", "e", "(Landroidx/compose/foundation/interaction/m$b;Lkotlinx/coroutines/r0;)V", "g", "(Landroidx/compose/foundation/interaction/m$b;)V", "b", "()V", "d", "c", "Z", "F", "f", "Landroidx/compose/runtime/b5;", "Landroidx/compose/runtime/snapshots/d0;", "Landroidx/compose/material/ripple/i;", "h", "Landroidx/compose/runtime/snapshots/d0;", "ripples", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
/* loaded from: classes.dex */
public final class c extends o implements p3 {

    /* renamed from: i, reason: collision with root package name */
    public static final int f9292i = 0;

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
    private final d0<m.b, i> ripples;

    /* compiled from: CommonRipple.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", f = "CommonRipple.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9298b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f9299c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f9300d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m.b f9301e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, c cVar, m.b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9299c = iVar;
            this.f9300d = cVar;
            this.f9301e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new a(this.f9299c, this.f9300d, this.f9301e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9298b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    i iVar = this.f9299c;
                    this.f9298b = 1;
                    if (iVar.f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a1.n(obj);
                }
                this.f9300d.ripples.remove(this.f9301e);
                return k2.f75408a;
            } catch (Throwable th) {
                this.f9300d.ripples.remove(this.f9301e);
                throw th;
            }
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public /* synthetic */ c(boolean z4, float f4, b5 b5Var, b5 b5Var2, w wVar) {
        this(z4, f4, b5Var, b5Var2);
    }

    private final void j(androidx.compose.ui.graphics.drawscope.f fVar, long j4) {
        Iterator<Map.Entry<m.b, i>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            i value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.g(fVar, d2.w(j4, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.foundation.o1
    public void a(@fg.l androidx.compose.ui.graphics.drawscope.c cVar) {
        long M = this.color.getValue().M();
        cVar.G6();
        f(cVar, this.radius, M);
        j(cVar, M);
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.o
    public void e(@fg.l m.b interaction, @fg.l r0 scope) {
        Iterator<Map.Entry<m.b, i>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j();
        }
        i iVar = new i(this.bounded ? i0.f.d(interaction.getPressPosition()) : null, this.radius, this.bounded, null);
        this.ripples.put(interaction, iVar);
        kotlinx.coroutines.k.f(scope, null, null, new a(iVar, this, interaction, null), 3, null);
    }

    @Override // androidx.compose.material.ripple.o
    public void g(@fg.l m.b interaction) {
        i iVar = this.ripples.get(interaction);
        if (iVar != null) {
            iVar.j();
        }
    }

    private c(boolean z4, float f4, b5<d2> b5Var, b5<h> b5Var2) {
        super(z4, b5Var2);
        this.bounded = z4;
        this.radius = f4;
        this.color = b5Var;
        this.rippleAlpha = b5Var2;
        this.ripples = new d0<>();
    }
}
