package androidx.compose.runtime.internal;

import androidx.compose.runtime.e3;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.x4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.s1;
import kotlin.k2;
import ld.x;

/* compiled from: ComposableLambdaN.jvm.kt */
@x4
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0017\"\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/compose/runtime/internal/e;", "Landroidx/compose/runtime/internal/d;", "", "key", "", "tracked", "arity", "<init>", "(IZI)V", "Lkotlin/k2;", "d", "()V", "Landroidx/compose/runtime/t;", "composer", "c", "(Landroidx/compose/runtime/t;)V", "params", "b", "(I)I", "", "block", "f", "(Ljava/lang/Object;)V", "", "args", "T", "([Ljava/lang/Object;)Ljava/lang/Object;", "I", "a", "()I", "Z", "getArity", "e", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/e3;", "Landroidx/compose/runtime/e3;", "scope", "", "g", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl\n*L\n111#1:180,2\n*E\n"})
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final int f16786h = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int arity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Object _block;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e3 scope;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<e3> scopes;

    /* compiled from: ComposableLambdaN.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/t;", "nc", "", "<anonymous parameter 1>", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,179:1\n37#2,2:180\n*S KotlinDebug\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaNImpl$invoke$1\n*L\n122#1:180,2\n*E\n"})
    static final class a extends n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object[] f16793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f16795d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object[] objArr, int i4, e eVar) {
            super(2);
            this.f16793b = objArr;
            this.f16794c = i4;
            this.f16795d = eVar;
        }

        public final void a(@fg.l androidx.compose.runtime.t tVar, int i4) {
            Object[] array = kotlin.collections.l.St(this.f16793b, kotlin.ranges.s.W1(0, this.f16794c)).toArray(new Object[0]);
            Object obj = this.f16793b[this.f16794c + 1];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            int b5 = g3.b(((Integer) obj).intValue());
            int length = (this.f16793b.length - this.f16794c) - 2;
            Object[] objArr = new Object[length];
            for (int i5 = 0; i5 < length; i5++) {
                Object obj2 = this.f16793b[this.f16794c + 2 + i5];
                l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                objArr[i5] = Integer.valueOf(g3.b(((Integer) obj2).intValue()));
            }
            e eVar = this.f16795d;
            s1 s1Var = new s1(4);
            s1Var.b(array);
            s1Var.a(tVar);
            s1Var.a(Integer.valueOf(b5 | 1));
            s1Var.b(objArr);
            eVar.T(s1Var.d(new Object[s1Var.c()]));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    public e(int i4, boolean z4, int i5) {
        this.key = i4;
        this.tracked = z4;
        this.arity = i5;
    }

    private final int b(int params) {
        int i4 = params - 2;
        for (int i5 = 1; i5 * 10 < i4; i5++) {
            i4--;
        }
        return i4;
    }

    private final void c(androidx.compose.runtime.t composer) {
        e3 N;
        if (!this.tracked || (N = composer.N()) == null) {
            return;
        }
        composer.j0(N);
        if (c.e(this.scope, N)) {
            this.scope = N;
            return;
        }
        List<e3> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(N);
            return;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (c.e(list.get(i4), N)) {
                list.set(i4, N);
                return;
            }
        }
        list.add(N);
    }

    private final void d() {
        if (this.tracked) {
            e3 e3Var = this.scope;
            if (e3Var != null) {
                e3Var.invalidate();
                this.scope = null;
            }
            List<e3> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    list.get(i4).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // ld.x
    @fg.m
    public Object T(@fg.l Object... args) {
        int b5 = b(args.length);
        Object obj = args[b5];
        l0.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.Composer");
        Object[] array = kotlin.collections.l.St(args, kotlin.ranges.s.W1(0, args.length - 1)).toArray(new Object[0]);
        Object obj2 = args[args.length - 1];
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        androidx.compose.runtime.t o4 = ((androidx.compose.runtime.t) obj).o(this.key);
        c(o4);
        int a5 = (o4.q0(this) ? c.a(2, b5) : c.a(1, b5)) | intValue;
        Object obj3 = this._block;
        l0.n(obj3, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        s1 s1Var = new s1(2);
        s1Var.b(array);
        s1Var.a(Integer.valueOf(a5));
        Object T = ((x) obj3).T(s1Var.d(new Object[s1Var.c()]));
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new a(args, b5, this));
        }
        return T;
    }

    /* renamed from: a, reason: from getter */
    public final int getKey() {
        return this.key;
    }

    public final void f(@fg.l Object block) {
        if (l0.g(block, this._block)) {
            return;
        }
        boolean z4 = this._block == null;
        l0.n(block, "null cannot be cast to non-null type kotlin.jvm.functions.FunctionN<*>");
        this._block = (x) block;
        if (z4) {
            return;
        }
        d();
    }

    @Override // ld.x, kotlin.jvm.internal.e0
    public int getArity() {
        return this.arity;
    }
}
