package androidx.paging;

import kotlin.Metadata;

/* compiled from: LoadState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Landroidx/paging/e0;", "", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "Z", "()Z", "b", "c", "Landroidx/paging/e0$c;", "Landroidx/paging/e0$b;", "Landroidx/paging/e0$a;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean endOfPaginationReached;

    /* compiled from: LoadState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/paging/e0$a;", "Landroidx/paging/e0;", "", "error", "<init>", "(Ljava/lang/Throwable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends e0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Throwable error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l Throwable error) {
            super(false, null);
            kotlin.jvm.internal.l0.p(error, "error");
            this.error = error;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public boolean equals(@fg.m Object other) {
            if (other instanceof a) {
                a aVar = (a) other;
                if (getEndOfPaginationReached() == aVar.getEndOfPaginationReached() && kotlin.jvm.internal.l0.g(this.error, aVar.error)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.error.hashCode() + Boolean.hashCode(getEndOfPaginationReached());
        }

        @fg.l
        public String toString() {
            return "Error(endOfPaginationReached=" + getEndOfPaginationReached() + ", error=" + this.error + ')';
        }
    }

    /* compiled from: LoadState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/e0$b;", "Landroidx/paging/e0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends e0 {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f31660b = new b();

        private b() {
            super(false, null);
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof b) && getEndOfPaginationReached() == ((b) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        @fg.l
        public String toString() {
            return "Loading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    /* compiled from: LoadState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/paging/e0$c;", "Landroidx/paging/e0;", "", "endOfPaginationReached", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "a", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends e0 {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        private static final c f31662c;

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        private static final c f31663d;

        /* compiled from: LoadState.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/paging/e0$c$a;", "", "<init>", "()V", "Landroidx/paging/e0$c;", "Complete", "Landroidx/paging/e0$c;", "a", "()Landroidx/paging/e0$c;", "Incomplete", "b", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: androidx.paging.e0$c$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final c a() {
                return c.f31662c;
            }

            @fg.l
            public final c b() {
                return c.f31663d;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        static {
            kotlin.jvm.internal.w wVar = null;
            f31662c = new c(true, wVar);
            f31663d = new c(false, wVar);
        }

        public c(boolean z4) {
            super(z4, null);
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof c) && getEndOfPaginationReached() == ((c) other).getEndOfPaginationReached();
        }

        public int hashCode() {
            return Boolean.hashCode(getEndOfPaginationReached());
        }

        @fg.l
        public String toString() {
            return "NotLoading(endOfPaginationReached=" + getEndOfPaginationReached() + ')';
        }
    }

    public /* synthetic */ e0(boolean z4, kotlin.jvm.internal.w wVar) {
        this(z4);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEndOfPaginationReached() {
        return this.endOfPaginationReached;
    }

    private e0(boolean z4) {
        this.endOfPaginationReached = z4;
    }
}
