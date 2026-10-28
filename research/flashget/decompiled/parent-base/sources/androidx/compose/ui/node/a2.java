package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@kd.g
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u001b\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u001d\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010$\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010R\u0014\u0010&\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0014\u0010(\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010!\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006)"}, d2 = {"Landroidx/compose/ui/node/a2;", "", "", "data", "c", "([I)[I", "Landroidx/compose/ui/node/w;", "diagonals", "Lkotlin/k2;", "a", "([ILandroidx/compose/ui/node/w;)V", "", "p", "([I)Ljava/lang/String;", "", "n", "([I)I", "other", "", "d", "([ILjava/lang/Object;)Z", "[I", "f", "()[I", "l", "startX", "m", "startY", "h", "endX", "i", "endY", "k", "([I)Z", "reverse", "g", "diagonalSize", "j", "hasAdditionOrRemoval", "o", "isAddition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] data;

    private /* synthetic */ a2(int[] iArr) {
        this.data = iArr;
    }

    public static final void a(int[] iArr, @fg.l w wVar) {
        if (!j(iArr)) {
            int i4 = iArr[0];
            wVar.g(i4, iArr[1], iArr[2] - i4);
        } else if (k(iArr)) {
            wVar.g(iArr[0], iArr[1], g(iArr));
        } else if (o(iArr)) {
            wVar.g(iArr[0], iArr[1] + 1, g(iArr));
        } else {
            wVar.g(iArr[0] + 1, iArr[1], g(iArr));
        }
    }

    public static final /* synthetic */ a2 b(int[] iArr) {
        return new a2(iArr);
    }

    @fg.l
    public static int[] c(@fg.l int[] iArr) {
        return iArr;
    }

    public static boolean d(int[] iArr, Object obj) {
        return (obj instanceof a2) && kotlin.jvm.internal.l0.g(iArr, ((a2) obj).data);
    }

    public static final boolean e(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.l0.g(iArr, iArr2);
    }

    public static final int g(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final int h(int[] iArr) {
        return iArr[2];
    }

    public static final int i(int[] iArr) {
        return iArr[3];
    }

    private static final boolean j(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    public static final boolean k(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int l(int[] iArr) {
        return iArr[0];
    }

    public static final int m(int[] iArr) {
        return iArr[1];
    }

    public static int n(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    private static final boolean o(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }

    @fg.l
    public static String p(int[] iArr) {
        StringBuilder sb = new StringBuilder("Snake(");
        sb.append(iArr[0]);
        sb.append(',');
        sb.append(iArr[1]);
        sb.append(',');
        sb.append(iArr[2]);
        sb.append(',');
        sb.append(iArr[3]);
        sb.append(',');
        return androidx.compose.animation.l.a(sb, k(iArr), ')');
    }

    public boolean equals(Object obj) {
        return d(this.data, obj);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public final /* synthetic */ int[] q() {
        return this.data;
    }

    @fg.l
    public String toString() {
        return p(this.data);
    }
}
