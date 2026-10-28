package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.n0;

/* compiled from: InlineClassAwareCaller.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\tB%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u001b¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/h;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Lkotlin/reflect/jvm/internal/calls/e;", "caller", "", "b", "Z", "isDefault", "Lkotlin/reflect/jvm/internal/calls/h$a;", "c", "Lkotlin/reflect/jvm/internal/calls/h$a;", "data", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "i", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/impl/descriptors/b;", "descriptor", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/e;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class h<M extends Member> implements e<M> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final e<M> caller;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final a data;

    /* compiled from: InlineClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0086\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/h$a;", "", "Lkotlin/ranges/l;", "a", "", "Ljava/lang/reflect/Method;", "b", "()[Ljava/lang/reflect/Method;", "c", "Lkotlin/ranges/l;", "getArgumentRange", "()Lkotlin/ranges/l;", "argumentRange", "[Ljava/lang/reflect/Method;", "getUnbox", "unbox", "Ljava/lang/reflect/Method;", "getBox", "()Ljava/lang/reflect/Method;", "box", "<init>", "(Lkotlin/ranges/l;[Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final IntRange argumentRange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final Method[] unbox;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Method box;

        public a(@d5.d IntRange intRange, @d5.d Method[] methodArr, @d5.e Method method) {
            l0.p(intRange, ProtectedSandApp.s("䎑"));
            l0.p(methodArr, ProtectedSandApp.s("䎒"));
            this.argumentRange = intRange;
            this.unbox = methodArr;
            this.box = method;
        }

        @d5.d
        /* renamed from: a, reason: from getter */
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final Method[] getUnbox() {
            return this.unbox;
        }

        @d5.e
        /* renamed from: c, reason: from getter */
        public final Method getBox() {
            return this.box;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if ((r12 instanceof kotlin.reflect.jvm.internal.calls.d) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.b r11, @d5.d kotlin.reflect.jvm.internal.calls.e<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.h.<init>(kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.calls.e, boolean):void");
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.e
    public Object C(@d5.d Object[] args) {
        Object invoke;
        l0.p(args, ProtectedSandApp.s("䎞"));
        a aVar = this.data;
        IntRange argumentRange = aVar.getArgumentRange();
        Method[] unbox = aVar.getUnbox();
        Method box = aVar.getBox();
        Object[] copyOf = Arrays.copyOf(args, args.length);
        l0.o(copyOf, ProtectedSandApp.s("䎟"));
        int f23724o = argumentRange.getF23724o();
        int f23725p = argumentRange.getF23725p();
        if (f23724o <= f23725p) {
            while (true) {
                Method method = unbox[f23724o];
                Object obj = args[f23724o];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        l0.o(returnType, ProtectedSandApp.s("䎠"));
                        obj = n0.g(returnType);
                    }
                }
                copyOf[f23724o] = obj;
                if (f23724o == f23725p) {
                    break;
                }
                f23724o++;
            }
        }
        Object C = this.caller.C(copyOf);
        return (box == null || (invoke = box.invoke(null, C)) == null) ? C : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public List<Type> a() {
        return this.caller.a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public M b() {
        return this.caller.b();
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    /* renamed from: i */
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
