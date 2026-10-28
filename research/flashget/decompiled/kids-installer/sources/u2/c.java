package u2;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.p;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.o0;

/* compiled from: Firebase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007\u001a$\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\fH\u0082\b\"\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0015\u0010\t\u001a\u00020\b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu2/b;", "", "name", "Lcom/google/firebase/g;", "a", "Landroid/content/Context;", "context", "e", "Lcom/google/firebase/p;", "options", "f", "g", "", "T", "Lcom/google/firebase/components/c;", "Lkotlinx/coroutines/o0;", "b", "c", "(Lu2/b;)Lcom/google/firebase/g;", "app", "d", "(Lu2/b;)Lcom/google/firebase/p;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/o0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/o0;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f33576a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o0 a(com.google.firebase.components.d dVar) {
            l0.P();
            Object h5 = dVar.h(new b0<>(Annotation.class, Executor.class));
            l0.o(h5, ProtectedSandApp.s("⯭"));
            return b2.c((Executor) h5);
        }
    }

    @d5.d
    public static final com.google.firebase.g a(@d5.d b bVar, @d5.d String str) {
        l0.p(bVar, ProtectedSandApp.s("ᮀ"));
        l0.p(str, ProtectedSandApp.s("ᮁ"));
        com.google.firebase.g q5 = com.google.firebase.g.q(str);
        l0.o(q5, ProtectedSandApp.s("ᮂ"));
        return q5;
    }

    private static final <T extends Annotation> com.google.firebase.components.c<o0> b() {
        l0.P();
        c.b f6 = com.google.firebase.components.c.f(new b0(Annotation.class, o0.class));
        l0.P();
        c.b b6 = f6.b(r.l(new b0(Annotation.class, Executor.class)));
        l0.P();
        com.google.firebase.components.c<o0> d6 = b6.f(a.f33576a).d();
        l0.o(d6, ProtectedSandApp.s("ᮃ"));
        return d6;
    }

    @d5.d
    public static final com.google.firebase.g c(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᮄ"));
        com.google.firebase.g p5 = com.google.firebase.g.p();
        l0.o(p5, ProtectedSandApp.s("ᮅ"));
        return p5;
    }

    @d5.d
    public static final p d(@d5.d b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᮆ"));
        p s5 = c(b.f33575a).s();
        l0.o(s5, ProtectedSandApp.s("ᮇ"));
        return s5;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @d5.e
    public static final com.google.firebase.g e(@d5.d b bVar, @d5.d Context context) {
        l0.p(bVar, ProtectedSandApp.s("ᮈ"));
        l0.p(context, ProtectedSandApp.s("ᮉ"));
        return com.google.firebase.g.x(context);
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @d5.d
    public static final com.google.firebase.g f(@d5.d b bVar, @d5.d Context context, @d5.d p pVar) {
        l0.p(bVar, ProtectedSandApp.s("ᮊ"));
        l0.p(context, ProtectedSandApp.s("ᮋ"));
        l0.p(pVar, ProtectedSandApp.s("ᮌ"));
        com.google.firebase.g y5 = com.google.firebase.g.y(context, pVar);
        l0.o(y5, ProtectedSandApp.s("ᮍ"));
        return y5;
    }

    @Deprecated(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @d5.d
    public static final com.google.firebase.g g(@d5.d b bVar, @d5.d Context context, @d5.d p pVar, @d5.d String str) {
        l0.p(bVar, ProtectedSandApp.s("ᮎ"));
        l0.p(context, ProtectedSandApp.s("ᮏ"));
        l0.p(pVar, ProtectedSandApp.s("ᮐ"));
        l0.p(str, ProtectedSandApp.s("ᮑ"));
        com.google.firebase.g z5 = com.google.firebase.g.z(context, pVar, str);
        l0.o(z5, ProtectedSandApp.s("ᮒ"));
        return z5;
    }
}
