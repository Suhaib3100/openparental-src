package androidx.compose.animation;

import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@m1
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001BL\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010\u0011R2\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0013R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006+"}, d2 = {"Landroidx/compose/animation/v;", "", "Landroidx/compose/ui/c;", "alignment", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/u;", "Lkotlin/r0;", "name", "fullSize", "size", "Landroidx/compose/animation/core/p0;", "animationSpec", "", "clip", "<init>", "(Landroidx/compose/ui/c;Lld/l;Landroidx/compose/animation/core/p0;Z)V", "a", "()Landroidx/compose/ui/c;", "b", "()Lld/l;", "c", "()Landroidx/compose/animation/core/p0;", "d", "()Z", "e", "(Landroidx/compose/ui/c;Lld/l;Landroidx/compose/animation/core/p0;Z)Landroidx/compose/animation/v;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/c;", "g", "Lld/l;", "j", "Landroidx/compose/animation/core/p0;", "h", "Z", "i", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class v {

    /* renamed from: e, reason: collision with root package name */
    public static final int f3367e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.c alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> size;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> animationSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean clip;

    /* compiled from: EnterExitTransition.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "a", "(J)J"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3372b = new a(1);

        a() {
            super(1);
        }

        public final long a(long j4) {
            return androidx.compose.ui.unit.v.a(0, 0);
        }

        @Override // ld.l
        public androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            uVar.getPackedValue();
            return androidx.compose.ui.unit.u.b(androidx.compose.ui.unit.v.a(0, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(@fg.l androidx.compose.ui.c cVar, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> lVar, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> p0Var, boolean z4) {
        this.alignment = cVar;
        this.size = lVar;
        this.animationSpec = p0Var;
        this.clip = z4;
    }

    public static v f(v vVar, androidx.compose.ui.c cVar, ld.l lVar, androidx.compose.animation.core.p0 p0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cVar = vVar.alignment;
        }
        if ((i4 & 2) != 0) {
            lVar = vVar.size;
        }
        if ((i4 & 4) != 0) {
            p0Var = vVar.animationSpec;
        }
        if ((i4 & 8) != 0) {
            z4 = vVar.clip;
        }
        vVar.getClass();
        return new v(cVar, lVar, p0Var, z4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.c getAlignment() {
        return this.alignment;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> b() {
        return this.size;
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> c() {
        return this.animationSpec;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @fg.l
    public final v e(@fg.l androidx.compose.ui.c alignment, @fg.l ld.l<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> size, @fg.l androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> animationSpec, boolean clip) {
        return new v(alignment, size, animationSpec, clip);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return kotlin.jvm.internal.l0.g(this.alignment, vVar.alignment) && kotlin.jvm.internal.l0.g(this.size, vVar.size) && kotlin.jvm.internal.l0.g(this.animationSpec, vVar.animationSpec) && this.clip == vVar.clip;
    }

    @fg.l
    public final androidx.compose.ui.c g() {
        return this.alignment;
    }

    @fg.l
    public final androidx.compose.animation.core.p0<androidx.compose.ui.unit.u> h() {
        return this.animationSpec;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clip) + ((this.animationSpec.hashCode() + ((this.size.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.clip;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> j() {
        return this.size;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeSize(alignment=");
        sb.append(this.alignment);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", animationSpec=");
        sb.append(this.animationSpec);
        sb.append(", clip=");
        return l.a(sb, this.clip, ')');
    }

    public /* synthetic */ v(androidx.compose.ui.c cVar, ld.l lVar, androidx.compose.animation.core.p0 p0Var, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(cVar, (i4 & 2) != 0 ? a.f3372b : lVar, p0Var, (i4 & 8) != 0 ? true : z4);
    }
}
