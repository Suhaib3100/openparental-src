package p9;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;

/* compiled from: FirebaseCrashlytics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/Function1;", "Lp9/c;", "Lkotlin/k2;", "Lkotlin/u;", "init", "b", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Lld/l;)V", "Lea/b;", "a", "(Lea/b;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class b {
    @l
    public static final FirebaseCrashlytics a(@l ea.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㢋\u0001"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        l0.o(firebaseCrashlytics, ProtectedSandApp.s("㢌\u0001"));
        return firebaseCrashlytics;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final void b(@l FirebaseCrashlytics firebaseCrashlytics, @l ld.l<? super c, k2> lVar) {
        l0.p(firebaseCrashlytics, ProtectedSandApp.s("㢋\u0001"));
        l0.p(lVar, ProtectedSandApp.s("㢍\u0001"));
        lVar.invoke(new c(firebaseCrashlytics));
    }
}
