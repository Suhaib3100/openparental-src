package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a4;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.o3;
import androidx.compose.runtime.p1;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: Operations.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0013\b\u0000\u0018\u0000 `2\u00020\u0001:\u0003HLOB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000fJ\u001e\u0010\u001a\u001a\u00020\u00042\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u000fJ\u001f\u0010\u001d\u001a\u00020\u0010*\u00060\u001bR\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u0010*\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u00020\u0010\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001c\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020&¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\t¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0013H\u0007¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0013¢\u0006\u0004\b.\u0010-J>\u00103\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00132\u0017\u00102\u001a\u0013\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\t¢\u0006\u0004\b5\u0010\u0003J\u0015\u00107\u001a\u00020\t2\u0006\u00106\u001a\u00020\u0000¢\u0006\u0004\b7\u00108J-\u0010:\u001a\u00020\t2\u001b\u00109\u001a\u0017\u0012\b\u0012\u00060\u001bR\u00020\u0000\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\b¢\u0006\u0004\b:\u0010;J-\u0010=\u001a\u00020\t2\u001b\u0010<\u001a\u0017\u0012\b\u0012\u00060\u001bR\u00020\u0000\u0012\u0004\u0012\u00020\t0/¢\u0006\u0002\b1H\u0086\b¢\u0006\u0004\b=\u0010;J)\u0010D\u001a\u00020\t2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030>2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0010H\u0017¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bH\u0010\u0012R\u001e\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010JR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010,R\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010,R\u001e\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010,R\u0016\u0010Z\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010,R\u0016\u0010\\\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010,R\u0011\u0010_\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/runtime/changelist/k;", "Landroidx/compose/runtime/changelist/l;", "<init>", "()V", "", "currentSize", "requiredSize", "s", "(II)I", "Lkotlin/k2;", "u", "(I)V", "v", "paramCount", "q", "(I)I", "", "A", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/g;", "D", "()Landroidx/compose/runtime/changelist/g;", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "K", "Landroidx/compose/runtime/changelist/g$s;", "L", "Landroidx/compose/runtime/changelist/k$b;", "linePrefix", "r", "(Landroidx/compose/runtime/changelist/k$b;Ljava/lang/String;)Ljava/lang/String;", "", "y", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "T", "", "J", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "", "B", "()Z", "C", "p", "operation", "I", "(Landroidx/compose/runtime/changelist/g;)V", "G", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/k$c;", "Lkotlin/u;", "args", "H", "(Landroidx/compose/runtime/changelist/g;Lld/l;)V", "E", "other", "F", "(Landroidx/compose/runtime/changelist/k;)V", "sink", "t", "(Lld/l;)V", "action", "x", "Landroidx/compose/runtime/e;", "applier", "Landroidx/compose/runtime/a4;", "slots", "Landroidx/compose/runtime/o3;", "rememberManager", "w", "(Landroidx/compose/runtime/e;Landroidx/compose/runtime/a4;Landroidx/compose/runtime/o3;)V", "toString", "()Ljava/lang/String;", "a", "", "[Landroidx/compose/runtime/changelist/g;", "opCodes", "b", "opCodesSize", "", "c", "[I", "intArgs", "d", "intArgsSize", "e", "[Ljava/lang/Object;", "objectArgs", "f", "objectArgsSize", "g", "pushedIntMask", "h", "pushedObjectMask", "z", "()I", "size", "i", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n1#1,473:1\n292#1,7:474\n281#1:481\n292#1,7:482\n282#1,2:489\n292#1,7:491\n*S KotlinDebug\n*F\n+ 1 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n*L\n281#1:474,7\n305#1:481\n305#1:482,7\n305#1:489,2\n404#1:491,7\n*E\n"})
/* loaded from: classes.dex */
public final class k implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final int f16076j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f16077k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public static final int f16078l = 16;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int opCodesSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int intArgsSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int objectArgsSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pushedIntMask;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int pushedObjectMask;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private g[] opCodes = new g[16];

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private int[] intArgs = new int[16];

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private Object[] objectArgs = new Object[16];

    /* compiled from: Operations.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/changelist/k$b;", "Landroidx/compose/runtime/changelist/h;", "<init>", "(Landroidx/compose/runtime/changelist/k;)V", "", "d", "()Z", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "b", "(I)I", "T", "Landroidx/compose/runtime/changelist/g$s;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "intIdx", "c", "objIdx", "Landroidx/compose/runtime/changelist/g;", "()Landroidx/compose/runtime/changelist/g;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int opIdx;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int intIdx;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int objIdx;

        public b() {
        }

        @Override // androidx.compose.runtime.changelist.h
        public <T> T a(int parameter) {
            return (T) k.this.objectArgs[this.objIdx + parameter];
        }

        @Override // androidx.compose.runtime.changelist.h
        public int b(int parameter) {
            return k.this.intArgs[this.intIdx + parameter];
        }

        @fg.l
        public final g c() {
            g gVar = k.this.opCodes[this.opIdx];
            l0.m(gVar);
            return gVar;
        }

        public final boolean d() {
            if (this.opIdx >= k.this.opCodesSize) {
                return false;
            }
            g c5 = c();
            this.intIdx = c5.getInts() + this.intIdx;
            this.objIdx = c5.getObjects() + this.objIdx;
            int i4 = this.opIdx + 1;
            this.opIdx = i4;
            return i4 < k.this.opCodesSize;
        }
    }

    /* compiled from: Operations.kt */
    @kd.g
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\t\u001a\u00028\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/runtime/changelist/k$c;", "", "Landroidx/compose/runtime/changelist/k;", "stack", "b", "(Landroidx/compose/runtime/changelist/k;)Landroidx/compose/runtime/changelist/k;", "Landroidx/compose/runtime/changelist/g$p;", "parameter", "", "value", "Lkotlin/k2;", "g", "(Landroidx/compose/runtime/changelist/k;II)V", "T", "Landroidx/compose/runtime/changelist/g$s;", "h", "(Landroidx/compose/runtime/changelist/k;ILjava/lang/Object;)V", "", "i", "(Landroidx/compose/runtime/changelist/k;)Ljava/lang/String;", "f", "(Landroidx/compose/runtime/changelist/k;)I", "other", "", "c", "(Landroidx/compose/runtime/changelist/k;Ljava/lang/Object;)Z", "a", "Landroidx/compose/runtime/changelist/k;", "Landroidx/compose/runtime/changelist/g;", "e", "(Landroidx/compose/runtime/changelist/k;)Landroidx/compose/runtime/changelist/g;", "operation", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final k stack;

        private /* synthetic */ c(k kVar) {
            this.stack = kVar;
        }

        public static final /* synthetic */ c a(k kVar) {
            return new c(kVar);
        }

        @fg.l
        public static k b(@fg.l k kVar) {
            return kVar;
        }

        public static boolean c(k kVar, Object obj) {
            return (obj instanceof c) && l0.g(kVar, ((c) obj).stack);
        }

        public static final boolean d(k kVar, k kVar2) {
            return l0.g(kVar, kVar2);
        }

        @fg.l
        public static final g e(k kVar) {
            return kVar.D();
        }

        public static int f(k kVar) {
            return kVar.hashCode();
        }

        public static final void g(k kVar, int i4, int i5) {
            int i6 = 1 << i4;
            if ((kVar.pushedIntMask & i6) == 0) {
                kVar.pushedIntMask = i6 | kVar.pushedIntMask;
                kVar.intArgs[kVar.K(i4)] = i5;
            } else {
                throw new IllegalStateException(("Already pushed argument " + kVar.D().e(i4)).toString());
            }
        }

        public static final <T> void h(k kVar, int i4, T t4) {
            int i5 = 1 << i4;
            if ((kVar.pushedObjectMask & i5) == 0) {
                kVar.pushedObjectMask = i5 | kVar.pushedObjectMask;
                kVar.objectArgs[kVar.L(i4)] = t4;
            } else {
                throw new IllegalStateException(("Already pushed argument " + kVar.D().f(i4)).toString());
            }
        }

        public static String i(k kVar) {
            return "WriteScope(stack=" + kVar + ')';
        }

        public boolean equals(Object obj) {
            return c(this.stack, obj);
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        /* renamed from: j, reason: from getter */
        public final /* synthetic */ k getStack() {
            return this.stack;
        }

        public String toString() {
            return i(this.stack);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Operations.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class d<T> extends n0 implements ld.l<T, CharSequence> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.f16093c = str;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(T t4) {
            return k.this.y(t4, this.f16093c);
        }
    }

    private final String A(String str) {
        return j.a(str, "    ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g D() {
        g gVar = this.opCodes[this.opCodesSize - 1];
        l0.m(gVar);
        return gVar;
    }

    private final <T> String J(Iterable<? extends T> iterable, String str) {
        return w.m3(iterable, ", ", "[", "]", 0, null, new d(str), 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int K(int parameter) {
        return (this.intArgsSize - D().getInts()) + parameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int L(int parameter) {
        return (this.objectArgsSize - D().getObjects()) + parameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q(int paramCount) {
        if (paramCount == 0) {
            return 0;
        }
        return (-1) >>> (32 - paramCount);
    }

    private final String r(b bVar, String str) {
        g c5 = bVar.c();
        if (c5.getInts() == 0 && c5.getObjects() == 0) {
            return c5.c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c5.c());
        sb.append('(');
        String A = A(str);
        int ints = c5.getInts();
        boolean z4 = true;
        for (int i4 = 0; i4 < ints; i4++) {
            String e4 = c5.e(i4);
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            l0.o(sb, "append('\\n')");
            sb.append(A);
            sb.append(e4);
            sb.append(" = ");
            sb.append(bVar.b(i4));
        }
        int objects = c5.getObjects();
        for (int i5 = 0; i5 < objects; i5++) {
            String f4 = c5.f(i5);
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            l0.o(sb, "append('\\n')");
            sb.append(A);
            sb.append(f4);
            sb.append(" = ");
            sb.append(y(bVar.a(i5), A));
        }
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        sb.append(str);
        sb.append(")");
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private final int s(int currentSize, int requiredSize) {
        int i4 = currentSize + (currentSize <= 1024 ? currentSize : 1024);
        return i4 < requiredSize ? requiredSize : i4;
    }

    private final void u(int requiredSize) {
        int[] iArr = this.intArgs;
        int length = iArr.length;
        if (requiredSize > length) {
            int[] copyOf = Arrays.copyOf(iArr, s(length, requiredSize));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.intArgs = copyOf;
        }
    }

    private final void v(int requiredSize) {
        Object[] objArr = this.objectArgs;
        int length = objArr.length;
        if (requiredSize > length) {
            Object[] copyOf = Arrays.copyOf(objArr, s(length, requiredSize));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.objectArgs = copyOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String y(Object obj, String str) {
        return obj == null ? "null" : obj instanceof Object[] ? J(kotlin.collections.l.B5((Object[]) obj), str) : obj instanceof int[] ? J(kotlin.collections.l.z5((int[]) obj), str) : obj instanceof long[] ? J(kotlin.collections.l.A5((long[]) obj), str) : obj instanceof float[] ? J(kotlin.collections.l.y5((float[]) obj), str) : obj instanceof double[] ? J(kotlin.collections.l.x5((double[]) obj), str) : obj instanceof Iterable ? J((Iterable) obj, str) : obj instanceof l ? ((l) obj).a(str) : obj.toString();
    }

    public final boolean B() {
        return this.opCodesSize == 0;
    }

    public final boolean C() {
        return this.opCodesSize != 0;
    }

    public final void E() {
        if (B()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        g[] gVarArr = this.opCodes;
        int i4 = this.opCodesSize - 1;
        this.opCodesSize = i4;
        g gVar = gVarArr[i4];
        l0.m(gVar);
        this.opCodes[this.opCodesSize] = null;
        int objects = gVar.getObjects();
        for (int i5 = 0; i5 < objects; i5++) {
            Object[] objArr = this.objectArgs;
            int i6 = this.objectArgsSize - 1;
            this.objectArgsSize = i6;
            objArr[i6] = null;
        }
        int ints = gVar.getInts();
        for (int i7 = 0; i7 < ints; i7++) {
            int[] iArr = this.intArgs;
            int i10 = this.intArgsSize - 1;
            this.intArgsSize = i10;
            iArr[i10] = 0;
        }
    }

    public final void F(@fg.l k other) {
        if (B()) {
            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
        }
        g[] gVarArr = this.opCodes;
        int i4 = this.opCodesSize - 1;
        this.opCodesSize = i4;
        g gVar = gVarArr[i4];
        l0.m(gVar);
        this.opCodes[this.opCodesSize] = null;
        other.I(gVar);
        int i5 = this.objectArgsSize;
        int i6 = other.objectArgsSize;
        int objects = gVar.getObjects();
        for (int i7 = 0; i7 < objects; i7++) {
            i6--;
            i5--;
            Object[] objArr = other.objectArgs;
            Object[] objArr2 = this.objectArgs;
            objArr[i6] = objArr2[i5];
            objArr2[i5] = null;
        }
        int i10 = this.intArgsSize;
        int i11 = other.intArgsSize;
        int ints = gVar.getInts();
        for (int i12 = 0; i12 < ints; i12++) {
            i11--;
            i10--;
            int[] iArr = other.intArgs;
            int[] iArr2 = this.intArgs;
            iArr[i11] = iArr2[i10];
            iArr2[i10] = 0;
        }
        this.objectArgsSize -= gVar.getObjects();
        this.intArgsSize -= gVar.getInts();
    }

    public final void G(@fg.l g operation) {
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            I(operation);
            return;
        }
        throw new IllegalArgumentException(("Cannot push " + operation + " without arguments because it expects " + operation.getInts() + " ints and " + operation.getObjects() + " objects.").toString());
    }

    public final void H(@fg.l g operation, @fg.l ld.l<? super c, k2> args) {
        I(operation);
        args.invoke(c.a(this));
        if (this.pushedIntMask == q(operation.getInts()) && this.pushedObjectMask == q(operation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = operation.getInts();
        int i4 = 0;
        for (int i5 = 0; i5 < ints; i5++) {
            if (((1 << i5) & this.pushedIntMask) != 0) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append(operation.e(i5));
                i4++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder a5 = androidx.compose.runtime.changelist.b.a(sb2, "StringBuilder().apply(builderAction).toString()");
        int objects = operation.getObjects();
        int i6 = 0;
        for (int i7 = 0; i7 < objects; i7++) {
            if (((1 << i7) & this.pushedObjectMask) != 0) {
                if (i4 > 0) {
                    a5.append(", ");
                }
                a5.append(operation.f(i7));
                i6++;
            }
        }
        String sb3 = a5.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(operation);
        sb4.append(". Not all arguments were provided. Missing ");
        androidx.compose.runtime.changelist.c.a(sb4, i4, " int arguments (", sb2, ") and ");
        throw new IllegalStateException(a.a(sb4, i6, " object arguments (", sb3, ").").toString());
    }

    @p1
    public final void I(@fg.l g operation) {
        this.pushedIntMask = 0;
        this.pushedObjectMask = 0;
        int i4 = this.opCodesSize;
        g[] gVarArr = this.opCodes;
        if (i4 == gVarArr.length) {
            Object[] copyOf = Arrays.copyOf(gVarArr, i4 + (i4 <= 1024 ? i4 : 1024));
            l0.o(copyOf, "copyOf(this, newSize)");
            this.opCodes = (g[]) copyOf;
        }
        u(operation.getInts() + this.intArgsSize);
        v(operation.getObjects() + this.objectArgsSize);
        g[] gVarArr2 = this.opCodes;
        int i5 = this.opCodesSize;
        this.opCodesSize = i5 + 1;
        gVarArr2[i5] = operation;
        this.intArgsSize = operation.getInts() + this.intArgsSize;
        this.objectArgsSize = operation.getObjects() + this.objectArgsSize;
    }

    @Override // androidx.compose.runtime.changelist.l
    @fg.l
    public String a(@fg.l String linePrefix) {
        StringBuilder sb = new StringBuilder();
        if (C()) {
            b bVar = new b();
            int i4 = 1;
            while (true) {
                sb.append(linePrefix);
                int i5 = i4 + 1;
                sb.append(i4);
                sb.append(". ");
                sb.append(r(bVar, linePrefix));
                l0.o(sb, "append(value)");
                sb.append('\n');
                l0.o(sb, "append('\\n')");
                if (!bVar.d()) {
                    break;
                }
                i4 = i5;
            }
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void p() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        kotlin.collections.l.M1(this.objectArgs, null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void t(@fg.l ld.l<? super b, k2> sink) {
        if (C()) {
            b bVar = new b();
            do {
                sink.invoke(bVar);
            } while (bVar.d());
        }
        p();
    }

    @fg.l
    @kotlin.k(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @x0(expression = "toDebugString()", imports = {}))
    public String toString() {
        return super.toString();
    }

    public final void w(@fg.l androidx.compose.runtime.e<?> applier, @fg.l a4 slots, @fg.l o3 rememberManager) {
        if (C()) {
            b bVar = new b();
            do {
                bVar.c().a(bVar, applier, slots, rememberManager);
            } while (bVar.d());
        }
        p();
    }

    public final void x(@fg.l ld.l<? super b, k2> action) {
        if (C()) {
            b bVar = new b();
            do {
                action.invoke(bVar);
            } while (bVar.d());
        }
    }

    /* renamed from: z, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }
}
