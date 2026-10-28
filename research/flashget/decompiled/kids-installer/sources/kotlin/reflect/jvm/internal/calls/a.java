package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eBA\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\t\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a;", "Lkotlin/reflect/jvm/internal/calls/e;", "", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "jClass", "", "", "b", "Ljava/util/List;", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/a$a;", "c", "Lkotlin/reflect/jvm/internal/calls/a$a;", "callMode", "Ljava/lang/reflect/Method;", "d", "methods", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "i", "()Ljava/lang/reflect/Type;", "returnType", "Lkotlin/reflect/jvm/internal/calls/a$b;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/a$a;Lkotlin/reflect/jvm/internal/calls/a$b;Ljava/util/List;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Class<?> jClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<String> parameterNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final EnumC0264a callMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Method> methods;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Type> parameterTypes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Class<?>> erasedParameterTypes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Object> defaultValues;

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.calls.a$a, reason: collision with other inner class name */
    public enum EnumC0264a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(@d5.d Class<?> cls, @d5.d List<String> list, @d5.d EnumC0264a enumC0264a, @d5.d b bVar, @d5.d List<Method> list2) {
        int b02;
        int b03;
        int b04;
        List q42;
        l0.p(cls, ProtectedSandApp.s("䍥"));
        l0.p(list, ProtectedSandApp.s("䍦"));
        l0.p(enumC0264a, ProtectedSandApp.s("䍧"));
        l0.p(bVar, ProtectedSandApp.s("䍨"));
        l0.p(list2, ProtectedSandApp.s("䍩"));
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = enumC0264a;
        this.methods = list2;
        b02 = b0.b0(list2, 10);
        ArrayList arrayList = new ArrayList(b02);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list3 = this.methods;
        b03 = b0.b0(list3, 10);
        ArrayList arrayList2 = new ArrayList(b03);
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            l0.o(returnType, ProtectedSandApp.s("䍪"));
            Class<?> g5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(returnType);
            if (g5 != null) {
                returnType = g5;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list4 = this.methods;
        b04 = b0.b0(list4, 10);
        ArrayList arrayList3 = new ArrayList(b04);
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == EnumC0264a.POSITIONAL_CALL && bVar == b.JAVA) {
            q42 = j0.q4(this.parameterNames, ProtectedSandApp.s("䍫"));
            if (!q42.isEmpty()) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("䍬"));
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.e
    public Object C(@d5.d Object[] args) {
        List i6;
        Map B0;
        l0.p(args, ProtectedSandApp.s("䍭"));
        e.a.a(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i5 = 0;
        int i7 = 0;
        while (i5 < length) {
            Object obj = args[i5];
            int i8 = i7 + 1;
            Object k5 = (obj == null && this.callMode == EnumC0264a.CALL_BY_NAME) ? this.defaultValues.get(i7) : c.k(obj, this.erasedParameterTypes.get(i7));
            if (k5 == null) {
                c.j(i7, this.parameterNames.get(i7), this.erasedParameterTypes.get(i7));
                throw null;
            }
            arrayList.add(k5);
            i5++;
            i7 = i8;
        }
        Class<?> cls = this.jClass;
        i6 = j0.i6(this.parameterNames, arrayList);
        B0 = f1.B0(i6);
        return c.d(cls, B0, this.methods);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public Member b() {
        return null;
    }

    public void c(@d5.d Object[] objArr) {
        e.a.a(this, objArr);
    }

    @d5.e
    public Void d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    /* renamed from: i */
    public Type getReturnType() {
        return this.jClass;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.a.EnumC0264a r9, kotlin.reflect.jvm.internal.calls.a.b r10, java.util.List r11, int r12, kotlin.jvm.internal.w r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L2a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = kotlin.collections.y.b0(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L13:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L2a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L13
        L2a:
            r5 = r11
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
