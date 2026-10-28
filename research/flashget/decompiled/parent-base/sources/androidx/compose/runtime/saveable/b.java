package androidx.compose.runtime.saveable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import ld.p;

/* compiled from: MapSaver.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u007f\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\r\"\u0004\b\u0000\u0010\u00002:\u0010\n\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0001¢\u0006\u0002\b\t2\"\u0010\f\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/n;", "Lkotlin/r0;", "name", "value", "", "", "", "Lkotlin/u;", "save", "Lkotlin/Function1;", "restore", "Landroidx/compose/runtime/saveable/l;", "a", "(Lld/p;Lld/l;)Landroidx/compose/runtime/saveable/l;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MapSaver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/runtime/saveable/n;", "it", "", "", "a", "(Landroidx/compose/runtime/saveable/n;Ljava/lang/Object;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,55:1\n215#2,2:56\n*S KotlinDebug\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$1\n*L\n36#1:56,2\n*E\n"})
    static final class a<T> extends n0 implements p<n, T, List<? extends Object>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<n, T, Map<String, Object>> f16961b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super n, ? super T, ? extends Map<String, ? extends Object>> pVar) {
            super(2);
            this.f16961b = pVar;
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(@fg.l n nVar, T t4) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Object> entry : this.f16961b.invoke(nVar, t4).entrySet()) {
                arrayList.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: MapSaver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "", "list", "a", "(Ljava/util/List;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nMapSaver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapSaver.kt\nandroidx/compose/runtime/saveable/MapSaverKt$mapSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
    /* renamed from: androidx.compose.runtime.saveable.b$b, reason: collision with other inner class name */
    static final class C0322b<T> extends n0 implements ld.l<List<? extends Object>, T> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Map<String, ? extends Object>, T> f16962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0322b(ld.l<? super Map<String, ? extends Object>, ? extends T> lVar) {
            super(1);
            this.f16962b = lVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T invoke(@fg.l List<? extends Object> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (list.size() % 2 != 0) {
                throw new IllegalStateException("non-zero remainder");
            }
            for (int i4 = 0; i4 < list.size(); i4 += 2) {
                Object obj = list.get(i4);
                l0.n(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, list.get(i4 + 1));
            }
            return this.f16962b.invoke(linkedHashMap);
        }
    }

    @fg.l
    public static final <T> l<T, Object> a(@fg.l p<? super n, ? super T, ? extends Map<String, ? extends Object>> pVar, @fg.l ld.l<? super Map<String, ? extends Object>, ? extends T> lVar) {
        return androidx.compose.runtime.saveable.a.a(new a(pVar), new C0322b(lVar));
    }
}
