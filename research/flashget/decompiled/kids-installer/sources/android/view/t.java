package android.view;

import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.java */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @o0
    AtomicReference<Object> f8658a = new AtomicReference<>();

    /* compiled from: Lifecycle.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8659a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8660b;

        static {
            int[] iArr = new int[b.values().length];
            f8660b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8660b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8660b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8660b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8660b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8660b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8660b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f8659a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8659a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8659a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8659a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8659a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: Lifecycle.java */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        @q0
        public static b downFrom(@o0 c cVar) {
            int i5 = a.f8659a[cVar.ordinal()];
            if (i5 == 1) {
                return ON_DESTROY;
            }
            if (i5 == 2) {
                return ON_STOP;
            }
            if (i5 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        @q0
        public static b downTo(@o0 c cVar) {
            int i5 = a.f8659a[cVar.ordinal()];
            if (i5 == 1) {
                return ON_STOP;
            }
            if (i5 == 2) {
                return ON_PAUSE;
            }
            if (i5 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        @q0
        public static b upFrom(@o0 c cVar) {
            int i5 = a.f8659a[cVar.ordinal()];
            if (i5 == 1) {
                return ON_START;
            }
            if (i5 == 2) {
                return ON_RESUME;
            }
            if (i5 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        @q0
        public static b upTo(@o0 c cVar) {
            int i5 = a.f8659a[cVar.ordinal()];
            if (i5 == 1) {
                return ON_CREATE;
            }
            if (i5 == 2) {
                return ON_START;
            }
            if (i5 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        @o0
        public c getTargetState() {
            switch (a.f8660b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.java */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(@o0 c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    @l0
    public abstract void a(@o0 z zVar);

    @o0
    @l0
    public abstract c b();

    @l0
    public abstract void c(@o0 z zVar);
}
