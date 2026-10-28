package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import fg.l;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ImmutableList.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001 J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/c;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "set", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "B0", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface g<E> extends c<E>, f<E> {

    /* compiled from: ImmutableList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/g$a;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/g;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<E> extends List<E>, f.a<E>, md.e {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
        @l
        g<E> a();
    }

    @l
    g<E> B0(int index);

    @Override // java.util.List
    @l
    g<E> add(int index, E element);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> add(E element);

    @Override // java.util.List
    @l
    g<E> addAll(int index, @l Collection<? extends E> c5);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> addAll(@l Collection<? extends E> elements);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> clear();

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    a<E> g();

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> n(@l ld.l<? super E, Boolean> predicate);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> remove(E element);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> removeAll(@l Collection<? extends E> elements);

    @Override // java.util.List, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    g<E> retainAll(@l Collection<? extends E> elements);

    @Override // java.util.List
    @l
    g<E> set(int index, E element);
}
