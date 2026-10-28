package kotlin.reflect.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.Iterator;
import java.util.List;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.g;
import kotlin.reflect.jvm.internal.d0;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.s;
import kotlin.reflect.t;

/* compiled from: KTypesJvm.kt */
@i(name = "KTypesJvm")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/s;", "Lkotlin/reflect/d;", "b", "(Lkotlin/reflect/s;)Lkotlin/reflect/d;", "c", "(Lkotlin/reflect/s;)V", "jvmErasure", "Lkotlin/reflect/g;", "a", "(Lkotlin/reflect/g;)Lkotlin/reflect/d;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKTypesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n288#2,2:53\n*S KotlinDebug\n*F\n+ 1 KTypesJvm.kt\nkotlin/reflect/jvm/KTypesJvm\n*L\n44#1:53,2\n*E\n"})
/* loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final kotlin.reflect.d<?> a(@l g gVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
        kotlin.reflect.d<?> b5;
        l0.p(gVar, ProtectedSandApp.s("晕\u0001"));
        if (gVar instanceof kotlin.reflect.d) {
            return (kotlin.reflect.d) gVar;
        }
        if (!(gVar instanceof t)) {
            throw new g0(ProtectedSandApp.s("晗\u0001") + gVar);
        }
        List<s> upperBounds = ((t) gVar).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            s sVar = (s) next;
            l0.n(sVar, ProtectedSandApp.s("晖\u0001"));
            h c5 = ((d0) sVar).getType().O0().c();
            eVar = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) c5 : null;
            if (eVar != null && eVar.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE && eVar.b() != kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) {
                eVar = next;
                break;
            }
        }
        s sVar2 = (s) eVar;
        if (sVar2 == null) {
            sVar2 = (s) w.G2(upperBounds);
        }
        return (sVar2 == null || (b5 = b(sVar2)) == null) ? l1.d(Object.class) : b5;
    }

    @l
    public static final kotlin.reflect.d<?> b(@l s sVar) {
        kotlin.reflect.d<?> a5;
        l0.p(sVar, ProtectedSandApp.s("晕\u0001"));
        g classifier = sVar.getClassifier();
        if (classifier != null && (a5 = a(classifier)) != null) {
            return a5;
        }
        throw new g0(ProtectedSandApp.s("晗\u0001") + sVar);
    }

    @c1(version = "1.1")
    public static /* synthetic */ void c(s sVar) {
    }
}
