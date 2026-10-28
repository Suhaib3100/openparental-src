package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: FloatList.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b*\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0005J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010\u0005J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b%\u0010$J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\nJ\u0015\u0010'\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b'\u0010\u0018J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b(\u0010\u0016J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b)\u0010\u001cJ\u0018\u0010*\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010+\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020\f2\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b1\u0010\u0018J\u0015\u00102\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b2\u0010\u0016J\"\u00103\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010\u001eJ\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u0010\u001eR\u0012\u0010!\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/collection/o1;", "Landroidx/collection/t;", "", "initialCapacity", "<init>", "(I)V", "", "element", "", "X", "(F)Z", "index", "Lkotlin/k2;", "W", "(IF)V", "", "elements", "Z", "(I[F)Z", "Y", "(ILandroidx/collection/t;)Z", "a0", "(Landroidx/collection/t;)Z", "b0", "([F)Z", "j0", "(Landroidx/collection/t;)V", "k0", "([F)V", "c0", "()V", "minCapacity", "v0", "capacity", "d0", "i0", "(F)V", "f0", "l0", "n0", "m0", "h0", "g0", "o0", "(I)F", "start", "end", "p0", "(II)V", "r0", "q0", "s0", "(IF)F", "t0", "u0", "e0", "()I", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,969:1\n549#1:970\n70#2:971\n253#2,6:974\n70#2:980\n70#2:981\n70#2:982\n70#2:989\n70#2:990\n13614#3,2:972\n1687#3,6:983\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n692#1:970\n753#1:971\n772#1:974,6\n783#1:980\n787#1:981\n834#1:982\n850#1:989\n869#1:990\n763#1:972,2\n836#1:983,6\n*E\n"})
/* loaded from: classes.dex */
public final class o1 extends t {
    public o1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(o1 o1Var, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = o1Var._size;
        }
        o1Var.v0(i4);
    }

    public final void W(@androidx.annotation.g0(from = 0) int index, float element) {
        int i4;
        if (index < 0 || index > (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        d0(i4 + 1);
        float[] fArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.y0(fArr, fArr, index + 1, index, i5);
        }
        fArr[index] = element;
        this._size++;
    }

    public final boolean X(float element) {
        d0(this._size + 1);
        float[] fArr = this.content;
        int i4 = this._size;
        fArr[i4] = element;
        this._size = i4 + 1;
        return true;
    }

    public final boolean Y(@androidx.annotation.g0(from = 0) int index, @fg.l t elements) {
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
        float[] fArr = this.content;
        int i4 = this._size;
        if (index != i4) {
            kotlin.collections.l.y0(fArr, fArr, elements._size + index, index, i4);
        }
        kotlin.collections.l.y0(elements.content, fArr, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean Z(@androidx.annotation.g0(from = 0) int index, @fg.l float[] elements) {
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
        float[] fArr = this.content;
        int i5 = this._size;
        if (index != i5) {
            kotlin.collections.l.y0(fArr, fArr, elements.length + index, index, i5);
        }
        kotlin.collections.l.H0(elements, fArr, index, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final boolean a0(@fg.l t elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return Y(this._size, elements);
    }

    public final boolean b0(@fg.l float[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        return Z(this._size, elements);
    }

    public final void c0() {
        this._size = 0;
    }

    public final void d0(int capacity) {
        float[] fArr = this.content;
        if (fArr.length < capacity) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(capacity, (fArr.length * 3) / 2));
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final int e0() {
        return this.content.length;
    }

    public final void f0(float element) {
        l0(element);
    }

    public final void g0(@fg.l t elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        float[] fArr = elements.content;
        int i4 = elements._size;
        for (int i5 = 0; i5 < i4; i5++) {
            l0(fArr[i5]);
        }
    }

    public final void h0(@fg.l float[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        for (float f4 : elements) {
            l0(f4);
        }
    }

    public final void i0(float element) {
        X(element);
    }

    public final void j0(@fg.l t elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Y(this._size, elements);
    }

    public final void k0(@fg.l float[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        Z(this._size, elements);
    }

    public final boolean l0(float element) {
        int y4 = y(element);
        if (y4 < 0) {
            return false;
        }
        o0(y4);
        return true;
    }

    public final boolean m0(@fg.l t elements) {
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

    public final boolean n0(@fg.l float[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        for (float f4 : elements) {
            l0(f4);
        }
        return i4 != this._size;
    }

    public final float o0(@androidx.annotation.g0(from = 0) int index) {
        int i4;
        if (index < 0 || index >= (i4 = this._size)) {
            StringBuilder a5 = s.a("Index ", index, " must be in 0..");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        float[] fArr = this.content;
        float f4 = fArr[index];
        if (index != i4 - 1) {
            kotlin.collections.l.y0(fArr, fArr, index, index + 1, i4);
        }
        this._size--;
        return f4;
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
                float[] fArr = this.content;
                kotlin.collections.l.y0(fArr, fArr, start, end, i4);
            }
            this._size -= end - start;
        }
    }

    public final boolean q0(@fg.l t elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        float[] fArr = this.content;
        for (int i5 = i4 - 1; -1 < i5; i5--) {
            if (!elements.c(fArr[i5])) {
                o0(i5);
            }
        }
        return i4 != this._size;
    }

    public final boolean r0(@fg.l float[] elements) {
        kotlin.jvm.internal.l0.p(elements, "elements");
        int i4 = this._size;
        float[] fArr = this.content;
        int i5 = i4 - 1;
        while (true) {
            int i6 = 0;
            int i7 = -1;
            if (-1 >= i5) {
                break;
            }
            float f4 = fArr[i5];
            int length = elements.length;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (elements[i6] == f4) {
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

    public final float s0(@androidx.annotation.g0(from = 0) int index, float element) {
        if (index < 0 || index >= this._size) {
            StringBuilder a5 = s.a("set index ", index, " must be between 0 .. ");
            a5.append(this._size - 1);
            throw new IndexOutOfBoundsException(a5.toString());
        }
        float[] fArr = this.content;
        float f4 = fArr[index];
        fArr[index] = element;
        return f4;
    }

    public final void t0() {
        kotlin.collections.l.N3(this.content, 0, this._size);
    }

    public final void u0() {
        kotlin.collections.l.yu(this.content, 0, this._size);
    }

    public final void v0(int minCapacity) {
        int max = Math.max(minCapacity, this._size);
        float[] fArr = this.content;
        if (fArr.length > max) {
            float[] copyOf = Arrays.copyOf(fArr, max);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public o1(int i4) {
        super(i4, null);
    }

    public o1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        super((i5 & 1) != 0 ? 16 : i4, null);
    }
}
