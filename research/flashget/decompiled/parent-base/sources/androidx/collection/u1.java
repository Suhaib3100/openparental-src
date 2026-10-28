package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b(\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\u0005J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\"\u0010\u0005J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b#\u0010\u0005J\u0015\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b$\u0010\tJ\u0015\u0010%\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0017J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b&\u0010\u0015J\u0018\u0010'\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002¢\u0006\u0004\b'\u0010\u001bJ\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b(\u0010\u0019J\u0017\u0010)\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020\u000b2\b\b\u0001\u0010+\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010\rJ\u0015\u0010.\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b.\u0010\u0017J\u0015\u0010/\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b/\u0010\u0015J\"\u00100\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u000b¢\u0006\u0004\b2\u0010\u001dJ\r\u00103\u001a\u00020\u000b¢\u0006\u0004\b3\u0010\u001dR\u0012\u0010 \u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Landroidx/collection/u1;", "Landroidx/collection/h0;", "", "initialCapacity", "<init>", "(I)V", "element", "", "X", "(I)Z", "index", "Lkotlin/k2;", "W", "(II)V", "", "elements", "Z", "(I[I)Z", "Y", "(ILandroidx/collection/h0;)Z", "a0", "(Landroidx/collection/h0;)Z", "b0", "([I)Z", "j0", "(Landroidx/collection/h0;)V", "k0", "([I)V", "c0", "()V", "minCapacity", "v0", "capacity", "d0", "i0", "f0", "l0", "n0", "m0", "h0", "g0", "o0", "(I)I", "start", "end", "p0", "r0", "q0", "s0", "(II)I", "t0", "u0", "e0", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13600#3,2:972\n1663#3,6:983\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: classes.dex */
public final class u1 extends h0 {
    public u1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(u1 u1Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = u1Var._size;
        }
        u1Var.v0(i4);
    }

    public final void W(@androidx.annotation.g0(from = 0) int index, int element) {
        int i4;
        if (index < 0 || index > (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        d0(i4 + 1);
        int[] iArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.z0(iArr, iArr, index + 1, index, i5);
        }
        iArr[index] = element;
        this._size++;
    }

    public final boolean X(int element) {
        d0(this._size + 1);
        int[] iArr = this.content;
        int i4 = this._size;
        iArr[i4] = element;
        this._size = i4 + 1;
        return true;
    }

    public final boolean Y(@androidx.annotation.g0(from = 0) int index, @fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (index < 0 || index > this._size) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (elements.B()) {
            return false;
        }
        d0(this._size + elements._size);
        int[] iArr = this.content;
        int i4 = this._size;
        if (index != i4) {
            kotlin.collections.l.z0(iArr, iArr, elements._size + index, index, i4);
        }
        kotlin.collections.l.z0(elements.content, iArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean Z(@androidx.annotation.g0(from = 0) int index, @fg.l int[] elements) {
        int i4;
        kotlin.jvm.internal.l0.p(elements, "elements");
        if (index < 0 || index > (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        d0(i4 + elements.length);
        int[] iArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.z0(iArr, iArr, elements.length + index, index, i5);
        }
        kotlin.collections.l.I0(elements, iArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final boolean a0(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return Y(this._size, elements);
    }

    public final boolean b0(@fg.l int[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return Z(this._size, elements);
    }

    public final void c0() {
        this._size = 0;
    }

    public final void d0(int capacity) {
        int[] iArr = this.content;
        if (iArr.length < capacity) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(capacity, (iArr.length * 3) / 2));
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int e0() {
        return this.content.length;
    }

    public final void f0(int element) {
        l0(element);
    }

    public final void g0(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int[] iArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            l0(iArr[i5]);
        }
    }

    public final void h0(@fg.l int[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (int i4 : elements) {
            l0(i4);
        }
    }

    public final void i0(int element) {
        X(element);
    }

    public final void j0(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Y(this._size, elements);
    }

    public final void k0(@fg.l int[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Z(this._size, elements);
    }

    public final boolean l0(int element) {
        int y4 = y(element);
        if (y4 < 0) {
            return false;
        }
        o0(y4);
        return true;
    }

    public final boolean m0(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        int i5 = elements._size - 1;
        if (i5 >= 0) {
            int i6 = 0;
            while (true) {
                l0(elements.s(i6));
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        }
        return i4 != this._size;
    }

    public final boolean n0(@fg.l int[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        for (int i5 : elements) {
            l0(i5);
        }
        return i4 != this._size;
    }

    public final int o0(@androidx.annotation.g0(from = 0) int index) {
        int i4;
        if (index < 0 || index >= (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        int[] iArr = this.content;
        int i5 = iArr[index];
        if (index != i4 - 1) {
            kotlin.collections.l.z0(iArr, iArr, index, index + 1, i4);
        }
        this._size--;
        return i5;
    }

    public final void p0(@androidx.annotation.g0(from = 0) int start, @androidx.annotation.g0(from = 0) int end) {
        int i4;
        if (start < 0 || start > (i4 = this._size) || end < 0 || end > i4) {
            StringBuilder a5 = n1.a("Start (", start, ") and end (", end, ") must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        if (end < start) {
            throw new IllegalArgumentException(m1.a("Start (", start, ") is more than end (", end, ')'));
        }
        if (end != start) {
            if (end < i4) {
                int[] iArr = this.content;
                kotlin.collections.l.z0(iArr, iArr, start, end, i4);
            }
            this._size -= end - start;
        }
    }

    public final boolean q0(@fg.l h0 elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        int[] iArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!elements.c(iArr[i5])) {
                o0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean r0(@fg.l int[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        int[] iArr = this.content;
        int i5 = i4 - 1;
        while (true) {
            int i6 = 0;
            int i7 = -1;
            if (-1 >= i5) {
                break;
            }
            int i10 = iArr[i5];
            int length = elements.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == i10) {
                    i7 = i6;
                    break;
                }
                i6++;
            }
            if (i7 < 0) {
                o0(i5);
            }
            i5--;
        }
        return i4 != this._size;
    }

    public final int s0(@androidx.annotation.g0(from = 0) int index, int element) {
        if (index < 0 || index >= this._size) {
            StringBuilder a5 = s.a("set index ", index, " must be between 0 .. ");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        int[] iArr = this.content;
        int i4 = iArr[index];
        iArr[index] = element;
        return i4;
    }

    public final void t0() {
        kotlin.collections.l.P3(this.content, 0, this._size);
    }

    public final void u0() {
        kotlin.collections.l.Au(this.content, 0, this._size);
    }

    public final void v0(int minCapacity) {
        int max = Math.max(minCapacity, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public u1(int i4) {
        super(i4, null);
    }

    public u1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        super((i5 & 1) != 0 ? 16 : i4, null);
    }
}
