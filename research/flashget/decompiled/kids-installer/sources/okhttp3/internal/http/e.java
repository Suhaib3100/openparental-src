package okhttp3.internal.http;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.l0;
import kotlin.text.e0;
import okhttp3.g0;
import okhttp3.n;
import okhttp3.v;
import okhttp3.w;
import okio.m;
import okio.p;

/* compiled from: HttpHeaders.kt */
@p3.i(name = "HttpHeaders")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001f"}, d2 = {"Lokhttp3/v;", "", "headerName", "", "Lokhttp3/h;", "b", "Lokio/m;", "", "result", "Lkotlin/m2;", "d", "", "h", "", "prefix", "i", "e", "f", "Lokhttp3/n;", "Lokhttp3/w;", "url", "headers", "g", "Lokhttp3/g0;", "c", "response", "a", "Lokio/p;", "Lokio/p;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final p f30952a;

    /* renamed from: b, reason: collision with root package name */
    private static final p f30953b;

    static {
        p.Companion companion = p.INSTANCE;
        f30952a = companion.l(ProtectedSandApp.s("挀"));
        f30953b = companion.l(ProtectedSandApp.s("持"));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@d5.d g0 g0Var) {
        l0.p(g0Var, ProtectedSandApp.s("挂"));
        return c(g0Var);
    }

    @d5.d
    public static final List<okhttp3.h> b(@d5.d v vVar, @d5.d String str) {
        boolean K1;
        l0.p(vVar, ProtectedSandApp.s("挃"));
        l0.p(str, ProtectedSandApp.s("挄"));
        ArrayList arrayList = new ArrayList();
        int size = vVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            K1 = e0.K1(str, vVar.q(i5), true);
            if (K1) {
                try {
                    d(new m().j0(vVar.x(i5)), arrayList);
                } catch (EOFException e6) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f31323a.m(ProtectedSandApp.s("挅"), 5, e6);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@d5.d g0 g0Var) {
        boolean K1;
        l0.p(g0Var, ProtectedSandApp.s("挆"));
        if (l0.g(g0Var.getRequest().m(), ProtectedSandApp.s("指"))) {
            return false;
        }
        int code = g0Var.getCode();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && okhttp3.internal.d.x(g0Var) == -1) {
            K1 = e0.K1(ProtectedSandApp.s("按"), g0.P(g0Var, ProtectedSandApp.s("挈"), null, 2, null), true);
            if (!K1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(okio.m r7, java.util.List<okhttp3.h> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            h(r7)
            java.lang.String r1 = f(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = h(r7)
            java.lang.String r3 = f(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.M()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.h r7 = new okhttp3.h
            java.util.Map r0 = kotlin.collections.c1.z()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = okhttp3.internal.d.S(r7, r4)
            boolean r6 = h(r7)
            if (r2 != 0) goto L6c
            if (r6 != 0) goto L41
            boolean r2 = r7.M()
            if (r2 == 0) goto L6c
        L41:
            okhttp3.h r2 = new okhttp3.h
            java.lang.StringBuilder r3 = androidx.constraintlayout.motion.widget.r.a(r3)
            java.lang.String r4 = "挊"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            java.lang.String r4 = kotlin.text.v.e2(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "挋"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            kotlin.jvm.internal.l0.o(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L6c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.d.S(r7, r4)
            int r6 = r6 + r5
        L76:
            if (r3 != 0) goto L88
            java.lang.String r3 = f(r7)
            boolean r5 = h(r7)
            if (r5 == 0) goto L83
            goto L8a
        L83:
            int r5 = okhttp3.internal.d.S(r7, r4)
            r6 = r5
        L88:
            if (r6 != 0) goto L95
        L8a:
            okhttp3.h r4 = new okhttp3.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L95:
            r5 = 1
            if (r6 <= r5) goto L99
            return
        L99:
            boolean r5 = h(r7)
            if (r5 == 0) goto La0
            return
        La0:
            r5 = 34
            byte r5 = (byte) r5
            boolean r5 = i(r7, r5)
            if (r5 == 0) goto Lae
            java.lang.String r5 = e(r7)
            goto Lb2
        Lae:
            java.lang.String r5 = f(r7)
        Lb2:
            if (r5 == 0) goto Lcc
            java.lang.Object r3 = r2.put(r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lbd
            return
        Lbd:
            boolean r3 = h(r7)
            if (r3 != 0) goto Lca
            boolean r3 = r7.M()
            if (r3 != 0) goto Lca
            return
        Lca:
            r3 = r0
            goto L76
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.e.d(okio.m, java.util.List):void");
    }

    private static final String e(m mVar) throws EOFException {
        byte b6 = (byte) 34;
        if (!(mVar.readByte() == b6)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("挌").toString());
        }
        m mVar2 = new m();
        while (true) {
            long V = mVar.V(f30952a);
            if (V == -1) {
                return null;
            }
            if (mVar.b0(V) == b6) {
                mVar2.t0(mVar, V);
                mVar.readByte();
                return mVar2.L0();
            }
            if (mVar.size() == V + 1) {
                return null;
            }
            mVar2.t0(mVar, V);
            mVar.readByte();
            mVar2.t0(mVar, 1L);
        }
    }

    private static final String f(m mVar) {
        long V = mVar.V(f30953b);
        if (V == -1) {
            V = mVar.size();
        }
        if (V != 0) {
            return mVar.q(V);
        }
        return null;
    }

    public static final void g(@d5.d n nVar, @d5.d w wVar, @d5.d v vVar) {
        l0.p(nVar, ProtectedSandApp.s("挍"));
        l0.p(wVar, ProtectedSandApp.s("挎"));
        l0.p(vVar, ProtectedSandApp.s("挏"));
        if (nVar == n.f31501a) {
            return;
        }
        List<okhttp3.m> g5 = okhttp3.m.INSTANCE.g(wVar, vVar);
        if (g5.isEmpty()) {
            return;
        }
        nVar.a(wVar, g5);
    }

    private static final boolean h(m mVar) {
        boolean z5 = false;
        while (!mVar.M()) {
            byte b02 = mVar.b0(0L);
            if (b02 == 9 || b02 == 32) {
                mVar.readByte();
            } else {
                if (b02 != 44) {
                    break;
                }
                mVar.readByte();
                z5 = true;
            }
        }
        return z5;
    }

    private static final boolean i(m mVar, byte b6) {
        return !mVar.M() && mVar.b0(0L) == b6;
    }
}
