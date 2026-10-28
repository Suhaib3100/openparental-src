package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0015\u0017BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0019\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$R\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/a$a;", "callMode", "Lkotlin/reflect/jvm/internal/calls/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/a$a;Lkotlin/reflect/jvm/internal/calls/a$b;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "Lkotlin/reflect/jvm/internal/calls/a$a;", "d", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,181:1\n1549#2:182\n1620#2,3:183\n1549#2:186\n1620#2,2:187\n1622#2:190\n1549#2:191\n1620#2,3:192\n1549#2:195\n1620#2,3:196\n1#3:189\n11155#4:199\n11266#4,4:200\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n*L\n28#1:182\n28#1:183,3\n35#1:186\n35#1:187,2\n35#1:190\n37#1:191\n37#1:192,3\n20#1:195\n20#1:196,3\n53#1:199\n53#1:200,4\n*E\n"})
/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Class<?> jClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<String> parameterNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final EnumC1067a callMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Method> methods;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Type> parameterTypes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Class<?>> erasedParameterTypes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Object> defaultValues;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.calls.a$a, reason: collision with other inner class name */
    public static final class EnumC1067a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EnumC1067a[] $VALUES;
        public static final EnumC1067a CALL_BY_NAME = new EnumC1067a(ProtectedSandApp.s("暢\u0001"), 0);
        public static final EnumC1067a POSITIONAL_CALL = new EnumC1067a(ProtectedSandApp.s("暣\u0001"), 1);

        private static final /* synthetic */ EnumC1067a[] $values() {
            return new EnumC1067a[]{CALL_BY_NAME, POSITIONAL_CALL};
        }

        static {
            EnumC1067a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private EnumC1067a(String str, int i4) {
        }

        public static EnumC1067a valueOf(String str) {
            return (EnumC1067a) Enum.valueOf(EnumC1067a.class, str);
        }

        public static EnumC1067a[] values() {
            return (EnumC1067a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b JAVA = new b(ProtectedSandApp.s("暤\u0001"), 0);
        public static final b KOTLIN = new b(ProtectedSandApp.s("暥\u0001"), 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{JAVA, KOTLIN};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private b(String str, int i4) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public a(@l Class<?> cls, @l List<String> list, @l EnumC1067a enumC1067a, @l b bVar, @l List<Method> list2) {
        l0.p(cls, ProtectedSandApp.s("暦\u0001"));
        l0.p(list, ProtectedSandApp.s("暧\u0001"));
        l0.p(enumC1067a, ProtectedSandApp.s("暨\u0001"));
        l0.p(bVar, ProtectedSandApp.s("暩\u0001"));
        l0.p(list2, ProtectedSandApp.s("暪\u0001"));
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = enumC1067a;
        this.methods = list2;
        List<Method> list3 = list2;
        ArrayList arrayList = new ArrayList(w.b0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list4 = this.methods;
        ArrayList arrayList2 = new ArrayList(w.b0(list4, 10));
        Iterator<T> it2 = list4.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            l0.m(returnType);
            Class<?> g4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(returnType);
            if (g4 != null) {
                returnType = g4;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list5 = this.methods;
        ArrayList arrayList3 = new ArrayList(w.b0(list5, 10));
        Iterator<T> it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == EnumC1067a.POSITIONAL_CALL && bVar == b.JAVA && !w.q4(this.parameterNames, ProtectedSandApp.s("暫\u0001")).isEmpty()) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("暬\u0001"));
        }
    }

    public void a(@l Object[] objArr) {
        e.a.a(this, objArr);
    }

    @m
    public Void b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public List<Type> c() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @m
    public Object call(@l Object[] args) {
        l0.p(args, ProtectedSandApp.s("暭\u0001"));
        e.a.a(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            Object obj = args[i4];
            int i6 = i5 + 1;
            Object k4 = (obj == null && this.callMode == EnumC1067a.CALL_BY_NAME) ? this.defaultValues.get(i5) : c.k(obj, this.erasedParameterTypes.get(i5));
            if (k4 == null) {
                c.j(i5, this.parameterNames.get(i5), this.erasedParameterTypes.get(i5));
                throw null;
            }
            arrayList.add(k4);
            i4++;
            i5 = i6;
        }
        return c.d(this.jClass, z0.B0(w.i6(this.parameterNames, arrayList)), this.methods);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public Member d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public Type getReturnType() {
        return this.jClass;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.a.EnumC1067a r9, kotlin.reflect.jvm.internal.calls.a.b r10, java.util.List r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2d
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = kotlin.collections.w.b0(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L16:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L2b
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r12.add(r13)
            goto L16
        L2b:
            r5 = r12
            goto L2e
        L2d:
            r5 = r11
        L2e:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.a.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.a$a, kotlin.reflect.jvm.internal.calls.a$b, java.util.List, int, kotlin.jvm.internal.w):void");
    }
}
