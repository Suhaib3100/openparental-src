package okhttp3.internal.http;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m;
import kotlin.text.v;
import kotlin.x0;
import okhttp3.f0;
import okhttp3.n;
import okhttp3.u;
import okio.p;

/* compiled from: HttpHeaders.kt */
@kd.i(name = "HttpHeaders")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\u001f\"\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010#\"\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006&"}, d2 = {"Lokhttp3/u;", "", "headerName", "", "Lokhttp3/h;", "b", "(Lokhttp3/u;Ljava/lang/String;)Ljava/util/List;", "Lokio/m;", "", "result", "Lkotlin/k2;", "d", "(Lokio/m;Ljava/util/List;)V", "", "h", "(Lokio/m;)Z", "", "prefix", "i", "(Lokio/m;B)Z", "e", "(Lokio/m;)Ljava/lang/String;", "f", "Lokhttp3/n;", "Lokhttp3/v;", "url", "headers", "g", "(Lokhttp3/n;Lokhttp3/v;Lokhttp3/u;)V", "Lokhttp3/f0;", "c", "(Lokhttp3/f0;)Z", "response", "a", "Lokio/p;", "Lokio/p;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final p f84479a;

    /* renamed from: b, reason: collision with root package name */
    private static final p f84480b;

    static {
        p.Companion companion = p.INSTANCE;
        f84479a = companion.l(ProtectedSandApp.s("1"));
        f84480b = companion.l(ProtectedSandApp.s("2"));
    }

    @kotlin.k(level = m.ERROR, message = "No longer supported", replaceWith = @x0(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@l f0 f0Var) {
        l0.p(f0Var, ProtectedSandApp.s("3"));
        return c(f0Var);
    }

    @l
    public static final List<okhttp3.h> b(@l u uVar, @l String str) {
        l0.p(uVar, ProtectedSandApp.s("4"));
        l0.p(str, ProtectedSandApp.s("5"));
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (v.K1(str, uVar.j(i4), true)) {
                try {
                    d(new okio.m().Q0(uVar.s(i4)), arrayList);
                } catch (EOFException e4) {
                    okhttp3.internal.platform.j.INSTANCE.getClass();
                    okhttp3.internal.platform.j.f84863a.m(ProtectedSandApp.s("6"), 5, e4);
                }
            }
        }
        return arrayList;
    }

    public static final boolean c(@l f0 f0Var) {
        l0.p(f0Var, ProtectedSandApp.s("7"));
        if (l0.g(f0Var.getRequest().m(), ProtectedSandApp.s("8"))) {
            return false;
        }
        int u4 = f0Var.u();
        if (((u4 >= 100 && u4 < 200) || u4 == 204 || u4 == 304) && okhttp3.internal.d.x(f0Var) == -1) {
            if (!v.K1(ProtectedSandApp.s(":"), f0.C(f0Var, ProtectedSandApp.s("9"), null, 2, null), true)) {
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
            boolean r7 = r7.t2()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.h r7 = new okhttp3.h
            java.util.Map r0 = kotlin.collections.z0.z()
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
            boolean r2 = r7.t2()
            if (r2 == 0) goto L6c
        L41:
            okhttp3.h r2 = new okhttp3.h
            java.lang.StringBuilder r3 = androidx.compose.material3.j4.a(r3)
            java.lang.String r4 = ";"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
            java.lang.String r4 = kotlin.text.v.e2(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "<"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)
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
            boolean r3 = r7.t2()
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

    private static final String e(okio.m mVar) throws EOFException {
        byte b5 = (byte) 34;
        if (!(mVar.readByte() == b5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("="));
        }
        okio.m mVar2 = new okio.m();
        while (true) {
            long w02 = mVar.w0(f84479a);
            if (w02 == -1) {
                return null;
            }
            if (mVar.z(w02) == b5) {
                mVar2.write(mVar, w02);
                mVar.readByte();
                return mVar2.n3();
            }
            if (mVar.size() == w02 + 1) {
                return null;
            }
            mVar2.write(mVar, w02);
            mVar.readByte();
            mVar2.write(mVar, 1L);
        }
    }

    private static final String f(okio.m mVar) {
        long w02 = mVar.w0(f84480b);
        if (w02 == -1) {
            w02 = mVar.size();
        }
        if (w02 != 0) {
            return mVar.q3(w02, kotlin.text.f.UTF_8);
        }
        return null;
    }

    public static final void g(@l n nVar, @l okhttp3.v vVar, @l u uVar) {
        l0.p(nVar, ProtectedSandApp.s(">"));
        l0.p(vVar, ProtectedSandApp.s("?"));
        l0.p(uVar, ProtectedSandApp.s("@"));
        if (nVar == n.f85045a) {
            return;
        }
        List<okhttp3.m> g4 = okhttp3.m.INSTANCE.g(vVar, uVar);
        if (g4.isEmpty()) {
            return;
        }
        nVar.b(vVar, g4);
    }

    private static final boolean h(okio.m mVar) {
        boolean z4 = false;
        while (!mVar.t2()) {
            byte z5 = mVar.z(0L);
            if (z5 == 9 || z5 == 32) {
                mVar.readByte();
            } else {
                if (z5 != 44) {
                    break;
                }
                mVar.readByte();
                z4 = true;
            }
        }
        return z4;
    }

    private static final boolean i(okio.m mVar, byte b5) {
        return !mVar.t2() && mVar.z(0L) == b5;
    }
}
