package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentIterators.kt */
@androidx.compose.runtime.internal.u(parameters = 4)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/w;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/v;", "", "<init>", "()V", "p", "()Ljava/util/Map$Entry;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w<K, V> extends v<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f16286f = 0;

    @Override // java.util.Iterator
    @fg.l
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        f();
        o(getIndex() + 2);
        return new b(getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
