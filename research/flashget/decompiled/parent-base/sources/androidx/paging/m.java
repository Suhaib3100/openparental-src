package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DataSource.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 $*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0006\u0016'!/$\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJE\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n0\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ9\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0000\"\b\b\u0002\u0010\b*\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH @ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H ¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020*8\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\u00020*8\u0010X\u0090D¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b/\u0010-R\u0014\u00103\u001a\u0002018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u00102R\u0014\u00105\u001a\u00020*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00066"}, d2 = {"Landroidx/paging/m;", "", "Key", "Value", "Landroidx/paging/m$e;", "type", "<init>", "(Landroidx/paging/m$e;)V", "ToValue", "Li/a;", "", "function", "l", "(Li/a;)Landroidx/paging/m;", "Lkotlin/Function1;", "m", "(Lld/l;)Landroidx/paging/m;", "j", "k", "Landroidx/paging/m$d;", "onInvalidatedCallback", "Lkotlin/k2;", "a", "(Landroidx/paging/m$d;)V", "n", "f", "()V", "Landroidx/paging/m$f;", "params", "Landroidx/paging/m$a;", "i", "(Landroidx/paging/m$f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "item", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/paging/m$e;", "e", "()Landroidx/paging/m$e;", "Landroidx/paging/y;", "b", "Landroidx/paging/y;", "invalidateCallbackTracker", "", "Z", "g", "()Z", "isContiguous", "d", "supportsPageDropping", "", "()I", "invalidateCallbackCount", "h", "isInvalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class m<Key, Value> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y<d> invalidateCallbackTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isContiguous;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsPageDropping;

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u0007\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u00052\u001e\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/m$b;", "", "<init>", "()V", "A", "B", "Li/a;", "", "function", "source", "a", "(Li/a;Ljava/util/List;)Ljava/util/List;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: androidx.paging.m$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final <A, B> List<B> a(@fg.l i.a<List<A>, List<B>> function, @fg.l List<? extends A> source) {
            kotlin.jvm.internal.l0.p(function, "function");
            kotlin.jvm.internal.l0.p(source, "source");
            List<B> dest = function.apply(source);
            if (dest.size() == source.size()) {
                kotlin.jvm.internal.l0.o(dest, "dest");
                return dest;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\t*\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\nH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\t*\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\t*\u00020\u00012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u00110\nH\u0016¢\u0006\u0004\b\u0012\u0010\rJE\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00040\u0000\"\b\b\u0004\u0010\t*\u00020\u00012\u001e\u0010\u000b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u00110\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J+\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00170\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/paging/m$c;", "", "Key", "Value", "<init>", "()V", "Landroidx/paging/m;", "d", "()Landroidx/paging/m;", "ToValue", "Li/a;", "function", "e", "(Li/a;)Landroidx/paging/m$c;", "Lkotlin/Function1;", "f", "(Lld/l;)Landroidx/paging/m$c;", "", "g", "h", "Lkotlinx/coroutines/m0;", "fetchDispatcher", "Lkotlin/Function0;", "Landroidx/paging/b1;", "b", "(Lkotlinx/coroutines/m0;)Lld/a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class c<Key, Value> {

        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0001*\u00020\u0000\"\b\b\u0003\u0010\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "<anonymous>", "()Landroidx/paging/b1;"}, k = 3, mv = {1, 5, 1})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<b1<Key, Value>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.m0 f31916b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f31917c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.m0 m0Var, c<Key, Value> cVar) {
                super(0);
                this.f31916b = m0Var;
                this.f31917c = cVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b1<Key, Value> invoke() {
                return new d0(this.f31916b, this.f31917c.d());
            }
        }

        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0004\"\b\b\u0004\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class b<I, O> implements i.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i.a<Value, ToValue> f31918a;

            b(i.a<Value, ToValue> aVar) {
                this.f31918a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // i.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<ToValue> apply(List<? extends Value> list) {
                kotlin.jvm.internal.l0.o(list, "list");
                List<? extends Value> list2 = list;
                i.a<Value, ToValue> aVar = this.f31918a;
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(aVar.apply(it.next()));
                }
                return arrayList;
            }
        }

        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0004\"\b\b\u0004\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.m$c$c, reason: collision with other inner class name */
        static final class C0547c<I, O> implements i.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ld.l<Value, Object> f31919a;

            /* JADX WARN: Multi-variable type inference failed */
            C0547c(ld.l<? super Value, Object> lVar) {
                this.f31919a = lVar;
            }

            @Override // i.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> apply(List<? extends Value> list) {
                kotlin.jvm.internal.l0.o(list, "list");
                List<? extends Value> list2 = list;
                ld.l<Value, Object> lVar = this.f31919a;
                ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(lVar.invoke(it.next()));
                }
                return arrayList;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001b\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/paging/m$c$d", "Landroidx/paging/m$c;", "Landroidx/paging/m;", "d", "()Landroidx/paging/m;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class d<ToValue> extends c<Key, ToValue> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f31920a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i.a<List<Value>, List<ToValue>> f31921b;

            d(c<Key, Value> cVar, i.a<List<Value>, List<ToValue>> aVar) {
                this.f31920a = cVar;
                this.f31921b = aVar;
            }

            @Override // androidx.paging.m.c
            @fg.l
            public m<Key, ToValue> d() {
                return this.f31920a.d().l(this.f31921b);
            }
        }

        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0004\"\b\b\u0004\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class e<I, O> implements i.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ld.l<List<? extends Value>, List<Object>> f31922a;

            /* JADX WARN: Multi-variable type inference failed */
            e(ld.l<? super List<? extends Value>, ? extends List<Object>> lVar) {
                this.f31922a = lVar;
            }

            @Override // i.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Object> apply(List<? extends Value> it) {
                ld.l<List<? extends Value>, List<Object>> lVar = this.f31922a;
                kotlin.jvm.internal.l0.o(it, "it");
                return lVar.invoke(it);
            }
        }

        public static /* synthetic */ ld.a c(c cVar, kotlinx.coroutines.m0 m0Var, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if ((i4 & 1) != 0) {
                m0Var = kotlinx.coroutines.j1.c();
            }
            return cVar.b(m0Var);
        }

        @fg.l
        @kd.j
        public final ld.a<b1<Key, Value>> a() {
            return c(this, null, 1, null);
        }

        @fg.l
        @kd.j
        public final ld.a<b1<Key, Value>> b(@fg.l kotlinx.coroutines.m0 fetchDispatcher) {
            kotlin.jvm.internal.l0.p(fetchDispatcher, "fetchDispatcher");
            return new r1(fetchDispatcher, new a(fetchDispatcher, this));
        }

        @fg.l
        public abstract m<Key, Value> d();

        @fg.l
        public <ToValue> c<Key, ToValue> e(@fg.l i.a<Value, ToValue> function) {
            kotlin.jvm.internal.l0.p(function, "function");
            return g(new b(function));
        }

        public /* synthetic */ c f(ld.l function) {
            kotlin.jvm.internal.l0.p(function, "function");
            return g(new C0547c(function));
        }

        @fg.l
        public <ToValue> c<Key, ToValue> g(@fg.l i.a<List<Value>, List<ToValue>> function) {
            kotlin.jvm.internal.l0.p(function, "function");
            return new d(this, function);
        }

        public /* synthetic */ c h(ld.l function) {
            kotlin.jvm.internal.l0.p(function, "function");
            return g(new e(function));
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/m$d;", "", "Lkotlin/k2;", "a", "()V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d {
        @androidx.annotation.d
        void a();
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/m$e;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIONAL", "PAGE_KEYED", "ITEM_KEYED", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum e {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/paging/m$f;", "", "K", "Landroidx/paging/g0;", "type", "key", "", "initialLoadSize", "", "placeholdersEnabled", "pageSize", "<init>", "(Landroidx/paging/g0;Ljava/lang/Object;IZI)V", "a", "Landroidx/paging/g0;", "e", "()Landroidx/paging/g0;", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "I", "()I", "d", "Z", "()Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f<K> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final g0 type;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final K key;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int initialLoadSize;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean placeholdersEnabled;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int pageSize;

        public f(@fg.l g0 type, @fg.m K k4, int i4, boolean z4, int i5) {
            kotlin.jvm.internal.l0.p(type, "type");
            this.type = type;
            this.key = k4;
            this.initialLoadSize = i4;
            this.placeholdersEnabled = z4;
            this.pageSize = i5;
            if (type != g0.REFRESH && k4 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getInitialLoadSize() {
            return this.initialLoadSize;
        }

        @fg.m
        public final K b() {
            return this.key;
        }

        /* renamed from: c, reason: from getter */
        public final int getPageSize() {
            return this.pageSize;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final g0 getType() {
            return this.type;
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/m$d;", "it", "Lkotlin/k2;", "<anonymous>", "(Landroidx/paging/m$d;)V"}, k = 3, mv = {1, 5, 1})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<d, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f31928b = new g(1);

        g() {
            super(1);
        }

        public final void a(@fg.l d it) {
            kotlin.jvm.internal.l0.p(it, "it");
            it.a();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(d dVar) {
            a(dVar);
            return k2.f75408a;
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Key", "", "Value"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<Key, Value> f31929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(m<Key, Value> mVar) {
            super(0);
            this.f31929b = mVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f31929b.h());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "", "Key", "Value", "list"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class i<ToValue> extends kotlin.jvm.internal.n0 implements ld.l<List<? extends Value>, List<? extends ToValue>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.a<Value, ToValue> f31930b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i.a<Value, ToValue> aVar) {
            super(1);
            this.f31930b = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> invoke(@fg.l List<? extends Value> list) {
            kotlin.jvm.internal.l0.p(list, "list");
            List<? extends Value> list2 = list;
            i.a<Value, ToValue> aVar = this.f31930b;
            ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u00032\u000e\u0010\u0006\u001a\n \u0002*\u0004\u0018\u0001H\u0005H\u0005H\n"}, d2 = {"<anonymous>", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class j<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<Value, Object> f31931a;

        /* JADX WARN: Multi-variable type inference failed */
        j(ld.l<? super Value, Object> lVar) {
            this.f31931a = lVar;
        }

        @Override // i.a
        public final Object apply(Value it) {
            ld.l<Value, Object> lVar = this.f31931a;
            kotlin.jvm.internal.l0.o(it, "it");
            return lVar.invoke(it);
        }
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u0002H\u0002 \u0003*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0005*\u00020\u0004\"\b\b\u0002\u0010\u0006*\u00020\u00042\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u0002H\u0006 \u0003*\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "ToValue", "kotlin.jvm.PlatformType", "", "Key", "Value", "it"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class k<I, O> implements i.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ld.l<List<? extends Value>, List<Object>> f31932a;

        /* JADX WARN: Multi-variable type inference failed */
        k(ld.l<? super List<? extends Value>, ? extends List<Object>> lVar) {
            this.f31932a = lVar;
        }

        @Override // i.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> apply(List<? extends Value> it) {
            ld.l<List<? extends Value>, List<Object>> lVar = this.f31932a;
            kotlin.jvm.internal.l0.o(it, "it");
            return lVar.invoke(it);
        }
    }

    public m(@fg.l e type) {
        kotlin.jvm.internal.l0.p(type, "type");
        this.type = type;
        this.invalidateCallbackTracker = new y<>(g.f31928b, new h(this));
        this.isContiguous = true;
        this.supportsPageDropping = true;
    }

    @androidx.annotation.d
    public void a(@fg.l d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(onInvalidatedCallback);
    }

    @androidx.annotation.m1
    public final int b() {
        return this.invalidateCallbackTracker.a();
    }

    @fg.l
    public abstract Key c(@fg.l Value item);

    /* renamed from: d, reason: from getter */
    public boolean getSupportsPageDropping() {
        return this.supportsPageDropping;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final e getType() {
        return this.type;
    }

    @androidx.annotation.d
    public void f() {
        this.invalidateCallbackTracker.c();
    }

    /* renamed from: g, reason: from getter */
    public boolean getIsContiguous() {
        return this.isContiguous;
    }

    @androidx.annotation.n1
    public boolean h() {
        return this.invalidateCallbackTracker.getInvalid();
    }

    @fg.m
    public abstract Object i(@fg.l f<Key> fVar, @fg.l kotlin.coroutines.d<? super a<Value>> dVar);

    @fg.l
    public <ToValue> m<Key, ToValue> j(@fg.l i.a<Value, ToValue> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return m(new i(function));
    }

    public /* synthetic */ m k(ld.l function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return j(new j(function));
    }

    @fg.l
    public <ToValue> m<Key, ToValue> l(@fg.l i.a<List<Value>, List<ToValue>> function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return new x1(this, function);
    }

    public /* synthetic */ m m(ld.l function) {
        kotlin.jvm.internal.l0.p(function, "function");
        return l(new k(function));
    }

    @androidx.annotation.d
    public void n(@fg.l d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(onInvalidatedCallback);
    }

    /* compiled from: DataSource.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u0000 \u001d*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0014B?\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/paging/m$a;", "", "Value", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "pageSize", "Lkotlin/k2;", "e", "(I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "c", "I", "()I", "f", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a<Value> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        @kd.f
        public final List<Value> data;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object prevKey;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final Object nextKey;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int itemsBefore;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int itemsAfter;

        /* compiled from: DataSource.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005\"\b\b\u0003\u0010\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007JW\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005\"\b\b\u0003\u0010\b*\u00020\u0001\"\b\b\u0004\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052\u001e\u0010\r\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\f0\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/paging/m$a$a;", "", "<init>", "()V", "T", "Landroidx/paging/m$a;", "b", "()Landroidx/paging/m$a;", "ToValue", "Value", "result", "Li/a;", "", "function", "a", "(Landroidx/paging/m$a;Li/a;)Landroidx/paging/m$a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.m$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final <ToValue, Value> a<Value> a(@fg.l a<ToValue> result, @fg.l i.a<List<ToValue>, List<Value>> function) {
                kotlin.jvm.internal.l0.p(result, "result");
                kotlin.jvm.internal.l0.p(function, "function");
                return new a<>(m.INSTANCE.a(function, result.data), result.getPrevKey(), result.getNextKey(), result.getItemsBefore(), result.getItemsAfter());
            }

            @fg.l
            public final <T> a<T> b() {
                return new a<>(kotlin.collections.j0.f74919b, null, null, 0, 0);
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@fg.l List<? extends Value> data, @fg.m Object obj, @fg.m Object obj2, int i4, int i5) {
            kotlin.jvm.internal.l0.p(data, "data");
            this.data = data;
            this.prevKey = obj;
            this.nextKey = obj2;
            this.itemsBefore = i4;
            this.itemsAfter = i5;
            if (i4 < 0 && i4 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i4 > 0 || i5 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i5 < 0 && i5 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getItemsAfter() {
            return this.itemsAfter;
        }

        /* renamed from: b, reason: from getter */
        public final int getItemsBefore() {
            return this.itemsBefore;
        }

        @fg.m
        /* renamed from: c, reason: from getter */
        public final Object getNextKey() {
            return this.nextKey;
        }

        @fg.m
        /* renamed from: d, reason: from getter */
        public final Object getPrevKey() {
            return this.prevKey;
        }

        public final void e(int pageSize) {
            int i4;
            if (this.itemsBefore == Integer.MIN_VALUE || (i4 = this.itemsAfter) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i4 <= 0 || this.data.size() % pageSize == 0) {
                if (this.itemsBefore % pageSize == 0) {
                    return;
                }
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.itemsBefore + ", pageSize = " + pageSize);
            }
            int size = this.data.size() + this.itemsBefore + this.itemsAfter;
            StringBuilder sb = new StringBuilder("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize ");
            sb.append(this.data.size());
            sb.append(", position ");
            l.a(sb, this.itemsBefore, ", totalCount ", size, ", pageSize ");
            sb.append(pageSize);
            throw new IllegalArgumentException(sb.toString());
        }

        public boolean equals(@fg.m Object other) {
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return kotlin.jvm.internal.l0.g(this.data, aVar.data) && kotlin.jvm.internal.l0.g(this.prevKey, aVar.prevKey) && kotlin.jvm.internal.l0.g(this.nextKey, aVar.nextKey) && this.itemsBefore == aVar.itemsBefore && this.itemsAfter == aVar.itemsAfter;
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
            this(list, obj, obj2, (i6 & 8) != 0 ? Integer.MIN_VALUE : i4, (i6 & 16) != 0 ? Integer.MIN_VALUE : i5);
        }
    }
}
