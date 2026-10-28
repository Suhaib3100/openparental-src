package kotlin.reflect.full;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.b0;
import kotlin.reflect.jvm.internal.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.jvm.internal.m;
import kotlin.reflect.jvm.internal.q;
import q3.l;

/* compiled from: KClasses.kt */
@p3.i(name = "KClasses")
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a-\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a#\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\"6\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"(\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"$\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0018\u0010\r\"\"\u0010\u001f\u001a\u00020\u001b*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\",\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#\",\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0012\u001a\u0004\b&\u0010#\",\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0012\u001a\u0004\b)\u0010#\",\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0012\u001a\u0004\b,\u0010#\",\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0012\u001a\u0004\b/\u0010#\",\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0012\u001a\u0004\b2\u0010#\",\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0012\u001a\u0004\b5\u0010#\",\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0012\u001a\u0004\b8\u0010#\",\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0012\u001a\u0004\b<\u0010#\">\u0010B\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030?0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0012\u001a\u0004\b@\u0010#\"B\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030C0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0012\u001a\u0004\bD\u0010#\">\u0010I\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030?0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0012\u001a\u0004\bG\u0010#\"B\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030C0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0012\u001a\u0004\bJ\u0010#\"\u001c\u0010O\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010N\"\u001c\u0010Q\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010N\",\u0010V\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000R*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0012\u001a\u0004\bS\u0010T\"(\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001b0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0012\u001a\u0004\bW\u0010#\",\u0010\\\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0012\u001a\u0004\bZ\u0010#¨\u0006]"}, d2 = {"Lkotlin/reflect/d;", "base", "", "V", "derived", "X", "", "T", "value", "d", "(Lkotlin/reflect/d;Ljava/lang/Object;)Ljava/lang/Object;", "Y", "e", "(Lkotlin/reflect/d;)Ljava/lang/Object;", "Lkotlin/reflect/i;", "L", "(Lkotlin/reflect/d;)Lkotlin/reflect/i;", "getPrimaryConstructor$annotations", "(Lkotlin/reflect/d;)V", "primaryConstructor", "j", "(Lkotlin/reflect/d;)Lkotlin/reflect/d;", "getCompanionObject$annotations", "companionObject", "l", "getCompanionObjectInstance$annotations", "companionObjectInstance", "Lkotlin/reflect/s;", "z", "(Lkotlin/reflect/d;)Lkotlin/reflect/s;", "getDefaultType$annotations", "defaultType", "", "Lkotlin/reflect/c;", "x", "(Lkotlin/reflect/d;)Ljava/util/Collection;", "getDeclaredMembers$annotations", "declaredMembers", "B", "getFunctions$annotations", "functions", "N", "getStaticFunctions$annotations", "staticFunctions", "H", "getMemberFunctions$annotations", "memberFunctions", "D", "getMemberExtensionFunctions$annotations", "memberExtensionFunctions", "n", "getDeclaredFunctions$annotations", "declaredFunctions", "t", "getDeclaredMemberFunctions$annotations", "declaredMemberFunctions", "p", "getDeclaredMemberExtensionFunctions$annotations", "declaredMemberExtensionFunctions", "Lkotlin/reflect/p;", "P", "getStaticProperties$annotations", "staticProperties", "Lkotlin/reflect/q;", "J", "getMemberProperties$annotations", "memberProperties", "Lkotlin/reflect/r;", "F", "getMemberExtensionProperties$annotations", "memberExtensionProperties", "v", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "r", "getDeclaredMemberExtensionProperties$annotations", "declaredMemberExtensionProperties", "Lkotlin/reflect/jvm/internal/l;", "(Lkotlin/reflect/jvm/internal/l;)Z", "isExtension", "U", "isNotExtension", "", "R", "(Lkotlin/reflect/d;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "h", "getAllSupertypes$annotations", "allSupertypes", "f", "getAllSuperclasses$annotations", "allSuperclasses", "kotlin-reflection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class f {

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"kotlin/reflect/full/f$a", "Lkotlin/reflect/jvm/internal/impl/utils/b$f;", "Lkotlin/reflect/s;", "current", "", "f", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class a extends b.f<KType, KType> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC0396b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean c(@d5.d KType current) {
            l0.p(current, ProtectedSandApp.s("罾"));
            ((LinkedList) this.f26659a).add(current);
            return true;
        }
    }

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class b extends Lambda implements q3.a<Type> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ KClass<?> f23788p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(KClass<?> kClass) {
            super(0);
            this.f23788p = kClass;
        }

        @Override // q3.a
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type n() {
            return ((m) this.f23788p).f();
        }
    }

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/d;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    static final class d extends Lambda implements l<KClass<?>, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ KClass<?> f23790p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(KClass<?> kClass) {
            super(1);
            this.f23790p = kClass;
        }

        @Override // q3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(KClass<?> kClass) {
            return Boolean.valueOf(l0.g(kClass, this.f23790p));
        }
    }

    @SinceKotlin(version = "1.1")
    @Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    public static /* synthetic */ void A(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> B(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋴"));
        Collection<KCallable<?>> A = kClass.A();
        ArrayList arrayList = new ArrayList();
        for (Object obj : A) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void C(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> D(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋵"));
        Collection<kotlin.reflect.jvm.internal.l<?>> h5 = ((m.a) ((m) kClass).v0().n()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) obj;
            if (T(lVar) && (lVar instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void E(KClass kClass) {
    }

    @d5.d
    public static final <T> Collection<KProperty2<T, ?, ?>> F(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋶"));
        Collection<kotlin.reflect.jvm.internal.l<?>> h5 = ((m) kClass).v0().n().h();
        ArrayList arrayList = new ArrayList();
        for (T t5 : h5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) t5;
            if (T(lVar) && (lVar instanceof KProperty2)) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void G(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> H(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋷"));
        Collection<kotlin.reflect.jvm.internal.l<?>> h5 = ((m.a) ((m) kClass).v0().n()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) obj;
            if (U(lVar) && (lVar instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void I(KClass kClass) {
    }

    @d5.d
    public static final <T> Collection<KProperty1<T, ?>> J(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋸"));
        Collection<kotlin.reflect.jvm.internal.l<?>> h5 = ((m) kClass).v0().n().h();
        ArrayList arrayList = new ArrayList();
        for (T t5 : h5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) t5;
            if (U(lVar) && (lVar instanceof KProperty1)) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void K(KClass kClass) {
    }

    @d5.e
    public static final <T> KFunction<T> L(@d5.d KClass<T> kClass) {
        T t5;
        l0.p(kClass, ProtectedSandApp.s("䋹"));
        Iterator<T> it = ((m) kClass).l().iterator();
        while (true) {
            if (!it.hasNext()) {
                t5 = null;
                break;
            }
            t5 = it.next();
            KFunction kFunction = (KFunction) t5;
            l0.n(kFunction, ProtectedSandApp.s("䋺"));
            z C0 = ((q) kFunction).C0();
            l0.n(C0, ProtectedSandApp.s("䋻"));
            if (((kotlin.reflect.jvm.internal.impl.descriptors.l) C0).M()) {
                break;
            }
        }
        return (KFunction) t5;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void M(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> N(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋼"));
        Collection<kotlin.reflect.jvm.internal.l<?>> i5 = ((m.a) ((m) kClass).v0().n()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i5) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void O(KClass kClass) {
    }

    @d5.d
    public static final Collection<KProperty0<?>> P(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋽"));
        Collection<kotlin.reflect.jvm.internal.l<?>> i5 = ((m.a) ((m) kClass).v0().n()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) obj;
            if (U(lVar) && (lVar instanceof KProperty0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void Q(KClass kClass) {
    }

    @d5.d
    public static final List<KClass<?>> R(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䋾"));
        List<KType> m5 = kClass.m();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = m5.iterator();
        while (it.hasNext()) {
            KClassifier k5 = ((KType) it.next()).k();
            KClass kClass2 = k5 instanceof KClass ? (KClass) k5 : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void S(KClass kClass) {
    }

    private static final boolean T(kotlin.reflect.jvm.internal.l<?> lVar) {
        return lVar.C0().t0() != null;
    }

    private static final boolean U(kotlin.reflect.jvm.internal.l<?> lVar) {
        return !T(lVar);
    }

    @SinceKotlin(version = "1.1")
    public static final boolean V(@d5.d KClass<?> kClass, @d5.d KClass<?> kClass2) {
        List k5;
        l0.p(kClass, ProtectedSandApp.s("䋿"));
        l0.p(kClass2, ProtectedSandApp.s("䌀"));
        if (!l0.g(kClass, kClass2)) {
            k5 = kotlin.collections.z.k(kClass);
            Boolean e6 = kotlin.reflect.jvm.internal.impl.utils.b.e(k5, new e(new f1() { // from class: kotlin.reflect.full.f.c
                @Override // kotlin.reflect.KProperty1
                @d5.e
                public Object get(@d5.e Object obj) {
                    return f.R((KClass) obj);
                }

                @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
                @d5.d
                public String getName() {
                    return ProtectedSandApp.s("罿");
                }

                @Override // kotlin.jvm.internal.q
                @d5.d
                public KDeclarationContainer w0() {
                    return l1.h(f.class, ProtectedSandApp.s("羀"));
                }

                @Override // kotlin.jvm.internal.q
                @d5.d
                public String y0() {
                    return ProtectedSandApp.s("羁");
                }
            }), new d(kClass2));
            l0.o(e6, ProtectedSandApp.s("䌁"));
            if (!e6.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable W(KProperty1 kProperty1, KClass kClass) {
        l0.p(kProperty1, ProtectedSandApp.s("䌂"));
        return (Iterable) kProperty1.N(kClass);
    }

    @SinceKotlin(version = "1.1")
    public static final boolean X(@d5.d KClass<?> kClass, @d5.d KClass<?> kClass2) {
        l0.p(kClass, ProtectedSandApp.s("䌃"));
        l0.p(kClass2, ProtectedSandApp.s("䌄"));
        return V(kClass2, kClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @d5.e
    public static final <T> T Y(@d5.d KClass<T> kClass, @d5.e Object obj) {
        l0.p(kClass, ProtectedSandApp.s("䌅"));
        if (!kClass.j0(obj)) {
            return null;
        }
        l0.n(obj, ProtectedSandApp.s("䌆"));
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Iterable a(KType kType) {
        int b02;
        KClassifier k5 = kType.k();
        q3.a aVar = null;
        Object[] objArr = 0;
        KClass kClass = k5 instanceof KClass ? (KClass) k5 : null;
        if (kClass == null) {
            throw new e0(ProtectedSandApp.s("䌋") + kType);
        }
        List<KType> m5 = kClass.m();
        if (kType.g().isEmpty()) {
            return m5;
        }
        String s5 = ProtectedSandApp.s("䌇");
        l0.n(kType, s5);
        q1 f6 = q1.f(((b0) kType).getType());
        b02 = kotlin.collections.b0.b0(m5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (KType kType2 : m5) {
            l0.n(kType2, s5);
            h0 p5 = f6.p(((b0) kType2).getType(), x1.INVARIANT);
            if (p5 == null) {
                throw new e0(ProtectedSandApp.s("䌉") + kType2 + ProtectedSandApp.s("䌊") + kType + ')');
            }
            l0.o(p5, ProtectedSandApp.s("䌈"));
            arrayList.add(new b0(p5, aVar, 2, objArr == true ? 1 : 0));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T> T d(@d5.d KClass<T> kClass, @d5.e Object obj) {
        l0.p(kClass, ProtectedSandApp.s("䌌"));
        if (kClass.j0(obj)) {
            l0.n(obj, ProtectedSandApp.s("䌍"));
            return obj;
        }
        throw new TypeCastException(ProtectedSandApp.s("䌎") + kClass.J());
    }

    @SinceKotlin(version = "1.1")
    @d5.d
    public static final <T> T e(@d5.d KClass<T> kClass) {
        Map<KParameter, ? extends Object> z5;
        boolean z6;
        l0.p(kClass, ProtectedSandApp.s("䌏"));
        Iterator<T> it = kClass.l().iterator();
        T t5 = null;
        T t6 = null;
        boolean z7 = false;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                List<KParameter> r5 = ((KFunction) next).r();
                if (!(r5 instanceof Collection) || !r5.isEmpty()) {
                    Iterator<T> it2 = r5.iterator();
                    while (it2.hasNext()) {
                        if (!((KParameter) it2.next()).q0()) {
                            z6 = false;
                            break;
                        }
                    }
                }
                z6 = true;
                if (z6) {
                    if (z7) {
                        break;
                    }
                    t6 = next;
                    z7 = true;
                }
            } else if (z7) {
                t5 = t6;
            }
        }
        KFunction kFunction = (KFunction) t5;
        if (kFunction != null) {
            z5 = kotlin.collections.f1.z();
            return (T) kFunction.X(z5);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("䌐") + kClass);
    }

    @d5.d
    public static final Collection<KClass<?>> f(@d5.d KClass<?> kClass) {
        int b02;
        l0.p(kClass, ProtectedSandApp.s("䌑"));
        Collection<KType> h5 = h(kClass);
        b02 = kotlin.collections.b0.b0(h5, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (KType kType : h5) {
            KClassifier k5 = kType.k();
            KClass kClass2 = k5 instanceof KClass ? (KClass) k5 : null;
            if (kClass2 == null) {
                throw new e0(ProtectedSandApp.s("䌒") + kType);
            }
            arrayList.add(kClass2);
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void g(KClass kClass) {
    }

    @d5.d
    public static final Collection<KType> h(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌓"));
        Object c6 = kotlin.reflect.jvm.internal.impl.utils.b.c(kClass.m(), kotlin.reflect.full.d.f23786a, new b.h(), new a());
        l0.o(c6, ProtectedSandApp.s("䌔"));
        return (Collection) c6;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void i(KClass kClass) {
    }

    @d5.e
    public static final KClass<?> j(@d5.d KClass<?> kClass) {
        Object obj;
        l0.p(kClass, ProtectedSandApp.s("䌕"));
        Iterator<T> it = kClass.K().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            KClass kClass2 = (KClass) obj;
            l0.n(kClass2, ProtectedSandApp.s("䌖"));
            if (((m) kClass2).n().L()) {
                break;
            }
        }
        return (KClass) obj;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void k(KClass kClass) {
    }

    @d5.e
    public static final Object l(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌗"));
        KClass<?> j5 = j(kClass);
        if (j5 != null) {
            return j5.T();
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void m(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> n(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌘"));
        Collection<kotlin.reflect.jvm.internal.l<?>> l5 = ((m.a) ((m) kClass).v0().n()).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : l5) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void o(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> p(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌙"));
        Collection<kotlin.reflect.jvm.internal.l<?>> m5 = ((m.a) ((m) kClass).v0().n()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) obj;
            if (T(lVar) && (lVar instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void q(KClass kClass) {
    }

    @d5.d
    public static final <T> Collection<KProperty2<T, ?, ?>> r(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌚"));
        Collection<kotlin.reflect.jvm.internal.l<?>> m5 = ((m) kClass).v0().n().m();
        ArrayList arrayList = new ArrayList();
        for (T t5 : m5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) t5;
            if (T(lVar) && (lVar instanceof KProperty2)) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void s(KClass kClass) {
    }

    @d5.d
    public static final Collection<KFunction<?>> t(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌛"));
        Collection<kotlin.reflect.jvm.internal.l<?>> m5 = ((m.a) ((m) kClass).v0().n()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) obj;
            if (U(lVar) && (lVar instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void u(KClass kClass) {
    }

    @d5.d
    public static final <T> Collection<KProperty1<T, ?>> v(@d5.d KClass<T> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌜"));
        Collection<kotlin.reflect.jvm.internal.l<?>> m5 = ((m) kClass).v0().n().m();
        ArrayList arrayList = new ArrayList();
        for (T t5 : m5) {
            kotlin.reflect.jvm.internal.l lVar = (kotlin.reflect.jvm.internal.l) t5;
            if (U(lVar) && (lVar instanceof KProperty1)) {
                arrayList.add(t5);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void w(KClass kClass) {
    }

    @d5.d
    public static final Collection<KCallable<?>> x(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌝"));
        return ((m.a) ((m) kClass).v0().n()).l();
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void y(KClass kClass) {
    }

    @d5.d
    public static final KType z(@d5.d KClass<?> kClass) {
        l0.p(kClass, ProtectedSandApp.s("䌞"));
        p0 E = ((m) kClass).n().E();
        l0.o(E, ProtectedSandApp.s("䌟"));
        return new b0(E, new b(kClass));
    }
}
