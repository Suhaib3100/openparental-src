package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.EmptyList;
import kotlin.collections.i0;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;

/* compiled from: KAnnotatedElements.kt */
@p3.i(name = "KAnnotatedElements")
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b\u001a*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¨\u0006\f"}, d2 = {"", "T", "Lkotlin/reflect/b;", "a", "(Lkotlin/reflect/b;)Ljava/lang/annotation/Annotation;", "", "d", "", "b", "Lkotlin/reflect/d;", "klass", "c", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class b {
    @SinceKotlin(version = "1.1")
    public static final <T extends Annotation> T a(KAnnotatedElement kAnnotatedElement) {
        Object obj;
        l0.p(kAnnotatedElement, ProtectedSandApp.s("䋡"));
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            l0.P();
            if (((Annotation) obj) instanceof Annotation) {
                break;
            }
        }
        l0.P();
        return (T) obj;
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T extends Annotation> List<T> b(KAnnotatedElement kAnnotatedElement) {
        l0.p(kAnnotatedElement, ProtectedSandApp.s("䋢"));
        l0.P();
        return c(kAnnotatedElement, l1.d(Annotation.class));
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final <T extends Annotation> List<T> c(@d5.d KAnnotatedElement kAnnotatedElement, @d5.d KClass<T> kClass) {
        List<T> f12;
        Object obj;
        List<T> t5;
        l0.p(kAnnotatedElement, ProtectedSandApp.s("䋣"));
        l0.p(kClass, ProtectedSandApp.s("䋤"));
        f12 = i0.f1(kAnnotatedElement.getAnnotations(), p3.b.e(kClass));
        if (!f12.isEmpty()) {
            return f12;
        }
        Class<? extends Annotation> b6 = a.f23773a.b(p3.b.e(kClass));
        if (b6 != null) {
            Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l0.g(p3.b.e(p3.b.a((Annotation) obj)), b6)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod(ProtectedSandApp.s("䋥"), new Class[0]).invoke(annotation, new Object[0]);
                l0.n(invoke, ProtectedSandApp.s("䋦"));
                t5 = p.t((Annotation[]) invoke);
                return t5;
            }
        }
        return EmptyList.f23167o;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final <T extends Annotation> boolean d(KAnnotatedElement kAnnotatedElement) {
        Object obj;
        l0.p(kAnnotatedElement, ProtectedSandApp.s("䋧"));
        Iterator<T> it = kAnnotatedElement.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            l0.P();
            if (((Annotation) obj) instanceof Annotation) {
                break;
            }
        }
        l0.P();
        return ((Annotation) obj) != null;
    }
}
