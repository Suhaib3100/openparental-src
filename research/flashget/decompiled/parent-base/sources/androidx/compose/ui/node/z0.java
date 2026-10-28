package androidx.compose.ui.node;

import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MutableVectorWithMutationTracking.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0013H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/node/z0;", "T", "", "Landroidx/compose/runtime/collection/g;", "vector", "Lkotlin/Function0;", "Lkotlin/k2;", "onVectorMutated", "<init>", "(Landroidx/compose/runtime/collection/g;Lld/a;)V", "c", "()V", "", "index", "element", "a", "(ILjava/lang/Object;)V", "i", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "block", "d", "(Lld/l;)V", "", "b", "()Ljava/util/List;", "e", "Landroidx/compose/runtime/collection/g;", "h", "()Landroidx/compose/runtime/collection/g;", "Lld/a;", "f", "()Lld/a;", "g", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,54:1\n460#2,11:55\n523#2:66\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n48#1:55,11\n52#1:66\n*E\n"})
/* loaded from: classes.dex */
public final class z0<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19536c = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<T> vector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> onVectorMutated;

    public z0(@fg.l androidx.compose.runtime.collection.g<T> gVar, @fg.l ld.a<k2> aVar) {
        this.vector = gVar;
        this.onVectorMutated = aVar;
    }

    public final void a(int index, T element) {
        this.vector.a(index, element);
        this.onVectorMutated.invoke();
    }

    @fg.l
    public final List<T> b() {
        return this.vector.l();
    }

    public final void c() {
        this.vector.m();
        this.onVectorMutated.invoke();
    }

    public final void d(@fg.l ld.l<? super T, k2> block) {
        androidx.compose.runtime.collection.g<T> gVar = this.vector;
        int size = gVar.getSize();
        if (size > 0) {
            T[] L = gVar.L();
            int i4 = 0;
            do {
                block.invoke(L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    public final T e(int index) {
        return this.vector.L()[index];
    }

    @fg.l
    public final ld.a<k2> f() {
        return this.onVectorMutated;
    }

    public final int g() {
        return this.vector.getSize();
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<T> h() {
        return this.vector;
    }

    public final T i(int index) {
        T n02 = this.vector.n0(index);
        this.onVectorMutated.invoke();
        return n02;
    }
}
