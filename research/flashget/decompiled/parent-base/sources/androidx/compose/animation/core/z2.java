package androidx.compose.animation.core;

import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.j;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import i0.f;
import i0.i;
import i0.n;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VisibilityThresholds.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\".\u0010\u0010\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u00000\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0014\u001a\u00020\u0012*\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0013\"\u0015\u0010\u0014\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0015\u0010\u0014\u001a\u00020\u001a*\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u001b\"\u0015\u0010\u0014\u001a\u00020\u001d*\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u001e\"\u0015\u0010\u0014\u001a\u00020 *\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010!\"\u0015\u0010\u0014\u001a\u00020#*\u00020\"8F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0015\u0010\u0014\u001a\u00020'*\u00020&8F¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0015\u0010\u0014\u001a\u00020\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"", "a", "F", "DpVisibilityThreshold", "b", "PxVisibilityThreshold", "Li0/i;", "c", "Li0/i;", "rectVisibilityThreshold", "", "Landroidx/compose/animation/core/i2;", "d", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "visibilityThresholdMap", "Landroidx/compose/ui/unit/q$a;", "Landroidx/compose/ui/unit/q;", "(Landroidx/compose/ui/unit/q$a;)J", "VisibilityThreshold", "Li0/f$a;", "Li0/f;", "f", "(Li0/f$a;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/j0;)I", "Landroidx/compose/ui/unit/h$a;", "Landroidx/compose/ui/unit/h;", "(Landroidx/compose/ui/unit/h$a;)F", "Landroidx/compose/ui/unit/j$a;", "Landroidx/compose/ui/unit/j;", "(Landroidx/compose/ui/unit/j$a;)J", "Li0/n$a;", "Li0/n;", "g", "(Li0/n$a;)J", "Landroidx/compose/ui/unit/u$a;", "Landroidx/compose/ui/unit/u;", "e", "(Landroidx/compose/ui/unit/u$a;)J", "Li0/i$a;", "h", "(Li0/i$a;)Li0/i;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n174#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f3047a = 0.1f;

    /* renamed from: b, reason: collision with root package name */
    private static final float f3048b = 0.5f;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final i0.i f3049c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Map<i2<?, ?>, Float> f3050d;

    static {
        Float valueOf = Float.valueOf(0.5f);
        f3049c = new i0.i(0.5f, 0.5f, 0.5f, 0.5f);
        i2<Integer, o> j4 = k2.j(kotlin.jvm.internal.j0.f75314a);
        Float valueOf2 = Float.valueOf(1.0f);
        f3050d = kotlin.collections.z0.W(new kotlin.q0(j4, valueOf2), new kotlin.q0(k2.e(androidx.compose.ui.unit.u.INSTANCE), valueOf2), new kotlin.q0(k2.d(androidx.compose.ui.unit.q.INSTANCE), valueOf2), new kotlin.q0(k2.i(kotlin.jvm.internal.a0.f75283a), Float.valueOf(0.01f)), new kotlin.q0(k2.g(i0.i.INSTANCE), valueOf), new kotlin.q0(k2.h(i0.n.INSTANCE), valueOf), new kotlin.q0(k2.f(i0.f.INSTANCE), valueOf), new kotlin.q0(k2.b(androidx.compose.ui.unit.h.INSTANCE), Float.valueOf(0.1f)), new kotlin.q0(k2.c(androidx.compose.ui.unit.j.INSTANCE), Float.valueOf(0.1f)));
    }

    public static final float a(@fg.l h.Companion companion) {
        return androidx.compose.ui.unit.h.g(0.1f);
    }

    public static final int b(@fg.l kotlin.jvm.internal.j0 j0Var) {
        return 1;
    }

    public static final long c(@fg.l j.Companion companion) {
        h.Companion companion2 = androidx.compose.ui.unit.h.INSTANCE;
        return androidx.compose.ui.unit.i.a(androidx.compose.ui.unit.h.g(0.1f), androidx.compose.ui.unit.h.g(0.1f));
    }

    public static final long d(@fg.l q.Companion companion) {
        return androidx.compose.ui.unit.r.a(1, 1);
    }

    public static final long e(@fg.l u.Companion companion) {
        return androidx.compose.ui.unit.v.a(1, 1);
    }

    public static final long f(@fg.l f.Companion companion) {
        return i0.g.a(0.5f, 0.5f);
    }

    public static final long g(@fg.l n.Companion companion) {
        return i0.o.a(0.5f, 0.5f);
    }

    @fg.l
    public static final i0.i h(@fg.l i.Companion companion) {
        return f3049c;
    }

    @fg.l
    public static final Map<i2<?, ?>, Float> i() {
        return f3050d;
    }
}
