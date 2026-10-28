package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.r;

/* compiled from: KAnnotatedElements.kt */
@kd.i(name = "KAnnotatedElements")
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a1\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "Lkotlin/reflect/b;", "a", "(Lkotlin/reflect/b;)Ljava/lang/annotation/Annotation;", "", "d", "(Lkotlin/reflect/b;)Z", "", "b", "(Lkotlin/reflect/b;)Ljava/util/List;", "Lkotlin/reflect/d;", "klass", "c", "(Lkotlin/reflect/b;Lkotlin/reflect/d;)Ljava/util/List;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKAnnotatedElements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n20#1:105\n288#2,2:103\n288#2,2:106\n288#2,2:108\n*S KotlinDebug\n*F\n+ 1 KAnnotatedElements.kt\nkotlin/reflect/full/KAnnotatedElements\n*L\n29#1:105\n20#1:103,2\n29#1:106,2\n62#1:108,2\n*E\n"})
/* loaded from: classes7.dex */
public final class b {
    @c1(version = "1.1")
    public static final <T extends Annotation> T a(kotlin.reflect.b bVar) {
        Object obj;
        l0.p(bVar, ProtectedSandApp.s("昜\u0001"));
        Iterator<T> it = bVar.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Annotation annotation = (Annotation) obj;
            l0.P();
            if (annotation != null) {
                break;
            }
        }
        l0.P();
        return (T) obj;
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.7")
    public static final <T extends Annotation> List<T> b(kotlin.reflect.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("昜\u0001"));
        l0.P();
        return c(bVar, l1.d(Annotation.class));
    }

    @l
    @o2(markerClass = {r.class})
    @c1(version = "1.7")
    public static final <T extends Annotation> List<T> c(@l kotlin.reflect.b bVar, @l kotlin.reflect.d<T> dVar) {
        Object obj;
        l0.p(bVar, ProtectedSandApp.s("昜\u0001"));
        l0.p(dVar, ProtectedSandApp.s("昝\u0001"));
        List<T> f12 = w.f1(bVar.getAnnotations(), kd.b.e(dVar));
        if (!f12.isEmpty()) {
            return f12;
        }
        Class<? extends Annotation> b5 = a.f75522a.b(kd.b.e(dVar));
        if (b5 != null) {
            Iterator<T> it = bVar.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l0.g(kd.b.e(kd.b.a((Annotation) obj)), b5)) {
                    break;
                }
            }
            Annotation annotation = (Annotation) obj;
            if (annotation != null) {
                Object invoke = annotation.getClass().getMethod(ProtectedSandApp.s("昞\u0001"), null).invoke(annotation, null);
                l0.n(invoke, ProtectedSandApp.s("星\u0001"));
                return kotlin.collections.l.t((Annotation[]) invoke);
            }
        }
        return j0.f74919b;
    }

    @o2(markerClass = {r.class})
    @c1(version = "1.4")
    public static final <T extends Annotation> boolean d(kotlin.reflect.b bVar) {
        Object obj;
        l0.p(bVar, ProtectedSandApp.s("昜\u0001"));
        Iterator<T> it = bVar.getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Annotation annotation = (Annotation) obj;
            l0.P();
            if (annotation != null) {
                break;
            }
        }
        l0.P();
        return ((Annotation) obj) != null;
    }
}
