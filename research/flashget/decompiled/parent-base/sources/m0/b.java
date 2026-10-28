package m0;

import androidx.compose.runtime.internal.u;
import fg.l;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: PointerIdArray.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\fJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u0003J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\fR$\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0012\u0010'\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b&\u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Lm0/b;", "", "<init>", "()V", "", "index", "Landroidx/compose/ui/input/pointer/a0;", "f", "(I)J", "pointerId", "", "k", "(J)Z", "", "pointerIdValue", "j", "l", "(I)Z", "i", "()Z", "value", "a", "b", "Lkotlin/k2;", "m", "(IJ)V", "n", "c", "e", "d", "<set-?>", "I", "h", "()I", "size", "", "[J", "internalArray", "g", "lastIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f81467c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private long[] internalArray = new long[2];

    public final boolean a(long value) {
        if (d(value)) {
            return false;
        }
        m(this.size, value);
        return true;
    }

    public final boolean b(long pointerId) {
        return a(pointerId);
    }

    public final void c() {
        this.size = 0;
    }

    public final boolean d(long pointerIdValue) {
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.internalArray[i5] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(long pointerId) {
        return d(pointerId);
    }

    public final long f(int index) {
        return this.internalArray[index];
    }

    public final int g() {
        return this.size - 1;
    }

    /* renamed from: h, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final boolean i() {
        return this.size == 0;
    }

    public final boolean j(long pointerIdValue) {
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (pointerIdValue == this.internalArray[i5]) {
                l(i5);
                return true;
            }
        }
        return false;
    }

    public final boolean k(long pointerId) {
        return j(pointerId);
    }

    public final boolean l(int index) {
        int i4 = this.size;
        if (index >= i4) {
            return false;
        }
        int i5 = i4 - 1;
        while (index < i5) {
            long[] jArr = this.internalArray;
            int i6 = index + 1;
            jArr[index] = jArr[i6];
            index = i6;
        }
        this.size--;
        return true;
    }

    public final void m(int index, long value) {
        long[] jArr = this.internalArray;
        if (index >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(index + 1, jArr.length * 2));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.internalArray = copyOf;
        }
        this.internalArray[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    public final void n(int index, long pointerId) {
        m(index, pointerId);
    }
}
