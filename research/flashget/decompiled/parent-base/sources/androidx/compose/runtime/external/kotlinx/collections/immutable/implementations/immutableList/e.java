package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.u;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: PersistentVector.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!J5\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#JA\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)JA\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016¢\u0006\u0004\b8\u00109J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010/R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010@R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010@R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u000eR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010B¨\u0006D"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/e;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "", "", "root", "tail", "", "size", "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "s", "()I", "filledTail", "newTail", "m", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/e;", "shift", "p", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "tailIndex", "element", "i", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/e;", "index", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;", "elementCarry", "h", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)[Ljava/lang/Object;", "rootSize", "r", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "l", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "tailCarry", "j", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/d;)[Ljava/lang/Object;", "q", "c", "(I)[Ljava/lang/Object;", "e", "v", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "B0", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Lkotlin/Function1;", "", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "f", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/f;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "[Ljava/lang/Object;", "g", "I", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* loaded from: classes.dex */
public final class e<E> extends b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f16187i = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] root;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] tail;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int rootShift;

    public e(@fg.l Object[] objArr, @fg.l Object[] objArr2, int i4, int i5) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i4;
        this.rootShift = i5;
        if (getSize() <= 32) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + getSize()).toString());
        }
        getSize();
        l.d(getSize());
        int length = objArr2.length;
    }

    private final Object[] c(int index) {
        if (s() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i4 = this.rootShift; i4 > 0; i4 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i4)];
            l0.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object[] copyOf;
        int a5 = l.a(index, shift);
        if (shift == 0) {
            if (a5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(root, 32);
                l0.o(copyOf, "copyOf(this, newSize)");
            }
            kotlin.collections.l.B0(root, copyOf, a5 + 1, a5, 31);
            elementCarry.b(root[31]);
            copyOf[a5] = element;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(root, 32);
        l0.o(copyOf2, "copyOf(this, newSize)");
        int i4 = shift - 5;
        Object obj = root[a5];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a5] = h((Object[]) obj, i4, index, element, elementCarry);
        int i5 = a5 + 1;
        while (i5 < 32 && copyOf2[i5] != null) {
            Object obj2 = root[i5];
            l0.n(obj2, str);
            Object[] objArr = copyOf2;
            objArr[i5] = h((Object[]) obj2, i4, 0, elementCarry.getValue(), elementCarry);
            i5++;
            copyOf2 = objArr;
            str = str;
        }
        return copyOf2;
    }

    private final e<E> i(Object[] root, int tailIndex, Object element) {
        int size = getSize() - s();
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            kotlin.collections.l.B0(this.tail, copyOf, tailIndex + 1, tailIndex, size);
            copyOf[tailIndex] = element;
            return new e<>(root, copyOf, getSize() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        kotlin.collections.l.B0(objArr, copyOf, tailIndex + 1, tailIndex, size - 1);
        copyOf[tailIndex] = element;
        return m(root, copyOf, l.c(obj));
    }

    private final Object[] j(Object[] root, int shift, int index, d tailCarry) {
        Object[] j4;
        int a5 = l.a(index, shift);
        if (shift == 5) {
            tailCarry.b(root[a5]);
            j4 = null;
        } else {
            Object obj = root[a5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            j4 = j((Object[]) obj, shift - 5, index, tailCarry);
        }
        if (j4 == null && a5 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(root, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        copyOf[a5] = j4;
        return copyOf;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> l(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = Arrays.copyOf(root, 32);
                l0.o(root, "copyOf(this, newSize)");
            }
            return new j(root);
        }
        d dVar = new d(null);
        Object[] j4 = j(root, shift, rootSize - 1, dVar);
        l0.m(j4);
        Object value = dVar.getValue();
        l0.n(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        if (j4[1] != null) {
            return new e(j4, objArr, rootSize, shift);
        }
        Object obj = j4[0];
        l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj, objArr, rootSize, shift - 5);
    }

    private final e<E> m(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = getSize() >> 5;
        int i4 = this.rootShift;
        if (size <= (1 << i4)) {
            return new e<>(p(root, i4, filledTail), newTail, getSize() + 1, this.rootShift);
        }
        Object[] c5 = l.c(root);
        int i5 = this.rootShift + 5;
        return new e<>(p(c5, i5, filledTail), newTail, getSize() + 1, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object[] p(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.getSize()
            int r0 = r0 + (-1)
            int r0 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L19
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.l0.o(r4, r2)
            if (r4 != 0) goto L1b
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r5 != r1) goto L21
            r4[r0] = r6
            goto L2c
        L21:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.p(r2, r5, r6)
            r4[r0] = r5
        L2c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.e.p(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] q(Object[] root, int shift, int index, d tailCarry) {
        Object[] copyOf;
        int a5 = l.a(index, shift);
        if (shift == 0) {
            if (a5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(root, 32);
                l0.o(copyOf, "copyOf(this, newSize)");
            }
            kotlin.collections.l.B0(root, copyOf, a5, a5 + 1, 32);
            copyOf[31] = tailCarry.getValue();
            tailCarry.b(root[a5]);
            return copyOf;
        }
        int a6 = root[31] == null ? l.a(s() - 1, shift) : 31;
        Object[] copyOf2 = Arrays.copyOf(root, 32);
        l0.o(copyOf2, "copyOf(this, newSize)");
        int i4 = shift - 5;
        int i5 = a5 + 1;
        if (i5 <= a6) {
            while (true) {
                Object obj = copyOf2[a6];
                l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a6] = q((Object[]) obj, i4, 0, tailCarry);
                if (a6 == i5) {
                    break;
                }
                a6--;
            }
        }
        Object obj2 = copyOf2[a5];
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a5] = q((Object[]) obj2, i4, index, tailCarry);
        return copyOf2;
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> r(Object[] root, int rootSize, int shift, int index) {
        int size = getSize() - rootSize;
        if (size == 1) {
            return l(root, rootSize, shift);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        int i4 = size - 1;
        if (index < i4) {
            kotlin.collections.l.B0(this.tail, copyOf, index, index + 1, size);
        }
        copyOf[i4] = null;
        return new e(root, copyOf, (rootSize + size) - 1, shift);
    }

    private final int s() {
        return l.d(getSize());
    }

    private final Object[] v(Object[] root, int shift, int index, Object e4) {
        int a5 = l.a(index, shift);
        Object[] copyOf = Arrays.copyOf(root, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        if (shift == 0) {
            copyOf[a5] = e4;
        } else {
            Object obj = copyOf[a5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a5] = v((Object[]) obj, shift - 5, index, e4);
        }
        return copyOf;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> B0(int index) {
        f0.e.a(index, getSize());
        int s4 = s();
        return index >= s4 ? r(this.root, s4, this.rootShift, index - s4) : r(q(this.root, this.rootShift, index, new d(this.tail[0])), s4, this.rootShift, 0);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int index, E element) {
        f0.e.b(index, getSize());
        if (index == getSize()) {
            return add((e<E>) element);
        }
        int s4 = s();
        if (index >= s4) {
            return i(this.root, index - s4, element);
        }
        d dVar = new d(null);
        return i(h(this.root, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f<E> g() {
        return new f<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int index) {
        f0.e.a(index, getSize());
        return (E) c(index)[index & 31];
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.l
    public ListIterator<E> listIterator(int index) {
        f0.e.b(index, getSize());
        return new g(this.root, this.tail, index, getSize(), (this.rootShift / 5) + 1);
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int index, E element) {
        f0.e.a(index, getSize());
        if (s() > index) {
            return new e(v(this.root, this.rootShift, index, element), this.tail, getSize(), this.rootShift);
        }
        Object[] copyOf = Arrays.copyOf(this.tail, 32);
        l0.o(copyOf, "copyOf(this, newSize)");
        copyOf[index & 31] = element;
        return new e(this.root, copyOf, getSize(), this.rootShift);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> n(@fg.l ld.l<? super E, Boolean> predicate) {
        f<E> g4 = g();
        g4.U(predicate);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E element) {
        int size = getSize() - s();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.tail, 32);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[size] = element;
            return new e(this.root, copyOf, getSize() + 1, this.rootShift);
        }
        return m(this.root, this.tail, l.c(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.f add(Object obj) {
        return add((e<E>) obj);
    }
}
