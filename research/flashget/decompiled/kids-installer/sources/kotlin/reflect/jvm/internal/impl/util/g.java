package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26581a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final a f26582b = new a();

        private a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final String f26583b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d String str) {
            super(false, null);
            l0.p(str, ProtectedSandApp.s("塿"));
            this.f26583b = str;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final c f26584b = new c();

        private c() {
            super(true, null);
        }
    }

    public /* synthetic */ g(boolean z5, w wVar) {
        this(z5);
    }

    public final boolean a() {
        return this.f26581a;
    }

    private g(boolean z5) {
        this.f26581a = z5;
    }
}
