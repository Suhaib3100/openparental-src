package androidx.compose.runtime.external.kotlinx.collections.immutable;

import fg.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ImmutableMap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0013J+\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\u0007J1\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/d;", "key", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "", "m", "putAll", "(Ljava/util/Map;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "clear", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "g", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface h<K, V> extends d<K, V> {

    /* compiled from: ImmutableMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/h$a;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "a", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/h;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a<K, V> extends Map<K, V>, md.g {
        @l
        h<K, V> a();
    }

    @Override // java.util.Map
    @l
    h<K, V> clear();

    @l
    a<K, V> g();

    @Override // java.util.Map
    @l
    h<K, V> put(K key, V value);

    @Override // java.util.Map
    @l
    h<K, V> putAll(@l Map<? extends K, ? extends V> m4);

    @Override // java.util.Map
    @l
    h<K, V> remove(K key);

    @Override // java.util.Map
    @l
    h<K, V> remove(K key, V value);
}
