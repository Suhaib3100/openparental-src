package kotlin.reflect.full;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.c1;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.reflect.jvm.internal.d0;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.q1;
import kotlin.reflect.jvm.internal.impl.types.x1;
import kotlin.reflect.jvm.internal.impl.utils.b;
import kotlin.reflect.jvm.internal.n;
import kotlin.reflect.jvm.internal.o;
import kotlin.reflect.p;
import kotlin.reflect.q;
import kotlin.reflect.r;
import kotlin.reflect.s;

/* compiled from: KClasses.kt */
@kd.i(name = "KClasses")
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\u001a#\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a-\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a#\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\"6\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"(\u0010\u0018\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0015\u0010\u0016\"$\u0010\u001b\u001a\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u000e\"\"\u0010 \u001a\u00020\u001c*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u001e\",\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b#\u0010$\",\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b'\u0010$\",\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0013\u001a\u0004\b*\u0010$\",\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0013\u001a\u0004\b-\u0010$\",\u00102\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0013\u001a\u0004\b0\u0010$\",\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0013\u001a\u0004\b3\u0010$\",\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0013\u001a\u0004\b6\u0010$\",\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0013\u001a\u0004\b9\u0010$\",\u0010?\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b>\u0010\u0013\u001a\u0004\b=\u0010$\">\u0010C\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010\u0013\u001a\u0004\bA\u0010$\"B\u0010G\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0013\u001a\u0004\bE\u0010$\">\u0010J\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0013\u001a\u0004\bH\u0010$\"B\u0010M\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0013\u001a\u0004\bK\u0010$\"\u001c\u0010P\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010O\"\u001c\u0010R\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010O\",\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000S*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0013\u001a\u0004\bT\u0010U\"(\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001c0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010\u0013\u001a\u0004\bX\u0010$\",\u0010]\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010\u0013\u001a\u0004\b[\u0010$¨\u0006^"}, d2 = {"Lkotlin/reflect/d;", "base", "", "V", "(Lkotlin/reflect/d;Lkotlin/reflect/d;)Z", "derived", "X", "", "T", "value", "d", "(Lkotlin/reflect/d;Ljava/lang/Object;)Ljava/lang/Object;", "Y", "e", "(Lkotlin/reflect/d;)Ljava/lang/Object;", "Lkotlin/reflect/i;", "L", "(Lkotlin/reflect/d;)Lkotlin/reflect/i;", "M", "(Lkotlin/reflect/d;)V", "primaryConstructor", "j", "(Lkotlin/reflect/d;)Lkotlin/reflect/d;", "k", "companionObject", "l", "m", "companionObjectInstance", "Lkotlin/reflect/s;", "z", "(Lkotlin/reflect/d;)Lkotlin/reflect/s;", "A", "defaultType", "", "Lkotlin/reflect/c;", "x", "(Lkotlin/reflect/d;)Ljava/util/Collection;", "y", "declaredMembers", "B", "C", "functions", "N", "O", "staticFunctions", "H", "I", "memberFunctions", "D", "E", "memberExtensionFunctions", "n", "o", "declaredFunctions", "t", "u", "declaredMemberFunctions", "p", "q", "declaredMemberExtensionFunctions", "Lkotlin/reflect/p;", "P", "Q", "staticProperties", "Lkotlin/reflect/q;", "J", "K", "memberProperties", "Lkotlin/reflect/r;", "F", "G", "memberExtensionProperties", "v", "w", "declaredMemberProperties", "r", "s", "declaredMemberExtensionProperties", "Lkotlin/reflect/jvm/internal/n;", "(Lkotlin/reflect/jvm/internal/n;)Z", "isExtension", "U", "isNotExtension", "", "R", "(Lkotlin/reflect/d;)Ljava/util/List;", "S", "superclasses", "h", "i", "allSupertypes", "f", "g", "allSuperclasses", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n288#2,2:282\n288#2,2:284\n800#2,11:286\n800#2,11:297\n766#2:308\n857#2,2:309\n766#2:311\n857#2,2:312\n800#2,11:314\n766#2:325\n857#2,2:326\n766#2:328\n857#2,2:329\n766#2:331\n857#2,2:332\n766#2:334\n857#2,2:335\n766#2:337\n857#2,2:338\n766#2:340\n857#2,2:341\n766#2:343\n857#2,2:344\n1603#2,9:346\n1855#2:355\n1856#2:357\n1612#2:358\n1549#2:359\n1620#2,3:360\n661#2,4:363\n1726#2,3:367\n665#2,7:370\n1549#2:377\n1620#2,3:378\n1#3:356\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:282,2\n47#1:284,2\n89#1:286,11\n96#1:297,11\n103#1:308\n103#1:309,2\n110#1:311\n110#1:312,2\n119#1:314,11\n126#1:325\n126#1:326,2\n133#1:328\n133#1:329,2\n141#1:331\n141#1:332,2\n148#1:334\n148#1:335,2\n155#1:337\n155#1:338,2\n162#1:340\n162#1:341,2\n169#1:343\n169#1:344,2\n184#1:346,9\n184#1:355\n184#1:357\n184#1:358\n223#1:359\n223#1:360,3\n276#1:363,4\n276#1:367,3\n276#1:370,7\n200#1:377\n200#1:378,3\n184#1:356\n*E\n"})
/* loaded from: classes7.dex */
public final class f {

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlin/reflect/full/f$a", "Lkotlin/reflect/jvm/internal/impl/utils/b$f;", "Lkotlin/reflect/s;", "current", "", "e", "(Lkotlin/reflect/s;)Z", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends b.f<s, s> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1200b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(@l s current) {
            l0.p(current, ProtectedSandApp.s("昬\u0001"));
            ((LinkedList) this.f78667a).add(current);
            return true;
        }
    }

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.a<Type> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d<?> f75537b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.reflect.d<?> dVar) {
            super(0);
            this.f75537b = dVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Type invoke() {
            return ((o) this.f75537b).e();
        }
    }

    /* compiled from: KClasses.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class c extends f1 {

        /* renamed from: b, reason: collision with root package name */
        public static final c f75538b = new c();

        /* synthetic */ c() {
        }

        @Override // kotlin.reflect.q
        @m
        public Object get(@m Object obj) {
            return f.R((kotlin.reflect.d) obj);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @l
        public String getName() {
            return ProtectedSandApp.s("昭\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @l
        public kotlin.reflect.h getOwner() {
            return l1.h(f.class, ProtectedSandApp.s("昮\u0001"));
        }

        @Override // kotlin.jvm.internal.q
        @l
        public String getSignature() {
            return ProtectedSandApp.s("是\u0001");
        }
    }

    /* compiled from: KClasses.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/d;", "kotlin.jvm.PlatformType", "it", "", "a", "(Lkotlin/reflect/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends n0 implements ld.l<kotlin.reflect.d<?>, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.d<?> f75539b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.reflect.d<?> dVar) {
            super(1);
            this.f75539b = dVar;
        }

        @Override // ld.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.d<?> dVar) {
            return Boolean.valueOf(l0.g(dVar, this.f75539b));
        }
    }

    @c1(version = "1.1")
    @k(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    public static /* synthetic */ void A(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> B(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<kotlin.reflect.c<?>> r4 = dVar.r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : r4) {
            if (obj instanceof kotlin.reflect.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void C(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> D(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> h4 = ((o.a) ((o) dVar).k0().getValue()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h4) {
            n nVar = (n) obj;
            if (T(nVar) && (nVar instanceof kotlin.reflect.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void E(kotlin.reflect.d dVar) {
    }

    @l
    public static final <T> Collection<r<T, ?, ?>> F(@l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> h4 = ((o) dVar).k0().getValue().h();
        ArrayList arrayList = new ArrayList();
        for (T t4 : h4) {
            n nVar = (n) t4;
            if (T(nVar) && (nVar instanceof r)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void G(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> H(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> h4 = ((o.a) ((o) dVar).k0().getValue()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h4) {
            n nVar = (n) obj;
            if (U(nVar) && (nVar instanceof kotlin.reflect.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void I(kotlin.reflect.d dVar) {
    }

    @l
    public static final <T> Collection<q<T, ?>> J(@l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> h4 = ((o) dVar).k0().getValue().h();
        ArrayList arrayList = new ArrayList();
        for (T t4 : h4) {
            n nVar = (n) t4;
            if (U(nVar) && (nVar instanceof q)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void K(kotlin.reflect.d dVar) {
    }

    @m
    public static final <T> kotlin.reflect.i<T> L(@l kotlin.reflect.d<T> dVar) {
        T t4;
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Iterator<T> it = ((o) dVar).h().iterator();
        while (true) {
            if (!it.hasNext()) {
                t4 = null;
                break;
            }
            t4 = it.next();
            kotlin.reflect.i iVar = (kotlin.reflect.i) t4;
            l0.n(iVar, ProtectedSandApp.s("昱\u0001"));
            z p02 = ((kotlin.reflect.jvm.internal.s) iVar).p0();
            l0.n(p02, ProtectedSandApp.s("昲\u0001"));
            if (((kotlin.reflect.jvm.internal.impl.descriptors.l) p02).f0()) {
                break;
            }
        }
        return (kotlin.reflect.i) t4;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void M(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> N(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> i4 = ((o.a) ((o) dVar).k0().getValue()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i4) {
            if (obj instanceof kotlin.reflect.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void O(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<p<?>> P(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> i4 = ((o.a) ((o) dVar).k0().getValue()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i4) {
            n nVar = (n) obj;
            if (U(nVar) && (nVar instanceof p)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void Q(kotlin.reflect.d dVar) {
    }

    @l
    public static final List<kotlin.reflect.d<?>> R(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        List<s> j4 = dVar.j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = j4.iterator();
        while (it.hasNext()) {
            kotlin.reflect.g d5 = ((s) it.next()).d();
            kotlin.reflect.d dVar2 = d5 instanceof kotlin.reflect.d ? (kotlin.reflect.d) d5 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void S(kotlin.reflect.d dVar) {
    }

    private static final boolean T(n<?> nVar) {
        return nVar.p0().S() != null;
    }

    private static final boolean U(n<?> nVar) {
        return !T(nVar);
    }

    @c1(version = "1.1")
    public static final boolean V(@l kotlin.reflect.d<?> dVar, @l kotlin.reflect.d<?> dVar2) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        l0.p(dVar2, ProtectedSandApp.s("昳\u0001"));
        if (!l0.g(dVar, dVar2)) {
            Boolean e4 = kotlin.reflect.jvm.internal.impl.utils.b.e(w.k(dVar), new e(c.f75538b), new d(dVar2));
            l0.o(e4, ProtectedSandApp.s("昴\u0001"));
            if (!e4.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable W(q qVar, kotlin.reflect.d dVar) {
        l0.p(qVar, ProtectedSandApp.s("昵\u0001"));
        return (Iterable) qVar.invoke(dVar);
    }

    @c1(version = "1.1")
    public static final boolean X(@l kotlin.reflect.d<?> dVar, @l kotlin.reflect.d<?> dVar2) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        l0.p(dVar2, ProtectedSandApp.s("昶\u0001"));
        return V(dVar2, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m
    @c1(version = "1.1")
    public static final <T> T Y(@l kotlin.reflect.d<T> dVar, @m Object obj) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        if (!dVar.q(obj)) {
            return null;
        }
        l0.n(obj, ProtectedSandApp.s("昷\u0001"));
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Iterable a(s sVar) {
        kotlin.reflect.g d5 = sVar.d();
        ld.a aVar = null;
        Object[] objArr = 0;
        kotlin.reflect.d dVar = d5 instanceof kotlin.reflect.d ? (kotlin.reflect.d) d5 : null;
        if (dVar == null) {
            throw new g0(ProtectedSandApp.s("昻\u0001") + sVar);
        }
        List<s> j4 = dVar.j();
        if (sVar.c().isEmpty()) {
            return j4;
        }
        String s4 = ProtectedSandApp.s("昸\u0001");
        l0.n(sVar, s4);
        q1 f4 = q1.f(((d0) sVar).getType());
        List<s> list = j4;
        ArrayList arrayList = new ArrayList(w.b0(list, 10));
        for (s sVar2 : list) {
            l0.n(sVar2, s4);
            h0 p4 = f4.p(((d0) sVar2).getType(), x1.INVARIANT);
            if (p4 == null) {
                throw new g0(ProtectedSandApp.s("昹\u0001") + sVar2 + ProtectedSandApp.s("昺\u0001") + sVar + ')');
            }
            l0.m(p4);
            arrayList.add(new d0(p4, aVar, 2, objArr == true ? 1 : 0));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    @c1(version = "1.1")
    public static final <T> T d(@l kotlin.reflect.d<T> dVar, @m Object obj) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        if (dVar.q(obj)) {
            l0.n(obj, ProtectedSandApp.s("昼\u0001"));
            return obj;
        }
        throw new TypeCastException(ProtectedSandApp.s("昽\u0001") + dVar.N());
    }

    @l
    @c1(version = "1.1")
    public static final <T> T e(@l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Iterator<T> it = dVar.h().iterator();
        T t4 = null;
        boolean z4 = false;
        T t5 = null;
        while (true) {
            if (it.hasNext()) {
                T next = it.next();
                List<kotlin.reflect.n> parameters = ((kotlin.reflect.i) next).getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        if (!((kotlin.reflect.n) it2.next()).A()) {
                            break;
                        }
                    }
                }
                if (z4) {
                    break;
                }
                z4 = true;
                t5 = next;
            } else if (z4) {
                t4 = t5;
            }
        }
        kotlin.reflect.i iVar = (kotlin.reflect.i) t4;
        if (iVar != null) {
            return (T) iVar.callBy(z0.z());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("显\u0001") + dVar);
    }

    @l
    public static final Collection<kotlin.reflect.d<?>> f(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<s> h4 = h(dVar);
        ArrayList arrayList = new ArrayList(w.b0(h4, 10));
        for (s sVar : h4) {
            kotlin.reflect.g d5 = sVar.d();
            kotlin.reflect.d dVar2 = d5 instanceof kotlin.reflect.d ? (kotlin.reflect.d) d5 : null;
            if (dVar2 == null) {
                throw new g0(ProtectedSandApp.s("昻\u0001") + sVar);
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void g(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<s> h(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Object c5 = kotlin.reflect.jvm.internal.impl.utils.b.c(dVar.j(), kotlin.reflect.full.d.f75535a, new b.h(), new a());
        l0.o(c5, ProtectedSandApp.s("昿\u0001"));
        return (Collection) c5;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void i(kotlin.reflect.d dVar) {
    }

    @m
    public static final kotlin.reflect.d<?> j(@l kotlin.reflect.d<?> dVar) {
        Object obj;
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Iterator<T> it = dVar.D().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) obj;
            l0.n(dVar2, ProtectedSandApp.s("晀\u0001"));
            if (((o) dVar2).i().e0()) {
                break;
            }
        }
        return (kotlin.reflect.d) obj;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    @m
    public static final Object l(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        kotlin.reflect.d<?> j4 = j(dVar);
        if (j4 != null) {
            return j4.E();
        }
        return null;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void m(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> n(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> l4 = ((o.a) ((o) dVar).k0().getValue()).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : l4) {
            if (obj instanceof kotlin.reflect.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void o(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> p(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> m4 = ((o.a) ((o) dVar).k0().getValue()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m4) {
            n nVar = (n) obj;
            if (T(nVar) && (nVar instanceof kotlin.reflect.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void q(kotlin.reflect.d dVar) {
    }

    @l
    public static final <T> Collection<r<T, ?, ?>> r(@l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> m4 = ((o) dVar).k0().getValue().m();
        ArrayList arrayList = new ArrayList();
        for (T t4 : m4) {
            n nVar = (n) t4;
            if (T(nVar) && (nVar instanceof r)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void s(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.i<?>> t(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> m4 = ((o.a) ((o) dVar).k0().getValue()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m4) {
            n nVar = (n) obj;
            if (U(nVar) && (nVar instanceof kotlin.reflect.i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void u(kotlin.reflect.d dVar) {
    }

    @l
    public static final <T> Collection<q<T, ?>> v(@l kotlin.reflect.d<T> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        Collection<n<?>> m4 = ((o) dVar).k0().getValue().m();
        ArrayList arrayList = new ArrayList();
        for (T t4 : m4) {
            n nVar = (n) t4;
            if (U(nVar) && (nVar instanceof q)) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    @c1(version = "1.1")
    public static /* synthetic */ void w(kotlin.reflect.d dVar) {
    }

    @l
    public static final Collection<kotlin.reflect.c<?>> x(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        return ((o.a) ((o) dVar).k0().getValue()).l();
    }

    @c1(version = "1.1")
    public static /* synthetic */ void y(kotlin.reflect.d dVar) {
    }

    @l
    public static final s z(@l kotlin.reflect.d<?> dVar) {
        l0.p(dVar, ProtectedSandApp.s("昰\u0001"));
        p0 r4 = ((o) dVar).i().r();
        l0.o(r4, ProtectedSandApp.s("晁\u0001"));
        return new d0(r4, new b(dVar));
    }
}
