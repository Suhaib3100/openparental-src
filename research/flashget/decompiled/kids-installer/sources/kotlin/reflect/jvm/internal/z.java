package kotlin.reflect.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l1;
import kotlin.m2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.a;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d;
import kotlin.reflect.jvm.internal.k;
import kotlin.text.Typography;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b \u0018\u0000 N*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004OPQRB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010H\u001a\u00020)¢\u0006\u0004\bI\u0010JB5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010K\u001a\u0004\u0018\u00010)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bI\u0010LB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u00100\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bI\u0010MJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0013\u00100\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00106\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0018\u0010>\u001a\u0006\u0012\u0002\b\u00030;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0002\b\u0003\u0018\u00010;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0014\u0010B\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00102R\u0014\u0010C\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u00102R\u0014\u0010E\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u0014\u0010H\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006S"}, d2 = {"Lkotlin/reflect/jvm/internal/z;", "V", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/o;", "Ljava/lang/reflect/Member;", "G0", "fieldOrMethod", "", "receiver1", "receiver2", "I0", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/p;", "s", "Lkotlin/reflect/jvm/internal/p;", "A0", "()Lkotlin/reflect/jvm/internal/p;", "container", "t", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "u", "M0", "signature", "v", "Ljava/lang/Object;", "rawBoundReceiver", "Lkotlin/reflect/jvm/internal/g0$b;", "Ljava/lang/reflect/Field;", "w", "Lkotlin/reflect/jvm/internal/g0$b;", "_javaField", "Lkotlin/reflect/jvm/internal/g0$a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "kotlin.jvm.PlatformType", "x", "Lkotlin/reflect/jvm/internal/g0$a;", "_descriptor", "H0", "()Ljava/lang/Object;", "boundReceiver", "E0", "()Z", "isBound", "L0", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/z$c;", "K0", "()Lkotlin/reflect/jvm/internal/z$c;", "getter", "Lkotlin/reflect/jvm/internal/calls/e;", "z0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "B0", "defaultCaller", "l0", "isLateinit", "isConst", "o", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/p;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "y", "a", "b", "c", "d", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public abstract class z<V> extends l<V> implements KProperty<V> {

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: z, reason: collision with root package name */
    @d5.d
    private static final Object f26842z = new Object();

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final p container;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String name;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String signature;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Object rawBoundReceiver;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.b<Field> _javaField;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g0.a<u0> _descriptor;

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b$\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lkotlin/reflect/jvm/internal/z$a;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/l;", "Lkotlin/reflect/o$a;", "Lkotlin/reflect/i;", "Lkotlin/reflect/jvm/internal/z;", "G0", "()Lkotlin/reflect/jvm/internal/z;", "property", "Lkotlin/reflect/jvm/internal/p;", "A0", "()Lkotlin/reflect/jvm/internal/p;", "container", "Lkotlin/reflect/jvm/internal/calls/e;", "B0", "()Lkotlin/reflect/jvm/internal/calls/e;", "defaultCaller", "", "E0", "()Z", "isBound", "p", "isInline", "q", "isExternal", "B", "isOperator", "H", "isInfix", "o", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static abstract class a<PropertyType, ReturnType> extends l<ReturnType> implements KFunction<ReturnType>, KProperty.a<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.l
        @d5.d
        /* renamed from: A0 */
        public p getContainer() {
            return G0().getContainer();
        }

        @Override // kotlin.reflect.KFunction
        public boolean B() {
            return F0().B();
        }

        @Override // kotlin.reflect.jvm.internal.l
        @d5.e
        public kotlin.reflect.jvm.internal.calls.e<?> B0() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.l
        public boolean E0() {
            return G0().E0();
        }

        @d5.d
        public abstract t0 F0();

        @d5.d
        public abstract z<PropertyType> G0();

        @Override // kotlin.reflect.KFunction
        public boolean H() {
            return F0().H();
        }

        @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
        public boolean o() {
            return F0().o();
        }

        @Override // kotlin.reflect.KFunction
        public boolean p() {
            return F0().p();
        }

        @Override // kotlin.reflect.KFunction
        public boolean q() {
            return F0().q();
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/z$b;", "", "EXTENSION_PROPERTY_DELEGATE", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.z$b, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final Object a() {
            return z.f26842z;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/z$c;", "V", "Lkotlin/reflect/jvm/internal/z$a;", "Lkotlin/reflect/o$c;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "s", "Lkotlin/reflect/jvm/internal/g0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/e;", "t", "Lkotlin/reflect/jvm/internal/g0$b;", "z0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static abstract class c<V> extends a<V, V> implements KProperty.c<V> {

        /* renamed from: u, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26849u = {l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("誫"), ProtectedSandApp.s("説"))), l1.u(new g1(l1.d(c.class), ProtectedSandApp.s("読"), ProtectedSandApp.s("誮")))};

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a descriptor = g0.d(new b(this));

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.b caller = g0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ c<V> f26852p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? extends V> cVar) {
                super(0);
                this.f26852p = cVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.e<?> n() {
                kotlin.reflect.jvm.internal.calls.e<?> b6;
                b6 = a0.b(this.f26852p, true);
                return b6;
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/v0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/v0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends Lambda implements q3.a<v0> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ c<V> f26853p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? extends V> cVar) {
                super(0);
                this.f26853p = cVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final v0 n() {
                v0 e6 = this.f26853p.G0().F0().e();
                return e6 == null ? kotlin.reflect.jvm.internal.impl.resolve.d.d(this.f26853p.G0().F0(), kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e.b()) : e6;
            }
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        @d5.d
        /* renamed from: H0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public v0 F0() {
            T b6 = this.descriptor.b(this, f26849u[0]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("誯"));
            return (v0) b6;
        }

        public boolean equals(@d5.e Object other) {
            return (other instanceof c) && kotlin.jvm.internal.l0.g(G0(), ((c) other).G0());
        }

        @Override // kotlin.reflect.KCallable
        @d5.d
        public String getName() {
            return ProtectedSandApp.s("誰") + G0().getName() + Typography.f27130f;
        }

        public int hashCode() {
            return G0().hashCode();
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("誱") + G0();
        }

        @Override // kotlin.reflect.jvm.internal.l
        @d5.d
        public kotlin.reflect.jvm.internal.calls.e<?> z0() {
            T b6 = this.caller.b(this, f26849u[1]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("課"));
            return (kotlin.reflect.jvm.internal.calls.e) b6;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlin/reflect/jvm/internal/z$d;", "V", "Lkotlin/reflect/jvm/internal/z$a;", "Lkotlin/m2;", "Lkotlin/reflect/j$b;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "s", "Lkotlin/reflect/jvm/internal/g0$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/calls/e;", "t", "Lkotlin/reflect/jvm/internal/g0$b;", "z0", "()Lkotlin/reflect/jvm/internal/calls/e;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    public static abstract class d<V> extends a<V, m2> implements KMutableProperty.b<V> {

        /* renamed from: u, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f26854u = {l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("詇"), ProtectedSandApp.s("詈"))), l1.u(new g1(l1.d(d.class), ProtectedSandApp.s("詉"), ProtectedSandApp.s("詊")))};

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.a descriptor = g0.d(new b(this));

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final g0.b caller = g0.b(new a(this));

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/calls/e;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/calls/e;"}, k = 3, mv = {1, 8, 0})
        static final class a extends Lambda implements q3.a<kotlin.reflect.jvm.internal.calls.e<?>> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ d<V> f26857p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d<V> dVar) {
                super(0);
                this.f26857p = dVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.calls.e<?> n() {
                kotlin.reflect.jvm.internal.calls.e<?> b6;
                b6 = a0.b(this.f26857p, false);
                return b6;
            }
        }

        /* compiled from: KPropertyImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/w0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/w0;"}, k = 3, mv = {1, 8, 0})
        static final class b extends Lambda implements q3.a<w0> {

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ d<V> f26858p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d<V> dVar) {
                super(0);
                this.f26858p = dVar;
            }

            @Override // q3.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final w0 n() {
                w0 h5 = this.f26858p.G0().F0().h();
                if (h5 != null) {
                    return h5;
                }
                u0 F0 = this.f26858p.G0().F0();
                g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f24114e;
                return kotlin.reflect.jvm.internal.impl.resolve.d.e(F0, aVar.b(), aVar.b());
            }
        }

        @Override // kotlin.reflect.jvm.internal.z.a
        @d5.d
        /* renamed from: H0, reason: merged with bridge method [inline-methods] */
        public w0 F0() {
            T b6 = this.descriptor.b(this, f26854u[0]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詋"));
            return (w0) b6;
        }

        public boolean equals(@d5.e Object other) {
            return (other instanceof d) && kotlin.jvm.internal.l0.g(G0(), ((d) other).G0());
        }

        @Override // kotlin.reflect.KCallable
        @d5.d
        public String getName() {
            return ProtectedSandApp.s("詌") + G0().getName() + Typography.f27130f;
        }

        public int hashCode() {
            return G0().hashCode();
        }

        @d5.d
        public String toString() {
            return ProtectedSandApp.s("詍") + G0();
        }

        @Override // kotlin.reflect.jvm.internal.l
        @d5.d
        public kotlin.reflect.jvm.internal.calls.e<?> z0() {
            T b6 = this.caller.b(this, f26854u[1]);
            kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詎"));
            return (kotlin.reflect.jvm.internal.calls.e) b6;
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/u0;", "kotlin.jvm.PlatformType", "a", "()Lkotlin/reflect/jvm/internal/impl/descriptors/u0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends Lambda implements q3.a<u0> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ z<V> f26859p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(z<? extends V> zVar) {
            super(0);
            this.f26859p = zVar;
        }

        @Override // q3.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 n() {
            return this.f26859p.getContainer().U(this.f26859p.getName(), this.f26859p.getSignature());
        }
    }

    /* compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"V", "Ljava/lang/reflect/Field;", "a", "()Ljava/lang/reflect/Field;"}, k = 3, mv = {1, 8, 0})
    static final class f extends Lambda implements q3.a<Field> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ z<V> f26860p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(z<? extends V> zVar) {
            super(0);
            this.f26860p = zVar;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Field n() {
            Class<?> enclosingClass;
            k f6 = j0.f26695a.f(this.f26860p.F0());
            if (!(f6 instanceof k.c)) {
                if (f6 instanceof k.a) {
                    return ((k.a) f6).getField();
                }
                if ((f6 instanceof k.b) || (f6 instanceof k.d)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            k.c cVar = (k.c) f6;
            u0 descriptor = cVar.getDescriptor();
            d.a d6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a, cVar.getProto(), cVar.getNameResolver(), cVar.getTypeTable(), false, 8, null);
            if (d6 == null) {
                return null;
            }
            z<V> zVar = this.f26860p;
            if (kotlin.reflect.jvm.internal.impl.load.java.k.e(descriptor) || kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f(cVar.getProto())) {
                enclosingClass = zVar.getContainer().f().getEnclosingClass();
            } else {
                kotlin.reflect.jvm.internal.impl.descriptors.m b6 = descriptor.b();
                enclosingClass = b6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? n0.p((kotlin.reflect.jvm.internal.impl.descriptors.e) b6) : zVar.getContainer().f();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(d6.c());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    private z(p pVar, String str, String str2, u0 u0Var, Object obj) {
        this.container = pVar;
        this.name = str;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        g0.b<Field> b6 = g0.b(new f(this));
        kotlin.jvm.internal.l0.o(b6, ProtectedSandApp.s("詓"));
        this._javaField = b6;
        g0.a<u0> c6 = g0.c(u0Var, new e(this));
        kotlin.jvm.internal.l0.o(c6, ProtectedSandApp.s("詔"));
        this._descriptor = c6;
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    /* renamed from: A0, reason: from getter */
    public p getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.e
    public kotlin.reflect.jvm.internal.calls.e<?> B0() {
        return K0().B0();
    }

    @Override // kotlin.reflect.jvm.internal.l
    public boolean E0() {
        return !kotlin.jvm.internal.l0.g(this.rawBoundReceiver, kotlin.jvm.internal.q.f23594u);
    }

    @d5.e
    protected final Member G0() {
        if (!F0().W()) {
            return null;
        }
        k f6 = j0.f26695a.f(F0());
        if (f6 instanceof k.c) {
            k.c cVar = (k.c) f6;
            if (cVar.getSignature().F()) {
                a.c A = cVar.getSignature().A();
                if (!A.A() || !A.y()) {
                    return null;
                }
                return getContainer().S(cVar.getNameResolver().getString(A.w()), cVar.getNameResolver().getString(A.v()));
            }
        }
        return L0();
    }

    @d5.e
    public final Object H0() {
        return kotlin.reflect.jvm.internal.calls.i.a(this.rawBoundReceiver, F0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d5.e
    protected final Object I0(@d5.e Member fieldOrMethod, @d5.e Object receiver1, @d5.e Object receiver2) {
        String s5 = ProtectedSandApp.s("詘");
        String s6 = ProtectedSandApp.s("詙");
        String s7 = ProtectedSandApp.s("詚");
        try {
            Object obj = f26842z;
            if ((receiver1 == obj || receiver2 == obj) && F0().t0() == null) {
                throw new RuntimeException(s7 + this + ProtectedSandApp.s("詟"));
            }
            Object H0 = E0() ? H0() : receiver1;
            if (!(H0 != obj)) {
                H0 = null;
            }
            if (!E0()) {
                receiver1 = receiver2;
            }
            if (!(receiver1 != obj)) {
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
                return ((Field) fieldOrMethod).get(H0);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError(s6 + fieldOrMethod + ProtectedSandApp.s("詞"));
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                Object[] objArr = new Object[1];
                if (H0 == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    kotlin.jvm.internal.l0.o(cls, ProtectedSandApp.s("詝"));
                    H0 = n0.g(cls);
                }
                objArr[0] = H0;
                return method.invoke(null, objArr);
            }
            if (length != 2) {
                throw new AssertionError(s5 + fieldOrMethod + ProtectedSandApp.s("詜"));
            }
            Method method2 = (Method) fieldOrMethod;
            Object[] objArr2 = new Object[2];
            objArr2[0] = H0;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                kotlin.jvm.internal.l0.o(cls2, ProtectedSandApp.s("詛"));
                receiver1 = n0.g(cls2);
            }
            objArr2[1] = receiver1;
            return method2.invoke(null, objArr2);
        } catch (IllegalAccessException e6) {
            throw new IllegalPropertyDelegateAccessException(e6);
        }
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public u0 F0() {
        u0 n5 = this._descriptor.n();
        kotlin.jvm.internal.l0.o(n5, ProtectedSandApp.s("詠"));
        return n5;
    }

    @d5.d
    public abstract c<V> K0();

    @d5.e
    public final Field L0() {
        return this._javaField.n();
    }

    @d5.d
    /* renamed from: M0, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(@d5.e Object other) {
        z<?> d6 = n0.d(other);
        return d6 != null && kotlin.jvm.internal.l0.g(getContainer(), d6.getContainer()) && kotlin.jvm.internal.l0.g(getName(), d6.getName()) && kotlin.jvm.internal.l0.g(this.signature, d6.signature) && kotlin.jvm.internal.l0.g(this.rawBoundReceiver, d6.rawBoundReceiver);
    }

    @Override // kotlin.reflect.KCallable
    @d5.d
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    public boolean l0() {
        return F0().z0();
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public boolean o() {
        return false;
    }

    @Override // kotlin.reflect.KProperty
    public boolean s() {
        return F0().s();
    }

    @d5.d
    public String toString() {
        return i0.f23876a.g(F0());
    }

    @Override // kotlin.reflect.jvm.internal.l
    @d5.d
    public kotlin.reflect.jvm.internal.calls.e<?> z0() {
        return K0().z0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(@d5.d p pVar, @d5.d String str, @d5.d String str2, @d5.e Object obj) {
        this(pVar, str, str2, null, obj);
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("詐"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("詑"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("詒"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(@d5.d kotlin.reflect.jvm.internal.p r8, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.u0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "評"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "詖"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = r9.getName()
            java.lang.String r3 = r0.h()
            java.lang.String r0 = "詗"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r3, r0)
            kotlin.reflect.jvm.internal.j0 r0 = kotlin.reflect.jvm.internal.j0.f26695a
            kotlin.reflect.jvm.internal.k r0 = r0.f(r9)
            java.lang.String r4 = r0.getString()
            java.lang.Object r6 = kotlin.jvm.internal.q.f23594u
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.z.<init>(kotlin.reflect.jvm.internal.p, kotlin.reflect.jvm.internal.impl.descriptors.u0):void");
    }
}
