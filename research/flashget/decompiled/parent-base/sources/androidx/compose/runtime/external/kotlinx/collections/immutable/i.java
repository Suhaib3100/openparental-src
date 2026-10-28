package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.f;
import fg.l;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: ImmutableSet.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&¢\u0006\u0004\b\u0012\u0010\nJ\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface i<E> extends e<E>, f<E> {

    /* compiled from: ImmutableSet.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<E> extends Set<E>, f.a<E>, md.h {
        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f.a
        @l
        i<E> a();
    }

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> add(E element);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> addAll(@l Collection<? extends E> elements);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> clear();

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    a<E> g();

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> n(@l ld.l<? super E, Boolean> predicate);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> remove(E element);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> removeAll(@l Collection<? extends E> elements);

    @Override // java.util.Set, java.util.Collection, androidx.compose.runtime.external.kotlinx.collections.immutable.f
    @l
    i<E> retainAll(@l Collection<? extends E> elements);
}
