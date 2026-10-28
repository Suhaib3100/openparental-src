package androidx.compose.ui.text.style;

import androidx.compose.runtime.m1;
import androidx.compose.runtime.x4;
import androidx.compose.ui.unit.a0;
import androidx.compose.ui.unit.z;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: TextIndent.kt */
@m1
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/q;", "", "Landroidx/compose/ui/unit/z;", "firstLine", "restLine", "<init>", "(JJLkotlin/jvm/internal/w;)V", "b", "(JJ)Landroidx/compose/ui/text/style/q;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "d", "()J", "e", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final int f21388d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long firstLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long restLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final q f21389e = new q(0, 0, 3, null);

    /* compiled from: TextIndent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/q$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/q;", "None", "Landroidx/compose/ui/text/style/q;", "a", "()Landroidx/compose/ui/text/style/q;", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.style.q$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @x4
        public static /* synthetic */ void b() {
        }

        @fg.l
        public final q a() {
            return q.f21389e;
        }

        public Companion(w wVar) {
        }
    }

    public /* synthetic */ q(long j4, long j5, w wVar) {
        this(j4, j5);
    }

    public static q c(q qVar, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = qVar.firstLine;
        }
        if ((i4 & 2) != 0) {
            j5 = qVar.restLine;
        }
        qVar.getClass();
        return new q(j4, j5);
    }

    @fg.l
    public final q b(long firstLine, long restLine) {
        return new q(firstLine, restLine);
    }

    /* renamed from: d, reason: from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* renamed from: e, reason: from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return z.j(this.firstLine, qVar.firstLine) && z.j(this.restLine, qVar.restLine);
    }

    public int hashCode() {
        return Long.hashCode(this.restLine) + (z.o(this.firstLine) * 31);
    }

    @fg.l
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) z.u(this.firstLine)) + ", restLine=" + ((Object) z.u(this.restLine)) + ')';
    }

    private q(long j4, long j5) {
        this.firstLine = j4;
        this.restLine = j5;
    }

    public /* synthetic */ q(long j4, long j5, int i4, w wVar) {
        this((i4 & 1) != 0 ? a0.m(0) : j4, (i4 & 2) != 0 ? a0.m(0) : j5);
    }
}
