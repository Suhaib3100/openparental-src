package a1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.flashget.kidsdownloader.SandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: AppConfigIniter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/flashget/kidsdownloader/configs/AppConfigIniter;", "", "app", "Lcom/flashget/kidsdownloader/SandApp;", "(Lcom/flashget/kidsdownloader/SandApp;)V", "getApp", "()Lcom/flashget/kidsdownloader/SandApp;", "setApp", "getConfig", "Lcom/flashget/kidsdownloader/configs/app/AppConfig;", "isTestConfig", "", "init", "Companion", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final C0001a f24b = new C0001a(null);

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static String f25c = ProtectedSandApp.s("%");

    /* renamed from: d, reason: collision with root package name */
    private static int f26d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f27e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f28f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f29g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static final int f30h = 4;

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private SandApp f31a;

    /* compiled from: AppConfigIniter.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/flashget/kidsdownloader/configs/AppConfigIniter$Companion;", "", "()V", "APP_CONFIG_ADC_DEBUG", "", "APP_CONFIG_ADC_RELEASE", "APP_CONFIG_CFG_DEBUG", "APP_CONFIG_CFG_RELEASE", "APP_CONFIG_SOURCE", "", "getAPP_CONFIG_SOURCE", "()Ljava/lang/String;", "setAPP_CONFIG_SOURCE", "(Ljava/lang/String;)V", "appConfigType", "getAppConfigType", "()I", "setAppConfigType", "(I)V", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a1.a$a, reason: collision with other inner class name */
    public static final class C0001a {
        private C0001a() {
        }

        @d5.d
        public final String a() {
            return a.f25c;
        }

        public final int b() {
            return a.f26d;
        }

        public final void c(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("$"));
            a.f25c = str;
        }

        public final void d(int i5) {
            a.f26d = i5;
        }

        public C0001a(w wVar) {
        }
    }

    public a(@d5.d SandApp sandApp) {
        l0.p(sandApp, ProtectedSandApp.s("&"));
        this.f31a = sandApp;
    }

    private final com.flashget.kidsdownloader.configs.app.a f(boolean z5) {
        if (z5) {
            com.flashget.kidsdownloader.configs.app.d dVar = new com.flashget.kidsdownloader.configs.app.d(this.f31a);
            f25c = ProtectedSandApp.s("'");
            f26d = 3;
            return dVar;
        }
        com.flashget.kidsdownloader.configs.app.c cVar = new com.flashget.kidsdownloader.configs.app.c(this.f31a);
        f25c = ProtectedSandApp.s("(");
        f26d = 4;
        return cVar;
    }

    @d5.d
    /* renamed from: e, reason: from getter */
    public final SandApp getF31a() {
        return this.f31a;
    }

    @d5.d
    public final com.flashget.kidsdownloader.configs.app.a g() {
        int a6 = d1.a.f22320a.a(this.f31a);
        return a6 != 1 ? a6 != 2 ? f(false) : f(false) : f(true);
    }

    public final void h(@d5.d SandApp sandApp) {
        l0.p(sandApp, ProtectedSandApp.s(")"));
        this.f31a = sandApp;
    }
}
