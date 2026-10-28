package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;

/* compiled from: KDeclarationContainerImpl.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 J2\u00020\u0001:\u0003KJLB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0017\u001a\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0006\u001a\u00020%H&¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0&2\u0006\u0010\u0006\u001a\u00020%H&¢\u0006\u0004\b+\u0010)J\u0019\u0010-\u001a\u0004\u0018\u00010'2\u0006\u0010,\u001a\u00020\u001eH&¢\u0006\u0004\b-\u0010.J)\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030&2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0004¢\u0006\u0004\b4\u00105J\u001d\u00107\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0005¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J'\u0010>\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\n¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\bB\u0010AR\u0018\u0010E\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020F0&8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lkotlin/reflect/jvm/internal/r;", "Lkotlin/jvm/internal/t;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "a0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "e0", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "c0", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "desc", "isConstructor", "Lkotlin/k2;", "z", "(Ljava/util/List;Ljava/lang/String;Z)V", "Y", "(Ljava/lang/String;)Ljava/util/List;", "", "begin", "end", "b0", "(Ljava/lang/String;II)Ljava/lang/Class;", "Z", "(Ljava/lang/String;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/name/f;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "X", "(Lkotlin/reflect/jvm/internal/impl/name/f;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "S", "index", "T", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;", "scope", "Lkotlin/reflect/jvm/internal/r$c;", "belonginess", "Lkotlin/reflect/jvm/internal/n;", "U", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/h;Lkotlin/reflect/jvm/internal/r$c;)Ljava/util/Collection;", "signature", "O", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "K", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "M", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "J", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "H", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "I", "V", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "R", "()Ljava/util/Collection;", "constructorDescriptors", "b", "a", "c", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,314:1\n1603#2,9:315\n1855#2:324\n1856#2:326\n1612#2:327\n766#2:328\n857#2,2:329\n1477#2:331\n1502#2,3:332\n1505#2,3:342\n766#2:345\n857#2,2:346\n766#2:348\n857#2,2:349\n1#3:325\n1#3:351\n372#4,7:335\n1282#5,2:352\n37#6,2:354\n37#6,2:356\n37#6,2:358\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:315,9\n58#1:324\n58#1:326\n58#1:327\n83#1:328\n83#1:329,2\n103#1:331\n103#1:332,3\n103#1:342,3\n128#1:345\n128#1:346,2\n142#1:348\n142#1:349,2\n58#1:325\n103#1:335,7\n197#1:352,2\n207#1:354,2\n215#1:356,2\n239#1:358,2\n*E\n"})
/* loaded from: classes7.dex */
public abstract class r implements kotlin.jvm.internal.t {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f78798c = kotlin.jvm.internal.w.class;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final kotlin.text.r f78799d = new kotlin.text.r(ProtectedSandApp.s("腦\u0001"));

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/r$a;", "", "<init>", "()V", "Lkotlin/text/r;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/r;", "a", "()Lkotlin/text/r;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.r$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final kotlin.text.r a() {
            return r.f78799d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/r$b;", "", "<init>", "(Lkotlin/reflect/jvm/internal/r;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "a", "Lkotlin/reflect/jvm/internal/i0$a;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f78800c = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("臶\u0001"), ProtectedSandApp.s("臷\u0001")))};

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a moduleData;

        /* compiled from: KDeclarationContainerImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f78803b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(r rVar) {
                super(0);
                this.f78803b = rVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k invoke() {
                return h0.b(this.f78803b.e());
            }
        }

        public b() {
            this.moduleData = i0.c(new a(r.this));
        }

        @fg.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a() {
            i0.a aVar = this.moduleData;
            kotlin.reflect.o<Object> oVar = f78800c[0];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("臸\u0001"));
            return (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) invoke;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/r$c;", "", "<init>", "(Ljava/lang/String;I)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "member", "", "accept", "(Lkotlin/reflect/jvm/internal/impl/descriptors/b;)Z", "DECLARED", "INHERITED", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    protected static final class c {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c DECLARED = new c(ProtectedSandApp.s("艤\u0001"), 0);
        public static final c INHERITED = new c(ProtectedSandApp.s("艥\u0001"), 1);

        private static final /* synthetic */ c[] $values() {
            return new c[]{DECLARED, INHERITED};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private c(String str, int i4) {
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final boolean accept(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.b member) {
            kotlin.jvm.internal.l0.p(member, ProtectedSandApp.s("艦\u0001"));
            return member.b().isReal() == (this == DECLARED);
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/z;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/z;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<kotlin.reflect.jvm.internal.impl.descriptors.z, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f78804b = new d(1);

        d() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.z zVar) {
            kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("艧\u0001"));
            return kotlin.reflect.jvm.internal.impl.renderer.c.f77801j.s(zVar) + ProtectedSandApp.s("艨\u0001") + l0.f78709a.g(zVar).get_signature();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "", "a", "(Lkotlin/reflect/jvm/internal/impl/descriptors/u0;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<u0, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f78805b = new e(1);

        e() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l u0 u0Var) {
            kotlin.jvm.internal.l0.p(u0Var, ProtectedSandApp.s("艩\u0001"));
            return kotlin.reflect.jvm.internal.impl.renderer.c.f77801j.s(u0Var) + ProtectedSandApp.s("艪\u0001") + l0.f78709a.f(u0Var).getString();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/u;", "kotlin.jvm.PlatformType", "first", "second", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<kotlin.reflect.jvm.internal.impl.descriptors.u, kotlin.reflect.jvm.internal.impl.descriptors.u, Integer> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f78806b = new f(2);

        f() {
            super(2);
        }

        @Override // ld.p
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(kotlin.reflect.jvm.internal.impl.descriptors.u uVar, kotlin.reflect.jvm.internal.impl.descriptors.u uVar2) {
            Integer d5 = kotlin.reflect.jvm.internal.impl.descriptors.t.d(uVar, uVar2);
            return Integer.valueOf(d5 == null ? 0 : d5.intValue());
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/reflect/jvm/internal/r$g", "Lkotlin/reflect/jvm/internal/i;", "Lkotlin/reflect/jvm/internal/impl/descriptors/l;", "descriptor", "Lkotlin/k2;", "data", "Lkotlin/reflect/jvm/internal/n;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/k2;)Lkotlin/reflect/jvm/internal/n;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g extends i {
        g(r rVar) {
            super(rVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.l, kotlin.reflect.jvm.internal.impl.descriptors.o
        @fg.l
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public n<?> j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.l lVar, @fg.l k2 k2Var) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("艫\u0001"));
            kotlin.jvm.internal.l0.p(k2Var, ProtectedSandApp.s("艬\u0001"));
            throw new IllegalStateException(ProtectedSandApp.s("艭\u0001") + lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Q(ld.p pVar, Object obj, Object obj2) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("腧\u0001"));
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    private final List<Class<?>> Y(String desc) {
        int o32;
        ArrayList arrayList = new ArrayList();
        int i4 = 1;
        while (desc.charAt(i4) != ')') {
            int i5 = i4;
            while (desc.charAt(i5) == '[') {
                i5++;
            }
            char charAt = desc.charAt(i5);
            if (kotlin.text.v.S2(ProtectedSandApp.s("腨\u0001"), charAt, false, 2, null)) {
                o32 = i5 + 1;
            } else {
                if (charAt != 'L') {
                    throw new g0(ProtectedSandApp.s("腩\u0001").concat(desc));
                }
                o32 = kotlin.text.v.o3(desc, ';', i4, false, 4, null) + 1;
            }
            arrayList.add(b0(desc, i4, o32));
            i4 = o32;
        }
        return arrayList;
    }

    private final Class<?> Z(String desc) {
        return b0(desc, kotlin.text.v.o3(desc, ')', 0, false, 6, null) + 1, desc.length());
    }

    private final Method a0(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z4) {
        Class<?> a5;
        Method a02;
        if (z4) {
            clsArr[0] = cls;
        }
        Method e02 = e0(cls, str, clsArr, cls2);
        if (e02 != null) {
            return e02;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && (a02 = a0(superclass, str, clsArr, cls2, z4)) != null) {
            return a02;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.l0.o(interfaces, ProtectedSandApp.s("腪\u0001"));
        for (Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.l0.m(cls3);
            Method a03 = a0(cls3, str, clsArr, cls2, z4);
            if (a03 != null) {
                return a03;
            }
            if (z4 && (a5 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(cls3), cls3.getName().concat(ProtectedSandApp.s("腫\u0001")))) != null) {
                clsArr[0] = cls3;
                Method e03 = e0(a5, str, clsArr, cls2);
                if (e03 != null) {
                    return e03;
                }
            }
        }
        return null;
    }

    private final Class<?> b0(String desc, int begin, int end) {
        char charAt = desc.charAt(begin);
        if (charAt == 'L') {
            ClassLoader f4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f(e());
            String substring = desc.substring(begin + 1, end - 1);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("腬\u0001"));
            Class<?> loadClass = f4.loadClass(kotlin.text.v.h2(substring, '/', '.', false, 4, null));
            kotlin.jvm.internal.l0.o(loadClass, ProtectedSandApp.s("腭\u0001"));
            return loadClass;
        }
        if (charAt == '[') {
            return p0.f(b0(desc, begin + 1, end));
        }
        if (charAt == 'V') {
            Class<?> cls = Void.TYPE;
            kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("腮\u0001"));
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
        throw new g0(ProtectedSandApp.s("腩\u0001").concat(desc));
    }

    private final Constructor<?> c0(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method e0(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.l0.g(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.l0.o(declaredMethods, ProtectedSandApp.s("腯\u0001"));
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

    private final void z(List<Class<?>> result, String desc, boolean isConstructor) {
        List<Class<?>> Y = Y(desc);
        result.addAll(Y);
        int size = (Y.size() + 31) / 32;
        for (int i4 = 0; i4 < size; i4++) {
            Class<?> cls = Integer.TYPE;
            kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("腮\u0001"));
            result.add(cls);
        }
        if (!isConstructor) {
            result.add(Object.class);
            return;
        }
        Class<?> cls2 = f78798c;
        result.remove(cls2);
        kotlin.jvm.internal.l0.o(cls2, ProtectedSandApp.s("腰\u0001"));
        result.add(cls2);
    }

    @fg.m
    public final Constructor<?> H(@fg.l String desc) {
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("腱\u0001"));
        return c0(e(), Y(desc));
    }

    @fg.m
    public final Constructor<?> I(@fg.l String desc) {
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("腱\u0001"));
        Class<?> e4 = e();
        ArrayList arrayList = new ArrayList();
        z(arrayList, desc, true);
        k2 k2Var = k2.f75408a;
        return c0(e4, arrayList);
    }

    @fg.m
    public final Method J(@fg.l String name, @fg.l String desc, boolean isMember) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("腲\u0001"));
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("腱\u0001"));
        if (kotlin.jvm.internal.l0.g(name, ProtectedSandApp.s("腳\u0001"))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(e());
        }
        z(arrayList, desc, false);
        return a0(V(), androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("腴\u0001")), (Class[]) arrayList.toArray(new Class[0]), Z(desc), isMember);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC] */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.z K(@fg.l java.lang.String r14, @fg.l java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.r.K(java.lang.String, java.lang.String):kotlin.reflect.jvm.internal.impl.descriptors.z");
    }

    @fg.m
    public final Method M(@fg.l String name, @fg.l String desc) {
        Method a02;
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("腲\u0001"));
        kotlin.jvm.internal.l0.p(desc, ProtectedSandApp.s("腱\u0001"));
        if (kotlin.jvm.internal.l0.g(name, ProtectedSandApp.s("腳\u0001"))) {
            return null;
        }
        Class<?>[] clsArr = (Class[]) Y(desc).toArray(new Class[0]);
        Class<?> Z = Z(desc);
        Method a03 = a0(V(), name, clsArr, Z, false);
        if (a03 != null) {
            return a03;
        }
        if (!V().isInterface() || (a02 = a0(Object.class, name, clsArr, Z, false)) == null) {
            return null;
        }
        return a02;
    }

    @fg.l
    public final u0 O(@fg.l String name, @fg.l String signature) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("腲\u0001"));
        kotlin.jvm.internal.l0.p(signature, ProtectedSandApp.s("腵\u0001"));
        kotlin.text.p j4 = f78799d.j(signature);
        if (j4 != null) {
            String str = j4.a().getMatch().b().get(1);
            u0 T = T(Integer.parseInt(str));
            if (T != null) {
                return T;
            }
            StringBuilder a5 = androidx.appcompat.view.g.a(ProtectedSandApp.s("膂\u0001"), str, ProtectedSandApp.s("膃\u0001"));
            a5.append(e());
            throw new g0(a5.toString());
        }
        kotlin.reflect.jvm.internal.impl.name.f f4 = kotlin.reflect.jvm.internal.impl.name.f.f(name);
        String s4 = ProtectedSandApp.s("腼\u0001");
        kotlin.jvm.internal.l0.o(f4, s4);
        Collection<u0> X = X(f4);
        ArrayList arrayList = new ArrayList();
        for (Object obj : X) {
            if (kotlin.jvm.internal.l0.g(l0.f78709a.f((u0) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        String s5 = ProtectedSandApp.s("膀\u0001");
        String s6 = ProtectedSandApp.s("腿\u0001");
        String s7 = ProtectedSandApp.s("膄\u0001");
        if (isEmpty) {
            StringBuilder a6 = androidx.constraintlayout.core.parser.b.a(s7, name, s6, signature, s5);
            a6.append(this);
            throw new g0(a6.toString());
        }
        if (arrayList.size() == 1) {
            return (u0) kotlin.collections.w.h5(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            kotlin.reflect.jvm.internal.impl.descriptors.u visibility = ((u0) obj2).getVisibility();
            Object obj3 = linkedHashMap.get(visibility);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(visibility, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection values = z0.r(linkedHashMap, new q(f.f78806b)).values();
        kotlin.jvm.internal.l0.o(values, ProtectedSandApp.s("膅\u0001"));
        List list = (List) kotlin.collections.w.n3(values);
        if (list.size() == 1) {
            kotlin.jvm.internal.l0.m(list);
            return (u0) kotlin.collections.w.B2(list);
        }
        kotlin.reflect.jvm.internal.impl.name.f f5 = kotlin.reflect.jvm.internal.impl.name.f.f(name);
        kotlin.jvm.internal.l0.o(f5, s4);
        String m32 = kotlin.collections.w.m3(X(f5), ProtectedSandApp.s("腽\u0001"), null, null, 0, null, e.f78805b, 30, null);
        StringBuilder a7 = androidx.constraintlayout.core.parser.b.a(s7, name, s6, signature, s5);
        a7.append(this);
        a7.append(':');
        a7.append(m32.length() == 0 ? ProtectedSandApp.s("膁\u0001") : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("腽\u0001"), m32));
        throw new g0(a7.toString());
    }

    @fg.l
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.l> R();

    @fg.l
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.z> S(@fg.l kotlin.reflect.jvm.internal.impl.name.f name);

    @fg.m
    public abstract u0 T(int index);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[SYNTHETIC] */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.util.Collection<kotlin.reflect.jvm.internal.n<?>> U(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h r8, @fg.l kotlin.reflect.jvm.internal.r.c r9) {
        /*
            r7 = this;
            java.lang.String r0 = "膆\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "膇\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            kotlin.reflect.jvm.internal.r$g r0 = new kotlin.reflect.jvm.internal.r$g
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L28:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = (kotlin.reflect.jvm.internal.impl.descriptors.m) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b
            if (r4 == 0) goto L56
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.b r4 = (kotlin.reflect.jvm.internal.impl.descriptors.b) r4
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.u r6 = kotlin.reflect.jvm.internal.impl.descriptors.t.f76293h
            boolean r5 = kotlin.jvm.internal.l0.g(r5, r6)
            if (r5 != 0) goto L56
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L56
            kotlin.k2 r4 = kotlin.k2.f75408a
            java.lang.Object r3 = r3.E(r0, r4)
            kotlin.reflect.jvm.internal.n r3 = (kotlin.reflect.jvm.internal.n) r3
            goto L57
        L56:
            r3 = r2
        L57:
            if (r3 == 0) goto L28
            r1.add(r3)
            goto L28
        L5d:
            java.util.List r8 = kotlin.collections.w.V5(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.r.U(kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.r$c):java.util.Collection");
    }

    @fg.l
    protected Class<?> V() {
        Class<?> g4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.g(e());
        return g4 == null ? e() : g4;
    }

    @fg.l
    public abstract Collection<u0> X(@fg.l kotlin.reflect.jvm.internal.impl.name.f name);
}
