package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.p;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.calls.e;
import kotlin.reflect.jvm.internal.calls.f;

/* compiled from: InternalUnderlyingValOfInlineClass.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\t\u000eB\u001f\b\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "c", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "b", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "Ljava/lang/reflect/Type;", "i", "()Ljava/lang/reflect/Type;", "returnType", "e", "()Ljava/lang/reflect/Method;", "member", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "Lkotlin/reflect/jvm/internal/calls/j$a;", "Lkotlin/reflect/jvm/internal/calls/j$b;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class j implements e<Method> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Method unboxMethod;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Type> parameterTypes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Type returnType;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$a;", "Lkotlin/reflect/jvm/internal/calls/j;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class a extends j implements d {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Object boundReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d Method method, @d5.e Object obj) {
            super(method, EmptyList.f23167o, null);
            l0.p(method, ProtectedSandApp.s("翤"));
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("翥"));
            e.a.a(this, args);
            return c(this.boundReceiver, args);
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/j$b;", "Lkotlin/reflect/jvm/internal/calls/j;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "unboxMethod", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class b extends j {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(@d5.d java.lang.reflect.Method r3) {
            /*
                r2 = this;
                java.lang.String r0 = "翦"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r3, r0)
                java.lang.Class r0 = r3.getDeclaringClass()
                java.util.List r0 = kotlin.collections.y.k(r0)
                r1 = 0
                r2.<init>(r3, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.j.b.<init>(java.lang.reflect.Method):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("翧"));
            e.a.a(this, args);
            Object obj = args[0];
            f.Companion companion = f.INSTANCE;
            return c(obj, args.length <= 1 ? new Object[0] : p.l1(args, 1, args.length));
        }
    }

    public /* synthetic */ j(Method method, List list, w wVar) {
        this(method, list);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public final List<Type> a() {
        return this.parameterTypes;
    }

    @d5.e
    protected final Object c(@d5.e Object instance, @d5.d Object[] args) {
        l0.p(args, ProtectedSandApp.s("䎶"));
        return this.unboxMethod.invoke(instance, Arrays.copyOf(args, args.length));
    }

    public void d(@d5.d Object[] objArr) {
        e.a.a(this, objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    /* renamed from: i, reason: from getter */
    public final Type getReturnType() {
        return this.returnType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private j(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        l0.o(returnType, ProtectedSandApp.s("䎵"));
        this.returnType = returnType;
    }
}
