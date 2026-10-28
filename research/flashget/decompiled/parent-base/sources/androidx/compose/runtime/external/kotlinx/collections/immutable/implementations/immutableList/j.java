package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.g;
import androidx.compose.runtime.internal.u;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: SmallPersistentVector.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00010B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u001cJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u001dJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010$J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b+\u0010\u001dR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/j;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/b;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "", "size", "f", "(I)[Ljava/lang/Object;", "element", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Lkotlin/Function1;", "", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "B0", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "e", "[Ljava/lang/Object;", "b", "()I", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/* loaded from: classes.dex */
public final class j<E> extends b<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.c<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f16213g = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] buffer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final j f16214h = new j(new Object[0]);

    /* compiled from: SmallPersistentVector.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/j$a;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/j;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/j;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/j;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.j$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final j a() {
            return j.f16214h;
        }

        public Companion(w wVar) {
        }
    }

    public j(@fg.l Object[] objArr) {
        this.buffer = objArr;
        int length = objArr.length;
    }

    private final Object[] f(int size) {
        return new Object[size];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> B0(int index) {
        f0.e.a(index, getSize());
        if (getSize() == 1) {
            return f16214h;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, getSize() - 1);
        l0.o(copyOf, "copyOf(this, newSize)");
        kotlin.collections.l.B0(this.buffer, copyOf, index, index + 1, getSize());
        return new j(copyOf);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(int index, E element) {
        f0.e.b(index, getSize());
        if (index == getSize()) {
            return add((j<E>) element);
        }
        if (getSize() < 32) {
            Object[] objArr = new Object[getSize() + 1];
            kotlin.collections.l.K0(this.buffer, objArr, 0, 0, index, 6, null);
            kotlin.collections.l.B0(this.buffer, objArr, index + 1, index, getSize());
            objArr[index] = element;
            return new j(objArr);
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        l0.o(copyOf, "copyOf(this, size)");
        kotlin.collections.l.B0(this.buffer, copyOf, index + 1, index, getSize() - 1);
        copyOf[index] = element;
        return new e(copyOf, l.c(this.buffer[31]), getSize() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(int index, @fg.l Collection<? extends E> c5) {
        f0.e.b(index, getSize());
        if (c5.size() + getSize() > 32) {
            g.a<E> g4 = g();
            g4.addAll(index, c5);
            return g4.a();
        }
        Object[] objArr = new Object[c5.size() + getSize()];
        kotlin.collections.l.K0(this.buffer, objArr, 0, 0, index, 6, null);
        kotlin.collections.l.B0(this.buffer, objArr, c5.size() + index, index, getSize());
        Iterator<? extends E> it = c5.iterator();
        while (it.hasNext()) {
            objArr[index] = it.next();
            index++;
        }
        return new j(objArr);
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    /* renamed from: b */
    public int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int index) {
        f0.e.a(index, getSize());
        return (E) this.buffer[index];
    }

    @Override // kotlin.collections.c, java.util.List
    public int indexOf(Object element) {
        return kotlin.collections.l.If(this.buffer, element);
    }

    @Override // kotlin.collections.c, java.util.List
    public int lastIndexOf(Object element) {
        return kotlin.collections.l.Mh(this.buffer, element);
    }

    @Override // kotlin.collections.c, java.util.List
    @fg.l
    public ListIterator<E> listIterator(int index) {
        f0.e.b(index, getSize());
        return new c(this.buffer, index, getSize());
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> set(int index, E element) {
        f0.e.a(index, getSize());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[index] = element;
        return new j(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public g.a<E> g() {
        return new f(this, null, this.buffer, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> n(@fg.l ld.l<? super E, Boolean> predicate) {
        Object[] objArr = this.buffer;
        int size = getSize();
        int size2 = getSize();
        boolean z4 = false;
        for (int i4 = 0; i4 < size2; i4++) {
            Object obj = this.buffer[i4];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z4) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    l0.o(objArr, "copyOf(this, size)");
                    z4 = true;
                    size = i4;
                }
            } else if (z4) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == getSize() ? this : size == 0 ? f16214h : new j(kotlin.collections.l.l1(objArr, 0, size));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.b, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> addAll(@fg.l Collection<? extends E> elements) {
        if (elements.size() + getSize() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, elements.size() + getSize());
            l0.o(copyOf, "copyOf(this, newSize)");
            int size = getSize();
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new j(copyOf);
        }
        g.a<E> g4 = g();
        g4.addAll(elements);
        return g4.a();
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.g, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @fg.l
    public androidx.compose.runtime.external.kotlinx.collections.immutable.g<E> add(E element) {
        if (getSize() < 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, getSize() + 1);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[getSize()] = element;
            return new j(copyOf);
        }
        return new e(this.buffer, l.c(element), getSize() + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.f add(Object obj) {
        return add((j<E>) obj);
    }
}
