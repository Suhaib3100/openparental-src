package androidx.compose.animation;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/h0;", "", "<init>", "()V", "exit", "d", "(Landroidx/compose/animation/h0;)Landroidx/compose/animation/h0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "Landroidx/compose/animation/e1;", "c", "()Landroidx/compose/animation/e1;", "data", "a", "Landroidx/compose/animation/i0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name */
    public static final int f3179b = 0;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final h0 f3180c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final h0 f3181d;

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/animation/h0$a;", "", "<init>", "()V", "Landroidx/compose/animation/h0;", "None", "Landroidx/compose/animation/h0;", "b", "()Landroidx/compose/animation/h0;", "KeepUntilTransitionsFinished", "a", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.h0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final h0 a() {
            return h0.f3181d;
        }

        @fg.l
        public final h0 b() {
            return h0.f3180c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        kotlin.jvm.internal.w wVar = null;
        k0 k0Var = null;
        y0 y0Var = null;
        v vVar = null;
        t0 t0Var = null;
        Map map = null;
        f3180c = new i0(new e1(k0Var, y0Var, vVar, t0Var, false, map, 63, wVar));
        f3181d = new i0(new e1(k0Var, y0Var, vVar, t0Var, true, map, 47, wVar));
    }

    public /* synthetic */ h0(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    public abstract e1 c();

    @x4
    @fg.l
    public final h0 d(@fg.l h0 exit) {
        k0 k4 = c().k();
        if (k4 == null) {
            k4 = exit.c().k();
        }
        k0 k0Var = k4;
        y0 n4 = c().n();
        if (n4 == null) {
            n4 = exit.c().n();
        }
        y0 y0Var = n4;
        v i4 = c().i();
        if (i4 == null) {
            i4 = exit.c().i();
        }
        v vVar = i4;
        t0 m4 = c().m();
        if (m4 == null) {
            m4 = exit.c().m();
        }
        return new i0(new e1(k0Var, y0Var, vVar, m4, c().l() || exit.c().l(), kotlin.collections.z0.n0(c().j(), exit.c().j())));
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof h0) && kotlin.jvm.internal.l0.g(((h0) other).c(), c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    @fg.l
    public String toString() {
        if (kotlin.jvm.internal.l0.g(this, f3180c)) {
            return "ExitTransition.None";
        }
        if (kotlin.jvm.internal.l0.g(this, f3181d)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        e1 c5 = c();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        k0 k4 = c5.k();
        sb.append(k4 != null ? k4.toString() : null);
        sb.append(",\nSlide - ");
        y0 n4 = c5.n();
        sb.append(n4 != null ? n4.toString() : null);
        sb.append(",\nShrink - ");
        v i4 = c5.i();
        sb.append(i4 != null ? i4.toString() : null);
        sb.append(",\nScale - ");
        t0 m4 = c5.m();
        sb.append(m4 != null ? m4.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c5.l());
        return sb.toString();
    }

    private h0() {
    }
}
