package androidx.compose.runtime.external.kotlinx.collections.immutable;

import fg.l;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ImmutableMap.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\tR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/d;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "U0", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/e;", "keys", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "values", "", "B2", "entries", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface d<K, V> extends Map<K, V>, md.a {
    @l
    e<Map.Entry<K, V>> B2();

    @l
    b<V> K();

    @l
    e<K> U0();
}
