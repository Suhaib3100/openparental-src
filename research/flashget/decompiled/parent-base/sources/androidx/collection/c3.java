package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: SparseArrayCompat.jvm.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u000eJ'\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010\u000bJ\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010\"J\u0017\u0010/\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u0010,J\u0017\u00100\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\"J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u0010<R\u0016\u0010@\u001a\u00020>8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b6\u0010?R\u001e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120A8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0016\u0010\u0019\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b2\u0010DR\u0011\u0010F\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bE\u0010*¨\u0006G"}, d2 = {"Landroidx/collection/c3;", "E", "", "", "initialCapacity", "<init>", "(I)V", "d", "()Landroidx/collection/c3;", "key", "i", "(I)Ljava/lang/Object;", "defaultValue", "k", "(ILjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/k2;", "g", "t", "", "value", "", "u", "(ILjava/lang/Object;)Z", "index", "v", "size", "w", "(II)V", "y", "oldValue", "newValue", "z", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "q", "(ILjava/lang/Object;)V", "other", "r", "(Landroidx/collection/c3;)V", "s", "B", "()I", "o", "()Z", "p", "(I)I", "C", "A", "m", "n", "(Ljava/lang/Object;)I", "e", "(I)Z", "f", "(Ljava/lang/Object;)Z", "c", "()V", "b", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[I", "keys", "", "[Ljava/lang/Object;", "values", "I", "l", "isEmpty", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
/* loaded from: classes.dex */
public class c3<E> implements Cloneable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ boolean garbage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ int[] keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ Object[] values;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ int size;

    @kd.j
    public c3() {
        this(0, 1, null);
    }

    public void A(int index, E value) {
        if (this.garbage) {
            d3.z(this);
        }
        this.values[index] = value;
    }

    public int B() {
        if (this.garbage) {
            d3.z(this);
        }
        return this.size;
    }

    public E C(int index) {
        if (this.garbage) {
            d3.z(this);
        }
        return (E) this.values[index];
    }

    public void b(int key, E value) {
        int i4 = this.size;
        if (i4 != 0 && key <= this.keys[i4 - 1]) {
            q(key, value);
            return;
        }
        if (this.garbage && i4 >= this.keys.length) {
            d3.z(this);
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int e4 = m.a.e(i5 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, e4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, e4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i5] = key;
        this.values[i5] = value;
        this.size = i5 + 1;
    }

    public void c() {
        int i4 = this.size;
        Object[] objArr = this.values;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c3<E> clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l0.n(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        c3<E> c3Var = (c3) clone;
        c3Var.keys = (int[]) this.keys.clone();
        c3Var.values = (Object[]) this.values.clone();
        return c3Var;
    }

    public boolean e(int key) {
        return m(key) >= 0;
    }

    public boolean f(E value) {
        if (this.garbage) {
            d3.z(this);
        }
        int i4 = this.size;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            }
            if (this.values[i5] == value) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @kotlin.k(message = "Alias for remove(int).", replaceWith = @kotlin.x0(expression = "remove(key)", imports = {}))
    public void g(int key) {
        t(key);
    }

    @fg.m
    public E i(int key) {
        return (E) d3.g(this, key);
    }

    public E k(int key, E defaultValue) {
        return (E) d3.h(this, key, defaultValue);
    }

    @kd.i(name = "getIsEmpty")
    public final boolean l() {
        return o();
    }

    public int m(int key) {
        if (this.garbage) {
            d3.z(this);
        }
        return m.a.a(this.keys, this.size, key);
    }

    public int n(E value) {
        if (this.garbage) {
            d3.z(this);
        }
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.values[i5] == value) {
                return i5;
            }
        }
        return -1;
    }

    public boolean o() {
        return B() == 0;
    }

    public int p(int index) {
        if (this.garbage) {
            d3.z(this);
        }
        return this.keys[index];
    }

    public void q(int key, E value) {
        Object obj;
        int a5 = m.a.a(this.keys, this.size, key);
        if (a5 >= 0) {
            this.values[a5] = value;
            return;
        }
        int i4 = ~a5;
        if (i4 < this.size) {
            Object obj2 = this.values[i4];
            obj = d3.f2203a;
            if (obj2 == obj) {
                this.keys[i4] = key;
                this.values[i4] = value;
                return;
            }
        }
        if (this.garbage && this.size >= this.keys.length) {
            d3.z(this);
            i4 = ~m.a.a(this.keys, this.size, key);
        }
        int i5 = this.size;
        if (i5 >= this.keys.length) {
            int e4 = m.a.e(i5 + 1);
            int[] copyOf = Arrays.copyOf(this.keys, e4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, e4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i6 = this.size;
        if (i6 - i4 != 0) {
            int[] iArr = this.keys;
            int i7 = i4 + 1;
            kotlin.collections.l.z0(iArr, iArr, i7, i4, i6);
            Object[] objArr = this.values;
            kotlin.collections.l.B0(objArr, objArr, i7, i4, this.size);
        }
        this.keys[i4] = key;
        this.values[i4] = value;
        this.size++;
    }

    public void r(@fg.l c3<? extends E> other) {
        Object obj;
        kotlin.jvm.internal.l0.p(other, "other");
        int B = other.B();
        for (int i4 = 0; i4 < B; i4++) {
            int p4 = other.p(i4);
            E C = other.C(i4);
            int a5 = m.a.a(this.keys, this.size, p4);
            if (a5 >= 0) {
                this.values[a5] = C;
            } else {
                int i5 = ~a5;
                if (i5 < this.size) {
                    Object obj2 = this.values[i5];
                    obj = d3.f2203a;
                    if (obj2 == obj) {
                        this.keys[i5] = p4;
                        this.values[i5] = C;
                    }
                }
                if (this.garbage && this.size >= this.keys.length) {
                    d3.z(this);
                    i5 = ~m.a.a(this.keys, this.size, p4);
                }
                int i6 = this.size;
                if (i6 >= this.keys.length) {
                    int e4 = m.a.e(i6 + 1);
                    int[] copyOf = Arrays.copyOf(this.keys, e4);
                    kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                    this.keys = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.values, e4);
                    kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
                    this.values = copyOf2;
                }
                int i7 = this.size;
                if (i7 - i5 != 0) {
                    int[] iArr = this.keys;
                    int i10 = i5 + 1;
                    kotlin.collections.l.z0(iArr, iArr, i10, i5, i7);
                    Object[] objArr = this.values;
                    kotlin.collections.l.B0(objArr, objArr, i10, i5, this.size);
                }
                this.keys[i5] = p4;
                this.values[i5] = C;
                this.size++;
            }
        }
    }

    @fg.m
    public E s(int key, E value) {
        Object obj;
        E e4 = (E) d3.g(this, key);
        if (e4 == null) {
            int a5 = m.a.a(this.keys, this.size, key);
            if (a5 >= 0) {
                this.values[a5] = value;
            } else {
                int i4 = ~a5;
                if (i4 < this.size) {
                    Object obj2 = this.values[i4];
                    obj = d3.f2203a;
                    if (obj2 == obj) {
                        this.keys[i4] = key;
                        this.values[i4] = value;
                    }
                }
                if (this.garbage && this.size >= this.keys.length) {
                    d3.z(this);
                    i4 = ~m.a.a(this.keys, this.size, key);
                }
                int i5 = this.size;
                if (i5 >= this.keys.length) {
                    int e5 = m.a.e(i5 + 1);
                    int[] copyOf = Arrays.copyOf(this.keys, e5);
                    kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
                    this.keys = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.values, e5);
                    kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
                    this.values = copyOf2;
                }
                int i6 = this.size;
                if (i6 - i4 != 0) {
                    int[] iArr = this.keys;
                    int i7 = i4 + 1;
                    kotlin.collections.l.z0(iArr, iArr, i7, i4, i6);
                    Object[] objArr = this.values;
                    kotlin.collections.l.B0(objArr, objArr, i7, i4, this.size);
                }
                this.keys[i4] = key;
                this.values[i4] = value;
                this.size++;
            }
        }
        return e4;
    }

    public void t(int key) {
        d3.p(this, key);
    }

    @fg.l
    public String toString() {
        if (B() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(p(i5));
            sb.append('=');
            E C = C(i5);
            if (C != this) {
                sb.append(C);
            } else {
                sb.append("(this Map)");
            }
        }
        return c.a(sb, '}', "buffer.toString()");
    }

    public boolean u(int key, @fg.m Object value) {
        int m4 = m(key);
        if (m4 < 0 || !kotlin.jvm.internal.l0.g(value, C(m4))) {
            return false;
        }
        v(m4);
        return true;
    }

    public void v(int index) {
        Object obj;
        Object obj2;
        Object obj3 = this.values[index];
        obj = d3.f2203a;
        if (obj3 != obj) {
            Object[] objArr = this.values;
            obj2 = d3.f2203a;
            objArr[index] = obj2;
            this.garbage = true;
        }
    }

    public void w(int index, int size) {
        int min = Math.min(size, index + size);
        while (index < min) {
            v(index);
            index++;
        }
    }

    @fg.m
    public E y(int key, E value) {
        int m4 = m(key);
        if (m4 < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e4 = (E) objArr[m4];
        objArr[m4] = value;
        return e4;
    }

    public boolean z(int key, E oldValue, E newValue) {
        int m4 = m(key);
        if (m4 < 0 || !kotlin.jvm.internal.l0.g(this.values[m4], oldValue)) {
            return false;
        }
        this.values[m4] = newValue;
        return true;
    }

    @kd.j
    public c3(int i4) {
        if (i4 == 0) {
            this.keys = m.a.f81460a;
            this.values = m.a.f81462c;
        } else {
            int e4 = m.a.e(i4);
            this.keys = new int[e4];
            this.values = new Object[e4];
        }
    }

    public /* synthetic */ c3(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 10 : i4);
    }
}
