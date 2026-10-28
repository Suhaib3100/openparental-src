package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.text.v;

/* compiled from: SaveableStateRegistry.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001d0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/saveable/j;", "Landroidx/compose/runtime/saveable/i;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lld/l;)V", "value", "a", "(Ljava/lang/Object;)Z", "key", "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "Landroidx/compose/runtime/saveable/i$a;", "c", "(Ljava/lang/String;Lld/a;)Landroidx/compose/runtime/saveable/i$a;", "e", "()Ljava/util/Map;", "Lld/l;", "", "b", "Ljava/util/Map;", "", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSaveableStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,159:1\n1#2:160\n361#3,7:161\n215#4,2:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateRegistry.kt\nandroidx/compose/runtime/saveable/SaveableStateRegistryImpl\n*L\n119#1:161,7\n134#1:168,2\n*E\n"})
/* loaded from: classes.dex */
final class j implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<Object, Boolean> canBeSaved;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, List<Object>> restored;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, List<ld.a<Object>>> valueProviders;

    /* compiled from: SaveableStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/saveable/j$a", "Landroidx/compose/runtime/saveable/i$a;", "Lkotlin/k2;", "a", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements i.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f17007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<Object> f17008c;

        a(String str, ld.a<? extends Object> aVar) {
            this.f17007b = str;
            this.f17008c = aVar;
        }

        @Override // androidx.compose.runtime.saveable.i.a
        public void a() {
            List list = (List) j.this.valueProviders.remove(this.f17007b);
            if (list != null) {
                list.remove(this.f17008c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            j.this.valueProviders.put(this.f17007b, list);
        }
    }

    public j(@fg.m Map<String, ? extends List<? extends Object>> map, @fg.l ld.l<Object, Boolean> lVar) {
        Map<String, List<Object>> J0;
        this.canBeSaved = lVar;
        this.restored = (map == null || (J0 = z0.J0(map)) == null) ? new LinkedHashMap<>() : J0;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.i
    public boolean a(@fg.l Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public i.a c(@fg.l String key, @fg.l ld.a<? extends Object> valueProvider) {
        if (v.S1(key)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map<String, List<ld.a<Object>>> map = this.valueProviders;
        List<ld.a<Object>> list = map.get(key);
        if (list == null) {
            list = new ArrayList<>();
            map.put(key, list);
        }
        list.add(valueProvider);
        return new a(key, valueProvider);
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.l
    public Map<String, List<Object>> e() {
        Map<String, List<Object>> J0 = z0.J0(this.restored);
        for (Map.Entry<String, List<ld.a<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<ld.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else {
                    if (!a(invoke)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    J0.put(key, w.s(invoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    Object invoke2 = value.get(i4).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    arrayList.add(invoke2);
                }
                J0.put(key, arrayList);
            }
        }
        return J0;
    }

    @Override // androidx.compose.runtime.saveable.i
    @fg.m
    public Object f(@fg.l String key) {
        List<Object> remove = this.restored.remove(key);
        if (remove == null || remove.isEmpty()) {
            return null;
        }
        if (remove.size() > 1) {
            this.restored.put(key, remove.subList(1, remove.size()));
        }
        return remove.get(0);
    }
}
