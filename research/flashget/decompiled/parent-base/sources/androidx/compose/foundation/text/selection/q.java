package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.w1;
import androidx.compose.runtime.m1;
import kotlin.Metadata;

/* compiled from: Selection.kt */
@m1
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b \u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b\"\u0010\u0013\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/text/selection/q;", "", "Landroidx/compose/foundation/text/selection/q$a;", "start", "end", "", "handlesCrossed", "<init>", "(Landroidx/compose/foundation/text/selection/q$a;Landroidx/compose/foundation/text/selection/q$a;Z)V", "other", "i", "(Landroidx/compose/foundation/text/selection/q;)Landroidx/compose/foundation/text/selection/q;", "Landroidx/compose/ui/text/t0;", "j", "()J", "a", "()Landroidx/compose/foundation/text/selection/q$a;", "b", "c", "()Z", "d", "(Landroidx/compose/foundation/text/selection/q$a;Landroidx/compose/foundation/text/selection/q$a;Z)Landroidx/compose/foundation/text/selection/q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/selection/q$a;", "h", "f", "Z", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8094d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a start;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a end;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean handlesCrossed;

    /* compiled from: Selection.kt */
    @m1
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/selection/q$a;", "", "Landroidx/compose/ui/text/style/i;", "direction", "", "offset", "", "selectableId", "<init>", "(Landroidx/compose/ui/text/style/i;IJ)V", "a", "()Landroidx/compose/ui/text/style/i;", "b", "()I", "c", "()J", "d", "(Landroidx/compose/ui/text/style/i;IJ)Landroidx/compose/foundation/text/selection/q$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/style/i;", "f", "I", "g", "J", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f8098d = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.text.style.i direction;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final long selectableId;

        public a(@fg.l androidx.compose.ui.text.style.i iVar, int i4, long j4) {
            this.direction = iVar;
            this.offset = i4;
            this.selectableId = j4;
        }

        public static a e(a aVar, androidx.compose.ui.text.style.i iVar, int i4, long j4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                iVar = aVar.direction;
            }
            if ((i5 & 2) != 0) {
                i4 = aVar.offset;
            }
            if ((i5 & 4) != 0) {
                j4 = aVar.selectableId;
            }
            aVar.getClass();
            return new a(iVar, i4, j4);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.ui.text.style.i getDirection() {
            return this.direction;
        }

        /* renamed from: b, reason: from getter */
        public final int getOffset() {
            return this.offset;
        }

        /* renamed from: c, reason: from getter */
        public final long getSelectableId() {
            return this.selectableId;
        }

        @fg.l
        public final a d(@fg.l androidx.compose.ui.text.style.i direction, int offset, long selectableId) {
            return new a(direction, offset, selectableId);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.direction == aVar.direction && this.offset == aVar.offset && this.selectableId == aVar.selectableId;
        }

        @fg.l
        public final androidx.compose.ui.text.style.i f() {
            return this.direction;
        }

        public final int g() {
            return this.offset;
        }

        public final long h() {
            return this.selectableId;
        }

        public int hashCode() {
            return Long.hashCode(this.selectableId) + w1.a(this.offset, this.direction.hashCode() * 31, 31);
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(this.direction);
            sb.append(", offset=");
            sb.append(this.offset);
            sb.append(", selectableId=");
            return androidx.collection.y0.a(sb, this.selectableId, ')');
        }
    }

    public q(@fg.l a aVar, @fg.l a aVar2, boolean z4) {
        this.start = aVar;
        this.end = aVar2;
        this.handlesCrossed = z4;
    }

    public static q e(q qVar, a aVar, a aVar2, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = qVar.start;
        }
        if ((i4 & 2) != 0) {
            aVar2 = qVar.end;
        }
        if ((i4 & 4) != 0) {
            z4 = qVar.handlesCrossed;
        }
        qVar.getClass();
        return new q(aVar, aVar2, z4);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final a getStart() {
        return this.start;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final a getEnd() {
        return this.end;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    @fg.l
    public final q d(@fg.l a start, @fg.l a end, boolean handlesCrossed) {
        return new q(start, end, handlesCrossed);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return kotlin.jvm.internal.l0.g(this.start, qVar.start) && kotlin.jvm.internal.l0.g(this.end, qVar.end) && this.handlesCrossed == qVar.handlesCrossed;
    }

    @fg.l
    public final a f() {
        return this.end;
    }

    public final boolean g() {
        return this.handlesCrossed;
    }

    @fg.l
    public final a h() {
        return this.start;
    }

    public int hashCode() {
        return Boolean.hashCode(this.handlesCrossed) + ((this.end.hashCode() + (this.start.hashCode() * 31)) * 31);
    }

    @fg.l
    public final q i(@fg.m q other) {
        if (other == null) {
            return this;
        }
        boolean z4 = this.handlesCrossed;
        if (z4 || other.handlesCrossed) {
            return new q(other.handlesCrossed ? other.start : other.end, z4 ? this.end : this.start, true);
        }
        return e(this, null, other.end, false, 5, null);
    }

    public final long j() {
        return androidx.compose.ui.text.u0.b(this.start.g(), this.end.g());
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", handlesCrossed=");
        return androidx.compose.animation.l.a(sb, this.handlesCrossed, ')');
    }

    public /* synthetic */ q(a aVar, a aVar2, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(aVar, aVar2, (i4 & 4) != 0 ? false : z4);
    }
}
