package kotlin.reflect.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.m;
import kotlin.reflect.o;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000 P*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004QRSTB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0010B+\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\b\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010#R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010#R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010\u00060\u0006048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0018\u0010H\u001a\u0006\u0012\u0002\b\u00030E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0014\u0010K\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010<R\u0014\u0010L\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010<R\u0014\u0010M\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lkotlin/reflect/jvm/internal/b0;", "V", "Lkotlin/reflect/jvm/internal/n;", "Lkotlin/reflect/o;", "Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/r;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Ljava/lang/reflect/Member;", "u0", "()Ljava/lang/reflect/Member;", "fieldOrMethod", "receiver1", "receiver2", "w0", "(Ljava/lang/reflect/Member;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "h", "Lkotlin/reflect/jvm/internal/r;", "n0", "()Lkotlin/reflect/jvm/internal/r;", "i", "Ljava/lang/String;", "getName", "j", "A0", "k", "Ljava/lang/Object;", "Lkotlin/b0;", "Ljava/lang/reflect/Field;", "l", "Lkotlin/b0;", "_javaField", "Lkotlin/reflect/jvm/internal/i0$a;", "kotlin.jvm.PlatformType", "m", "Lkotlin/reflect/jvm/internal/i0$a;", "_descriptor", "v0", "()Ljava/lang/Object;", "s0", "()Z", "isBound", "z0", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/b0$c;", "y0", "()Lkotlin/reflect/jvm/internal/b0$c;", "getter", "Lkotlin/reflect/jvm/internal/calls/e;", "m0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "o0", "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "n", "a", "b", "c", "d", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
/* loaded from: classes7.dex */
public abstract class b0<V> extends n<V> implements kotlin.reflect.o<V> {

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final Object f75550o = new Object();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r container;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String signature;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object rawBoundReceiver;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.b0<Field> _javaField;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final i0.a<u0> _descriptor;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u0014\u0010 \u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lkotlin/reflect/jvm/internal/b0$a;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/n;", "Lkotlin/reflect/o$a;", "Lkotlin/reflect/i;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/b0;", "u0", "()Lkotlin/reflect/jvm/internal/b0;", "property", "Lkotlin/reflect/jvm/internal/r;", "n0", "()Lkotlin/reflect/jvm/internal/r;", "container", "Lkotlin/reflect/jvm/internal/calls/e;", "o0", "()Lkotlin/reflect/jvm/internal/calls/e;", "defaultCaller", "", "s0", "()Z", "isBound", "k", "isInline", "t", "isExternal", "x", "isOperator", "B", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a<PropertyType, ReturnType> extends n<ReturnType> implements kotlin.reflect.i<ReturnType>, o.a<PropertyType> {
        @Override // kotlin.reflect.i
        public boolean B() {
            return t0().B();
        }

        @Override // kotlin.reflect.c, kotlin.reflect.i
        public boolean isSuspend() {
            return t0().isSuspend();
        }

        @Override // kotlin.reflect.i
        public boolean k() {
            return t0().k();
        }

        @Override // kotlin.reflect.jvm.internal.n
        @fg.l
        /* renamed from: n0 */
        public r getContainer() {
            return u0().getContainer();
        }

        @Override // kotlin.reflect.jvm.internal.n
        @fg.m
        public kotlin.reflect.jvm.internal.calls.e<?> o0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.n
        public boolean s0() {
            return u0().s0();
        }

        @Override // kotlin.reflect.i
        public boolean t() {
            return t0().t();
        }

        @fg.l
        public abstract t0 t0();

        @fg.l
        public abstract b0<PropertyType> u0();

        @Override // kotlin.reflect.i
        public boolean x() {
            return t0().x();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/b0$b;", "", "<init>", "()V", "EXTENSION_PROPERTY_DELEGATE", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.b0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final Object a() {
            return b0.f75550o;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/b0$c;", "V", "Lkotlin/reflect/jvm/internal/b0$a;", "Lkotlin/reflect/o$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "h", "Lkotlin/reflect/jvm/internal/i0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/e;", "i", "Lkotlin/b0;", "m0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c<V> extends a<V, V> implements o.c<V> {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f75557j = {l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("晲\u0001"), ProtectedSandApp.s("晳\u0001")))};

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a descriptor = i0.c(new b(this));

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.b0 caller = kotlin.c0.b(kotlin.f0.PUBLICATION, new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<V> f75560b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? extends V> cVar) {
                super(0);
                this.f75560b = cVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.e<?> invoke() {
                kotlin.reflect.jvm.internal.calls.e<?> b5;
                b5 = c0.b(this.f75560b, true);
                return b5;
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/v0;"}, k = 3, mv = {1, 9, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<v0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<V> f75561b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? extends V> cVar) {
                super(0);
                this.f75561b = cVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v0 invoke() {
                v0 getter = this.f75561b.u0().t0().getGetter();
                return getter == null ? kotlin.reflect.jvm.internal.impl.resolve.e.d(this.f75561b.u0().t0(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2.b()) : getter;
            }
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof c) && kotlin.jvm.internal.l0.g(u0(), ((c) other).u0());
        }

        @Override // kotlin.reflect.c
        @fg.l
        public String getName() {
            return ProtectedSandApp.s("晴\u0001") + u0().getName() + kotlin.text.m0.greater;
        }

        public int hashCode() {
            return u0().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.n
        @fg.l
        public kotlin.reflect.jvm.internal.calls.e<?> m0() {
            return (kotlin.reflect.jvm.internal.calls.e) this.caller.getValue();
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("晵\u0001") + u0();
        }

        @Override // kotlin.reflect.jvm.internal.b0.a
        @fg.l
        /* renamed from: v0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public v0 t0() {
            i0.a aVar = this.descriptor;
            kotlin.reflect.o<Object> oVar = f75557j[0];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("晶\u0001"));
            return (v0) invoke;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/b0$d;", "V", "Lkotlin/reflect/jvm/internal/b0$a;", "Lkotlin/k2;", "Lkotlin/reflect/j$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "h", "Lkotlin/reflect/jvm/internal/i0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/e;", "i", "Lkotlin/b0;", "m0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "getName", "name", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d<V> extends a<V, k2> implements j.b<V> {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f75562j = {l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("暊\u0001"), ProtectedSandApp.s("暋\u0001")))};

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final i0.a descriptor = i0.c(new b(this));

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.b0 caller = kotlin.c0.b(kotlin.f0.PUBLICATION, new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 9, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d<V> f75565b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<V> dVar) {
                super(0);
                this.f75565b = dVar;
            }

            @Override // ld.a
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.e<?> invoke() {
                kotlin.reflect.jvm.internal.calls.e<?> b5;
                b5 = c0.b(this.f75565b, false);
                return b5;
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/w0;"}, k = 3, mv = {1, 9, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<w0> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d<V> f75566b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<V> dVar) {
                super(0);
                this.f75566b = dVar;
            }

            @Override // ld.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w0 invoke() {
                w0 setter = this.f75566b.u0().t0().getSetter();
                if (setter != null) {
                    return setter;
                }
                u0 t02 = this.f75566b.u0().t0();
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f75911n2;
                return kotlin.reflect.jvm.internal.impl.resolve.e.e(t02, aVar.b(), aVar.b());
            }
        }

        public boolean equals(@fg.m Object other) {
            return (other instanceof d) && kotlin.jvm.internal.l0.g(u0(), ((d) other).u0());
        }

        @Override // kotlin.reflect.c
        @fg.l
        public String getName() {
            return ProtectedSandApp.s("暌\u0001") + u0().getName() + kotlin.text.m0.greater;
        }

        public int hashCode() {
            return u0().hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.n
        @fg.l
        public kotlin.reflect.jvm.internal.calls.e<?> m0() {
            return (kotlin.reflect.jvm.internal.calls.e) this.caller.getValue();
        }

        @fg.l
        public String toString() {
            return ProtectedSandApp.s("暍\u0001") + u0();
        }

        @Override // kotlin.reflect.jvm.internal.b0.a
        @fg.l
        /* renamed from: v0, reason: merged with bridge method [inline-methods] */
        public w0 t0() {
            i0.a aVar = this.descriptor;
            kotlin.reflect.o<Object> oVar = f75562j[0];
            Object invoke = aVar.invoke();
            kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("暎\u0001"));
            return (w0) invoke;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/u0;"}, k = 3, mv = {1, 9, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<u0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<V> f75567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(b0<? extends V> b0Var) {
            super(0);
            this.f75567b = b0Var;
        }

        @Override // ld.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 invoke() {
            return this.f75567b.getContainer().O(this.f75567b.getName(), this.f75567b.getSignature());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<Field> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<V> f75568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(b0<? extends V> b0Var) {
            super(0);
            this.f75568b = b0Var;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field invoke() {
            Class<?> enclosingClass;
            m f4 = l0.f78709a.f(this.f75568b.t0());
            if (!(f4 instanceof m.c)) {
                if (f4 instanceof m.a) {
                    return ((m.a) f4).getField();
                }
                if ((f4 instanceof m.b) || (f4 instanceof m.d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            m.c cVar = (m.c) f4;
            u0 descriptor = cVar.getDescriptor();
            d.a d5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a, cVar.getProto(), cVar.getNameResolver(), cVar.getTypeTable(), false, 8, null);
            if (d5 == null) {
                return null;
            }
            b0<V> b0Var = this.f75568b;
            if (kotlin.reflect.jvm.internal.impl.load.java.k.e(descriptor) || kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(cVar.getProto())) {
                enclosingClass = b0Var.getContainer().e().getEnclosingClass();
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.m c5 = descriptor.c();
                enclosingClass = c5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? p0.s((kotlin.reflect.jvm.internal.impl.descriptors.e) c5) : b0Var.getContainer().e();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(d5.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    private b0(r rVar, String str, String str2, u0 u0Var, Object obj) {
        this.container = rVar;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this._javaField = kotlin.c0.b(kotlin.f0.PUBLICATION, new f(this));
        i0.a<u0> b5 = i0.b(u0Var, new e(this));
        kotlin.jvm.internal.l0.o(b5, ProtectedSandApp.s("晻\u0001"));
        this._descriptor = b5;
    }

    @fg.l
    /* renamed from: A0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(@fg.m Object other) {
        b0<?> d5 = p0.d(other);
        return d5 != null && kotlin.jvm.internal.l0.g(getContainer(), d5.getContainer()) && kotlin.jvm.internal.l0.g(getName(), d5.getName()) && kotlin.jvm.internal.l0.g(this.signature, d5.signature) && kotlin.jvm.internal.l0.g(this.rawBoundReceiver, d5.rawBoundReceiver);
    }

    @Override // kotlin.reflect.c
    @fg.l
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.o
    public boolean isConst() {
        return t0().isConst();
    }

    @Override // kotlin.reflect.o
    public boolean isLateinit() {
        return t0().A0();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    public boolean isSuspend() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    public kotlin.reflect.jvm.internal.calls.e<?> m0() {
        return y0().m0();
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    /* renamed from: n0, reason: from getter */
    public r getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.m
    public kotlin.reflect.jvm.internal.calls.e<?> o0() {
        return y0().o0();
    }

    @Override // kotlin.reflect.jvm.internal.n
    public boolean s0() {
        return !kotlin.jvm.internal.l0.g(this.rawBoundReceiver, kotlin.jvm.internal.q.NO_RECEIVER);
    }

    @fg.l
    public String toString() {
        return k0.f78694a.g(t0());
    }

    @fg.m
    protected final Member u0() {
        if (!t0().F()) {
            return null;
        }
        m f4 = l0.f78709a.f(t0());
        if (f4 instanceof m.c) {
            m.c cVar = (m.c) f4;
            if (cVar.getSignature().G()) {
                a.c A = cVar.getSignature().A();
                if (!A.A() || !A.y()) {
                    return null;
                }
                return getContainer().M(cVar.getNameResolver().getString(A.x()), cVar.getNameResolver().getString(A.v()));
            }
        }
        return z0();
    }

    @fg.m
    public final Object v0() {
        return kotlin.reflect.jvm.internal.calls.k.g(this.rawBoundReceiver, t0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    protected final Object w0(@fg.m Member fieldOrMethod, @fg.m Object receiver1, @fg.m Object receiver2) {
        String s4 = ProtectedSandApp.s("晾\u0001");
        String s5 = ProtectedSandApp.s("晿\u0001");
        String s6 = ProtectedSandApp.s("暀\u0001");
        try {
            Object obj = f75550o;
            if ((receiver1 == obj || receiver2 == obj) && t0().S() == null) {
                throw new RuntimeException(s6 + this + ProtectedSandApp.s("暄\u0001"));
            }
            Object v02 = s0() ? v0() : receiver1;
            if (v02 == obj) {
                v02 = null;
            }
            if (!s0()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(kotlin.reflect.jvm.b.a(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(v02);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError(s4 + fieldOrMethod + ProtectedSandApp.s("暃\u0001"));
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, null);
            }
            String s7 = ProtectedSandApp.s("暁\u0001");
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                if (v02 == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    kotlin.jvm.internal.l0.o(cls, s7);
                    v02 = p0.g(cls);
                }
                return method.invoke(null, v02);
            }
            if (length != 2) {
                throw new AssertionError(s5 + fieldOrMethod + ProtectedSandApp.s("暂\u0001"));
            }
            Method method2 = (Method) fieldOrMethod;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                kotlin.jvm.internal.l0.o(cls2, s7);
                receiver1 = p0.g(cls2);
            }
            return method2.invoke(null, v02, receiver1);
        } catch (IllegalAccessException e4) {
            throw new IllegalPropertyDelegateAccessException(e4);
        }
    }

    @Override // kotlin.reflect.jvm.internal.n
    @fg.l
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public u0 t0() {
        u0 invoke = this._descriptor.invoke();
        kotlin.jvm.internal.l0.o(invoke, ProtectedSandApp.s("暅\u0001"));
        return invoke;
    }

    @fg.l
    public abstract c<V> y0();

    @fg.m
    public final Field z0() {
        return this._javaField.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(@fg.l r rVar, @fg.l String str, @fg.l String str2, @fg.m Object obj) {
        this(rVar, str, str2, null, obj);
        kotlin.jvm.internal.l0.p(rVar, ProtectedSandApp.s("晸\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("晹\u0001"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("智\u0001"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@fg.l kotlin.reflect.jvm.internal.r r8, @fg.l kotlin.reflect.jvm.internal.impl.descriptors.u0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "晸\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "晼\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "晽\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            kotlin.reflect.jvm.internal.l0 r0 = kotlin.reflect.jvm.internal.l0.f78709a
            kotlin.reflect.jvm.internal.m r0 = r0.f(r9)
            java.lang.String r4 = r0.getString()
            java.lang.Object r6 = kotlin.jvm.internal.q.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.b0.<init>(kotlin.reflect.jvm.internal.r, kotlin.reflect.jvm.internal.impl.descriptors.u0):void");
    }
}
