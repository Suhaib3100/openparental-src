package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: TextFieldHandleState.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ;\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b$\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/e;", "", "", "visible", "Li0/f;", "position", "Landroidx/compose/ui/text/style/i;", "direction", "handlesCrossed", "<init>", "(ZJLandroidx/compose/ui/text/style/i;ZLkotlin/jvm/internal/w;)V", "b", "()Z", "c", "()J", "d", "()Landroidx/compose/ui/text/style/i;", "e", "f", "(ZJLandroidx/compose/ui/text/style/i;Z)Landroidx/compose/foundation/text2/input/internal/selection/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "k", "J", "j", "Landroidx/compose/ui/text/style/i;", "h", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class e {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f8750f = 0;

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final e f8751g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean visible;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long position;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.ui.text.style.i direction;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesCrossed;

    /* compiled from: TextFieldHandleState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/selection/e$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text2/input/internal/selection/e;", "Hidden", "Landroidx/compose/foundation/text2/input/internal/selection/e;", "a", "()Landroidx/compose/foundation/text2/input/internal/selection/e;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.input.internal.selection.e$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        public final e a() {
            return e.f8751g;
        }

        public Companion(w wVar) {
        }
    }

    static {
        i0.f.INSTANCE.getClass();
        f8751g = new e(false, i0.f.f74149e, androidx.compose.ui.text.style.i.Ltr, false);
    }

    public /* synthetic */ e(boolean z4, long j4, androidx.compose.ui.text.style.i iVar, boolean z5, w wVar) {
        this(z4, j4, iVar, z5);
    }

    public static e g(e eVar, boolean z4, long j4, androidx.compose.ui.text.style.i iVar, boolean z5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = eVar.visible;
        }
        if ((i4 & 2) != 0) {
            j4 = eVar.position;
        }
        long j5 = j4;
        if ((i4 & 4) != 0) {
            iVar = eVar.direction;
        }
        androidx.compose.ui.text.style.i iVar2 = iVar;
        if ((i4 & 8) != 0) {
            z5 = eVar.handlesCrossed;
        }
        eVar.getClass();
        return new e(z4, j5, iVar2, z5);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* renamed from: c, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.text.style.i getDirection() {
        return this.direction;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return this.visible == eVar.visible && i0.f.l(this.position, eVar.position) && this.direction == eVar.direction && this.handlesCrossed == eVar.handlesCrossed;
    }

    @l
    public final e f(boolean visible, long position, @l androidx.compose.ui.text.style.i direction, boolean handlesCrossed) {
        return new e(visible, position, direction, handlesCrossed);
    }

    @l
    public final androidx.compose.ui.text.style.i h() {
        return this.direction;
    }

    public int hashCode() {
        return Boolean.hashCode(this.handlesCrossed) + ((this.direction.hashCode() + ((i0.f.s(this.position) + (Boolean.hashCode(this.visible) * 31)) * 31)) * 31);
    }

    public final boolean i() {
        return this.handlesCrossed;
    }

    public final long j() {
        return this.position;
    }

    public final boolean k() {
        return this.visible;
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.visible);
        sb.append(", position=");
        sb.append((Object) i0.f.y(this.position));
        sb.append(", direction=");
        sb.append(this.direction);
        sb.append(", handlesCrossed=");
        return androidx.compose.animation.l.a(sb, this.handlesCrossed, ')');
    }

    private e(boolean z4, long j4, androidx.compose.ui.text.style.i iVar, boolean z5) {
        this.visible = z4;
        this.position = j4;
        this.direction = iVar;
        this.handlesCrossed = z5;
    }
}
