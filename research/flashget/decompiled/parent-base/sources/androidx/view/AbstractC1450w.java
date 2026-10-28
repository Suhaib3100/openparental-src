package androidx.view;

import androidx.annotation.c1;
import fg.l;
import fg.m;
import java.util.concurrent.atomic.AtomicReference;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0002\u0007\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\bR(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/w;", "", "<init>", "()V", "Landroidx/lifecycle/d0;", "observer", "Lkotlin/k2;", "a", "(Landroidx/lifecycle/d0;)V", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "c", "()Ljava/util/concurrent/atomic/AtomicReference;", "e", "(Ljava/util/concurrent/atomic/AtomicReference;)V", "internalScopeRef", "Landroidx/lifecycle/w$b;", "b", "()Landroidx/lifecycle/w$b;", "currentState", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1450w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    @c1({c1.a.LIBRARY_GROUP})
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/w$a;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/lifecycle/w$b;", "getTargetState", "()Landroidx/lifecycle/w$b;", "targetState", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.w$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        /* renamed from: Companion, reason: from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: Lifecycle.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/w$a$a;", "", "<init>", "()V", "Landroidx/lifecycle/w$b;", "state", "Landroidx/lifecycle/w$a;", "a", "(Landroidx/lifecycle/w$b;)Landroidx/lifecycle/w$a;", "b", "c", "d", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.w$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {

            /* compiled from: Lifecycle.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.w$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0504a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f30462a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f30462a = iArr;
                }
            }

            private Companion() {
            }

            @m
            @n
            public final a a(@l b state) {
                l0.p(state, "state");
                int i4 = C0504a.f30462a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_DESTROY;
                }
                if (i4 == 2) {
                    return a.ON_STOP;
                }
                if (i4 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @m
            @n
            public final a b(@l b state) {
                l0.p(state, "state");
                int i4 = C0504a.f30462a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_STOP;
                }
                if (i4 == 2) {
                    return a.ON_PAUSE;
                }
                if (i4 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            @m
            @n
            public final a c(@l b state) {
                l0.p(state, "state");
                int i4 = C0504a.f30462a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_START;
                }
                if (i4 == 2) {
                    return a.ON_RESUME;
                }
                if (i4 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @m
            @n
            public final a d(@l b state) {
                l0.p(state, "state");
                int i4 = C0504a.f30462a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_CREATE;
                }
                if (i4 == 2) {
                    return a.ON_START;
                }
                if (i4 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public Companion(w wVar) {
            }
        }

        /* compiled from: Lifecycle.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.lifecycle.w$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30463a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f30463a = iArr;
            }
        }

        @m
        @n
        public static final a downFrom(@l b bVar) {
            return INSTANCE.a(bVar);
        }

        @m
        @n
        public static final a downTo(@l b bVar) {
            return INSTANCE.b(bVar);
        }

        @m
        @n
        public static final a upFrom(@l b bVar) {
            return INSTANCE.c(bVar);
        }

        @m
        @n
        public static final a upTo(@l b bVar) {
            return INSTANCE.d(bVar);
        }

        @l
        public final b getTargetState() {
            switch (b.f30463a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/w$b;", "", "<init>", "(Ljava/lang/String;I)V", "state", "", "isAtLeast", "(Landroidx/lifecycle/w$b;)Z", "DESTROYED", "INITIALIZED", "CREATED", "STARTED", "RESUMED", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.w$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(@l b state) {
            l0.p(state, "state");
            return compareTo(state) >= 0;
        }
    }

    @androidx.annotation.l0
    public abstract void a(@l InterfaceC1421d0 observer);

    @l
    @androidx.annotation.l0
    public abstract b b();

    @l
    public final AtomicReference<Object> c() {
        return this.internalScopeRef;
    }

    @androidx.annotation.l0
    public abstract void d(@l InterfaceC1421d0 observer);

    public final void e(@l AtomicReference<Object> atomicReference) {
        l0.p(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
