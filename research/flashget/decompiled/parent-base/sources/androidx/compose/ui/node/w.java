package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0016J-\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u000bJ\r\u0010!\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$J\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)R\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\"¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/w;", "", "", "initialCapacity", "<init>", "(I)V", "start", "end", "elSize", "Lkotlin/k2;", "i", "(III)V", "e", "(III)I", "j", "k", "(II)V", "a", "b", "", "(II)Z", "index", "(I)I", "oldStart", "oldEnd", "newStart", "newEnd", "h", "(IIII)V", "x", "y", "size", "g", "f", "()I", "d", "()Z", "()V", "", "[I", "stack", "I", "lastIndex", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,510:1\n1#2:511\n*E\n"})
/* loaded from: classes.dex */
final class w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] stack;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int lastIndex;

    public w(int i4) {
        this.stack = new int[i4];
    }

    private final boolean a(int a5, int b5) {
        int[] iArr = this.stack;
        int i4 = iArr[a5];
        int i5 = iArr[b5];
        if (i4 >= i5) {
            return i4 == i5 && iArr[a5 + 1] <= iArr[b5 + 1];
        }
        return true;
    }

    private final int e(int start, int end, int elSize) {
        int i4 = start - elSize;
        while (start < end) {
            if (a(start, end)) {
                i4 += elSize;
                k(i4, start);
            }
            start += elSize;
        }
        int i5 = i4 + elSize;
        k(i5, end);
        return i5;
    }

    private final void i(int start, int end, int elSize) {
        if (start < end) {
            int e4 = e(start, end, elSize);
            i(start, e4 - elSize, elSize);
            i(e4 + elSize, end, elSize);
        }
    }

    private final void k(int i4, int j4) {
        int[] iArr = this.stack;
        a1.i(iArr, i4, j4);
        a1.i(iArr, i4 + 1, j4 + 1);
        a1.i(iArr, i4 + 2, j4 + 2);
    }

    public final int b(int index) {
        return this.stack[index];
    }

    /* renamed from: c, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean d() {
        return this.lastIndex != 0;
    }

    public final int f() {
        int[] iArr = this.stack;
        int i4 = this.lastIndex - 1;
        this.lastIndex = i4;
        return iArr[i4];
    }

    public final void g(int x4, int y4, int size) {
        int i4 = this.lastIndex;
        int i5 = i4 + 3;
        int[] iArr = this.stack;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i4] = x4 + size;
        iArr2[i4 + 1] = y4 + size;
        iArr2[i4 + 2] = size;
        this.lastIndex = i5;
    }

    public final void h(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i4 = this.lastIndex;
        int i5 = i4 + 4;
        int[] iArr = this.stack;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.stack = copyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i4] = oldStart;
        iArr2[i4 + 1] = oldEnd;
        iArr2[i4 + 2] = newStart;
        iArr2[i4 + 3] = newEnd;
        this.lastIndex = i5;
    }

    public final void j() {
        int i4 = this.lastIndex;
        if (i4 % 3 != 0) {
            throw new IllegalStateException("Array size not a multiple of 3");
        }
        if (i4 > 3) {
            i(0, i4 - 3, 3);
        }
    }
}
