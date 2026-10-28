package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.collections.e1;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.m2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000 =2\u00020\u0001:\u0003>?@B\u0007¢\u0006\u0004\b;\u0010<JG\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\r\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00052\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000fH\u0002J*\u0010\u0017\u001a\u00020\u00162\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u001a\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J$\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002J\u0014\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001f2\u0006\u0010\u0004\u001a\u00020\u001eH&J\u0012\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u0019H&J\"\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0004J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010.\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003J\u0018\u0010/\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003J \u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u00100\u001a\u00020\bJ\u0014\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003J\u0014\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u0018\u00106\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006A"}, d2 = {"Lkotlin/reflect/jvm/internal/p;", "Lkotlin/jvm/internal/t;", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "i0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "o0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "n0", "", "result", "desc", "isConstructor", "Lkotlin/m2;", "M", "g0", "", "begin", "end", "k0", "h0", "Lkotlin/reflect/jvm/internal/impl/name/f;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "f0", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "a0", "index", "b0", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "scope", "Lkotlin/reflect/jvm/internal/p$c;", "belonginess", "Lkotlin/reflect/jvm/internal/l;", "d0", "signature", "U", "Q", "S", "isMember", "P", "N", "O", "e0", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "Y", "()Ljava/util/Collection;", "constructorDescriptors", "<init>", "()V", "o", "a", "b", "c", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class p implements ClassBasedDeclarationContainer {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: p, reason: collision with root package name */
    private static final Class<?> f26780p = kotlin.jvm.internal.w.class;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private static final Regex f26781q = new Regex(ProtectedSandApp.s("翲"));

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\t\u001a\u0012\u0012\u0002\b\u0003 \b*\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/p$a;", "", "Lkotlin/text/r;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/r;", "a", "()Lkotlin/text/r;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.p$a, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final Regex a() {
            return p.f26781q;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/p$b;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "a", "Lkotlin/reflect/jvm/internal/g0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "<init>", "(Lkotlin/reflect/jvm/internal/p;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26782c = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("奴"), ProtectedSandApp.s("奵")))};

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a moduleData;

        /* compiled from: KDeclarationContainerImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;"}, k = 3, mv = {1, 8, 0})
        /* loaded from: classes6.dex */
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ p f26785p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar) {
                super(0);
                this.f26785p = pVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k n() {
                return f0.b(this.f26785p.f());
            }
        }

        public b() {
            this.moduleData = g0.d(new a(p.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a() {
            T b6 = this.moduleData.b(this, f26782c[0]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("奶"));
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) b6;
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0084\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/p$c;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "member", "", "accept", "<init>", "(Ljava/lang/String;I)V", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes5.dex */
    protected enum c {
        DECLARED,
        INHERITED;

        public final boolean accept(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b member) {
            kotlin.jvm.internal.l0.p(member, ProtectedSandApp.s("姥"));
            return member.j().isReal() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class d extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.descriptors.z, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final d f26786p = new d();

        d() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
            kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("訮"));
            return kotlin.reflect.jvm.internal.impl.renderer.c.f25819j.s(zVar) + ProtectedSandApp.s("訯") + j0.f26695a.g(zVar).get_signature();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class e extends Lambda implements q3.l<u0, CharSequence> {

        /* renamed from: p, reason: collision with root package name */
        public static final e f26787p = new e();

        e() {
            super(1);
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence N(@d5.d u0 u0Var) {
            kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("訰"));
            return kotlin.reflect.jvm.internal.impl.renderer.c.f25819j.s(u0Var) + ProtectedSandApp.s("許") + j0.f26695a.f(u0Var).getString();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "kotlin.jvm.PlatformType", "first", "second", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class f extends Lambda implements q3.p<kotlin.reflect.jvm.internal.impl.descriptors.u, kotlin.reflect.jvm.internal.impl.descriptors.u, Integer> {

        /* renamed from: p, reason: collision with root package name */
        public static final f f26788p = new f();

        f() {
            super(2);
        }

        @Override // q3.p
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer g0(kotlin.reflect.jvm.internal.impl.descriptors.u uVar, kotlin.reflect.jvm.internal.impl.descriptors.u uVar2) {
            Integer d6 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(uVar, uVar2);
            return Integer.valueOf(d6 == null ? 0 : d6.intValue());
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/reflect/jvm/internal/p$g", "Lkotlin/reflect/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "descriptor", "Lkotlin/m2;", "data", "Lkotlin/reflect/jvm/internal/l;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/m2;)Lkotlin/reflect/jvm/internal/l;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static final class g extends kotlin.reflect.jvm.internal.g {
        g(p pVar) {
            super(pVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
        @d5.d
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public l<?> h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @d5.d m2 m2Var) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("訲"));
            kotlin.jvm.internal.l0.p(m2Var, ProtectedSandApp.s("訳"));
            throw new IllegalStateException(ProtectedSandApp.s("訴") + lVar);
        }
    }

    private final void M(List<Class<?>> list, String str, boolean z5) {
        list.addAll(g0(str));
        int size = ((r5.size() + 32) - 1) / 32;
        for (int i5 = 0; i5 < size; i5++) {
            Class<?> cls = Integer.TYPE;
            kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("翳"));
            list.add(cls);
        }
        if (!z5) {
            list.add(Object.class);
            return;
        }
        Class<?> cls2 = f26780p;
        list.remove(cls2);
        kotlin.jvm.internal.l0.o(cls2, ProtectedSandApp.s("翴"));
        list.add(cls2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int V(q3.p pVar, Object obj, Object obj2) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("翵"));
        return ((Number) pVar.g0(obj, obj2)).intValue();
    }

    private final List<Class<?>> g0(String desc) {
        boolean S2;
        int o32;
        int i5;
        ArrayList arrayList = new ArrayList();
        int i6 = 1;
        while (desc.charAt(i6) != ')') {
            int i7 = i6;
            while (desc.charAt(i7) == '[') {
                i7++;
            }
            char charAt = desc.charAt(i7);
            S2 = kotlin.text.h0.S2(ProtectedSandApp.s("翶"), charAt, false, 2, null);
            if (S2) {
                i5 = i7 + 1;
            } else {
                if (charAt != 'L') {
                    throw new e0(ProtectedSandApp.s("翷").concat(desc));
                }
                o32 = kotlin.text.h0.o3(desc, ';', i6, false, 4, null);
                i5 = o32 + 1;
            }
            arrayList.add(k0(desc, i6, i5));
            i6 = i5;
        }
        return arrayList;
    }

    private final Class<?> h0(String desc) {
        int o32;
        o32 = kotlin.text.h0.o3(desc, ')', 0, false, 6, null);
        return k0(desc, o32 + 1, desc.length());
    }

    private final Method i0(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z5) {
        Class<?> a6;
        Method i02;
        if (z5) {
            clsArr[0] = cls;
        }
        Method o02 = o0(cls, str, clsArr, cls2);
        if (o02 != null) {
            return o02;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (i02 = i0(superclass, str, clsArr, cls2, z5)) != null) {
            return i02;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.l0.o(interfaces, ProtectedSandApp.s("翸"));
        for (Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.l0.o(cls3, ProtectedSandApp.s("翹"));
            Method i03 = i0(cls3, str, clsArr, cls2, z5);
            if (i03 != null) {
                return i03;
            }
            if (z5 && (a6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(cls3), cls3.getName().concat(ProtectedSandApp.s("翺")))) != null) {
                clsArr[0] = cls3;
                Method o03 = o0(a6, str, clsArr, cls2);
                if (o03 != null) {
                    return o03;
                }
            }
        }
        return null;
    }

    private final Class<?> k0(String desc, int begin, int end) {
        String h22;
        char charAt = desc.charAt(begin);
        if (charAt == 'L') {
            ClassLoader f6 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(f());
            String substring = desc.substring(begin + 1, end - 1);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("翻"));
            h22 = kotlin.text.e0.h2(substring, org.apache.commons.io.n.f32060b, org.apache.commons.io.k.f32026a, false, 4, null);
            Class<?> loadClass = f6.loadClass(h22);
            kotlin.jvm.internal.l0.o(loadClass, ProtectedSandApp.s("翼"));
            return loadClass;
        }
        if (charAt == '[') {
            return n0.f(k0(desc, begin + 1, end));
        }
        if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("翽"));
            return cls;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == 'C') {
            return Character.TYPE;
        }
        if (charAt == 'B') {
            return Byte.TYPE;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'D') {
            return Double.TYPE;
        }
        throw new e0(ProtectedSandApp.s("翾").concat(desc));
    }

    private final Constructor<?> n0(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method o0(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.l0.g(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.l0.o(declaredMethods, ProtectedSandApp.s("翿"));
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.l0.g(method.getName(), str) && kotlin.jvm.internal.l0.g(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @d5.e
    public final Constructor<?> N(@d5.d String desc) {
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("耀"));
        return n0(f(), g0(desc));
    }

    @d5.e
    public final Constructor<?> O(@d5.d String desc) {
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("老"));
        Class<?> f6 = f();
        ArrayList arrayList = new ArrayList();
        M(arrayList, desc, true);
        m2 m2Var = m2.f23662a;
        return n0(f6, arrayList);
    }

    @d5.e
    public final Method P(@d5.d String name, @d5.d String desc, boolean isMember) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("耂"));
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("考"));
        if (kotlin.jvm.internal.l0.g(name, ProtectedSandApp.s("耄"))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(f());
        }
        M(arrayList, desc, false);
        return i0(e0(), androidx.concurrent.futures.b.a(name, ProtectedSandApp.s("者")), (Class[]) arrayList.toArray(new Class[0]), h0(desc), isMember);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.z Q(@d5.d String name, @d5.d String signature) {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> a02;
        Object h5;
        String m32;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("耆"));
        kotlin.jvm.internal.l0.p(signature, ProtectedSandApp.s("耇"));
        if (kotlin.jvm.internal.l0.g(name, ProtectedSandApp.s("耈"))) {
            a02 = kotlin.collections.j0.V5(Y());
        } else {
            kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(name);
            kotlin.jvm.internal.l0.o(p5, ProtectedSandApp.s("耉"));
            a02 = a0(p5);
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> collection = a02;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (kotlin.jvm.internal.l0.g(j0.f26695a.g((kotlin.reflect.jvm.internal.impl.descriptors.z) obj).get_signature(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            h5 = kotlin.collections.j0.h5(arrayList);
            return (kotlin.reflect.jvm.internal.impl.descriptors.z) h5;
        }
        m32 = kotlin.collections.j0.m3(collection, ProtectedSandApp.s("耊"), null, null, 0, null, d.f26786p, 30, null);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("耋"));
        sb.append(name);
        sb.append(ProtectedSandApp.s("而"));
        sb.append(signature);
        sb.append(ProtectedSandApp.s("耍"));
        sb.append(this);
        sb.append(':');
        sb.append(m32.length() == 0 ? ProtectedSandApp.s("耎") : androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("耏"), m32));
        throw new e0(sb.toString());
    }

    @d5.e
    public final Method S(@d5.d String name, @d5.d String desc) {
        Method i02;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("耐"));
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("耑"));
        if (kotlin.jvm.internal.l0.g(name, ProtectedSandApp.s("耒"))) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) g0(desc).toArray(new Class[0]);
        Class<?> h02 = h0(desc);
        Method i03 = i0(e0(), name, clsArr, h02, false);
        if (i03 != null) {
            return i03;
        }
        if (!e0().isInterface() || (i02 = i0(Object.class, name, clsArr, h02, false)) == null) {
            return null;
        }
        return i02;
    }

    @d5.d
    public final u0 U(@d5.d String name, @d5.d String signature) {
        Object h5;
        SortedMap r5;
        Object n32;
        String m32;
        Object B2;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("耓"));
        kotlin.jvm.internal.l0.p(signature, ProtectedSandApp.s("耔"));
        MatchResult j5 = f26781q.j(signature);
        if (j5 != null) {
            String str = j5.a().getF27151a().b().get(1);
            u0 b02 = b0(Integer.parseInt(str));
            if (b02 != null) {
                return b02;
            }
            StringBuilder a6 = androidx.appcompat.view.g.a(ProtectedSandApp.s("耕"), str, ProtectedSandApp.s("耖"));
            a6.append(f());
            throw new e0(a6.toString());
        }
        kotlin.reflect.jvm.internal.impl.name.f p5 = kotlin.reflect.jvm.internal.impl.name.f.p(name);
        String s5 = ProtectedSandApp.s("耗");
        kotlin.jvm.internal.l0.o(p5, s5);
        Collection<u0> f02 = f0(p5);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f02) {
            if (kotlin.jvm.internal.l0.g(j0.f26695a.f((u0) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        String s6 = ProtectedSandApp.s("耘");
        String s7 = ProtectedSandApp.s("耙");
        String s8 = ProtectedSandApp.s("耚");
        if (isEmpty) {
            throw new e0(s8 + name + s7 + signature + s6 + this);
        }
        if (arrayList.size() == 1) {
            h5 = kotlin.collections.j0.h5(arrayList);
            return (u0) h5;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            kotlin.reflect.jvm.internal.impl.descriptors.u c6 = ((u0) obj2).c();
            Object obj3 = linkedHashMap.get(c6);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(c6, obj3);
            }
            ((List) obj3).add(obj2);
        }
        r5 = e1.r(linkedHashMap, new o(f.f26788p));
        Collection values = r5.values();
        kotlin.jvm.internal.l0.o(values, ProtectedSandApp.s("耛"));
        n32 = kotlin.collections.j0.n3(values);
        List list = (List) n32;
        if (list.size() == 1) {
            kotlin.jvm.internal.l0.o(list, ProtectedSandApp.s("耜"));
            B2 = kotlin.collections.j0.B2(list);
            return (u0) B2;
        }
        kotlin.reflect.jvm.internal.impl.name.f p6 = kotlin.reflect.jvm.internal.impl.name.f.p(name);
        kotlin.jvm.internal.l0.o(p6, s5);
        m32 = kotlin.collections.j0.m3(f0(p6), ProtectedSandApp.s("耝"), null, null, 0, null, e.f26787p, 30, null);
        StringBuilder sb = new StringBuilder(s8);
        sb.append(name);
        sb.append(s7);
        sb.append(signature);
        sb.append(s6);
        sb.append(this);
        sb.append(':');
        sb.append(m32.length() == 0 ? ProtectedSandApp.s("耞") : androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("耟"), m32));
        throw new e0(sb.toString());
    }

    @d5.d
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> Y();

    @d5.d
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> a0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name);

    @d5.e
    public abstract u0 b0(int index);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[SYNTHETIC] */
    @d5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.util.Collection<kotlin.reflect.jvm.internal.l<?>> d0(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h r8, @d5.d kotlin.reflect.jvm.internal.p.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "耠"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "耡"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            kotlin.reflect.jvm.internal.p$g r0 = new kotlin.reflect.jvm.internal.p$g
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.a(r8, r2, r2, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L26:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L5b
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b
            if (r4 == 0) goto L54
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.c()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.t.f24443h
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r6)
            if (r5 != 0) goto L54
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L54
            kotlin.m2 r4 = kotlin.m2.f23662a
            java.lang.Object r3 = r3.T(r0, r4)
            kotlin.reflect.jvm.internal.l r3 = (kotlin.reflect.jvm.internal.l) r3
            goto L55
        L54:
            r3 = r2
        L55:
            if (r3 == 0) goto L26
            r1.add(r3)
            goto L26
        L5b:
            java.util.List r8 = kotlin.collections.y.V5(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.p.d0(kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.p$c):java.util.Collection");
    }

    @d5.d
    protected Class<?> e0() {
        Class<?> g5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(f());
        return g5 == null ? f() : g5;
    }

    @d5.d
    public abstract Collection<u0> f0(@d5.d kotlin.reflect.jvm.internal.impl.name.f name);
}
