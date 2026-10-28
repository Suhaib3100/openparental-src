package androidx.paging;

import androidx.paging.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.z0;

/* compiled from: PageKeyedDataSource.kt */
@kotlin.k(message = "PageKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.x0(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u000467#2B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ7\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00142\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H&¢\u0006\u0004\b\u001f\u0010 J1\u0010!\u001a\u00020\u001c2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H&¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0010¢\u0006\u0004\b#\u0010$JC\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010%*\u00020\u00012\u001e\u0010(\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020'0&¢\u0006\u0004\b)\u0010*JC\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010%*\u00020\u00012\u001e\u0010(\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020'0+¢\u0006\u0004\b,\u0010-J7\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010%*\u00020\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&¢\u0006\u0004\b.\u0010*J7\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010%*\u00020\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020+¢\u0006\u0004\b/\u0010-R \u00105\u001a\u00020\u00128\u0010X\u0090D¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0006\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Landroidx/paging/q0;", "", "Key", "Value", "Landroidx/paging/m;", "<init>", "()V", "Landroidx/paging/q0$c;", "params", "Landroidx/paging/m$a;", "y", "(Landroidx/paging/q0$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/q0$d;", "w", "(Landroidx/paging/q0$d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "u", "Lkotlinx/coroutines/p;", "continuation", "", "isAppend", "Landroidx/paging/q0$a;", "s", "(Lkotlinx/coroutines/p;Z)Landroidx/paging/q0$a;", "Landroidx/paging/m$f;", "i", "(Landroidx/paging/m$f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/q0$b;", "callback", "Lkotlin/k2;", "z", "(Landroidx/paging/q0$c;Landroidx/paging/q0$b;)V", "x", "(Landroidx/paging/q0$d;Landroidx/paging/q0$a;)V", "v", "item", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "ToValue", "Li/a;", "", "function", "C", "(Li/a;)Landroidx/paging/q0;", "Lkotlin/Function1;", "D", "(Lld/l;)Landroidx/paging/q0;", "A", "B", "f", "Z", "d", "()Z", "t", "supportsPageDropping", "a", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class q0<Key, Value> extends m<Key, Value> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsPageDropping;

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/q0$a;", "Key", "Value", "", "<init>", "()V", "", "data", "adjacentPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a<Key, Value> {
        public abstract void a(@fg.l List<? extends Value> data, @fg.m Key adjacentPageKey);
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\f\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0010\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00030\u00062\b\u0010\u000b\u001a\u0004\u0018\u00018\u00022\b\u0010\f\u001a\u0004\u0018\u00018\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/paging/q0$b;", "Key", "Value", "", "<init>", "()V", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b<Key, Value> {
        public abstract void a(@fg.l List<? extends Value> data, int position, int totalCount, @fg.m Key previousPageKey, @fg.m Key nextPageKey);

        public abstract void b(@fg.l List<? extends Value> data, @fg.m Key previousPageKey, @fg.m Key nextPageKey);
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/q0$c;", "", "Key", "", "requestedLoadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "a", "I", "b", "Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c<Key> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int requestedLoadSize;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean placeholdersEnabled;

        public c(int i4, boolean z4) {
            this.requestedLoadSize = i4;
            this.placeholdersEnabled = z4;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/q0$d;", "", "Key", "key", "", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "a", "Ljava/lang/Object;", "b", "I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class d<Key> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final Key key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int requestedLoadSize;

        public d(@fg.l Key key, int i4) {
            kotlin.jvm.internal.l0.p(key, "key");
            this.key = key;
            this.requestedLoadSize = i4;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/paging/q0$e", "Landroidx/paging/q0$a;", "", "data", "adjacentPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e extends a<Key, Value> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<Value>> f32240a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f32241b;

        /* JADX WARN: Multi-variable type inference failed */
        e(kotlinx.coroutines.p<? super m.a<Value>> pVar, boolean z4) {
            this.f32240a = pVar;
            this.f32241b = z4;
        }

        @Override // androidx.paging.q0.a
        public void a(@fg.l List<? extends Value> data, @fg.m Key adjacentPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f32240a;
            boolean z4 = this.f32241b;
            m.a aVar = new m.a(data, z4 ? null : adjacentPageKey, z4 ? adjacentPageKey : null, 0, 0, 24, null);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001JA\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/paging/q0$f", "Landroidx/paging/q0$b;", "", "data", "", "position", "totalCount", "previousPageKey", "nextPageKey", "Lkotlin/k2;", "a", "(Ljava/util/List;IILjava/lang/Object;Ljava/lang/Object;)V", "b", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends b<Key, Value> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<Value>> f32242a;

        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.p<? super m.a<Value>> pVar) {
            this.f32242a = pVar;
        }

        @Override // androidx.paging.q0.b
        public void a(@fg.l List<? extends Value> data, int position, int totalCount, @fg.m Key previousPageKey, @fg.m Key nextPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f32242a;
            m.a aVar = new m.a(data, previousPageKey, nextPageKey, position, (totalCount - data.size()) - position);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }

        @Override // androidx.paging.q0.b
        public void b(@fg.l List<? extends Value> data, @fg.m Key previousPageKey, @fg.m Key nextPageKey) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f32242a;
            m.a aVar = new m.a(data, previousPageKey, nextPageKey, 0, 0, 24, null);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class g<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a<Value, ToValue> f32243a;

        g(i.a<Value, ToValue> aVar) {
            this.f32243a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends Value> list2 = list;
            i.a<Value, ToValue> aVar = this.f32243a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<Value, ToValue> f32244a;

        /* JADX WARN: Multi-variable type inference failed */
        h(ld.l<? super Value, ? extends ToValue> lVar) {
            this.f32244a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends Value> list2 = list;
            ld.l<Value, ToValue> lVar = this.f32244a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<List<? extends Value>, List<ToValue>> f32245a;

        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
            this.f32245a = lVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> it) {
            ld.l<List<? extends Value>, List<ToValue>> lVar = this.f32245a;
            kotlin.jvm.internal.l0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public q0() {
        super(m.e.PAGE_KEYED);
    }

    public static final a o(q0 q0Var, kotlinx.coroutines.p pVar, boolean z4) {
        q0Var.getClass();
        return new e(pVar, z4);
    }

    private final a<Key, Value> s(kotlinx.coroutines.p<? super m.a<Value>> continuation, boolean isAppend) {
        return new e(continuation, isAppend);
    }

    public static /* synthetic */ void t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(d<Key> dVar, kotlin.coroutines.d<? super m.a<Value>> dVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        qVar.e0();
        v(dVar, o(this, qVar, true));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return y4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(d<Key> dVar, kotlin.coroutines.d<? super m.a<Value>> dVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        qVar.e0();
        x(dVar, o(this, qVar, false));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return y4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(c<Key> cVar, kotlin.coroutines.d<? super m.a<Value>> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        z(cVar, new f(qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <ToValue> q0<Key, ToValue> j(@fg.l i.a<Value, ToValue> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new g(function));
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final <ToValue> q0<Key, ToValue> k(@fg.l ld.l<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new h(function));
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final <ToValue> q0<Key, ToValue> l(@fg.l i.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return new z1(this, function);
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final <ToValue> q0<Key, ToValue> m(@fg.l ld.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new i(function));
    }

    @Override // androidx.paging.m
    @fg.l
    public Key c(@fg.l Value item) {
        kotlin.jvm.internal.l0.p(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.m
    /* renamed from: d, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    @Override // androidx.paging.m
    @fg.m
    public final Object i(@fg.l m.f<Key> fVar, @fg.l kotlin.coroutines.d<? super m.a<Value>> dVar) {
        if (fVar.getType() == g0.REFRESH) {
            return y(new c<>(fVar.getInitialLoadSize(), fVar.getPlaceholdersEnabled()), dVar);
        }
        if (fVar.b() == null) {
            return m.a.INSTANCE.b();
        }
        if (fVar.getType() == g0.PREPEND) {
            return w(new d<>(fVar.b(), fVar.getPageSize()), dVar);
        }
        if (fVar.getType() == g0.APPEND) {
            return u(new d<>(fVar.b(), fVar.getPageSize()), dVar);
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.l0.C("Unsupported type ", fVar.getType()));
    }

    public abstract void v(@fg.l d<Key> params, @fg.l a<Key, Value> callback);

    public abstract void x(@fg.l d<Key> params, @fg.l a<Key, Value> callback);

    public abstract void z(@fg.l c<Key> params, @fg.l b<Key, Value> callback);
}
