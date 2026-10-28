package androidx.paging;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.k2;

/* compiled from: PagingSource.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0017\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0005J\u001b\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010$\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/paging/b1;", "", "Key", "Value", "<init>", "()V", "Lkotlin/k2;", "f", "Lkotlin/Function0;", "onInvalidatedCallback", "h", "(Lld/a;)V", "i", "Landroidx/paging/b1$a;", "params", "Landroidx/paging/b1$b;", "g", "(Landroidx/paging/b1$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/paging/d1;", "state", "e", "(Landroidx/paging/d1;)Ljava/lang/Object;", "Landroidx/paging/y;", "a", "Landroidx/paging/y;", "invalidateCallbackTracker", "", "b", "()I", "invalidateCallbackCount", "", "c", "()Z", "jumpingSupported", "d", "keyReuseSupported", "invalid", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b1<Key, Value> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y<ld.a<k2>> invalidateCallbackTracker = new y<>(c.f31572b, null, 2, 0 == true ? 1 : 0);

    /* compiled from: PagingSource.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\t\u000b\u000e\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Landroidx/paging/b1$a;", "", "Key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(IZ)V", "a", "I", "b", "()I", "Z", "c", "()Z", "()Ljava/lang/Object;", "key", "d", "Landroidx/paging/b1$a$d;", "Landroidx/paging/b1$a$a;", "Landroidx/paging/b1$a$c;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a<Key> {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int loadSize;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean placeholdersEnabled;

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/b1$a$a;", "", "Key", "Landroidx/paging/b1$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.b1$a$a, reason: collision with other inner class name */
        public static final class C0527a<Key> extends a<Key> {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0527a(@fg.l Key key, int i4, boolean z4) {
                super(i4, z4, null);
                kotlin.jvm.internal.l0.p(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.b1.a
            @fg.l
            public Key a() {
                return this.key;
            }
        }

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f\"\b\b\u0003\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/b1$a$b;", "", "<init>", "()V", "Key", "Landroidx/paging/g0;", "loadType", "key", "", "loadSize", "", "placeholdersEnabled", "Landroidx/paging/b1$a;", "a", "(Landroidx/paging/g0;Ljava/lang/Object;IZ)Landroidx/paging/b1$a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.b1$a$b, reason: from kotlin metadata */
        public static final class Companion {

            /* compiled from: PagingSource.kt */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.b1$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0528a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f31560a;

                static {
                    int[] iArr = new int[g0.values().length];
                    iArr[g0.REFRESH.ordinal()] = 1;
                    iArr[g0.PREPEND.ordinal()] = 2;
                    iArr[g0.APPEND.ordinal()] = 3;
                    f31560a = iArr;
                }
            }

            private Companion() {
            }

            @fg.l
            public final <Key> a<Key> a(@fg.l g0 loadType, @fg.m Key key, int loadSize, boolean placeholdersEnabled) {
                kotlin.jvm.internal.l0.p(loadType, "loadType");
                int i4 = C0528a.f31560a[loadType.ordinal()];
                if (i4 == 1) {
                    return new d(key, loadSize, placeholdersEnabled);
                }
                if (i4 == 2) {
                    if (key != null) {
                        return new c(key, loadSize, placeholdersEnabled);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (key != null) {
                    return new C0527a(key, loadSize, placeholdersEnabled);
                }
                throw new IllegalArgumentException("key cannot be null for append");
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/b1$a$c;", "", "Key", "Landroidx/paging/b1$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class c<Key> extends a<Key> {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@fg.l Key key, int i4, boolean z4) {
                super(i4, z4, null);
                kotlin.jvm.internal.l0.p(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.b1.a
            @fg.l
            public Key a() {
                return this.key;
            }
        }

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/b1$a$d;", "", "Key", "Landroidx/paging/b1$a;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "d", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class d<Key> extends a<Key> {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private final Key key;

            public d(@fg.m Key key, int i4, boolean z4) {
                super(i4, z4, null);
                this.key = key;
            }

            @Override // androidx.paging.b1.a
            @fg.m
            public Key a() {
                return this.key;
            }
        }

        public /* synthetic */ a(int i4, boolean z4, kotlin.jvm.internal.w wVar) {
            this(i4, z4);
        }

        @fg.m
        public abstract Key a();

        /* renamed from: b, reason: from getter */
        public final int getLoadSize() {
            return this.loadSize;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        private a(int i4, boolean z4) {
            this.loadSize = i4;
            this.placeholdersEnabled = z4;
        }
    }

    /* compiled from: PagingSource.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/paging/b1$b;", "", "Key", "Value", "<init>", "()V", "a", "b", "c", "Landroidx/paging/b1$b$a;", "Landroidx/paging/b1$b$b;", "Landroidx/paging/b1$b$c;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class b<Key, Value> {

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Landroidx/paging/b1$b$a;", "", "Key", "Value", "Landroidx/paging/b1$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "a", "()Ljava/lang/Throwable;", "b", "(Ljava/lang/Throwable;)Landroidx/paging/b1$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "d", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class a<Key, Value> extends b<Key, Value> {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@fg.l Throwable throwable) {
                super(null);
                kotlin.jvm.internal.l0.p(throwable, "throwable");
                this.throwable = throwable;
            }

            public static /* synthetic */ a c(a aVar, Throwable th, int i4, Object obj) {
                if ((i4 & 1) != 0) {
                    th = aVar.throwable;
                }
                return aVar.b(th);
            }

            @fg.l
            /* renamed from: a, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            @fg.l
            public final a<Key, Value> b(@fg.l Throwable throwable) {
                kotlin.jvm.internal.l0.p(throwable, "throwable");
                return new a<>(throwable);
            }

            @fg.l
            public final Throwable d() {
                return this.throwable;
            }

            public boolean equals(@fg.m Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && kotlin.jvm.internal.l0.g(this.throwable, ((a) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            @fg.l
            public String toString() {
                return "Error(throwable=" + this.throwable + ')';
            }
        }

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/paging/b1$b$b;", "", "Key", "Value", "Landroidx/paging/b1$b;", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.b1$b$b, reason: collision with other inner class name */
        public static final class C0529b<Key, Value> extends b<Key, Value> {
            public C0529b() {
                super(null);
            }
        }

        /* compiled from: PagingSource.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u0016*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004:\u0001!B=\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB+\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00050\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015JX\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00050\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00042\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00050\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b)\u0010\u0015¨\u0006*"}, d2 = {"Landroidx/paging/b1$b$c;", "", "Key", "Value", "Landroidx/paging/b1$b;", "", "data", "prevKey", "nextKey", "", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "()Ljava/util/List;", "c", "()Ljava/lang/Object;", "d", "e", "()I", "f", "g", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)Landroidx/paging/b1$b$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "i", "Ljava/lang/Object;", "m", "l", "I", "k", "j", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final /* data */ class c<Key, Value> extends b<Key, Value> {

            /* renamed from: g, reason: collision with root package name */
            public static final int f31565g = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final List<Value> data;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private final Key prevKey;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.m
            private final Key nextKey;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int itemsBefore;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            private final int itemsAfter;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @fg.l
            public static final Companion INSTANCE = new Companion();

            /* renamed from: h, reason: collision with root package name */
            @fg.l
            private static final c f31566h = new c(kotlin.collections.j0.f74919b, null, null, 0, 0);

            /* compiled from: PagingSource.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0006\"\b\b\u0006\u0010\u0004*\u00020\u0001\"\b\b\u0007\u0010\u0005*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\bR,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00068\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/paging/b1$b$c$a;", "", "<init>", "()V", "Key", "Value", "Landroidx/paging/b1$b$c;", "a", "()Landroidx/paging/b1$b$c;", "", "EMPTY", "Landroidx/paging/b1$b$c;", "b", "c", "", "COUNT_UNDEFINED", "I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
            /* renamed from: androidx.paging.b1$b$c$a, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public static /* synthetic */ void c() {
                }

                @fg.l
                public final <Key, Value> c<Key, Value> a() {
                    return c.f31566h;
                }

                @fg.l
                public final c b() {
                    return c.f31566h;
                }

                public Companion(kotlin.jvm.internal.w wVar) {
                }
            }

            public /* synthetic */ c(List list, Object obj, Object obj2, int i4, int i5, int i6, kotlin.jvm.internal.w wVar) {
                this(list, obj, obj2, (i6 & 8) != 0 ? Integer.MIN_VALUE : i4, (i6 & 16) != 0 ? Integer.MIN_VALUE : i5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ c h(c cVar, List list, Object obj, Object obj2, int i4, int i5, int i6, Object obj3) {
                if ((i6 & 1) != 0) {
                    list = cVar.data;
                }
                Key key = obj;
                if ((i6 & 2) != 0) {
                    key = cVar.prevKey;
                }
                Key key2 = key;
                Key key3 = obj2;
                if ((i6 & 4) != 0) {
                    key3 = cVar.nextKey;
                }
                Key key4 = key3;
                if ((i6 & 8) != 0) {
                    i4 = cVar.itemsBefore;
                }
                int i7 = i4;
                if ((i6 & 16) != 0) {
                    i5 = cVar.itemsAfter;
                }
                return cVar.g(list, key2, key4, i7, i5);
            }

            @fg.l
            public final List<Value> b() {
                return this.data;
            }

            @fg.m
            public final Key c() {
                return this.prevKey;
            }

            @fg.m
            public final Key d() {
                return this.nextKey;
            }

            /* renamed from: e, reason: from getter */
            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public boolean equals(@fg.m Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return kotlin.jvm.internal.l0.g(this.data, cVar.data) && kotlin.jvm.internal.l0.g(this.prevKey, cVar.prevKey) && kotlin.jvm.internal.l0.g(this.nextKey, cVar.nextKey) && this.itemsBefore == cVar.itemsBefore && this.itemsAfter == cVar.itemsAfter;
            }

            /* renamed from: f, reason: from getter */
            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            @fg.l
            public final c<Key, Value> g(@fg.l List<? extends Value> data, @fg.m Key prevKey, @fg.m Key nextKey, @androidx.annotation.g0(from = -2147483648L) int itemsBefore, @androidx.annotation.g0(from = -2147483648L) int itemsAfter) {
                kotlin.jvm.internal.l0.p(data, "data");
                return new c<>(data, prevKey, nextKey, itemsBefore, itemsAfter);
            }

            public int hashCode() {
                int hashCode = this.data.hashCode() * 31;
                Key key = this.prevKey;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.nextKey;
                return Integer.hashCode(this.itemsAfter) + androidx.compose.foundation.w1.a(this.itemsBefore, (hashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31, 31);
            }

            @fg.l
            public final List<Value> i() {
                return this.data;
            }

            public final int j() {
                return this.itemsAfter;
            }

            public final int k() {
                return this.itemsBefore;
            }

            @fg.m
            public final Key l() {
                return this.nextKey;
            }

            @fg.m
            public final Key m() {
                return this.prevKey;
            }

            @fg.l
            public String toString() {
                StringBuilder sb = new StringBuilder("Page(data=");
                sb.append(this.data);
                sb.append(", prevKey=");
                sb.append(this.prevKey);
                sb.append(", nextKey=");
                sb.append(this.nextKey);
                sb.append(", itemsBefore=");
                sb.append(this.itemsBefore);
                sb.append(", itemsAfter=");
                return androidx.view.e.a(sb, this.itemsAfter, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@fg.l List<? extends Value> data, @fg.m Key key, @fg.m Key key2, @androidx.annotation.g0(from = -2147483648L) int i4, @androidx.annotation.g0(from = -2147483648L) int i5) {
                super(null);
                kotlin.jvm.internal.l0.p(data, "data");
                this.data = data;
                this.prevKey = key;
                this.nextKey = key2;
                this.itemsBefore = i4;
                this.itemsAfter = i5;
                boolean z4 = true;
                if (!(i4 == Integer.MIN_VALUE || i4 >= 0)) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i5 != Integer.MIN_VALUE && i5 < 0) {
                    z4 = false;
                }
                if (!z4) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public c(@fg.l List<? extends Value> data, @fg.m Key key, @fg.m Key key2) {
                this(data, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                kotlin.jvm.internal.l0.p(data, "data");
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: PagingSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lkotlin/Function0;", "Lkotlin/k2;", "it", "<anonymous>", "(Lld/a;)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<ld.a<? extends k2>, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f31572b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l ld.a<k2> it) {
            kotlin.jvm.internal.l0.p(it, "it");
            it.invoke();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(ld.a<? extends k2> aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public final boolean a() {
        return this.invalidateCallbackTracker.getInvalid();
    }

    @androidx.annotation.m1
    public final int b() {
        return this.invalidateCallbackTracker.a();
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    @fg.m
    public abstract Key e(@fg.l d1<Key, Value> state);

    public final void f() {
        this.invalidateCallbackTracker.c();
    }

    @fg.m
    public abstract Object g(@fg.l a<Key> aVar, @fg.l kotlin.coroutines.d<? super b<Key, Value>> dVar);

    public final void h(@fg.l ld.a<k2> onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(onInvalidatedCallback);
    }

    public final void i(@fg.l ld.a<k2> onInvalidatedCallback) {
        kotlin.jvm.internal.l0.p(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(onInvalidatedCallback);
    }
}
