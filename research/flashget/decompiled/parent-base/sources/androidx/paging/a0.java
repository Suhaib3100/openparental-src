package androidx.paging;

import androidx.paging.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.z0;

/* compiled from: ItemKeyedDataSource.kt */
@kotlin.k(message = "ItemKeyedDataSource is deprecated and has been replaced by PagingSource", replaceWith = @kotlin.x0(expression = "PagingSource<Key, Value>", imports = {"androidx.paging.PagingSource"}))
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\t\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u000423'4B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00018\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0012J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0081@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J+\u0010\u001e\u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001bH&¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010 H&¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\u001d2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010 H&¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0010¢\u0006\u0004\b'\u0010&JC\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001e\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100)¢\u0006\u0004\b+\u0010,JC\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u001e\u0010*\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100-¢\u0006\u0004\b.\u0010/J7\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020)¢\u0006\u0004\b0\u0010,J7\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010(*\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020-¢\u0006\u0004\b1\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Landroidx/paging/a0;", "", "Key", "Value", "Landroidx/paging/m;", "<init>", "()V", "Lkotlinx/coroutines/p;", "Landroidx/paging/m$a;", "androidx/paging/a0$f", "p", "(Lkotlinx/coroutines/p;)Landroidx/paging/a0$f;", "Landroidx/paging/m$f;", "params", "i", "(Landroidx/paging/m$f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "s", "(Ljava/util/List;)Ljava/lang/Object;", "r", "Landroidx/paging/a0$c;", "y", "(Landroidx/paging/a0$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/a0$d;", "w", "(Landroidx/paging/a0$d;Lkotlin/coroutines/d;)Ljava/lang/Object;", "u", "Landroidx/paging/a0$b;", "callback", "Lkotlin/k2;", "x", "(Landroidx/paging/a0$c;Landroidx/paging/a0$b;)V", "Landroidx/paging/a0$a;", "t", "(Landroidx/paging/a0$d;Landroidx/paging/a0$a;)V", "v", "item", "q", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "ToValue", "Li/a;", "function", "B", "(Li/a;)Landroidx/paging/a0;", "Lkotlin/Function1;", "C", "(Lld/l;)Landroidx/paging/a0;", "z", "A", "a", "b", "d", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a0<Key, Value> extends m<Key, Value> {

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/paging/a0$a;", "Value", "", "<init>", "()V", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a<Value> {
        public abstract void a(@fg.l List<? extends Value> data);
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/a0$b;", "Value", "Landroidx/paging/a0$a;", "<init>", "()V", "", "data", "", "position", "totalCount", "Lkotlin/k2;", "b", "(Ljava/util/List;II)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b<Value> extends a<Value> {
        public abstract void b(@fg.l List<? extends Value> data, int position, int totalCount);
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u0004\u0018\u00018\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/paging/a0$c;", "", "Key", "requestedInitialKey", "", "requestedLoadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "a", "Ljava/lang/Object;", "b", "I", "c", "Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class c<Key> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public final Key requestedInitialKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int requestedLoadSize;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean placeholdersEnabled;

        public c(@fg.m Key key, int i4, boolean z4) {
            this.requestedInitialKey = key;
            this.requestedLoadSize = i4;
            this.placeholdersEnabled = z4;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00028\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/a0$d;", "", "Key", "key", "", "requestedLoadSize", "<init>", "(Ljava/lang/Object;I)V", "a", "Ljava/lang/Object;", "b", "I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31437a;

        static {
            int[] iArr = new int[g0.values().length];
            iArr[g0.REFRESH.ordinal()] = 1;
            iArr[g0.PREPEND.ordinal()] = 2;
            iArr[g0.APPEND.ordinal()] = 3;
            f31437a = iArr;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/paging/a0$f", "Landroidx/paging/a0$a;", "", "data", "Lkotlin/k2;", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends a<Value> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<Value>> f31438a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<Key, Value> f31439b;

        /* JADX WARN: Multi-variable type inference failed */
        f(kotlinx.coroutines.p<? super m.a<Value>> pVar, a0<Key, Value> a0Var) {
            this.f31438a = pVar;
            this.f31439b = a0Var;
        }

        @Override // androidx.paging.a0.a
        public void a(@fg.l List<? extends Value> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f31438a;
            m.a aVar = new m.a(data, this.f31439b.s(data), this.f31439b.r(data), 0, 0, 24, null);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J-\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"androidx/paging/a0$g", "Landroidx/paging/a0$b;", "", "data", "", "position", "totalCount", "Lkotlin/k2;", "b", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;)V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g extends b<Value> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<m.a<Value>> f31440a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0<Key, Value> f31441b;

        /* JADX WARN: Multi-variable type inference failed */
        g(kotlinx.coroutines.p<? super m.a<Value>> pVar, a0<Key, Value> a0Var) {
            this.f31440a = pVar;
            this.f31441b = a0Var;
        }

        @Override // androidx.paging.a0.a
        public void a(@fg.l List<? extends Value> data) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f31440a;
            m.a aVar = new m.a(data, this.f31441b.s(data), this.f31441b.r(data), 0, 0, 24, null);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }

        @Override // androidx.paging.a0.b
        public void b(@fg.l List<? extends Value> data, int position, int totalCount) {
            kotlin.jvm.internal.l0.p(data, "data");
            kotlinx.coroutines.p<m.a<Value>> pVar = this.f31440a;
            m.a aVar = new m.a(data, this.f31441b.s(data), this.f31441b.r(data), position, (totalCount - data.size()) - position);
            z0.Companion companion = kotlin.z0.INSTANCE;
            pVar.resumeWith(aVar);
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i.a<Value, ToValue> f31442a;

        h(i.a<Value, ToValue> aVar) {
            this.f31442a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends Value> list2 = list;
            i.a<Value, ToValue> aVar = this.f31442a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<Value, ToValue> f31443a;

        /* JADX WARN: Multi-variable type inference failed */
        i(ld.l<? super Value, ? extends ToValue> lVar) {
            this.f31443a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> list) {
            kotlin.jvm.internal.l0.o(list, "list");
            List<? extends Value> list2 = list;
            ld.l<Value, ToValue> lVar = this.f31443a;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(lVar.invoke(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<List<? extends Value>, List<ToValue>> f31444a;

        /* JADX WARN: Multi-variable type inference failed */
        j(ld.l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
            this.f31444a = lVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> apply(List<? extends Value> it) {
            ld.l<List<? extends Value>, List<ToValue>> lVar = this.f31444a;
            kotlin.jvm.internal.l0.o(it, "it");
            return (List) lVar.invoke(it);
        }
    }

    public a0() {
        super(m.e.ITEM_KEYED);
    }

    public static final f o(a0 a0Var, kotlinx.coroutines.p pVar) {
        a0Var.getClass();
        return new f(pVar, a0Var);
    }

    private final f p(kotlinx.coroutines.p<? super m.a<Value>> pVar) {
        return new f(pVar, this);
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final <ToValue> a0<Key, ToValue> k(@fg.l ld.l<? super Value, ? extends ToValue> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new i(function));
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final <ToValue> a0<Key, ToValue> l(@fg.l i.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return new y1(this, function);
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final <ToValue> a0<Key, ToValue> m(@fg.l ld.l<? super List<? extends Value>, ? extends List<? extends ToValue>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new j(function));
    }

    @Override // androidx.paging.m
    @fg.l
    public Key c(@fg.l Value item) {
        kotlin.jvm.internal.l0.p(item, "item");
        return q(item);
    }

    @Override // androidx.paging.m
    @fg.m
    public final Object i(@fg.l m.f<Key> fVar, @fg.l kotlin.coroutines.d<? super m.a<Value>> dVar) {
        int i4 = e.f31437a[fVar.getType().ordinal()];
        if (i4 == 1) {
            return y(new c<>(fVar.b(), fVar.getInitialLoadSize(), fVar.getPlaceholdersEnabled()), dVar);
        }
        if (i4 == 2) {
            Key b5 = fVar.b();
            kotlin.jvm.internal.l0.m(b5);
            return w(new d<>(b5, fVar.getPageSize()), dVar);
        }
        if (i4 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Key b6 = fVar.b();
        kotlin.jvm.internal.l0.m(b6);
        return u(new d<>(b6, fVar.getPageSize()), dVar);
    }

    @fg.l
    public abstract Key q(@fg.l Value item);

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final Key r(@fg.l List<? extends Value> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        Object v32 = kotlin.collections.w.v3(list);
        if (v32 == null) {
            return null;
        }
        return (Key) q(v32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final Key s(@fg.l List<? extends Value> list) {
        kotlin.jvm.internal.l0.p(list, "<this>");
        Object G2 = kotlin.collections.w.G2(list);
        if (G2 == null) {
            return null;
        }
        return (Key) q(G2);
    }

    public abstract void t(@fg.l d<Key> params, @fg.l a<Value> callback);

    @fg.m
    @androidx.annotation.m1
    public final Object u(@fg.l d<Key> dVar, @fg.l kotlin.coroutines.d<? super m.a<Value>> dVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        qVar.e0();
        t(dVar, o(this, qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return y4;
    }

    public abstract void v(@fg.l d<Key> params, @fg.l a<Value> callback);

    @fg.m
    @androidx.annotation.m1
    public final Object w(@fg.l d<Key> dVar, @fg.l kotlin.coroutines.d<? super m.a<Value>> dVar2) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar2), 1);
        qVar.e0();
        v(dVar, o(this, qVar));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar2);
        }
        return y4;
    }

    public abstract void x(@fg.l c<Key> params, @fg.l b<Value> callback);

    @fg.m
    @androidx.annotation.m1
    public final Object y(@fg.l c<Key> cVar, @fg.l kotlin.coroutines.d<? super m.a<Value>> dVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        qVar.e0();
        x(cVar, new g(qVar, this));
        Object y4 = qVar.y();
        if (y4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }

    @Override // androidx.paging.m
    @fg.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final <ToValue> a0<Key, ToValue> j(@fg.l i.a<Value, ToValue> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new h(function));
    }
}
