package kotlin.reflect.jvm.internal.impl.types.error;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: ErrorType.kt */
/* loaded from: classes7.dex */
public final class h extends p0 {

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final h1 f78403c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f78404d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private final j f78405e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private final List<l1> f78406f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f78407g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private final String[] f78408h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private final String f78409i;

    /* JADX WARN: Multi-variable type inference failed */
    @kd.j
    public h(@fg.l h1 h1Var, @fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @fg.l j jVar, @fg.l List<? extends l1> list, boolean z4, @fg.l String... strArr) {
        l0.p(h1Var, ProtectedSandApp.s("繞\u0001"));
        l0.p(hVar, ProtectedSandApp.s("繟\u0001"));
        l0.p(jVar, ProtectedSandApp.s("繠\u0001"));
        l0.p(list, ProtectedSandApp.s("繡\u0001"));
        l0.p(strArr, ProtectedSandApp.s("繢\u0001"));
        this.f78403c = h1Var;
        this.f78404d = hVar;
        this.f78405e = jVar;
        this.f78406f = list;
        this.f78407g = z4;
        this.f78408h = strArr;
        t1 t1Var = t1.f75371a;
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f78409i = s3.a(copyOf, copyOf.length, debugMessage, ProtectedSandApp.s("繣\u0001"));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public List<l1> M0() {
        return this.f78406f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public d1 N0() {
        d1.f78389c.getClass();
        return d1.f78390d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public h1 O0() {
        return this.f78403c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean P0() {
        return this.f78407g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    /* renamed from: Q0 */
    public h0 Y0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("繤\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    /* renamed from: T0 */
    public w1 Y0(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("繤\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public w1 U0(d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("繥\u0001"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @fg.l
    public p0 V0(boolean z4) {
        h1 h1Var = this.f78403c;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f78404d;
        j jVar = this.f78405e;
        List<l1> list = this.f78406f;
        String[] strArr = this.f78408h;
        return new h(h1Var, hVar, jVar, list, z4, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @fg.l
    /* renamed from: W0 */
    public p0 U0(@fg.l d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("繥\u0001"));
        return this;
    }

    @fg.l
    public final String X0() {
        return this.f78409i;
    }

    @fg.l
    public final j Y0() {
        return this.f78405e;
    }

    @fg.l
    public h Z0(@fg.l kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("繤\u0001"));
        return this;
    }

    @fg.l
    public final h a1(@fg.l List<? extends l1> list) {
        l0.p(list, ProtectedSandApp.s("繦\u0001"));
        h1 h1Var = this.f78403c;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f78404d;
        j jVar = this.f78405e;
        boolean z4 = this.f78407g;
        String[] strArr = this.f78408h;
        return new h(h1Var, hVar, jVar, list, z4, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @fg.l
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h q() {
        return this.f78404d;
    }

    public h(h1 h1Var, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, j jVar, List list, boolean z4, String[] strArr, int i4, w wVar) {
        this(h1Var, hVar, jVar, (i4 & 8) != 0 ? j0.f74919b : list, (i4 & 16) != 0 ? false : z4, strArr);
    }
}
