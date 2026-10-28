package androidx.paging;

import androidx.paging.m;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: WrapperDataSource.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0002H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00020\u001c2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0090@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR,\u0010\t\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/paging/x1;", "", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/m;", "source", "Li/a;", "", "listFunction", "<init>", "(Landroidx/paging/m;Li/a;)V", "Landroidx/paging/m$d;", "onInvalidatedCallback", "Lkotlin/k2;", "a", "(Landroidx/paging/m$d;)V", "n", "f", "()V", "item", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "dest", "p", "(Ljava/util/List;Ljava/util/List;)V", "Landroidx/paging/m$f;", "params", "Landroidx/paging/m$a;", "i", "(Landroidx/paging/m$f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/m;", "g", "Li/a;", "Ljava/util/IdentityHashMap;", "h", "Ljava/util/IdentityHashMap;", "keyMap", "", "()Z", "isInvalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public class x1<Key, ValueFrom, ValueTo> extends m<Key, ValueTo> {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m<Key, ValueFrom> source;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i.a<List<ValueFrom>, List<ValueTo>> listFunction;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final IdentityHashMap<ValueTo, Key> keyMap;

    /* compiled from: WrapperDataSource.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32444a;

        static {
            int[] iArr = new int[m.e.values().length];
            iArr[m.e.ITEM_KEYED.ordinal()] = 1;
            f32444a = iArr;
        }
    }

    /* compiled from: WrapperDataSource.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.kt", i = {0}, l = {68}, m = "load$suspendImpl", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32445b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f32446c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x1<Key, ValueFrom, ValueTo> f32447d;

        /* renamed from: e, reason: collision with root package name */
        int f32448e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x1<Key, ValueFrom, ValueTo> x1Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f32447d = x1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32446c = obj;
            this.f32448e |= Integer.MIN_VALUE;
            return x1.o(this.f32447d, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(@fg.l m<Key, ValueFrom> source, @fg.l i.a<List<ValueFrom>, List<ValueTo>> listFunction) {
        super(source.getType());
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = a.f32444a[source.getType().ordinal()] == 1 ? new IdentityHashMap<>() : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object o(androidx.paging.x1 r4, androidx.paging.m.f r5, kotlin.coroutines.d r6) {
        /*
            boolean r0 = r6 instanceof androidx.paging.x1.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.x1$b r0 = (androidx.paging.x1.b) r0
            int r1 = r0.f32448e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32448e = r1
            goto L18
        L13:
            androidx.paging.x1$b r0 = new androidx.paging.x1$b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f32446c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f32448e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f32445b
            androidx.paging.x1 r4 = (androidx.paging.x1) r4
            kotlin.a1.n(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.a1.n(r6)
            androidx.paging.m<Key, ValueFrom> r6 = r4.source
            r0.f32445b = r4
            r0.f32448e = r3
            java.lang.Object r6 = r6.i(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            androidx.paging.m$a r6 = (androidx.paging.m.a) r6
            androidx.paging.m$a$a r5 = androidx.paging.m.a.INSTANCE
            i.a<java.util.List<ValueFrom>, java.util.List<ValueTo>> r0 = r4.listFunction
            androidx.paging.m$a r5 = r5.a(r6, r0)
            java.util.List<Value> r6 = r6.data
            java.util.List<Value> r0 = r5.data
            r4.p(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.x1.o(androidx.paging.x1, androidx.paging.m$f, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.paging.m
    public void a(@fg.l m.d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.a(onInvalidatedCallback);
    }

    @Override // androidx.paging.m
    @fg.l
    public Key c(@fg.l ValueTo item) {
        Key key;
        kotlin.jvm.internal.l0.p(item, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap == null) {
            throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
        }
        synchronized (identityHashMap) {
            key = this.keyMap.get(item);
            kotlin.jvm.internal.l0.m(key);
            kotlin.jvm.internal.l0.o(key, "keyMap[item]!!");
        }
        return key;
    }

    @Override // androidx.paging.m
    public void f() {
        this.source.f();
    }

    @Override // androidx.paging.m
    public boolean h() {
        return this.source.h();
    }

    @Override // androidx.paging.m
    @fg.m
    public Object i(@fg.l m.f<Key> fVar, @fg.l kotlin.coroutines.d<? super m.a<ValueTo>> dVar) {
        return o(this, fVar, dVar);
    }

    @Override // androidx.paging.m
    public void n(@fg.l m.d onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.n(onInvalidatedCallback);
    }

    public final void p(@fg.l List<? extends ValueFrom> source, @fg.l List<? extends ValueTo> dest) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(dest, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                try {
                    int size = dest.size() - 1;
                    if (size >= 0) {
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            this.keyMap.put(dest.get(i4), ((a0) this.source).q(source.get(i4)));
                            if (i5 > size) {
                                break;
                            } else {
                                i4 = i5;
                            }
                        }
                    }
                    k2 k2Var = k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
