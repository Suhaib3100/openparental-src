package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;

/* compiled from: ClassReference.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001OB\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010F\u001a\u00020\u00122\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020KH\u0016J\u0012\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0002H\u0017J\b\u0010N\u001a\u000201H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0015R\u001a\u0010 \u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0014\u001a\u0004\b \u0010\u0015R\u001a\u0010\"\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u0015R\u001a\u0010$\u001a\u00020\u00128VX\u0097\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u001e\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0010R\u0016\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R(\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0014\u001a\u0004\b6\u0010\u000bR\u0016\u00107\u001a\u0004\u0018\u0001018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00103R \u00109\u001a\b\u0012\u0004\u0012\u00020:0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b;\u0010\u0014\u001a\u0004\b<\u0010\u000bR \u0010=\u001a\b\u0012\u0004\u0012\u00020>0\b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0014\u001a\u0004\b@\u0010\u000bR\u001c\u0010A\u001a\u0004\u0018\u00010B8VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0014\u001a\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isFun", "isFun$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "isValue", "isValue$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* renamed from: kotlin.jvm.internal.u, reason: from Kotlin metadata */
/* loaded from: classes6.dex */
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    public static final a f23623p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final Map<Class<? extends Function<?>>, Integer> f23624q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private static final HashMap<String, String> f23625r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private static final HashMap<String, String> f23626s;

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    private static final HashMap<String, String> f23627t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private static final Map<String, String> f23628u;

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Class<?> f23629o;

    /* compiled from: ClassReference.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: kotlin.jvm.internal.u$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        @d5.e
        public final String a(@d5.d Class<?> cls) {
            String str;
            l0.p(cls, ProtectedSandApp.s("䅹"));
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) ClassReference.f23627t.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) ClassReference.f23627t.get(componentType.getName())) != null) {
                str2 = str.concat(ProtectedSandApp.s("䅺"));
            }
            return str2 == null ? ProtectedSandApp.s("䅻") : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
        
            if (r2 == null) goto L13;
         */
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(@d5.d java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "䅼"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L12
                goto Lb0
            L12:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6d
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L44
                kotlin.jvm.internal.l0.m(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.v.n5(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L42
                goto L44
            L42:
                r1 = r2
                goto Lb0
            L44:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L65
                kotlin.jvm.internal.l0.m(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.v.n5(r0, r7, r1, r3, r1)
                goto Lb0
            L65:
                kotlin.jvm.internal.l0.m(r0)
                java.lang.String r1 = kotlin.text.v.m5(r0, r4, r1, r3, r1)
                goto Lb0
            L6d:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9b
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "䅽"
                java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
                if (r0 == 0) goto L98
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.G()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L98
                java.lang.String r7 = r7.concat(r2)
                r1 = r7
            L98:
                if (r1 != 0) goto Lb0
                goto L42
            L9b:
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.G()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb0
                java.lang.String r1 = r7.getSimpleName()
            Lb0:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.ClassReference.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(@d5.e Object obj, @d5.d Class<?> cls) {
            l0.p(cls, ProtectedSandApp.s("䅾"));
            Map map = ClassReference.f23624q;
            l0.n(map, ProtectedSandApp.s("䅿"));
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return u1.B(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = p3.b.g(p3.b.i(cls));
            }
            return cls.isInstance(obj);
        }

        public a(w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List O;
        int b02;
        Map<Class<? extends Function<?>>, Integer> B0;
        int j5;
        String q5;
        String q52;
        int i5 = 0;
        O = kotlin.collections.a0.O(q3.a.class, q3.l.class, q3.p.class, q3.q.class, q3.r.class, q3.s.class, q3.t.class, q3.u.class, q3.v.class, q3.w.class, q3.b.class, q3.c.class, q3.d.class, q3.e.class, q3.f.class, q3.g.class, q3.h.class, q3.i.class, q3.j.class, q3.k.class, q3.m.class, q3.n.class, q3.o.class);
        b02 = kotlin.collections.b0.b0(O, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (Object obj : O) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.a0.Z();
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        B0 = kotlin.collections.f1.B0(arrayList);
        f23624q = B0;
        HashMap<String, String> hashMap = new HashMap<>();
        String s5 = ProtectedSandApp.s("绵");
        String s6 = ProtectedSandApp.s("绶");
        hashMap.put(s5, s6);
        String s7 = ProtectedSandApp.s("绷");
        String s8 = ProtectedSandApp.s("绸");
        hashMap.put(s7, s8);
        String s9 = ProtectedSandApp.s("绹");
        String s10 = ProtectedSandApp.s("绺");
        hashMap.put(s9, s10);
        String s11 = ProtectedSandApp.s("绻");
        String s12 = ProtectedSandApp.s("综");
        hashMap.put(s11, s12);
        String s13 = ProtectedSandApp.s("绽");
        String s14 = ProtectedSandApp.s("绾");
        hashMap.put(s13, s14);
        String s15 = ProtectedSandApp.s("绿");
        String s16 = ProtectedSandApp.s("缀");
        hashMap.put(s15, s16);
        String s17 = ProtectedSandApp.s("缁");
        String s18 = ProtectedSandApp.s("缂");
        hashMap.put(s17, s18);
        String s19 = ProtectedSandApp.s("缃");
        String s20 = ProtectedSandApp.s("缄");
        hashMap.put(s19, s20);
        f23625r = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put(ProtectedSandApp.s("缅"), s6);
        hashMap2.put(ProtectedSandApp.s("缆"), s8);
        hashMap2.put(ProtectedSandApp.s("缇"), s10);
        hashMap2.put(ProtectedSandApp.s("缈"), s12);
        hashMap2.put(ProtectedSandApp.s("缉"), s14);
        hashMap2.put(ProtectedSandApp.s("缊"), s16);
        hashMap2.put(ProtectedSandApp.s("缋"), s18);
        hashMap2.put(ProtectedSandApp.s("缌"), s20);
        f23626s = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put(ProtectedSandApp.s("缍"), ProtectedSandApp.s("缎"));
        hashMap3.put(ProtectedSandApp.s("缏"), ProtectedSandApp.s("缐"));
        hashMap3.put(ProtectedSandApp.s("缑"), ProtectedSandApp.s("缒"));
        hashMap3.put(ProtectedSandApp.s("缓"), ProtectedSandApp.s("缔"));
        hashMap3.put(ProtectedSandApp.s("缕"), ProtectedSandApp.s("编"));
        hashMap3.put(ProtectedSandApp.s("缗"), ProtectedSandApp.s("缘"));
        hashMap3.put(ProtectedSandApp.s("缙"), ProtectedSandApp.s("缚"));
        hashMap3.put(ProtectedSandApp.s("缛"), ProtectedSandApp.s("缜"));
        hashMap3.put(ProtectedSandApp.s("缝"), ProtectedSandApp.s("缞"));
        hashMap3.put(ProtectedSandApp.s("缟"), ProtectedSandApp.s("缠"));
        hashMap3.put(ProtectedSandApp.s("缡"), ProtectedSandApp.s("缢"));
        hashMap3.put(ProtectedSandApp.s("缣"), ProtectedSandApp.s("缤"));
        hashMap3.put(ProtectedSandApp.s("缥"), ProtectedSandApp.s("缦"));
        hashMap3.put(ProtectedSandApp.s("缧"), ProtectedSandApp.s("缨"));
        hashMap3.put(ProtectedSandApp.s("缩"), ProtectedSandApp.s("缪"));
        hashMap3.put(ProtectedSandApp.s("缫"), ProtectedSandApp.s("缬"));
        hashMap3.put(ProtectedSandApp.s("缭"), ProtectedSandApp.s("缮"));
        hashMap3.put(ProtectedSandApp.s("缯"), ProtectedSandApp.s("缰"));
        hashMap3.put(ProtectedSandApp.s("缱"), ProtectedSandApp.s("缲"));
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l0.o(values, ProtectedSandApp.s("缳"));
        for (String str : values) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("缴"));
            l0.m(str);
            q52 = kotlin.text.h0.q5(str, org.apache.commons.io.k.f32026a, null, 2, null);
            sb.append(q52);
            sb.append(ProtectedSandApp.s("缵"));
            Pair pair = new Pair(sb.toString(), androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("缶")));
            hashMap3.put(pair.e(), pair.f());
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : f23624q.entrySet()) {
            hashMap3.put(entry.getKey().getName(), ProtectedSandApp.s("缷") + entry.getValue().intValue());
        }
        f23627t = hashMap3;
        j5 = kotlin.collections.e1.j(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            q5 = kotlin.text.h0.q5((String) entry2.getValue(), org.apache.commons.io.k.f32026a, null, 2, null);
            linkedHashMap.put(key, q5);
        }
        f23628u = linkedHashMap;
    }

    public ClassReference(@d5.d Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("缸"));
        this.f23629o = cls;
    }

    private final Void M() {
        throw new p3.r();
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void N() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void O() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void P() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void Q() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void S() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void U() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void V() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void Y() {
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void a0() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void b0() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void d0() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void e0() {
    }

    @SinceKotlin(version = "1.5")
    public static /* synthetic */ void f0() {
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @d5.d
    public Collection<KCallable<?>> A() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean I() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public String J() {
        return f23623p.a(this.f23629o);
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public Collection<KClass<?>> K() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public String R() {
        return f23623p.b(this.f23629o);
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public Object T() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean Z() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean a() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.e
    public KVisibility c() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean d() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@d5.e Object other) {
        return (other instanceof ClassReference) && l0.g(p3.b.g(this), p3.b.g((KClass) other));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @d5.d
    public Class<?> f() {
        return this.f23629o;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @d5.d
    public List<Annotation> getAnnotations() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KTypeParameter> getTypeParameters() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return p3.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @SinceKotlin(version = "1.1")
    public boolean j0(@d5.e Object obj) {
        return f23623p.c(obj, this.f23629o);
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public Collection<KFunction<Object>> l() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KType> m() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean t() {
        M();
        throw new KotlinNothingValueException();
    }

    @d5.d
    public String toString() {
        return this.f23629o.toString() + ProtectedSandApp.s("缹");
    }

    @Override // kotlin.reflect.KClass
    public boolean u() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    @d5.d
    public List<KClass<? extends Object>> w() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean x() {
        M();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.KClass
    public boolean y() {
        M();
        throw new KotlinNothingValueException();
    }
}
