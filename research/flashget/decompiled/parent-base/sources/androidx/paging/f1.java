package androidx.paging;

import kotlin.Metadata;

/* compiled from: RemoteMediator.kt */
@p
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u000e\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/paging/f1;", "", "Key", "Value", "<init>", "()V", "Landroidx/paging/g0;", "loadType", "Landroidx/paging/d1;", "state", "Landroidx/paging/f1$b;", "c", "(Landroidx/paging/g0;Landroidx/paging/d1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/f1$a;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f1<Key, Value> {

    /* compiled from: RemoteMediator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/f1$a;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH_INITIAL_REFRESH", "SKIP_INITIAL_REFRESH", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum a {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    /* compiled from: RemoteMediator.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/f1$b;", "", "<init>", "()V", "a", "b", "Landroidx/paging/f1$b$a;", "Landroidx/paging/f1$b$b;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b {

        /* compiled from: RemoteMediator.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/f1$b$a;", "Landroidx/paging/f1$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@fg.l Throwable throwable) {
                super(null);
                kotlin.jvm.internal.l0.p(throwable, "throwable");
                this.throwable = throwable;
            }

            @fg.l
            /* renamed from: a, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: RemoteMediator.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/paging/f1$b$b;", "Landroidx/paging/f1$b;", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "Z", "()Z", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.f1$b$b, reason: collision with other inner class name */
        public static final class C0538b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final boolean endOfPaginationReached;

            public C0538b(boolean z4) {
                super(null);
                this.endOfPaginationReached = z4;
            }

            @kd.i(name = "endOfPaginationReached")
            /* renamed from: a, reason: from getter */
            public final boolean getEndOfPaginationReached() {
                return this.endOfPaginationReached;
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        private b() {
        }
    }

    @fg.m
    public Object a(@fg.l kotlin.coroutines.d<? super a> dVar) {
        return a.LAUNCH_INITIAL_REFRESH;
    }

    @fg.m
    public abstract Object c(@fg.l g0 g0Var, @fg.l d1<Key, Value> d1Var, @fg.l kotlin.coroutines.d<? super b> dVar);
}
