package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* compiled from: SelectionHandles.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\rR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/selection/b0;", "", "Landroidx/compose/foundation/text/o;", "handle", "Li0/f;", "position", "Landroidx/compose/foundation/text/selection/a0;", "anchor", "", "visible", "<init>", "(Landroidx/compose/foundation/text/o;JLandroidx/compose/foundation/text/selection/a0;ZLkotlin/jvm/internal/w;)V", "a", "()Landroidx/compose/foundation/text/o;", "b", "()J", "c", "()Landroidx/compose/foundation/text/selection/a0;", "d", "()Z", "e", "(Landroidx/compose/foundation/text/o;JLandroidx/compose/foundation/text/selection/a0;Z)Landroidx/compose/foundation/text/selection/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/o;", "h", "J", "i", "Landroidx/compose/foundation/text/selection/a0;", "g", "Z", "j", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class b0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f7931e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.o handle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean visible;

    public /* synthetic */ b0(androidx.compose.foundation.text.o oVar, long j4, a0 a0Var, boolean z4, kotlin.jvm.internal.w wVar) {
        this(oVar, j4, a0Var, z4);
    }

    public static b0 f(b0 b0Var, androidx.compose.foundation.text.o oVar, long j4, a0 a0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            oVar = b0Var.handle;
        }
        if ((i4 & 2) != 0) {
            j4 = b0Var.position;
        }
        long j5 = j4;
        if ((i4 & 4) != 0) {
            a0Var = b0Var.anchor;
        }
        a0 a0Var2 = a0Var;
        if ((i4 & 8) != 0) {
            z4 = b0Var.visible;
        }
        b0Var.getClass();
        return new b0(oVar, j5, a0Var2, z4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.foundation.text.o getHandle() {
        return this.handle;
    }

    /* renamed from: b, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final a0 getAnchor() {
        return this.anchor;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @fg.l
    public final b0 e(@fg.l androidx.compose.foundation.text.o handle, long position, @fg.l a0 anchor, boolean visible) {
        return new b0(handle, position, anchor, visible);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        return this.handle == b0Var.handle && i0.f.l(this.position, b0Var.position) && this.anchor == b0Var.anchor && this.visible == b0Var.visible;
    }

    @fg.l
    public final a0 g() {
        return this.anchor;
    }

    @fg.l
    public final androidx.compose.foundation.text.o h() {
        return this.handle;
    }

    public int hashCode() {
        return Boolean.hashCode(this.visible) + ((this.anchor.hashCode() + ((i0.f.s(this.position) + (this.handle.hashCode() * 31)) * 31)) * 31);
    }

    public final long i() {
        return this.position;
    }

    public final boolean j() {
        return this.visible;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.handle);
        sb.append(", position=");
        sb.append((Object) i0.f.y(this.position));
        sb.append(", anchor=");
        sb.append(this.anchor);
        sb.append(", visible=");
        return androidx.compose.animation.l.a(sb, this.visible, ')');
    }

    private b0(androidx.compose.foundation.text.o oVar, long j4, a0 a0Var, boolean z4) {
        this.handle = oVar;
        this.position = j4;
        this.anchor = a0Var;
        this.visible = z4;
    }
}
