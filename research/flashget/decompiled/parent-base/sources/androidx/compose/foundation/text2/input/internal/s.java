package androidx.compose.foundation.text2.input.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: OffsetMappingCalculator.kt */
@kd.g
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0083@\u0018\u0000 \u00042\u00020\u0001:\u0001%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013Jo\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00152K\u0010\u001a\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0017H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010!\u0088\u0001\u0007\u0092\u0001\u00020\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/text2/input/internal/s;", "", "", "size", "b", "(I)[I", "", "values", "c", "([I)[I", "index", "offset", "srcLen", "destLen", "Lkotlin/k2;", "k", "([IIIII)V", "newSize", "d", "([II)[I", "max", "", "reversed", "Lkotlin/Function3;", "Lkotlin/r0;", "name", "block", "g", "([IIZLld/q;)V", "", "l", "([I)Ljava/lang/String;", "j", "([I)I", "other", "e", "([ILjava/lang/Object;)Z", "a", "[I", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final a f8720b = new a();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f8721c = 3;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] values;

    /* compiled from: OffsetMappingCalculator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/s$a;", "", "<init>", "()V", "", "ElementSize", "I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    private /* synthetic */ s(int[] iArr) {
        this.values = iArr;
    }

    public static final /* synthetic */ s a(int[] iArr) {
        return new s(iArr);
    }

    @fg.l
    public static int[] b(int i4) {
        return new int[i4 * 3];
    }

    private static int[] c(int[] iArr) {
        return iArr;
    }

    @fg.l
    public static final int[] d(int[] iArr, int i4) {
        int[] copyOf = Arrays.copyOf(iArr, i4 * 3);
        kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static boolean e(int[] iArr, Object obj) {
        return (obj instanceof s) && kotlin.jvm.internal.l0.g(iArr, ((s) obj).values);
    }

    public static final boolean f(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.l0.g(iArr, iArr2);
    }

    public static final void g(int[] iArr, int i4, boolean z4, @fg.l ld.q<? super Integer, ? super Integer, ? super Integer, k2> qVar) {
        if (i4 < 0) {
            return;
        }
        if (!z4) {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 3;
                qVar.R(Integer.valueOf(iArr[i6]), Integer.valueOf(iArr[i6 + 1]), Integer.valueOf(iArr[i6 + 2]));
            }
            return;
        }
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            }
            int i7 = i4 * 3;
            qVar.R(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr[i7 + 1]), Integer.valueOf(iArr[i7 + 2]));
        }
    }

    public static /* synthetic */ void h(int[] iArr, int i4, boolean z4, ld.q qVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if (i4 < 0) {
            return;
        }
        if (!z4) {
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i6 * 3;
                qVar.R(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr[i7 + 1]), Integer.valueOf(iArr[i7 + 2]));
            }
            return;
        }
        while (true) {
            i4--;
            if (-1 >= i4) {
                return;
            }
            int i10 = i4 * 3;
            qVar.R(Integer.valueOf(iArr[i10]), Integer.valueOf(iArr[i10 + 1]), Integer.valueOf(iArr[i10 + 2]));
        }
    }

    public static final int i(int[] iArr) {
        return iArr.length / 3;
    }

    public static int j(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static final void k(int[] iArr, int i4, int i5, int i6, int i7) {
        int i10 = i4 * 3;
        iArr[i10] = i5;
        iArr[i10 + 1] = i6;
        iArr[i10 + 2] = i7;
    }

    public static String l(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.values, obj);
    }

    public int hashCode() {
        return Arrays.hashCode(this.values);
    }

    /* renamed from: m, reason: from getter */
    public final /* synthetic */ int[] getValues() {
        return this.values;
    }

    public String toString() {
        return l(this.values);
    }
}
