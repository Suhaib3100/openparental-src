package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* compiled from: InvalidatingPagingSourceFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR2\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00108\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0011\u0012\u0004\b\u000e\u0010\r\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/paging/z;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/b1;", "pagingSourceFactory", "<init>", "(Lld/a;)V", "d", "()Landroidx/paging/b1;", "Lkotlin/k2;", "c", "()V", "b", "Lld/a;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "pagingSources", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class z<Key, Value> implements ld.a<b1<Key, Value>> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<b1<Key, Value>> pagingSourceFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CopyOnWriteArrayList<b1<Key, Value>> pagingSources;

    /* compiled from: InvalidatingPagingSourceFactory.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0004*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>", "(Landroidx/paging/b1;)Z"}, k = 3, mv = {1, 5, 1})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<b1<Key, Value>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f32470b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b1<Key, Value> b1Var) {
            return Boolean.valueOf(b1Var.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@fg.l ld.a<? extends b1<Key, Value>> pagingSourceFactory) {
        kotlin.jvm.internal.l0.p(pagingSourceFactory, "pagingSourceFactory");
        this.pagingSourceFactory = pagingSourceFactory;
        this.pagingSources = new CopyOnWriteArrayList<>();
    }

    @androidx.annotation.m1
    public static /* synthetic */ void b() {
    }

    @fg.l
    public final CopyOnWriteArrayList<b1<Key, Value>> a() {
        return this.pagingSources;
    }

    public final void c() {
        Iterator<b1<Key, Value>> it = this.pagingSources.iterator();
        while (it.hasNext()) {
            b1<Key, Value> next = it.next();
            if (!next.a()) {
                next.f();
            }
        }
        kotlin.collections.w.L0(this.pagingSources, a.f32470b);
    }

    @Override // ld.a
    @fg.l
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b1<Key, Value> invoke() {
        b1<Key, Value> invoke = this.pagingSourceFactory.invoke();
        this.pagingSources.add(invoke);
        return invoke;
    }
}
