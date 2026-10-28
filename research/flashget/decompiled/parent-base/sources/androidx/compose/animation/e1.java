package androidx.compose.animation;

import androidx.compose.runtime.m1;
import androidx.compose.ui.q;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010+\u001a\u0004\b,\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b.\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u0010\u001bR+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\f8\u0006¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u0010\u001d¨\u00065"}, d2 = {"Landroidx/compose/animation/e1;", "", "Landroidx/compose/animation/k0;", "fade", "Landroidx/compose/animation/y0;", "slide", "Landroidx/compose/animation/v;", "changeSize", "Landroidx/compose/animation/t0;", "scale", "", "hold", "", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/q$d;", "effectsMap", "<init>", "(Landroidx/compose/animation/k0;Landroidx/compose/animation/y0;Landroidx/compose/animation/v;Landroidx/compose/animation/t0;ZLjava/util/Map;)V", "a", "()Landroidx/compose/animation/k0;", "b", "()Landroidx/compose/animation/y0;", "c", "()Landroidx/compose/animation/v;", "d", "()Landroidx/compose/animation/t0;", "e", "()Z", "f", "()Ljava/util/Map;", "g", "(Landroidx/compose/animation/k0;Landroidx/compose/animation/y0;Landroidx/compose/animation/v;Landroidx/compose/animation/t0;ZLjava/util/Map;)Landroidx/compose/animation/e1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/animation/k0;", "k", "Landroidx/compose/animation/y0;", "n", "Landroidx/compose/animation/v;", "i", "Landroidx/compose/animation/t0;", "m", "Z", "l", "Ljava/util/Map;", "j", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class e1 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f3118g = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final k0 fade;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final y0 slide;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final v changeSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final t0 scale;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean hold;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Object, androidx.compose.ui.node.y0<? extends q.d>> effectsMap;

    public e1() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static e1 h(e1 e1Var, k0 k0Var, y0 y0Var, v vVar, t0 t0Var, boolean z4, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            k0Var = e1Var.fade;
        }
        if ((i4 & 2) != 0) {
            y0Var = e1Var.slide;
        }
        y0 y0Var2 = y0Var;
        if ((i4 & 4) != 0) {
            vVar = e1Var.changeSize;
        }
        v vVar2 = vVar;
        if ((i4 & 8) != 0) {
            t0Var = e1Var.scale;
        }
        t0 t0Var2 = t0Var;
        if ((i4 & 16) != 0) {
            z4 = e1Var.hold;
        }
        boolean z5 = z4;
        if ((i4 & 32) != 0) {
            map = e1Var.effectsMap;
        }
        e1Var.getClass();
        return new e1(k0Var, y0Var2, vVar2, t0Var2, z5, map);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final k0 getFade() {
        return this.fade;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final y0 getSlide() {
        return this.slide;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final v getChangeSize() {
        return this.changeSize;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final t0 getScale() {
        return this.scale;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) other;
        return kotlin.jvm.internal.l0.g(this.fade, e1Var.fade) && kotlin.jvm.internal.l0.g(this.slide, e1Var.slide) && kotlin.jvm.internal.l0.g(this.changeSize, e1Var.changeSize) && kotlin.jvm.internal.l0.g(this.scale, e1Var.scale) && this.hold == e1Var.hold && kotlin.jvm.internal.l0.g(this.effectsMap, e1Var.effectsMap);
    }

    @fg.l
    public final Map<Object, androidx.compose.ui.node.y0<? extends q.d>> f() {
        return this.effectsMap;
    }

    @fg.l
    public final e1 g(@fg.m k0 fade, @fg.m y0 slide, @fg.m v changeSize, @fg.m t0 scale, boolean hold, @fg.l Map<Object, ? extends androidx.compose.ui.node.y0<? extends q.d>> effectsMap) {
        return new e1(fade, slide, changeSize, scale, hold, effectsMap);
    }

    public int hashCode() {
        k0 k0Var = this.fade;
        int hashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        y0 y0Var = this.slide;
        int hashCode2 = (hashCode + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        v vVar = this.changeSize;
        int hashCode3 = (hashCode2 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        t0 t0Var = this.scale;
        return this.effectsMap.hashCode() + d1.a(this.hold, (hashCode3 + (t0Var != null ? t0Var.hashCode() : 0)) * 31, 31);
    }

    @fg.m
    public final v i() {
        return this.changeSize;
    }

    @fg.l
    public final Map<Object, androidx.compose.ui.node.y0<? extends q.d>> j() {
        return this.effectsMap;
    }

    @fg.m
    public final k0 k() {
        return this.fade;
    }

    public final boolean l() {
        return this.hold;
    }

    @fg.m
    public final t0 m() {
        return this.scale;
    }

    @fg.m
    public final y0 n() {
        return this.slide;
    }

    @fg.l
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e1(@fg.m k0 k0Var, @fg.m y0 y0Var, @fg.m v vVar, @fg.m t0 t0Var, boolean z4, @fg.l Map<Object, ? extends androidx.compose.ui.node.y0<? extends q.d>> map) {
        this.fade = k0Var;
        this.slide = y0Var;
        this.changeSize = vVar;
        this.scale = t0Var;
        this.hold = z4;
        this.effectsMap = map;
    }

    public /* synthetic */ e1(k0 k0Var, y0 y0Var, v vVar, t0 t0Var, boolean z4, Map map, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : k0Var, (i4 & 2) != 0 ? null : y0Var, (i4 & 4) != 0 ? null : vVar, (i4 & 8) == 0 ? t0Var : null, (i4 & 16) != 0 ? false : z4, (i4 & 32) != 0 ? kotlin.collections.z0.z() : map);
    }
}
