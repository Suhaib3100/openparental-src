package p9;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.x0;

/* compiled from: KeyValueBuilder.kt */
@k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001c"}, d2 = {"Lp9/c;", "", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "", "key", "", "value", "Lkotlin/k2;", "f", "(Ljava/lang/String;Z)V", "", "a", "(Ljava/lang/String;D)V", "", "b", "(Ljava/lang/String;F)V", "", "c", "(Ljava/lang/String;I)V", "", "d", "(Ljava/lang/String;J)V", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final FirebaseCrashlytics crashlytics;

    public c(@l FirebaseCrashlytics firebaseCrashlytics) {
        l0.p(firebaseCrashlytics, ProtectedSandApp.s("㢎\u0001"));
        this.crashlytics = firebaseCrashlytics;
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void a(@l String key, double value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void b(@l String key, float value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void c(@l String key, int value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void d(@l String key, long value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void e(@l String key, @l String value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        l0.p(value, ProtectedSandApp.s("㢐\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }

    @k(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @x0(expression = "", imports = {}))
    public final void f(@l String key, boolean value) {
        l0.p(key, ProtectedSandApp.s("㢏\u0001"));
        this.crashlytics.setCustomKey(key, value);
    }
}
