package kotlin.reflect.jvm.internal.calls;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: CallerImpl.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001b*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0012\u0010\u0019\u0014\u001b!\"#B5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f\u0082\u0001\u0007$%&'()*¨\u0006+"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "Lkotlin/k2;", "b", "(Ljava/lang/Object;)V", "a", "Ljava/lang/reflect/Member;", "d", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "f", "g", "h", "Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n1#2:266\n*E\n"})
/* loaded from: classes7.dex */
public abstract class f<M extends Member> implements kotlin.reflect.jvm.internal.calls.e<M> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final M member;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Type returnType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final Class<?> instanceClass;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<Type> parameterTypes;

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/d;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n262#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor\n*L\n76#1:266\n76#1:267\n*E\n"})
    public static final class a extends f<Constructor<?>> implements d {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @m
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(@fg.l java.lang.reflect.Constructor<?> r8, @fg.m java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "曕\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "曖\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "曗\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L2b
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L32
            L2b:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = kotlin.collections.l.l1(r0, r2, r1)
            L32:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.boundReceiver = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曘\u0001"));
            e.a.a(this, args);
            Constructor<?> d5 = d();
            s1 s1Var = new s1(3);
            s1Var.a(this.boundReceiver);
            s1Var.b(args);
            s1Var.a(null);
            return d5.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n258#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor\n*L\n62#1:266\n62#1:267\n*E\n"})
    public static final class b extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(@fg.l java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "曙\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "曚\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "曛\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                kotlin.jvm.internal.l0.o(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L2b
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L31
            L2b:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = kotlin.collections.l.l1(r0, r2, r1)
            L31:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曜\u0001"));
            e.a.a(this, args);
            Constructor<?> d5 = d();
            s1 s1Var = new s1(2);
            s1Var.b(args);
            s1Var.a(null);
            return d5.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends f<Constructor<?>> implements d {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @m
        private final Object boundReceiver;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@fg.l java.lang.reflect.Constructor<?> r8, @fg.m java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "曝\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "曞\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "曟\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r5, r0)
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.boundReceiver = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曠\u0001"));
            e.a.a(this, args);
            Constructor<?> d5 = d();
            s1 s1Var = new s1(2);
            s1Var.a(this.boundReceiver);
            s1Var.b(args);
            return d5.newInstance(s1Var.d(new Object[s1Var.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n26#2:266\n26#2:267\n26#2:268\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n254#1:266\n258#1:267\n262#1:268\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.calls.f$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends f<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(@fg.l java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "曡\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.p(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "曢\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
                java.lang.String r0 = "曣\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
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
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曤\u0001"));
            e.a.a(this, args);
            return d().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n26#2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter\n*L\n172#1:266\n*E\n"})
    /* renamed from: kotlin.reflect.jvm.internal.calls.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC1068f extends f<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$a */
        public static final class a extends AbstractC1068f implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @m
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l Field field, @m Object obj) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("曧\u0001"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.AbstractC1068f, kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("曨\u0001"));
                e.a.a(this, args);
                return d().get(this.boundReceiver);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$b */
        public static final class b extends AbstractC1068f implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@l Field field) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("曩\u0001"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$c */
        public static final class c extends AbstractC1068f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@l Field field) {
                super(field, true, null);
                l0.p(field, ProtectedSandApp.s("曪\u0001"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "Lkotlin/k2;", "a", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$d */
        public static final class d extends AbstractC1068f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@l Field field) {
                super(field, true, null);
                l0.p(field, ProtectedSandApp.s("曫\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f
            public void a(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("曬\u0001"));
                e.a.a(this, args);
                b(kotlin.collections.l.nc(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$e */
        public static final class e extends AbstractC1068f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@l Field field) {
                super(field, false, null);
                l0.p(field, ProtectedSandApp.s("曭\u0001"));
            }
        }

        public /* synthetic */ AbstractC1068f(Field field, boolean z4, w wVar) {
            this(field, z4);
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曦\u0001"));
            a(args);
            return d().get(e() != null ? kotlin.collections.l.Rb(args) : null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private AbstractC1068f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "曥\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r8 == 0) goto L15
                java.lang.Class r8 = r7.getDeclaringClass()
            L13:
                r3 = r8
                goto L17
            L15:
                r8 = 0
                goto L13
            L17:
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.AbstractC1068f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\u0013\u0014\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "Lkotlin/k2;", "a", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class g extends f<Field> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean notNull;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends g implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @m
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l Field field, boolean z4, @m Object obj) {
                super(field, z4, false, null);
                l0.p(field, ProtectedSandApp.s("曲\u0001"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @l
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("曳\u0001"));
                a(args);
                d().set(this.boundReceiver, kotlin.collections.l.Rb(args));
                return k2.f75408a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends g implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@l Field field, boolean z4) {
                super(field, z4, false, null);
                l0.p(field, ProtectedSandApp.s("更\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @l
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("曵\u0001"));
                a(args);
                d().set(null, kotlin.collections.l.Ah(args));
                return k2.f75408a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@l Field field, boolean z4) {
                super(field, z4, true, null);
                l0.p(field, ProtectedSandApp.s("曶\u0001"));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "Lkotlin/k2;", "a", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@l Field field, boolean z4) {
                super(field, z4, true, null);
                l0.p(field, ProtectedSandApp.s("曷\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.f
            public void a(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("書\u0001"));
                super.a(args);
                b(kotlin.collections.l.nc(args));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$e;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@l Field field, boolean z4) {
                super(field, z4, false, null);
                l0.p(field, ProtectedSandApp.s("曹\u0001"));
            }
        }

        public /* synthetic */ g(Field field, boolean z4, boolean z5, w wVar) {
            this(field, z4, z5);
        }

        @Override // kotlin.reflect.jvm.internal.calls.f
        public void a(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曰\u0001"));
            e.a.a(this, args);
            if (this.notNull && kotlin.collections.l.Ah(args) == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("曱\u0001"));
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @m
        public Object call(@l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曰\u0001"));
            a(args);
            d().set(e() != null ? kotlin.collections.l.Rb(args) : null, kotlin.collections.l.Ah(args));
            return k2.f75408a;
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
                java.lang.String r0 = "曮\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r9 == 0) goto L13
                java.lang.Class r9 = r7.getDeclaringClass()
            L11:
                r3 = r9
                goto L15
            L13:
                r9 = 0
                goto L11
            L15:
                java.lang.reflect.Type r9 = r7.getGenericType()
                java.lang.String r0 = "曯\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r9, r0)
                r0 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r0]
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
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0012\u0013\u0014\u0015\u0016\u000e\u0017B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Method;", "method", "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "instance", "args", "f", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Z", "isVoidMethod", "a", "b", "c", "d", "e", "g", "Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h$f;", "Lkotlin/reflect/jvm/internal/calls/f$h$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class h extends f<Method> {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isVoidMethod;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @m
            private final Object boundReceiver;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l Method method, @m Object obj) {
                super(method, false, null, 4, null);
                l0.p(method, ProtectedSandApp.s("曽\u0001"));
                this.boundReceiver = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("曾\u0001"));
                e.a.a(this, args);
                return f(this.boundReceiver, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends h implements kotlin.reflect.jvm.internal.calls.d {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@l Method method) {
                super(method, false, null, 4, null);
                l0.p(method, ProtectedSandApp.s("替\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("最\u0001"));
                e.a.a(this, args);
                return f(null, args);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic\n*L\n126#1:266\n126#1:267\n*E\n"})
        public static final class c extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @m
            private final Object boundReceiver;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public c(@fg.l java.lang.reflect.Method r5, @fg.m java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "朁\u0001"
                    java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                    kotlin.jvm.internal.l0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "朂\u0001"
                    java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
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
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("會\u0001"));
                e.a.a(this, args);
                s1 s1Var = new s1(2);
                s1Var.a(this.boundReceiver);
                s1Var.b(args);
                return f(null, s1Var.d(new Object[s1Var.c()]));
            }

            @m
            /* renamed from: g, reason: from getter */
            public final Object getBoundReceiver() {
                return this.boundReceiver;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "[Ljava/lang/Object;", "()[Ljava/lang/Object;", "", "h", "()I", "receiverComponentsCount", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,265:1\n37#2,2:266\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStaticMultiFieldValueClass\n*L\n139#1:266,2\n*E\n"})
        public static final class d extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name and from kotlin metadata */
            @l
            private final Object[] boundReceiverComponents;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(@fg.l java.lang.reflect.Method r4, @fg.l java.lang.Object[] r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "朄\u0001"
                    java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                    kotlin.jvm.internal.l0.p(r4, r0)
                    java.lang.String r0 = "朅\u0001"
                    java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                    kotlin.jvm.internal.l0.p(r5, r0)
                    java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
                    java.lang.String r1 = "朆\u0001"
                    java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                    kotlin.jvm.internal.l0.o(r0, r1)
                    int r1 = r5.length
                    java.util.List r0 = kotlin.collections.l.l9(r0, r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    r1 = 0
                    java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r2 = 0
                    r3.<init>(r4, r1, r0, r2)
                    r3.boundReceiverComponents = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.h.d.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("朇\u0001"));
                e.a.a(this, args);
                s1 s1Var = new s1(2);
                s1Var.b(this.boundReceiverComponents);
                s1Var.b(args);
                return f(null, s1Var.d(new Object[s1Var.c()]));
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Object[] getBoundReceiverComponents() {
                return this.boundReceiverComponents;
            }

            public final int h() {
                return this.boundReceiverComponents.length;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance\n*L\n113#1:266\n113#1:267\n*E\n"})
        public static final class e extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@l Method method) {
                super(method, false, null, 6, null);
                l0.p(method, ProtectedSandApp.s("月\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("有\u0001"));
                e.a.a(this, args);
                return f(args[0], args.length <= 1 ? new Object[0] : kotlin.collections.l.l1(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$f;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nCallerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,265:1\n254#2:266\n26#3:267\n*S KotlinDebug\n*F\n+ 1 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject\n*L\n121#1:266\n121#1:267\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$h$f, reason: collision with other inner class name */
        public static final class C1069f extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1069f(@l Method method) {
                super(method, true, null, 4, null);
                l0.p(method, ProtectedSandApp.s("朊\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("朋\u0001"));
                e.a.a(this, args);
                b(kotlin.collections.l.nc(args));
                return f(null, args.length <= 1 ? new Object[0] : kotlin.collections.l.l1(args, 1, args.length));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$g;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends h {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@l Method method) {
                super(method, false, null, 6, null);
                l0.p(method, ProtectedSandApp.s("朌\u0001"));
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @m
            public Object call(@l Object[] args) {
                l0.p(args, ProtectedSandApp.s("服\u0001"));
                e.a.a(this, args);
                return f(null, args);
            }
        }

        public /* synthetic */ h(Method method, boolean z4, Type[] typeArr, w wVar) {
            this(method, z4, typeArr);
        }

        @m
        protected final Object f(@m Object instance, @l Object[] args) {
            l0.p(args, ProtectedSandApp.s("曼\u0001"));
            return this.isVoidMethod ? k2.f75408a : d().invoke(instance, Arrays.copyOf(args, args.length));
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
                java.lang.String r4 = "曻\u0001"
                java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
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
                java.lang.String r0 = "曺\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                kotlin.jvm.internal.l0.o(r2, r0)
                if (r8 == 0) goto L15
                java.lang.Class r8 = r7.getDeclaringClass()
            L13:
                r3 = r8
                goto L17
            L15:
                r8 = 0
                goto L13
            L17:
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

    public void a(@l Object[] objArr) {
        e.a.a(this, objArr);
    }

    protected final void b(@m Object obj) {
        if (obj == null || !this.member.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("曔\u0001"));
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public List<Type> c() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
    public final M d() {
        return this.member;
    }

    @m
    public final Class<?> e() {
        return this.instanceClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @l
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
            java.util.List r1 = kotlin.collections.w.O(r1)
            if (r1 != 0) goto L2b
        L27:
            java.util.List r1 = kotlin.collections.l.Ky(r4)
        L2b:
            r0.parameterTypes = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
