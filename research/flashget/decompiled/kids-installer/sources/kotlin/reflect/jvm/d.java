package kotlin.reflect.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import p3.i;

/* compiled from: KTypesJvm.kt */
@i(name = "KTypesJvm")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\"\"\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/s;", "Lkotlin/reflect/d;", "b", "(Lkotlin/reflect/s;)Lkotlin/reflect/d;", "getJvmErasure$annotations", "(Lkotlin/reflect/s;)V", "jvmErasure", "Lkotlin/reflect/g;", "a", "(Lkotlin/reflect/g;)Lkotlin/reflect/d;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    @d5.d
    public static final KClass<?> a(@d5.d KClassifier kClassifier) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar;
        KClass<?> b6;
        Object G2;
        l0.p(kClassifier, ProtectedSandApp.s("䌽"));
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (!(kClassifier instanceof KTypeParameter)) {
            throw new e0(ProtectedSandApp.s("䌿") + kClassifier);
        }
        List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
        Iterator<T> it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KType kType = (KType) next;
            l0.n(kType, ProtectedSandApp.s("䌾"));
            h b7 = ((b0) kType).getType().U0().b();
            eVar = b7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) b7 : null;
            if ((eVar == null || eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.INTERFACE || eVar.j() == kotlin.reflect.jvm.internal.impl.descriptors.f.ANNOTATION_CLASS) ? false : true) {
                eVar = next;
                break;
            }
        }
        KType kType2 = (KType) eVar;
        if (kType2 == null) {
            G2 = j0.G2(upperBounds);
            kType2 = (KType) G2;
        }
        return (kType2 == null || (b6 = b(kType2)) == null) ? l1.d(Object.class) : b6;
    }

    @d5.d
    public static final KClass<?> b(@d5.d KType kType) {
        KClass<?> a6;
        l0.p(kType, ProtectedSandApp.s("䍀"));
        KClassifier f23643o = kType.getF23643o();
        if (f23643o != null && (a6 = a(f23643o)) != null) {
            return a6;
        }
        throw new e0(ProtectedSandApp.s("䍁") + kType);
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void c(KType kType) {
    }
}
