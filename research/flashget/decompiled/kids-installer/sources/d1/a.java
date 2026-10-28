package d1;

import android.content.Context;
import android.content.SharedPreferences;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ConfigPref.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/flashget/kidsdownloader/pref/ConfigPref;", "", "()V", "Companion", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22321b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f22322c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f22323d = 3;

    /* renamed from: e, reason: collision with root package name */
    @d
    public static final String f22324e = ProtectedSandApp.s("ᬗ");

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final C0243a f22320a = new C0243a(null);

    /* compiled from: ConfigPref.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/flashget/kidsdownloader/pref/ConfigPref$Companion;", "", "()V", "CONFIG_NORMAL_MODEL", "", "CONFIG_RELEASE_MODEL", "CONFIG_TEST_MODEL", "PREF_CONFIG_MODEL", "", "getConfigModel", "context", "Landroid/content/Context;", "isReleaseAppConfig", "", "setConfigModel", "", "model", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d1.a$a, reason: collision with other inner class name */
    public static final class C0243a {
        private C0243a() {
        }

        public final int a(@d Context context) {
            l0.p(context, ProtectedSandApp.s("ᬏ"));
            try {
                return context.getSharedPreferences(context.getPackageName() + ProtectedSandApp.s("ᬐ"), 4).getInt(ProtectedSandApp.s("ᬑ"), 3);
            } catch (Exception e6) {
                e6.printStackTrace();
                return 3;
            }
        }

        public final boolean b(@d Context context) {
            l0.p(context, ProtectedSandApp.s("ᬒ"));
            try {
                Context applicationContext = context.getApplicationContext();
                l0.o(applicationContext, ProtectedSandApp.s("ᬓ"));
                return a(applicationContext) != 1;
            } catch (Exception unused) {
                return true;
            }
        }

        public final void c(@d Context context, int i5) {
            l0.p(context, ProtectedSandApp.s("ᬔ"));
            SharedPreferences.Editor edit = context.getSharedPreferences(context.getPackageName() + ProtectedSandApp.s("ᬕ"), 4).edit();
            edit.putInt(ProtectedSandApp.s("ᬖ"), i5);
            edit.apply();
        }

        public C0243a(w wVar) {
        }
    }
}
