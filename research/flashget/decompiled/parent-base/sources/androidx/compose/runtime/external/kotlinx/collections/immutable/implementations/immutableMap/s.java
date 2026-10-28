package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PersistentHashMapContentViews.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/s;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/b;", "Lkotlin/collections/a;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "b", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/d;", "", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s<K, V> extends kotlin.collections.a<V> implements androidx.compose.runtime.external.kotlinx.collections.immutable.b<V> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16269c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d<K, V> map;

    public s(@fg.l d<K, V> dVar) {
        this.map = dVar;
    }

    @Override // kotlin.collections.a
    /* renamed from: b */
    public int get_size() {
        return this.map.getSize();
    }

    @Override // kotlin.collections.a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.map.containsValue(element);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @fg.l
    public Iterator<V> iterator() {
        return new t(this.map.t());
    }
}
