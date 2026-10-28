package com.tencent.qcloud.core.http.interceptor;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.DomainSwitchException;
import com.tencent.qcloud.core.http.HttpTask;
import com.tencent.qcloud.core.task.TaskManager;
import com.tencent.qcloud.core.util.DomainSwitchUtils;
import com.tencent.qcloud.core.util.OkhttpInternalUtils;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.f0;
import okhttp3.v;
import okhttp3.w;

/* loaded from: classes7.dex */
public class RedirectInterceptor implements w {
    private static final int MAX_FOLLOW_UPS = 20;
    private b0 client;

    private d0 followUpRequest(f0 f0Var, boolean z4, boolean z5) throws DomainSwitchException {
        v W;
        if (f0Var == null) {
            throw new IllegalStateException();
        }
        int u4 = f0Var.u();
        String m4 = f0Var.getRequest().m();
        String s4 = ProtectedSandApp.s("婀\u0001");
        if (u4 != 307 && u4 != 308) {
            switch (u4) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        } else if (!m4.equals(s4) && !m4.equals(ProtectedSandApp.s("婁\u0001"))) {
            return null;
        }
        if (z4 && !z5 && DomainSwitchUtils.isMyqcloudUrl(f0Var.getRequest().q().getHost()) && TextUtils.isEmpty(f0.C(f0Var, ProtectedSandApp.s("婂\u0001"), null, 2, null))) {
            throw new DomainSwitchException();
        }
        String C = f0.C(f0Var, ProtectedSandApp.s("婃\u0001"), null, 2, null);
        if (C == null || (W = f0Var.getRequest().q().W(C)) == null) {
            return null;
        }
        if (!W.getScheme().equals(f0Var.getRequest().q().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        d0 request = f0Var.getRequest();
        request.getClass();
        d0.a aVar = new d0.a(request);
        if (OkhttpInternalUtils.permitsRequestBody(m4)) {
            boolean redirectsWithBody = OkhttpInternalUtils.redirectsWithBody(m4);
            if (OkhttpInternalUtils.redirectsToGet(m4)) {
                aVar.p(s4, null);
            } else {
                aVar.p(m4, redirectsWithBody ? f0Var.getRequest().f() : null);
            }
            if (!redirectsWithBody) {
                aVar.t(ProtectedSandApp.s("婄\u0001"));
                aVar.t(ProtectedSandApp.s("婅\u0001"));
                aVar.t(ProtectedSandApp.s("婆\u0001"));
            }
        }
        if (!sameConnection(f0Var, W)) {
            aVar.t(ProtectedSandApp.s("婇\u0001"));
        }
        aVar.t(ProtectedSandApp.s("婈\u0001"));
        return aVar.D(W).b();
    }

    private boolean sameConnection(f0 f0Var, v vVar) {
        v q4 = f0Var.getRequest().q();
        return q4.getHost().equals(vVar.getHost()) && q4.getPort() == vVar.getPort() && q4.getScheme().equals(vVar.getScheme());
    }

    @Override // okhttp3.w
    public f0 intercept(w.a aVar) throws IOException {
        d0 request = aVar.getRequest();
        HttpTask httpTask = (HttpTask) TaskManager.getInstance().get((String) request.p(Object.class));
        int i4 = 0;
        f0 f0Var = null;
        while (httpTask != null && !httpTask.isCanceled()) {
            f0 c5 = aVar.c(request);
            if (f0Var != null) {
                c5.getClass();
                c5 = new f0.a(c5).A(new f0.a(f0Var).b(null).c()).c();
            }
            f0Var = c5;
            request = followUpRequest(f0Var, httpTask.isDomainSwitch(), httpTask.isSelfSigner());
            if (request == null) {
                return f0Var;
            }
            OkhttpInternalUtils.closeQuietly(f0Var.o());
            i4++;
            if (i4 > 20) {
                throw new ProtocolException(a.a(ProtectedSandApp.s("婉\u0001"), i4));
            }
        }
        throw new IOException(ProtectedSandApp.s("婊\u0001"));
    }

    public void setClient(b0 b0Var) {
        this.client = b0Var;
    }
}
