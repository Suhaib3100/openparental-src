package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.w;
import kotlin.m2;

/* compiled from: DefaultBuiltIns.kt */
/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    public static final a f23891i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @d5.d
    private static final e f23892j = new e(false, 1, null);

    /* compiled from: DefaultBuiltIns.kt */
    public static final class a {
        private a() {
        }

        @d5.d
        public final e a() {
            return e.f23892j;
        }

        public a(w wVar) {
        }
    }

    public e() {
        this(false, 1, null);
    }

    public e(boolean z5) {
        super(new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("䒞"), (Runnable) null, (q3.l<InterruptedException, m2>) null));
        if (z5) {
            f(false);
        }
    }

    public /* synthetic */ e(boolean z5, int i5, w wVar) {
        this((i5 & 1) != 0 ? true : z5);
    }
}
