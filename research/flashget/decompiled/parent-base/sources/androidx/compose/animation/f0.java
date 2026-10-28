package androidx.compose.animation;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118 X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/f0;", "", "<init>", "()V", "enter", "c", "(Landroidx/compose/animation/f0;)Landroidx/compose/animation/f0;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/e1;", "b", "()Landroidx/compose/animation/e1;", "data", "a", "Landroidx/compose/animation/g0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f3169b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final f0 f3170c = new g0(new e1(null, null, null, null, false, null, 63, null));

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/animation/f0$a;", "", "<init>", "()V", "Landroidx/compose/animation/f0;", "None", "Landroidx/compose/animation/f0;", "a", "()Landroidx/compose/animation/f0;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.f0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final f0 a() {
            return f0.f3170c;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ f0(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    public abstract e1 b();

    @x4
    @fg.l
    public final f0 c(@fg.l f0 enter) {
        k0 k4 = b().k();
        if (k4 == null) {
            k4 = enter.b().k();
        }
        k0 k0Var = k4;
        y0 n4 = b().n();
        if (n4 == null) {
            n4 = enter.b().n();
        }
        y0 y0Var = n4;
        v i4 = b().i();
        if (i4 == null) {
            i4 = enter.b().i();
        }
        v vVar = i4;
        t0 m4 = b().m();
        if (m4 == null) {
            m4 = enter.b().m();
        }
        return new g0(new e1(k0Var, y0Var, vVar, m4, false, kotlin.collections.z0.n0(b().j(), enter.b().j()), 16, null));
    }

    public boolean equals(@fg.m Object other) {
        return (other instanceof f0) && kotlin.jvm.internal.l0.g(((f0) other).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    @fg.l
    public String toString() {
        if (kotlin.jvm.internal.l0.g(this, f3170c)) {
            return "EnterTransition.None";
        }
        e1 b5 = b();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        k0 k4 = b5.k();
        sb.append(k4 != null ? k4.toString() : null);
        sb.append(",\nSlide - ");
        y0 n4 = b5.n();
        sb.append(n4 != null ? n4.toString() : null);
        sb.append(",\nShrink - ");
        v i4 = b5.i();
        sb.append(i4 != null ? i4.toString() : null);
        sb.append(",\nScale - ");
        t0 m4 = b5.m();
        sb.append(m4 != null ? m4.toString() : null);
        return sb.toString();
    }

    private f0() {
    }
}
