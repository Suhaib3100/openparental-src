package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: NestedVectorStack.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/b1;", "T", "", "<init>", "()V", "", "a", "()Z", "b", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/g;", "vector", "Lkotlin/k2;", "c", "(Landroidx/compose/runtime/collection/g;)V", "", "I", "size", "", "[I", "currentIndexes", "", "[Landroidx/compose/runtime/collection/g;", "vectors", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,61:1\n523#2:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n44#1:62\n*E\n"})
/* loaded from: classes.dex */
public final class b1<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19177d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] currentIndexes = new int[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.runtime.collection.g<T>[] vectors = new androidx.compose.runtime.collection.g[16];

    public final boolean a() {
        int i4 = this.size;
        return i4 > 0 && this.currentIndexes[i4 - 1] >= 0;
    }

    public final T b() {
        int i4 = this.size;
        if (i4 <= 0) {
            throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
        }
        int i5 = i4 - 1;
        int i6 = this.currentIndexes[i5];
        androidx.compose.runtime.collection.g<T> gVar = this.vectors[i5];
        kotlin.jvm.internal.l0.m(gVar);
        if (i6 > 0) {
            this.currentIndexes[i5] = r3[i5] - 1;
        } else if (i6 == 0) {
            this.vectors[i5] = null;
            this.size--;
        }
        return gVar.L()[i6];
    }

    public final void c(@fg.l androidx.compose.runtime.collection.g<T> vector) {
        if (vector.U()) {
            return;
        }
        int i4 = this.size;
        int[] iArr = this.currentIndexes;
        if (i4 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.currentIndexes = copyOf;
            androidx.compose.runtime.collection.g<T>[] gVarArr = this.vectors;
            Object[] copyOf2 = Arrays.copyOf(gVarArr, gVarArr.length * 2);
            kotlin.jvm.internal.l0.o(copyOf2, "copyOf(this, newSize)");
            this.vectors = (androidx.compose.runtime.collection.g[]) copyOf2;
        }
        this.currentIndexes[i4] = vector.getSize() - 1;
        this.vectors[i4] = vector;
        this.size++;
    }
}
