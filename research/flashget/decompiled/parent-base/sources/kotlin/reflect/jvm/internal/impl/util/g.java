package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f78589a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final a f78590b = new a();

        private a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final String f78591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l String str) {
            super(false, null);
            l0.p(str, ProtectedSandApp.s("肺\u0001"));
            this.f78591b = str;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final c f78592b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z4, w wVar) {
        this(z4);
    }

    public final boolean a() {
        return this.f78589a;
    }

    private g(boolean z4) {
        this.f78589a = z4;
    }
}
