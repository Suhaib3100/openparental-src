package kotlinx.coroutines.selects;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.internal.s0;

/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00030\b2#\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"c\u0010\u001e\u001aQ\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016j\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 \"\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010 \"\u0014\u0010&\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 \"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)\"\u0014\u0010.\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)\"\u0014\u00100\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)\"\u001a\u00104\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u00103*Â\u0001\b\u0007\u00109\"[\u0012\u0017\u0012\u0015\u0012\u0002\b\u000305¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(6\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(7\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u00162[\u0012\u0017\u0012\u0015\u0012\u0002\b\u000305¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(6\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(7\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u00010\u0016B\u0002\b8*¦\u0001\b\u0007\u0010:\"M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016B\u0002\b8*¦\u0001\b\u0007\u0010;\"M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u000305¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(6\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u00162M\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0018\u0012\u0017\u0012\u0015\u0012\u0002\b\u000305¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(6\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u0016B\u0002\b8\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "m", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/p;", "", "Lkotlin/r0;", "name", "cause", "onCancellation", "", "o", "(Lkotlinx/coroutines/p;Lld/l;)Z", "", "trySelectInternalResult", "Lkotlinx/coroutines/selects/r;", "d", "(I)Lkotlinx/coroutines/selects/r;", "Lkotlin/Function3;", "", "clauseObject", "param", "clauseResult", "Lkotlinx/coroutines/selects/ProcessResultFunction;", "a", "Lld/q;", "DUMMY_PROCESS_RESULT_FUNCTION", "b", "I", "TRY_SELECT_SUCCESSFUL", "c", "TRY_SELECT_REREGISTER", "TRY_SELECT_CANCELLED", "e", "TRY_SELECT_ALREADY_SELECTED", "Lkotlinx/coroutines/internal/s0;", "f", "Lkotlinx/coroutines/internal/s0;", "STATE_REG", "g", "STATE_COMPLETED", "h", "STATE_CANCELLED", "i", "NO_RESULT", "j", "l", "()Lkotlinx/coroutines/internal/s0;", "PARAM_CLAUSE_0", "Lkotlinx/coroutines/selects/m;", "select", "internalResult", "Lkotlinx/coroutines/f2;", "OnCancellationConstructor", "ProcessResultFunction", "RegistrationFunction", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static final int f81071b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final int f81072c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f81073d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f81074e = 3;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final ld.q<Object, Object, Object, Object> f81070a = a.f81080b;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final s0 f81075f = new s0(ProtectedSandApp.s("袼\u0001"));

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final s0 f81076g = new s0(ProtectedSandApp.s("袽\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final s0 f81077h = new s0(ProtectedSandApp.s("袾\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final s0 f81078i = new s0(ProtectedSandApp.s("袿\u0001"));

    /* renamed from: j, reason: collision with root package name */
    @fg.l
    private static final s0 f81079j = new s0(ProtectedSandApp.s("裀\u0001"));

    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.q {

        /* renamed from: b, reason: collision with root package name */
        public static final a f81080b = new a(3);

        a() {
            super(3);
        }

        @Override // ld.q
        public Object R(Object obj, Object obj2, Object obj3) {
            return null;
        }

        @fg.m
        public final Void a(@fg.l Object obj, @fg.m Object obj2, @fg.m Object obj3) {
            return null;
        }
    }

    @f2
    public static /* synthetic */ void a() {
    }

    @f2
    public static /* synthetic */ void b() {
    }

    @f2
    public static /* synthetic */ void c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r d(int i4) {
        if (i4 == 0) {
            return r.SUCCESSFUL;
        }
        if (i4 == 1) {
            return r.REREGISTER;
        }
        if (i4 == 2) {
            return r.CANCELLED;
        }
        if (i4 == 3) {
            return r.ALREADY_SELECTED;
        }
        throw new IllegalStateException((ProtectedSandApp.s("裁\u0001") + i4).toString());
    }

    @fg.l
    public static final s0 l() {
        return f81079j;
    }

    @fg.m
    public static final <R> Object m(@fg.l ld.l<? super c<? super R>, k2> lVar, @fg.l kotlin.coroutines.d<? super R> dVar) {
        l lVar2 = new l(dVar.getContext());
        lVar.invoke(lVar2);
        return l.Z(lVar2, dVar);
    }

    private static final <R> Object n(ld.l<? super c<? super R>, k2> lVar, kotlin.coroutines.d<? super R> dVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(kotlinx.coroutines.p<? super k2> pVar, ld.l<? super Throwable, k2> lVar) {
        Object i02 = pVar.i0(k2.f75408a, null, lVar);
        if (i02 == null) {
            return false;
        }
        pVar.l0(i02);
        return true;
    }
}
