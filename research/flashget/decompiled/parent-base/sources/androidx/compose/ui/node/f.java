package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@kd.g
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/f;", "", "", "data", "b", "([I)[I", "", "index", "e", "([II)I", "value", "Lkotlin/k2;", "h", "([III)V", "", "i", "([I)Ljava/lang/String;", "g", "([I)I", "other", "", "c", "([ILjava/lang/Object;)Z", "a", "[I", "f", "mid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] data;

    private /* synthetic */ f(int[] iArr) {
        this.data = iArr;
    }

    public static final /* synthetic */ f a(int[] iArr) {
        return new f(iArr);
    }

    @fg.l
    public static int[] b(@fg.l int[] iArr) {
        return iArr;
    }

    public static boolean c(int[] iArr, Object obj) {
        return (obj instanceof f) && kotlin.jvm.internal.l0.g(iArr, ((f) obj).data);
    }

    public static final boolean d(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.l0.g(iArr, iArr2);
    }

    public static final int e(int[] iArr, int i4) {
        return iArr[(iArr.length / 2) + i4];
    }

    private static final int f(int[] iArr) {
        return iArr.length / 2;
    }

    public static int g(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void h(int[] iArr, int i4, int i5) {
        iArr[(iArr.length / 2) + i4] = i5;
    }

    public static String i(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return c(this.data, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    /* renamed from: j, reason: from getter */
    public final /* synthetic */ int[] getData() {
        return this.data;
    }

    public String toString() {
        return i(this.data);
    }
}
