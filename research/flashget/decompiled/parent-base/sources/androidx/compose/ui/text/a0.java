package androidx.compose.ui.text;

import androidx.compose.runtime.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: Placeholder.kt */
@m1
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/a0;", "", "Landroidx/compose/ui/unit/z;", "width", "height", "Landroidx/compose/ui/text/b0;", "placeholderVerticalAlign", "<init>", "(JJILkotlin/jvm/internal/w;)V", "a", "(JJI)Landroidx/compose/ui/text/a0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "e", "()J", "b", "c", "I", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20464d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int placeholderVerticalAlign;

    public /* synthetic */ a0(long j4, long j5, int i4, kotlin.jvm.internal.w wVar) {
        this(j4, j5, i4);
    }

    public static a0 b(a0 a0Var, long j4, long j5, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j4 = a0Var.width;
        }
        long j6 = j4;
        if ((i5 & 2) != 0) {
            j5 = a0Var.height;
        }
        long j7 = j5;
        if ((i5 & 4) != 0) {
            i4 = a0Var.placeholderVerticalAlign;
        }
        a0Var.getClass();
        return new a0(j6, j7, i4);
    }

    @fg.l
    public final a0 a(long width, long height, int placeholderVerticalAlign) {
        return new a0(width, height, placeholderVerticalAlign);
    }

    /* renamed from: c, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    /* renamed from: d, reason: from getter */
    public final int getPlaceholderVerticalAlign() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: e, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return androidx.compose.ui.unit.z.j(this.width, a0Var.width) && androidx.compose.ui.unit.z.j(this.height, a0Var.height) && b0.k(this.placeholderVerticalAlign, a0Var.placeholderVerticalAlign);
    }

    public int hashCode() {
        return b0.l(this.placeholderVerticalAlign) + i0.k.a(this.height, androidx.compose.ui.unit.z.o(this.width) * 31, 31);
    }

    @fg.l
    public String toString() {
        return "Placeholder(width=" + ((Object) androidx.compose.ui.unit.z.u(this.width)) + ", height=" + ((Object) androidx.compose.ui.unit.z.u(this.height)) + ", placeholderVerticalAlign=" + ((Object) b0.m(this.placeholderVerticalAlign)) + ')';
    }

    private a0(long j4, long j5, int i4) {
        this.width = j4;
        this.height = j5;
        this.placeholderVerticalAlign = i4;
        if (androidx.compose.ui.unit.a0.s(j4)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (androidx.compose.ui.unit.a0.s(j5)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
