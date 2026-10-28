package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: ListItem.kt */
@kd.g
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/j6;", "", "", "lines", "g", "(I)I", "other", "f", "(II)I", "", "k", "(I)Ljava/lang/String;", "j", "", "", "h", "(ILjava/lang/Object;)Z", "b", "I", "c", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class j6 implements Comparable<j6> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    private static final int f11906d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f11907e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f11908f = 3;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int lines;

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/j6$a;", "", "<init>", "()V", "", "hasOverline", "hasSupporting", "isSupportingMultiline", "Landroidx/compose/material3/j6;", "a", "(ZZZ)I", "OneLine", "I", "b", "()I", "TwoLine", "d", "ThreeLine", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.j6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final int a(boolean hasOverline, boolean hasSupporting, boolean isSupportingMultiline) {
            return ((hasOverline && hasSupporting) || isSupportingMultiline) ? j6.f11908f : (hasOverline || hasSupporting) ? j6.f11907e : j6.f11906d;
        }

        public final int b() {
            return j6.f11906d;
        }

        public final int c() {
            return j6.f11908f;
        }

        public final int d() {
            return j6.f11907e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ j6(int i4) {
        this.lines = i4;
    }

    public static final /* synthetic */ j6 d(int i4) {
        return new j6(i4);
    }

    public static int f(int i4, int i5) {
        return kotlin.jvm.internal.l0.t(i4, i5);
    }

    private static int g(int i4) {
        return i4;
    }

    public static boolean h(int i4, Object obj) {
        return (obj instanceof j6) && i4 == ((j6) obj).lines;
    }

    public static final boolean i(int i4, int i5) {
        return i4 == i5;
    }

    public static int j(int i4) {
        return Integer.hashCode(i4);
    }

    public static String k(int i4) {
        return androidx.compose.animation.core.a2.a("ListItemType(lines=", i4, ')');
    }

    @Override // java.lang.Comparable
    public int compareTo(j6 j6Var) {
        return kotlin.jvm.internal.l0.t(this.lines, j6Var.lines);
    }

    public int e(int i4) {
        return kotlin.jvm.internal.l0.t(this.lines, i4);
    }

    public boolean equals(Object obj) {
        return h(this.lines, obj);
    }

    public int hashCode() {
        return Integer.hashCode(this.lines);
    }

    /* renamed from: l, reason: from getter */
    public final /* synthetic */ int getLines() {
        return this.lines;
    }

    public String toString() {
        return k(this.lines);
    }
}
