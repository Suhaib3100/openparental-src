package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.types.d1;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.h1;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.types.w1;

/* compiled from: ErrorType.kt */
/* loaded from: classes6.dex */
public final class h extends p0 {

    /* renamed from: p, reason: collision with root package name */
    @d5.d
    private final h1 f26394p;

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h f26395q;

    /* renamed from: r, reason: collision with root package name */
    @d5.d
    private final j f26396r;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    private final List<l1> f26397s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f26398t;

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    private final String[] f26399u;

    /* renamed from: v, reason: collision with root package name */
    @d5.d
    private final String f26400v;

    /* JADX WARN: Multi-variable type inference failed */
    @p3.j
    public h(@d5.d h1 h1Var, @d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, @d5.d j jVar, @d5.d List<? extends l1> list, boolean z5, @d5.d String... strArr) {
        l0.p(h1Var, ProtectedSandApp.s("褙"));
        l0.p(hVar, ProtectedSandApp.s("褚"));
        l0.p(jVar, ProtectedSandApp.s("褛"));
        l0.p(list, ProtectedSandApp.s("褜"));
        l0.p(strArr, ProtectedSandApp.s("褝"));
        this.f26394p = h1Var;
        this.f26395q = hVar;
        this.f26396r = jVar;
        this.f26397s = list;
        this.f26398t = z5;
        this.f26399u = strArr;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f23622a;
        String debugMessage = jVar.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        l0.o(format, ProtectedSandApp.s("褞"));
        this.f26400v = format;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.h C() {
        return this.f26395q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public List<l1> S0() {
        return this.f26397s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public d1 T0() {
        d1.f26381p.getClass();
        return d1.f26382q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    @d5.d
    public h1 U0() {
        return this.f26394p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    public boolean V0() {
        return this.f26398t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.h0
    /* renamed from: W0 */
    public h0 e1(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("褟"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    /* renamed from: Z0 */
    public w1 e1(kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("褠"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public w1 a1(d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("褡"));
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @d5.d
    public p0 b1(boolean z5) {
        h1 h1Var = this.f26394p;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar = this.f26395q;
        j jVar = this.f26396r;
        List<l1> list = this.f26397s;
        String[] strArr = this.f26399u;
        return new h(h1Var, hVar, jVar, list, z5, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p0
    @d5.d
    /* renamed from: c1 */
    public p0 a1(@d5.d d1 d1Var) {
        l0.p(d1Var, ProtectedSandApp.s("褢"));
        return this;
    }

    @d5.d
    public final String d1() {
        return this.f26400v;
    }

    @d5.d
    public final j e1() {
        return this.f26396r;
    }

    @d5.d
    public h f1(@d5.d kotlin.reflect.jvm.internal.impl.types.checker.g gVar) {
        l0.p(gVar, ProtectedSandApp.s("褣"));
        return this;
    }

    public h(h1 h1Var, kotlin.reflect.jvm.internal.impl.resolve.scopes.h hVar, j jVar, List list, boolean z5, String[] strArr, int i5, w wVar) {
        this(h1Var, hVar, jVar, (i5 & 8) != 0 ? EmptyList.f23167o : list, (i5 & 16) != 0 ? false : z5, strArr);
    }
}
