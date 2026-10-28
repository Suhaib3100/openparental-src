package kotlin.reflect.jvm.internal.calls;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: CallerImpl.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0015*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\b\n\u0013\u0007\u0015 !\"B5\b\u0004\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004R\u0017\u0010\f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\b\u0010\u001a\u0082\u0001\u0007#$%&'()¨\u0006*"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "", "obj", "Lkotlin/m2;", "d", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/Type;", "i", "()Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "instanceClass", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "f", "g", "h", "Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public abstract class f<M extends Member> implements kotlin.reflect.jvm.internal.calls.e<M> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final M member;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Type returnType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private final Class<?> instanceClass;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final List<Type> parameterTypes;

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/d;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class a extends f<Constructor<?>> implements d {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@d5.d java.lang.reflect.Constructor<?> r8, @d5.e java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "羮"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "羯"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "羰"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L2c
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L33
            L2c:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.l.l1(r0, r2, r1)
            L33:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.boundReceiver = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("羱"));
            e.a.a(this, args);
            Constructor<?> b6 = b();
            s1 s1Var = new s1(3);
            s1Var.a(this.boundReceiver);
            s1Var.b(args);
            s1Var.a(null);
            return b6.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class b extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(@d5.d java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "羲"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "羳"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "羴"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                int r1 = r0.length
                r2 = 0
                r5 = 1
                if (r1 > r5) goto L2c
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L32
            L2c:
                int r1 = r0.length
                int r1 = r1 - r5
                java.lang.Object[] r0 = kotlin.collections.l.l1(r0, r2, r1)
            L32:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("羵"));
            e.a.a(this, args);
            Constructor<?> b6 = b();
            s1 s1Var = new s1(2);
            s1Var.b(args);
            s1Var.a(null);
            return b6.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class c extends f<Constructor<?>> implements d {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @d5.e
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@d5.d java.lang.reflect.Constructor<?> r8, @d5.e java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "羶"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "羷"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                r4 = 0
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "羸"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.boundReceiver = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("羹"));
            e.a.a(this, args);
            Constructor<?> b6 = b();
            s1 s1Var = new s1(2);
            s1Var.a(this.boundReceiver);
            s1Var.b(args);
            return b6.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0005J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0001\u0010\u0002\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$d;", "", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.calls.f$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static final class e extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(@d5.d java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "羺"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "羻"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L2c
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L2c
                r4 = r1
                goto L2e
            L2c:
                r0 = 0
                r4 = r0
            L2e:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "羼"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.e.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("羽"));
            e.a.a(this, args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f$e;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kotlin.reflect.jvm.internal.calls.f$f, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC0265f extends f<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$a */
        public static final class a extends AbstractC0265f implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d Field field, @d5.e Object obj) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("翀"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.AbstractC0265f, kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翁"));
                e.a.a(this, args);
                return b().get(this.boundReceiver);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$b */
        public static final class b extends AbstractC0265f implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@d5.d Field field) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("翂"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$c */
        public static final class c extends AbstractC0265f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@d5.d Field field) {
                super(field, true, null);
                l0.p(field, ProtectedSandApp.s("翃"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "", "args", "Lkotlin/m2;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$d */
        public static final class d extends AbstractC0265f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@d5.d Field field) {
                super(field, true, null);
                l0.p(field, ProtectedSandApp.s("翄"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f
            public void c(@d5.d Object[] args) {
                Object nc;
                l0.p(args, ProtectedSandApp.s("翅"));
                e.a.a(this, args);
                nc = t.nc(args);
                d(nc);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$e */
        public static final class e extends AbstractC0265f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@d5.d Field field) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("翆"));
            }
        }

        public /* synthetic */ AbstractC0265f(Field field, boolean z5, w wVar) {
            this(field, z5);
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("羿"));
            c(args);
            return b().get(e() != null ? t.Rb(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private AbstractC0265f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "羾"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r8 == 0) goto L14
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L15
            L14:
                r8 = 0
            L15:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.AbstractC0265f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0006\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "", "args", "Lkotlin/m2;", "c", "([Ljava/lang/Object;)V", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "Z", "notNull", "field", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "a", "b", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g$e;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static abstract class g extends f<Field> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean notNull;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class a extends g implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d Field field, boolean z5, @d5.e Object obj) {
                super(field, z5, false, null);
                l0.p(field, ProtectedSandApp.s("翌"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @d5.d
            public Object C(@d5.d Object[] args) {
                Object Rb;
                l0.p(args, ProtectedSandApp.s("翍"));
                c(args);
                Field b6 = b();
                Object obj = this.boundReceiver;
                Rb = t.Rb(args);
                b6.set(obj, Rb);
                return m2.f23662a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class b extends g implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@d5.d Field field, boolean z5) {
                super(field, z5, false, null);
                l0.p(field, ProtectedSandApp.s("翎"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @d5.d
            public Object C(@d5.d Object[] args) {
                Object Ah;
                l0.p(args, ProtectedSandApp.s("翏"));
                c(args);
                Field b6 = b();
                Ah = t.Ah(args);
                b6.set(null, Ah);
                return m2.f23662a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@d5.d Field field, boolean z5) {
                super(field, z5, true, null);
                l0.p(field, ProtectedSandApp.s("翐"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "", "args", "Lkotlin/m2;", "c", "([Ljava/lang/Object;)V", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@d5.d Field field, boolean z5) {
                super(field, z5, true, null);
                l0.p(field, ProtectedSandApp.s("翑"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.f
            public void c(@d5.d Object[] args) {
                Object nc;
                l0.p(args, ProtectedSandApp.s("習"));
                super.c(args);
                nc = t.nc(args);
                d(nc);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$e;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@d5.d Field field, boolean z5) {
                super(field, z5, false, null);
                l0.p(field, ProtectedSandApp.s("翓"));
            }
        }

        public /* synthetic */ g(Field field, boolean z5, boolean z6, w wVar) {
            this(field, z5, z6);
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @d5.e
        public Object C(@d5.d Object[] args) {
            Object Ah;
            l0.p(args, ProtectedSandApp.s("翉"));
            c(args);
            Field b6 = b();
            Object Rb = e() != null ? t.Rb(args) : null;
            Ah = t.Ah(args);
            b6.set(Rb, Ah);
            return m2.f23662a;
        }

        @Override // kotlin.reflect.jvm.internal.calls.f
        public void c(@d5.d Object[] args) {
            Object Ah;
            l0.p(args, ProtectedSandApp.s("翊"));
            e.a.a(this, args);
            if (this.notNull) {
                Ah = t.Ah(args);
                if (Ah == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("翋"));
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "翇"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r9 == 0) goto L12
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L13
            L12:
                r9 = 0
            L13:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                java.lang.reflect.Type r9 = r7.getGenericType()
                java.lang.String r0 = "翈"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r9, r0)
                r0 = 0
                r4[r0] = r9
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.notNull = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0012\u0013\u0014\u0015\u0016\u0007B+\b\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\u0082\u0001\u0006\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Method;", "", "instance", "", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "", "Z", "isVoidMethod", "method", "requiresInstance", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h$f;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes6.dex */
    public static abstract class h extends f<Method> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isVoidMethod;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class a extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@d5.d Method method, @d5.e Object obj) {
                super(method, false, null, 4, null);
                l0.p(method, ProtectedSandApp.s("翗"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翘"));
                e.a.a(this, args);
                return f(this.boundReceiver, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class b extends h implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@d5.d Method method) {
                super(method, false, null, 4, null);
                l0.p(method, ProtectedSandApp.s("翙"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翚"));
                e.a.a(this, args);
                return f(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "boundReceiver", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class c extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @d5.e
            private final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public c(@d5.d java.lang.reflect.Method r5, @d5.e java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "翛"
                    java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                    kotlin.jvm.internal.l0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "翜"
                    java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                    kotlin.jvm.internal.l0.o(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L1e
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L23
                L1e:
                    int r1 = r0.length
                    java.lang.Object[] r0 = kotlin.collections.l.l1(r0, r3, r1)
                L23:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.boundReceiver = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.h.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翝"));
                e.a.a(this, args);
                s1 s1Var = new s1(2);
                s1Var.a(this.boundReceiver);
                s1Var.b(args);
                return f(null, s1Var.d(new Object[s1Var.c()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class d extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@d5.d Method method) {
                super(method, false, null, 6, null);
                l0.p(method, ProtectedSandApp.s("翞"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翟"));
                e.a.a(this, args);
                return f(args[0], args.length <= 1 ? new Object[0] : p.l1(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@d5.d Method method) {
                super(method, true, null, 4, null);
                l0.p(method, ProtectedSandApp.s("翠"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                Object nc;
                l0.p(args, ProtectedSandApp.s("翡"));
                e.a.a(this, args);
                nc = t.nc(args);
                d(nc);
                return f(null, args.length <= 1 ? new Object[0] : p.l1(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$f;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "", "args", "", "C", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 8, 0})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$h$f, reason: collision with other inner class name */
        public static final class C0266f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0266f(@d5.d Method method) {
                super(method, false, null, 6, null);
                l0.p(method, ProtectedSandApp.s("翢"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @d5.e
            public Object C(@d5.d Object[] args) {
                l0.p(args, ProtectedSandApp.s("翣"));
                e.a.a(this, args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z5, Type[] typeArr, w wVar) {
            this(method, z5, typeArr);
        }

        @d5.e
        protected final Object f(@d5.e Object instance, @d5.d Object[] args) {
            l0.p(args, ProtectedSandApp.s("翖"));
            return this.isVoidMethod ? m2.f23662a : b().invoke(instance, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ h(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, kotlin.jvm.internal.w r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto Le
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1f
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "翕"
                java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
                kotlin.jvm.internal.l0.o(r3, r4)
            L1f:
                r0.<init>(r1, r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, kotlin.jvm.internal.w):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "翔"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r8 == 0) goto L14
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L15
            L14:
                r8 = 0
            L15:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.l0.g(r7, r8)
                r6.isVoidMethod = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    public /* synthetic */ f(Member member, Type type, Class cls, Type[] typeArr, w wVar) {
        this(member, type, cls, typeArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    public final M b() {
        return this.member;
    }

    public void c(@d5.d Object[] objArr) {
        e.a.a(this, objArr);
    }

    protected final void d(@d5.e Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䎏"));
        }
    }

    @d5.e
    public final Class<?> e() {
        return this.instanceClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @d5.d
    /* renamed from: i, reason: from getter */
    public final Type getReturnType() {
        return this.returnType;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private f(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.member = r1
            r0.returnType = r2
            r0.instanceClass = r3
            if (r3 == 0) goto L27
            kotlin.jvm.internal.s1 r1 = new kotlin.jvm.internal.s1
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = kotlin.collections.y.O(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.l.Jy(r4)
        L2b:
            r0.parameterTypes = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
