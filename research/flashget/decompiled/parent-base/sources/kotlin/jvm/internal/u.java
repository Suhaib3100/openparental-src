package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: ClassReference.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001b\n\u0002\b\b\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\\B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010 \u001a\u0004\b#\u0010\u001eR(\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\u001b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b'\u0010 \u001a\u0004\b&\u0010\u001eR\u001c\u0010-\u001a\u0004\u0018\u00010)8VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010 \u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b0\u0010 \u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b2\u0010 \u001a\u0004\b1\u0010/R\u001a\u00103\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b4\u0010 \u001a\u0004\b3\u0010/R\u001a\u00107\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b6\u0010 \u001a\u0004\b5\u0010/R\u001a\u0010:\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u0010 \u001a\u0004\b8\u0010/R\u001a\u0010=\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b<\u0010 \u001a\u0004\b;\u0010/R\u001a\u0010@\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010 \u001a\u0004\b>\u0010/R\u001a\u0010C\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\bB\u0010 \u001a\u0004\bA\u0010/R\u001a\u0010F\u001a\u00020\f8VX\u0097\u0004¢\u0006\f\u0012\u0004\bE\u0010 \u001a\u0004\bD\u0010/R\u0016\u0010H\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0016R\u0016\u0010J\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0016R\u001e\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030L0K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020P0K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u001e\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010NR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u001eR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006]"}, d2 = {"Lkotlin/jvm/internal/u;", "Lkotlin/reflect/d;", "", "Lkotlin/jvm/internal/t;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "z", "()Ljava/lang/Void;", "value", "", "q", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "", "Lkotlin/reflect/t;", "getTypeParameters", "()Ljava/util/List;", "J", "()V", "typeParameters", "Lkotlin/reflect/s;", "j", "I", "supertypes", "m", "H", "sealedSubclasses", "Lkotlin/reflect/w;", "getVisibility", "()Lkotlin/reflect/w;", "K", "visibility", "isFinal", "()Z", "R", "isOpen", "U", "isAbstract", "M", "p", "V", "isSealed", "C", "Q", "isData", "n", "T", "isInner", "F", "O", "isCompanion", "v", "S", "isFun", "w", "X", "isValue", "W", "simpleName", "N", "qualifiedName", "", "Lkotlin/reflect/c;", "r", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/i;", "h", "constructors", "D", "nestedClasses", "", "getAnnotations", "annotations", "E", "()Ljava/lang/Object;", "objectInstance", "c", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
/* loaded from: classes7.dex */
public final class u implements kotlin.reflect.d<Object>, t {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final Map<Class<? extends kotlin.v<?>>, Integer> f75373d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final HashMap<String, String> f75374e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final HashMap<String, String> f75375f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final HashMap<String, String> f75376g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final Map<String, String> f75377h;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Class<?> jClass;

    /* compiled from: ClassReference.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lkotlin/jvm/internal/u$a;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "b", "(Ljava/lang/Class;)Ljava/lang/String;", "a", "value", "", "c", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "Lkotlin/v;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: kotlin.jvm.internal.u$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        public final String a(@fg.l Class<?> jClass) {
            String str;
            l0.p(jClass, ProtectedSandApp.s("攁\u0001"));
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) u.f75376g.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) u.f75376g.get(componentType.getName())) != null) {
                str2 = str.concat(ProtectedSandApp.s("攂\u0001"));
            }
            return str2 == null ? ProtectedSandApp.s("攃\u0001") : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
        
            if (r2 == null) goto L13;
         */
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String b(@fg.l java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "攁\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L12
                goto Laf
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
                goto Laf
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
                goto Laf
            L65:
                kotlin.jvm.internal.l0.m(r0)
                java.lang.String r1 = kotlin.text.v.m5(r0, r4, r1, r3, r1)
                goto Laf
            L6d:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9a
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "攂\u0001"
                java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
                if (r0 == 0) goto L97
                java.util.Map r0 = kotlin.jvm.internal.u.y()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L97
                java.lang.String r1 = r7.concat(r2)
            L97:
                if (r1 != 0) goto Laf
                goto L42
            L9a:
                java.util.Map r0 = kotlin.jvm.internal.u.y()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Laf
                java.lang.String r1 = r7.getSimpleName()
            Laf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.u.Companion.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(@fg.m Object value, @fg.l Class<?> jClass) {
            l0.p(jClass, ProtectedSandApp.s("攁\u0001"));
            Map map = u.f75373d;
            l0.n(map, ProtectedSandApp.s("攄\u0001"));
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return u1.B(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = kd.b.g(kd.b.i(jClass));
            }
            return jClass.isInstance(value);
        }

        public Companion(w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List O = kotlin.collections.w.O(ld.a.class, ld.l.class, ld.p.class, ld.q.class, ld.r.class, ld.s.class, ld.t.class, ld.u.class, ld.v.class, ld.w.class, ld.b.class, ld.c.class, ld.d.class, ld.e.class, ld.f.class, ld.g.class, ld.h.class, ld.i.class, ld.j.class, ld.k.class, ld.m.class, ld.n.class, ld.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.w.b0(O, 10));
        int i4 = 0;
        for (Object obj : O) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                kotlin.collections.w.Z();
            }
            arrayList.add(new kotlin.q0((Class) obj, Integer.valueOf(i4)));
            i4 = i5;
        }
        f75373d = kotlin.collections.z0.B0(arrayList);
        String s4 = ProtectedSandApp.s("攐\u0001");
        String s5 = ProtectedSandApp.s("攑\u0001");
        String s6 = ProtectedSandApp.s("攒\u0001");
        String s7 = ProtectedSandApp.s("攓\u0001");
        HashMap<String, String> a5 = com.coremedia.iso.boxes.d.a(s4, s5, s6, s7);
        String s10 = ProtectedSandApp.s("攔\u0001");
        String s11 = ProtectedSandApp.s("攕\u0001");
        a5.put(s10, s11);
        String s12 = ProtectedSandApp.s("攖\u0001");
        String s13 = ProtectedSandApp.s("攗\u0001");
        a5.put(s12, s13);
        String s14 = ProtectedSandApp.s("攘\u0001");
        String s15 = ProtectedSandApp.s("攙\u0001");
        a5.put(s14, s15);
        String s16 = ProtectedSandApp.s("攚\u0001");
        String s17 = ProtectedSandApp.s("攛\u0001");
        a5.put(s16, s17);
        String s18 = ProtectedSandApp.s("攜\u0001");
        String s19 = ProtectedSandApp.s("攝\u0001");
        a5.put(s18, s19);
        String s20 = ProtectedSandApp.s("攞\u0001");
        String s21 = ProtectedSandApp.s("攟\u0001");
        a5.put(s20, s21);
        f75374e = a5;
        HashMap<String, String> a6 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("攠\u0001"), s5, ProtectedSandApp.s("攡\u0001"), s7);
        a6.put(ProtectedSandApp.s("攢\u0001"), s11);
        a6.put(ProtectedSandApp.s("攣\u0001"), s13);
        a6.put(ProtectedSandApp.s("攤\u0001"), s15);
        a6.put(ProtectedSandApp.s("攥\u0001"), s17);
        a6.put(ProtectedSandApp.s("攦\u0001"), s19);
        a6.put(ProtectedSandApp.s("攧\u0001"), s21);
        f75375f = a6;
        HashMap<String, String> a7 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("攨\u0001"), ProtectedSandApp.s("攩\u0001"), ProtectedSandApp.s("攪\u0001"), ProtectedSandApp.s("攫\u0001"));
        a7.put(ProtectedSandApp.s("攬\u0001"), ProtectedSandApp.s("攭\u0001"));
        a7.put(ProtectedSandApp.s("攮\u0001"), ProtectedSandApp.s("支\u0001"));
        a7.put(ProtectedSandApp.s("攰\u0001"), ProtectedSandApp.s("攱\u0001"));
        a7.put(ProtectedSandApp.s("攲\u0001"), ProtectedSandApp.s("攳\u0001"));
        a7.put(ProtectedSandApp.s("攴\u0001"), ProtectedSandApp.s("攵\u0001"));
        a7.put(ProtectedSandApp.s("收\u0001"), ProtectedSandApp.s("攷\u0001"));
        a7.put(ProtectedSandApp.s("攸\u0001"), ProtectedSandApp.s("改\u0001"));
        a7.put(ProtectedSandApp.s("攺\u0001"), ProtectedSandApp.s("攻\u0001"));
        a7.put(ProtectedSandApp.s("攼\u0001"), ProtectedSandApp.s("攽\u0001"));
        a7.put(ProtectedSandApp.s("放\u0001"), ProtectedSandApp.s("政\u0001"));
        a7.put(ProtectedSandApp.s("敀\u0001"), ProtectedSandApp.s("敁\u0001"));
        a7.put(ProtectedSandApp.s("敂\u0001"), ProtectedSandApp.s("敃\u0001"));
        a7.put(ProtectedSandApp.s("敄\u0001"), ProtectedSandApp.s("故\u0001"));
        a7.put(ProtectedSandApp.s("敆\u0001"), ProtectedSandApp.s("敇\u0001"));
        a7.put(ProtectedSandApp.s("效\u0001"), ProtectedSandApp.s("敉\u0001"));
        a7.put(ProtectedSandApp.s("敊\u0001"), ProtectedSandApp.s("敋\u0001"));
        a7.put(ProtectedSandApp.s("敌\u0001"), ProtectedSandApp.s("敍\u0001"));
        a7.putAll(a5);
        a7.putAll(a6);
        Collection<String> values = a5.values();
        l0.o(values, ProtectedSandApp.s("敎\u0001"));
        for (String str : values) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("敏\u0001"));
            l0.m(str);
            kotlin.q0 q0Var = new kotlin.q0(android.support.v4.media.c.a(sb, kotlin.text.v.q5(str, '.', null, 2, null), ProtectedSandApp.s("敐\u0001")), androidx.compose.runtime.changelist.j.a(str, ProtectedSandApp.s("救\u0001")));
            a7.put(q0Var.e(), q0Var.f());
        }
        for (Map.Entry<Class<? extends kotlin.v<?>>, Integer> entry : f75373d.entrySet()) {
            a7.put(entry.getKey().getName(), ProtectedSandApp.s("敒\u0001") + entry.getValue().intValue());
        }
        f75376g = a7;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.z0.j(a7.size()));
        for (Map.Entry entry2 : a7.entrySet()) {
            linkedHashMap.put(entry2.getKey(), kotlin.text.v.q5((String) entry2.getValue(), '.', null, 2, null));
        }
        f75377h = linkedHashMap;
    }

    public u(@fg.l Class<?> cls) {
        l0.p(cls, ProtectedSandApp.s("敓\u0001"));
        this.jClass = cls;
    }

    @kotlin.c1(version = "1.3")
    public static /* synthetic */ void H() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void I() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void J() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void K() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void M() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void O() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void Q() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void R() {
    }

    @kotlin.c1(version = "1.4")
    public static /* synthetic */ void S() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void T() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void U() {
    }

    @kotlin.c1(version = "1.1")
    public static /* synthetic */ void V() {
    }

    @kotlin.c1(version = "1.5")
    public static /* synthetic */ void X() {
    }

    private final Void z() {
        throw new kd.r();
    }

    @Override // kotlin.reflect.d
    public boolean C() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public Collection<kotlin.reflect.d<?>> D() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public Object E() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean F() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public String N() {
        return INSTANCE.a(this.jClass);
    }

    @Override // kotlin.reflect.d
    @fg.m
    public String W() {
        return INSTANCE.b(this.jClass);
    }

    @Override // kotlin.jvm.internal.t
    @fg.l
    public Class<?> e() {
        return this.jClass;
    }

    @Override // kotlin.reflect.d
    public boolean equals(@fg.m Object other) {
        return (other instanceof u) && l0.g(kd.b.g(this), kd.b.g((kotlin.reflect.d) other));
    }

    @Override // kotlin.reflect.b
    @fg.l
    public List<Annotation> getAnnotations() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.t> getTypeParameters() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.m
    public kotlin.reflect.w getVisibility() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public Collection<kotlin.reflect.i<Object>> h() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public int hashCode() {
        return kd.b.g(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public boolean isAbstract() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isFinal() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean isOpen() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.s> j() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @fg.l
    public List<kotlin.reflect.d<? extends Object>> m() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean n() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean p() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    @kotlin.c1(version = "1.1")
    public boolean q(@fg.m Object value) {
        return INSTANCE.c(value, this.jClass);
    }

    @Override // kotlin.reflect.d, kotlin.reflect.h
    @fg.l
    public Collection<kotlin.reflect.c<?>> r() {
        z();
        throw new KotlinNothingValueException();
    }

    @fg.l
    public String toString() {
        return this.jClass.toString() + ProtectedSandApp.s("敔\u0001");
    }

    @Override // kotlin.reflect.d
    public boolean v() {
        z();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.d
    public boolean w() {
        z();
        throw new KotlinNothingValueException();
    }
}
