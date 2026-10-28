package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: LongSparseArray.jvm.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J!\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010\u001d\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00102\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010$\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u00108J\u001f\u00109\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b9\u0010 J\u000f\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b9\u0010=R\u0016\u0010A\u001a\u00020?8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b7\u0010@R\u001e\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C0B8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0016\u0010G\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b3\u0010F¨\u0006H"}, d2 = {"Landroidx/collection/e1;", "E", "", "", "initialCapacity", "<init>", "(I)V", "d", "()Landroidx/collection/e1;", "", "key", "i", "(J)Ljava/lang/Object;", "defaultValue", "k", "(JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/k2;", "g", "(J)V", "s", "value", "", "t", "(JLjava/lang/Object;)Z", "index", "u", "v", "oldValue", "newValue", "w", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "p", "(JLjava/lang/Object;)V", "other", "q", "(Landroidx/collection/e1;)V", "r", "z", "()I", "n", "()Z", "o", "(I)J", "A", "(I)Ljava/lang/Object;", "y", "(ILjava/lang/Object;)V", "l", "(J)I", "m", "(Ljava/lang/Object;)I", "e", "(J)Z", "f", "(Ljava/lang/Object;)Z", "c", "()V", "b", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "I", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
/* loaded from: classes.dex */
public class e1<E> implements Cloneable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ boolean garbage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ long[] keys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ Object[] values;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public /* synthetic */ int size;

    @kd.j
    public e1() {
        this(0, 1, null);
    }

    public E A(int index) {
        int i4;
        Object obj;
        if (index < 0 || index >= (i4 = this.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        return (E) this.values[index];
    }

    public void b(long key, E value) {
        Object obj;
        int i4 = this.size;
        if (i4 != 0 && key <= this.keys[i4 - 1]) {
            p(key, value);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i4 >= jArr.length) {
                Object[] objArr = this.values;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    Object obj2 = objArr[i6];
                    obj = f1.f2222a;
                    if (obj2 != obj) {
                        if (i6 != i5) {
                            jArr[i5] = jArr[i6];
                            objArr[i5] = obj2;
                            objArr[i6] = null;
                        }
                        i5++;
                    }
                }
                this.garbage = false;
                this.size = i5;
            }
        }
        int i7 = this.size;
        if (i7 >= this.keys.length) {
            int f4 = m.a.f(i7 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, f4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, f4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i7] = key;
        this.values[i7] = value;
        this.size = i7 + 1;
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
    public e1<E> clone() {
        Object clone = super.clone();
        kotlin.jvm.internal.l0.n(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        e1<E> e1Var = (e1) clone;
        e1Var.keys = (long[]) this.keys.clone();
        e1Var.values = (Object[]) this.values.clone();
        return e1Var;
    }

    public boolean e(long key) {
        return l(key) >= 0;
    }

    public boolean f(E value) {
        return m(value) >= 0;
    }

    @kotlin.k(message = "Alias for `remove(key)`.", replaceWith = @kotlin.x0(expression = "remove(key)", imports = {}))
    public void g(long key) {
        Object obj;
        Object obj2;
        int b5 = m.a.b(this.keys, this.size, key);
        if (b5 >= 0) {
            Object obj3 = this.values[b5];
            obj = f1.f2222a;
            if (obj3 != obj) {
                Object[] objArr = this.values;
                obj2 = f1.f2222a;
                objArr[b5] = obj2;
                this.garbage = true;
            }
        }
    }

    @fg.m
    public E i(long key) {
        Object obj;
        int b5 = m.a.b(this.keys, this.size, key);
        if (b5 >= 0) {
            Object obj2 = this.values[b5];
            obj = f1.f2222a;
            if (obj2 != obj) {
                return (E) this.values[b5];
            }
        }
        return null;
    }

    public E k(long key, E defaultValue) {
        Object obj;
        int b5 = m.a.b(this.keys, this.size, key);
        if (b5 < 0) {
            return defaultValue;
        }
        Object obj2 = this.values[b5];
        obj = f1.f2222a;
        return obj2 == obj ? defaultValue : (E) this.values[b5];
    }

    public int l(long key) {
        Object obj;
        if (this.garbage) {
            int i4 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        return m.a.b(this.keys, this.size, key);
    }

    public int m(E value) {
        Object obj;
        if (this.garbage) {
            int i4 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        int i7 = this.size;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.values[i10] == value) {
                return i10;
            }
        }
        return -1;
    }

    public boolean n() {
        return z() == 0;
    }

    public long o(int index) {
        int i4;
        Object obj;
        if (index < 0 || index >= (i4 = this.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        return this.keys[index];
    }

    public void p(long key, E value) {
        Object obj;
        Object obj2;
        int b5 = m.a.b(this.keys, this.size, key);
        if (b5 >= 0) {
            this.values[b5] = value;
            return;
        }
        int i4 = ~b5;
        if (i4 < this.size) {
            Object obj3 = this.values[i4];
            obj2 = f1.f2222a;
            if (obj3 == obj2) {
                this.keys[i4] = key;
                this.values[i4] = value;
                return;
            }
        }
        if (this.garbage) {
            int i5 = this.size;
            long[] jArr = this.keys;
            if (i5 >= jArr.length) {
                Object[] objArr = this.values;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj4 = objArr[i7];
                    obj = f1.f2222a;
                    if (obj4 != obj) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr[i6] = obj4;
                            objArr[i7] = null;
                        }
                        i6++;
                    }
                }
                this.garbage = false;
                this.size = i6;
                i4 = ~m.a.b(this.keys, i6, key);
            }
        }
        int i10 = this.size;
        if (i10 >= this.keys.length) {
            int f4 = m.a.f(i10 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, f4);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, f4);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i11 = this.size;
        if (i11 - i4 != 0) {
            long[] jArr2 = this.keys;
            int i12 = i4 + 1;
            kotlin.collections.l.A0(jArr2, jArr2, i12, i4, i11);
            Object[] objArr2 = this.values;
            kotlin.collections.l.B0(objArr2, objArr2, i12, i4, this.size);
        }
        this.keys[i4] = key;
        this.values[i4] = value;
        this.size++;
    }

    public void q(@fg.l e1<? extends E> other) {
        kotlin.jvm.internal.l0.p(other, "other");
        int z4 = other.z();
        for (int i4 = 0; i4 < z4; i4++) {
            p(other.o(i4), other.A(i4));
        }
    }

    @fg.m
    public E r(long key, E value) {
        E i4 = i(key);
        if (i4 == null) {
            p(key, value);
        }
        return i4;
    }

    public void s(long key) {
        Object obj;
        Object obj2;
        int b5 = m.a.b(this.keys, this.size, key);
        if (b5 >= 0) {
            Object obj3 = this.values[b5];
            obj = f1.f2222a;
            if (obj3 != obj) {
                Object[] objArr = this.values;
                obj2 = f1.f2222a;
                objArr[b5] = obj2;
                this.garbage = true;
            }
        }
    }

    public boolean t(long key, E value) {
        int l4 = l(key);
        if (l4 < 0 || !kotlin.jvm.internal.l0.g(value, A(l4))) {
            return false;
        }
        u(l4);
        return true;
    }

    @fg.l
    public String toString() {
        if (z() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i4 = this.size;
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(o(i5));
            sb.append('=');
            E A = A(i5);
            if (A != sb) {
                sb.append(A);
            } else {
                sb.append("(this Map)");
            }
        }
        return c.a(sb, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public void u(int index) {
        Object obj;
        Object obj2;
        Object obj3 = this.values[index];
        obj = f1.f2222a;
        if (obj3 != obj) {
            Object[] objArr = this.values;
            obj2 = f1.f2222a;
            objArr[index] = obj2;
            this.garbage = true;
        }
    }

    @fg.m
    public E v(long key, E value) {
        int l4 = l(key);
        if (l4 < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e4 = (E) objArr[l4];
        objArr[l4] = value;
        return e4;
    }

    public boolean w(long key, E oldValue, E newValue) {
        int l4 = l(key);
        if (l4 < 0 || !kotlin.jvm.internal.l0.g(this.values[l4], oldValue)) {
            return false;
        }
        this.values[l4] = newValue;
        return true;
    }

    public void y(int index, E value) {
        int i4;
        Object obj;
        if (index < 0 || index >= (i4 = this.size)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("Expected index to be within 0..size()-1, but was ", index).toString());
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        this.values[index] = value;
    }

    public int z() {
        Object obj;
        if (this.garbage) {
            int i4 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                obj = f1.f2222a;
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.garbage = false;
            this.size = i5;
        }
        return this.size;
    }

    @kd.j
    public e1(int i4) {
        if (i4 == 0) {
            this.keys = m.a.f81461b;
            this.values = m.a.f81462c;
        } else {
            int f4 = m.a.f(i4);
            this.keys = new long[f4];
            this.values = new Object[f4];
        }
    }

    public /* synthetic */ e1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 10 : i4);
    }
}
