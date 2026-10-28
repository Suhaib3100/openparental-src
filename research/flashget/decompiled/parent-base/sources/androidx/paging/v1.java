package androidx.paging;

import com.luck.picture.lib.config.PictureConfig;
import kotlin.Metadata;
import kotlin.k2;
import org.apache.http.HttpStatus;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bg\u0012[\u0010\r\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Rl\u0010\r\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00048\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00160\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/paging/v1;", "T1", "T2", "", "Lkotlin/Function4;", "Lkotlin/r0;", "name", "t1", "t2", "Landroidx/paging/h;", "updateFrom", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "send", "<init>", "(Lld/r;)V", "", "index", "value", "a", "(ILjava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lld/r;", "Lkotlinx/coroutines/y;", "b", "Lkotlinx/coroutines/y;", "initialDispatched", "Lkotlinx/coroutines/sync/a;", "c", "Lkotlinx/coroutines/sync/a;", "lock", "", "d", "[Lkotlinx/coroutines/y;", "valueReceived", "e", "[Ljava/lang/Object;", "values", "paging-common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v1<T1, T2> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.r<T1, T2, h, kotlin.coroutines.d<? super k2>, Object> send;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.y<k2> initialDispatched;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.sync.a lock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.y<k2>[] valueReceived;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object[] values;

    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.UnbatchedFlowCombiner", f = "FlowExt.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {PictureConfig.CHOOSE_REQUEST, 227, HttpStatus.SC_RESET_CONTENT}, m = "onNext", n = {"this", "value", "index", "this", "value", "$this$withLock_u24default$iv", "index", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f32415b;

        /* renamed from: c, reason: collision with root package name */
        Object f32416c;

        /* renamed from: d, reason: collision with root package name */
        Object f32417d;

        /* renamed from: e, reason: collision with root package name */
        int f32418e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f32419f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v1<T1, T2> f32420g;

        /* renamed from: h, reason: collision with root package name */
        int f32421h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v1<T1, T2> v1Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f32420g = v1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f32419f = obj;
            this.f32421h |= Integer.MIN_VALUE;
            return this.f32420g.a(0, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v1(@fg.l ld.r<? super T1, ? super T2, ? super h, ? super kotlin.coroutines.d<? super k2>, ? extends Object> send) {
        kotlin.jvm.internal.l0.p(send, "send");
        this.send = send;
        this.initialDispatched = kotlinx.coroutines.a0.c(null, 1, null);
        this.lock = kotlinx.coroutines.sync.c.b(false, 1, null);
        kotlinx.coroutines.y<k2>[] yVarArr = new kotlinx.coroutines.y[2];
        for (int i4 = 0; i4 < 2; i4++) {
            yVarArr[i4] = kotlinx.coroutines.a0.c(null, 1, null);
        }
        this.valueReceived = yVarArr;
        Object[] objArr = new Object[2];
        for (int i5 = 0; i5 < 2; i5++) {
            objArr[i5] = s.f32267a;
        }
        this.values = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:28:0x00a9, B:30:0x00b0, B:35:0x00c1, B:37:0x00c9, B:39:0x00d3, B:44:0x00d8, B:45:0x00e2, B:51:0x00dd, B:52:0x00e0, B:32:0x00ba), top: B:27:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:28:0x00a9, B:30:0x00b0, B:35:0x00c1, B:37:0x00c9, B:39:0x00d3, B:44:0x00d8, B:45:0x00e2, B:51:0x00dd, B:52:0x00e0, B:32:0x00ba), top: B:27:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:28:0x00a9, B:30:0x00b0, B:35:0x00c1, B:37:0x00c9, B:39:0x00d3, B:44:0x00d8, B:45:0x00e2, B:51:0x00dd, B:52:0x00e0, B:32:0x00ba), top: B:27:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r17, @fg.m java.lang.Object r18, @fg.l kotlin.coroutines.d<? super kotlin.k2> r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.v1.a(int, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
