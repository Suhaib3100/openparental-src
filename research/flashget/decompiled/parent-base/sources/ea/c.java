package ea;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.components.b0;
import com.google.firebase.components.c;
import com.google.firebase.components.g;
import com.google.firebase.components.r;
import com.google.firebase.p;
import fg.l;
import fg.m;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.x0;
import kotlinx.coroutines.m0;
import kotlinx.coroutines.y1;

/* compiled from: Firebase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\u0010H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lea/b;", "", "name", "Lcom/google/firebase/g;", "a", "(Lea/b;Ljava/lang/String;)Lcom/google/firebase/g;", "Landroid/content/Context;", "context", "e", "(Lea/b;Landroid/content/Context;)Lcom/google/firebase/g;", "Lcom/google/firebase/p;", "options", "f", "(Lea/b;Landroid/content/Context;Lcom/google/firebase/p;)Lcom/google/firebase/g;", "g", "(Lea/b;Landroid/content/Context;Lcom/google/firebase/p;Ljava/lang/String;)Lcom/google/firebase/g;", "", "T", "Lcom/google/firebase/components/c;", "Lkotlinx/coroutines/m0;", "b", "()Lcom/google/firebase/components/c;", "c", "(Lea/b;)Lcom/google/firebase/g;", "app", "d", "(Lea/b;)Lcom/google/firebase/p;", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: Firebase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lcom/google/firebase/components/d;", "kotlin.jvm.PlatformType", "c", "Lkotlinx/coroutines/m0;", "b", "(Lcom/google/firebase/components/d;)Lkotlinx/coroutines/m0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nFirebase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Firebase.kt\ncom/google/firebase/ktx/FirebaseKt$coroutineDispatcher$1\n*L\n1#1,158:1\n*E\n"})
    public static final class a<T> implements g {

        /* renamed from: a, reason: collision with root package name */
        public static final a<T> f73771a = new a<>();

        @Override // com.google.firebase.components.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m0 a(com.google.firebase.components.d dVar) {
            l0.P();
            Object g4 = dVar.g(new b0<>(Annotation.class, Executor.class));
            l0.o(g4, ProtectedSandApp.s("㝐\u0001"));
            return y1.c((Executor) g4);
        }
    }

    @l
    public static final com.google.firebase.g a(@l b bVar, @l String str) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        l0.p(str, ProtectedSandApp.s("㝒\u0001"));
        com.google.firebase.g q4 = com.google.firebase.g.q(str);
        l0.o(q4, ProtectedSandApp.s("㝓\u0001"));
        return q4;
    }

    private static final <T extends Annotation> com.google.firebase.components.c<m0> b() {
        l0.P();
        c.b f4 = com.google.firebase.components.c.f(new b0(Annotation.class, m0.class));
        l0.P();
        c.b b5 = f4.b(r.l(new b0(Annotation.class, Executor.class)));
        l0.P();
        com.google.firebase.components.c<m0> d5 = b5.f(a.f73771a).d();
        l0.o(d5, ProtectedSandApp.s("㝔\u0001"));
        return d5;
    }

    @l
    public static final com.google.firebase.g c(@l b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        com.google.firebase.g p4 = com.google.firebase.g.p();
        l0.o(p4, ProtectedSandApp.s("㝕\u0001"));
        return p4;
    }

    @l
    public static final p d(@l b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        p s4 = c(b.f73770a).s();
        l0.o(s4, ProtectedSandApp.s("㝖\u0001"));
        return s4;
    }

    @m
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final com.google.firebase.g e(@l b bVar, @l Context context) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        l0.p(context, ProtectedSandApp.s("㝗\u0001"));
        return com.google.firebase.g.x(context);
    }

    @l
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final com.google.firebase.g f(@l b bVar, @l Context context, @l p pVar) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        l0.p(context, ProtectedSandApp.s("㝗\u0001"));
        l0.p(pVar, ProtectedSandApp.s("㝘\u0001"));
        com.google.firebase.g y4 = com.google.firebase.g.y(context, pVar);
        l0.o(y4, ProtectedSandApp.s("㝙\u0001"));
        return y4;
    }

    @l
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final com.google.firebase.g g(@l b bVar, @l Context context, @l p pVar, @l String str) {
        l0.p(bVar, ProtectedSandApp.s("㝑\u0001"));
        l0.p(context, ProtectedSandApp.s("㝗\u0001"));
        l0.p(pVar, ProtectedSandApp.s("㝘\u0001"));
        l0.p(str, ProtectedSandApp.s("㝒\u0001"));
        com.google.firebase.g z4 = com.google.firebase.g.z(context, pVar, str);
        l0.o(z4, ProtectedSandApp.s("㝚\u0001"));
        return z4;
    }
}
