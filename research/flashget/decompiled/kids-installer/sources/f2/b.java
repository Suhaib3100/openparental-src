package f2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.i;
import d5.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.l0;

/* compiled from: KeyValueBuilder.kt */
@Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder` from the main module.")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\fH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lf2/b;", "", "", "key", "", "value", "Lkotlin/m2;", "f", "", "a", "", "b", "", "c", "", "d", "e", "Lcom/google/firebase/crashlytics/i;", "Lcom/google/firebase/crashlytics/i;", "crashlytics", "<init>", "(Lcom/google/firebase/crashlytics/i;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final i crashlytics;

    public b(@d i iVar) {
        l0.p(iVar, ProtectedSandApp.s("ᬥ"));
        this.crashlytics = iVar;
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void a(@d String str, double d6) {
        l0.p(str, ProtectedSandApp.s("ᬦ"));
        this.crashlytics.k(str, d6);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void b(@d String str, float f6) {
        l0.p(str, ProtectedSandApp.s("ᬧ"));
        this.crashlytics.l(str, f6);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void c(@d String str, int i5) {
        l0.p(str, ProtectedSandApp.s("ᬨ"));
        this.crashlytics.m(str, i5);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void d(@d String str, long j5) {
        l0.p(str, ProtectedSandApp.s("ᬩ"));
        this.crashlytics.n(str, j5);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void e(@d String str, @d String str2) {
        l0.p(str, ProtectedSandApp.s("ᬪ"));
        l0.p(str2, ProtectedSandApp.s("ᬫ"));
        this.crashlytics.o(str, str2);
    }

    @Deprecated(message = "Use `com.google.firebase.crashlytics.KeyValueBuilder.key(key, value)` from the main module.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public final void f(@d String str, boolean z5) {
        l0.p(str, ProtectedSandApp.s("ᬬ"));
        this.crashlytics.p(str, z5);
    }
}
