package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.y0;

/* compiled from: BuildCompat.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\n\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001d"}, d2 = {"Landroidx/core/os/b;", "", "<init>", "()V", "", "codename", "buildCodename", "", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "()Z", "b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "m", "", "I", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final b f26493a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @kd.f
    @androidx.annotation.k(extension = 30)
    public static final int R_EXTENSION_INT;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @kd.f
    @androidx.annotation.k(extension = 31)
    public static final int S_EXTENSION_INT;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @kd.f
    @androidx.annotation.k(extension = 33)
    public static final int T_EXTENSION_INT;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @kd.f
    @androidx.annotation.k(extension = 1000000)
    public static final int AD_SERVICES_EXTENSION_INT;

    /* compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/core/os/b$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(30)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f26498a = new a();

        private a() {
        }

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    /* compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/os/b$b;", "", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @y0
    @dd.e(dd.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    /* renamed from: androidx.core.os.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0422b {
    }

    static {
        int i4 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i4 >= 30 ? a.f26498a.a(30) : 0;
        S_EXTENSION_INT = i4 >= 30 ? a.f26498a.a(31) : 0;
        T_EXTENSION_INT = i4 >= 30 ? a.f26498a.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i4 >= 30 ? a.f26498a.a(1000000) : 0;
    }

    private b() {
    }

    @kd.n
    @kotlin.k(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @androidx.annotation.k(api = 24)
    public static final boolean a() {
        return true;
    }

    @kd.n
    @kotlin.k(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @androidx.annotation.k(api = 25)
    public static final boolean b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @kd.n
    @kotlin.k(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @androidx.annotation.k(api = 26)
    public static final boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @kd.n
    @kotlin.k(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @androidx.annotation.k(api = 27)
    public static final boolean d() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @kd.n
    @kotlin.k(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @androidx.annotation.k(api = 28)
    public static final boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @kd.n
    @c1({c1.a.LIBRARY})
    @m1
    public static final boolean f(@fg.l String codename, @fg.l String buildCodename) {
        kotlin.jvm.internal.l0.p(codename, "codename");
        kotlin.jvm.internal.l0.p(buildCodename, "buildCodename");
        if (kotlin.jvm.internal.l0.g("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @kd.n
    @kotlin.k(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @androidx.annotation.k(api = 29)
    public static final boolean g() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @kd.n
    @kotlin.k(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @androidx.annotation.k(api = 30)
    public static final boolean h() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @kd.n
    @kotlin.k(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @androidx.annotation.k(api = 31, codename = "S")
    public static final boolean i() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31) {
            if (i4 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.l0.o(CODENAME, "CODENAME");
                if (f("S", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @kd.n
    @kotlin.k(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @androidx.annotation.k(api = 32, codename = "Sv2")
    public static final boolean j() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 32) {
            if (i4 >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.l0.o(CODENAME, "CODENAME");
                if (f("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @kd.n
    @kotlin.k(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @androidx.annotation.k(api = 33, codename = "Tiramisu")
    public static final boolean k() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.l0.o(CODENAME, "CODENAME");
                if (f("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @kd.n
    @kotlin.k(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @kotlin.x0(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @androidx.annotation.k(api = 34, codename = "UpsideDownCake")
    public static final boolean l() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 34) {
            if (i4 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.l0.o(CODENAME, "CODENAME");
                if (f("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @kd.n
    @androidx.annotation.k(api = 35, codename = "VanillaIceCream")
    public static final boolean m() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 35) {
            if (i4 >= 34) {
                String CODENAME = Build.VERSION.CODENAME;
                kotlin.jvm.internal.l0.o(CODENAME, "CODENAME");
                if (f("VanillaIceCream", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }
}
