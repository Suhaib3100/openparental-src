package androidx.compose.runtime.external.kotlinx.collections.immutable;

import fg.l;
import java.util.Collection;
import kotlin.Metadata;

/* compiled from: ImmutableCollection.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0011\u0010\tJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "element", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "remove", "removeAll", "Lkotlin/Function1;", "", "predicate", "n", "(Lld/l;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "retainAll", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface f<E> extends b<E> {

    /* compiled from: ImmutableCollection.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/f$a;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/f;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<E> extends Collection<E>, md.b {
        @l
        f<E> a();
    }

    @Override // java.util.Collection
    @l
    f<E> add(E element);

    @Override // java.util.Collection
    @l
    f<E> addAll(@l Collection<? extends E> elements);

    @Override // java.util.Collection
    @l
    f<E> clear();

    @l
    a<E> g();

    @l
    f<E> n(@l ld.l<? super E, Boolean> predicate);

    @Override // java.util.Collection
    @l
    f<E> remove(E element);

    @Override // java.util.Collection
    @l
    f<E> removeAll(@l Collection<? extends E> elements);

    @Override // java.util.Collection
    @l
    f<E> retainAll(@l Collection<? extends E> elements);
}
