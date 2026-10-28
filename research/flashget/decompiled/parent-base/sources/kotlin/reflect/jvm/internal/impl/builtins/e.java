package kotlin.reflect.jvm.internal.impl.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: DefaultBuiltIns.kt */
/* loaded from: classes7.dex */
public final class e extends h {

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    public static final b f75667i = new b();

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final b0<e> f75668j = c0.c(a.f75669b);

    /* compiled from: DefaultBuiltIns.kt */
    static final class a extends n0 implements ld.a<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f75669b = new a(0);

        a() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(false, 1, null);
        }
    }

    /* compiled from: DefaultBuiltIns.kt */
    public static final class b {
        private b() {
        }

        @fg.l
        public final e a() {
            return (e) e.f75668j.getValue();
        }

        public b(w wVar) {
        }
    }

    public e() {
        this(false, 1, null);
    }

    public e(boolean z4) {
        super(new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("栝\u0001"), (Runnable) null, (ld.l<InterruptedException, k2>) null));
        if (z4) {
            f(false);
        }
    }

    public /* synthetic */ e(boolean z4, int i4, w wVar) {
        this((i4 & 1) != 0 ? true : z4);
    }
}
