package com.tencent.beacon.base.net.adapter;

import androidx.annotation.q0;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.HttpRequestEntity;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.u;
import okhttp3.x;

/* loaded from: classes6.dex */
public class OkHttpAdapter extends AbstractNetAdapter {
    private b0 client;
    private int failCount;

    private OkHttpAdapter(b0 b0Var) {
        this.client = b0Var;
    }

    static /* synthetic */ int access$008(OkHttpAdapter okHttpAdapter) {
        int i4 = okHttpAdapter.failCount;
        okHttpAdapter.failCount = i4 + 1;
        return i4;
    }

    private e0 buildBody(HttpRequestEntity httpRequestEntity) {
        BodyType bodyType = httpRequestEntity.bodyType();
        int i4 = e.f71152a[bodyType.ordinal()];
        if (i4 == 1) {
            return e0.create(x.j(bodyType.httpType), com.tencent.beacon.base.net.b.d.b(httpRequestEntity.formParams()));
        }
        if (i4 == 2) {
            return e0.create(x.j(bodyType.httpType), httpRequestEntity.json());
        }
        if (i4 != 3) {
            return null;
        }
        return e0.create(x.j(ProtectedSandApp.s("ミ\u0001")), httpRequestEntity.content());
    }

    public static AbstractNetAdapter create(@q0 b0 b0Var) {
        return b0Var != null ? new OkHttpAdapter(b0Var) : new OkHttpAdapter();
    }

    private u mapToHeaders(Map<String, String> map) {
        u.a aVar = new u.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                aVar.b(entry.getKey(), entry.getValue());
            }
        }
        return aVar.i();
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        e0 create = e0.create(x.j(ProtectedSandApp.s("メ\u0001")), jceRequestEntity.getContent());
        u mapToHeaders = mapToHeaders(jceRequestEntity.getHeader());
        String name = jceRequestEntity.getType().name();
        this.client.b(new d0.a().B(jceRequestEntity.getUrl()).A(name).r(create).o(mapToHeaders).b()).n2(new c(this, callback, name));
    }

    private OkHttpAdapter() {
        b0.a aVar = new b0.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b0.a j02 = aVar.k(i0.f35989d, timeUnit).j0(i0.f35991f, timeUnit);
        j02.getClass();
        this.client = new b0(j02);
    }

    @Override // com.tencent.beacon.base.net.adapter.AbstractNetAdapter
    public void request(HttpRequestEntity httpRequestEntity, Callback<BResponse> callback) {
        String tag = httpRequestEntity.tag();
        this.client.b(new d0.a().B(httpRequestEntity.url()).p(httpRequestEntity.method().name(), buildBody(httpRequestEntity)).o(mapToHeaders(httpRequestEntity.headers())).A(tag == null ? ProtectedSandApp.s("ム\u0001") : tag).b()).n2(new d(this, callback, tag));
    }
}
