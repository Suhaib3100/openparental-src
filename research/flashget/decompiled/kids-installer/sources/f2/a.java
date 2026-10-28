package f2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.i;
import d5.d;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import q3.l;

/* compiled from: FirebaseCrashlytics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007\"\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/crashlytics/i;", "Lkotlin/Function1;", "Lf2/b;", "Lkotlin/m2;", "Lkotlin/u;", "init", "b", "Lu2/b;", "a", "(Lu2/b;)Lcom/google/firebase/crashlytics/i;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a {
    @d
    public static final i a(@d u2.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᬡ"));
        i d6 = i.d();
        l0.o(d6, ProtectedSandApp.s("ᬢ"));
        return d6;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final void b(@d i iVar, @d l<? super b, m2> lVar) {
        l0.p(iVar, ProtectedSandApp.s("ᬣ"));
        l0.p(lVar, ProtectedSandApp.s("ᬤ"));
        lVar.N(new b(iVar));
    }
}
