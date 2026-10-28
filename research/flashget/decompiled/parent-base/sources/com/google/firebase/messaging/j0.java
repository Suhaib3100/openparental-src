package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.k;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: GmsRpc.java */
/* loaded from: classes6.dex */
class j0 {
    private static final String A = ProtectedSandApp.s("ɤ\u0001");
    private static final String B = ProtectedSandApp.s("ɜ\u0001");
    private static final String C = ProtectedSandApp.s("ɝ\u0001");
    private static final String D = ProtectedSandApp.s("ɞ\u0001");
    private static final String E = ProtectedSandApp.s("ɟ\u0001");
    private static final String F = ProtectedSandApp.s("ɠ\u0001");
    private static final String G = ProtectedSandApp.s("ɢ\u0001");
    private static final String H = ProtectedSandApp.s("ɡ\u0001");
    static final String I = ProtectedSandApp.s("ɮ\u0001");
    static final String J = ProtectedSandApp.s("ɕ\u0001");
    static final String K = ProtectedSandApp.s("ɯ\u0001");
    private static final String L = ProtectedSandApp.s("ɫ\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final String f60161g = ProtectedSandApp.s("ɰ\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f60162h = ProtectedSandApp.s("ɒ\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f60163i = ProtectedSandApp.s("ɓ\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f60164j = ProtectedSandApp.s("ɔ\u0001");

    /* renamed from: k, reason: collision with root package name */
    static final String f60165k = ProtectedSandApp.s("ɑ\u0001");

    /* renamed from: l, reason: collision with root package name */
    static final String f60166l = ProtectedSandApp.s("ɗ\u0001");

    /* renamed from: m, reason: collision with root package name */
    static final String f60167m = ProtectedSandApp.s("ɱ\u0001");

    /* renamed from: n, reason: collision with root package name */
    static final String f60168n = ProtectedSandApp.s("ɦ\u0001");

    /* renamed from: o, reason: collision with root package name */
    static final String f60169o = ProtectedSandApp.s("ɘ\u0001");

    /* renamed from: p, reason: collision with root package name */
    private static final String f60170p = ProtectedSandApp.s("ɭ\u0001");

    /* renamed from: q, reason: collision with root package name */
    private static final String f60171q = ProtectedSandApp.s("ɬ\u0001");

    /* renamed from: r, reason: collision with root package name */
    static final String f60172r = ProtectedSandApp.s("ɖ\u0001");

    /* renamed from: s, reason: collision with root package name */
    private static final String f60173s = ProtectedSandApp.s("ɛ\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f60174t = ProtectedSandApp.s("ɚ\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f60175u = ProtectedSandApp.s("ə\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f60176v = ProtectedSandApp.s("ɩ\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f60177w = ProtectedSandApp.s("ɲ\u0001");

    /* renamed from: x, reason: collision with root package name */
    private static final String f60178x = ProtectedSandApp.s("ɣ\u0001");

    /* renamed from: y, reason: collision with root package name */
    private static final String f60179y = ProtectedSandApp.s("ɨ\u0001");

    /* renamed from: z, reason: collision with root package name */
    private static final String f60180z = ProtectedSandApp.s("ɧ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g f60181a;

    /* renamed from: b, reason: collision with root package name */
    private final p0 f60182b;

    /* renamed from: c, reason: collision with root package name */
    private final Rpc f60183c;

    /* renamed from: d, reason: collision with root package name */
    private final y9.b<com.google.firebase.platforminfo.i> f60184d;

    /* renamed from: e, reason: collision with root package name */
    private final y9.b<com.google.firebase.heartbeatinfo.k> f60185e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.k f60186f;

    j0(com.google.firebase.g gVar, p0 p0Var, y9.b<com.google.firebase.platforminfo.i> bVar, y9.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this(gVar, p0Var, new Rpc(gVar.n()), bVar, bVar2, kVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task<String> d(Task<Bundle> task) {
        return task.continueWith(new androidx.credentials.k(), new Continuation() { // from class: com.google.firebase.messaging.i0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                String j4;
                j4 = j0.this.j(task2);
                return j4;
            }
        });
    }

    private String e() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(ProtectedSandApp.s("ɏ\u0001")).digest(this.f60181a.r().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return ProtectedSandApp.s("ɐ\u0001");
        }
    }

    @androidx.annotation.d
    private String h(Bundle bundle) throws IOException {
        String s4 = ProtectedSandApp.s("ɑ\u0001");
        if (bundle == null) {
            throw new IOException(s4);
        }
        String string = bundle.getString(ProtectedSandApp.s("ɒ\u0001"));
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(ProtectedSandApp.s("ɓ\u0001"));
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(ProtectedSandApp.s("ɔ\u0001"));
        if (ProtectedSandApp.s("ɕ\u0001").equals(string3)) {
            throw new IOException(ProtectedSandApp.s("ɖ\u0001"));
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException(s4);
    }

    static boolean i(String str) {
        return ProtectedSandApp.s("ɑ\u0001").equals(str) || ProtectedSandApp.s("ɗ\u0001").equals(str) || ProtectedSandApp.s("ɘ\u0001").equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j(Task task) throws Exception {
        return h((Bundle) task.getResult(IOException.class));
    }

    private void k(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        k.a b5;
        bundle.putString(ProtectedSandApp.s("ə\u0001"), str2);
        bundle.putString(ProtectedSandApp.s("ɚ\u0001"), str);
        bundle.putString(ProtectedSandApp.s("ɛ\u0001"), str);
        bundle.putString(ProtectedSandApp.s("ɜ\u0001"), this.f60181a.s().j());
        bundle.putString(ProtectedSandApp.s("ɝ\u0001"), Integer.toString(this.f60182b.d()));
        bundle.putString(ProtectedSandApp.s("ɞ\u0001"), Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(ProtectedSandApp.s("ɟ\u0001"), this.f60182b.a());
        bundle.putString(ProtectedSandApp.s("ɠ\u0001"), this.f60182b.b());
        bundle.putString(ProtectedSandApp.s("ɡ\u0001"), e());
        try {
            String b6 = ((com.google.firebase.installations.o) Tasks.await(this.f60186f.c(false))).b();
            if (!TextUtils.isEmpty(b6)) {
                bundle.putString(ProtectedSandApp.s("ɢ\u0001"), b6);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString(ProtectedSandApp.s("ɣ\u0001"), (String) Tasks.await(this.f60186f.a()));
        bundle.putString(ProtectedSandApp.s("ɤ\u0001"), ProtectedSandApp.s("ɥ\u0001"));
        com.google.firebase.heartbeatinfo.k kVar = this.f60185e.get();
        com.google.firebase.platforminfo.i iVar = this.f60184d.get();
        if (kVar == null || iVar == null || (b5 = kVar.b(ProtectedSandApp.s("ɦ\u0001"))) == k.a.NONE) {
            return;
        }
        bundle.putString(ProtectedSandApp.s("ɧ\u0001"), Integer.toString(b5.getCode()));
        bundle.putString(ProtectedSandApp.s("ɨ\u0001"), iVar.a());
    }

    private Task<Bundle> m(String str, String str2, Bundle bundle) {
        try {
            k(str, str2, bundle);
            return this.f60183c.send(bundle);
        } catch (InterruptedException | ExecutionException e4) {
            return Tasks.forException(e4);
        }
    }

    Task<?> c() {
        Bundle bundle = new Bundle();
        bundle.putString(ProtectedSandApp.s("ɩ\u0001"), ProtectedSandApp.s("ɪ\u0001"));
        return d(m(p0.c(this.f60181a), ProtectedSandApp.s("ɫ\u0001"), bundle));
    }

    Task<CloudMessage> f() {
        return this.f60183c.getProxiedNotificationData();
    }

    Task<String> g() {
        return d(m(p0.c(this.f60181a), ProtectedSandApp.s("ɫ\u0001"), new Bundle()));
    }

    Task<Void> l(boolean z4) {
        return this.f60183c.setRetainProxiedNotifications(z4);
    }

    Task<?> n(String str, String str2) {
        Bundle bundle = new Bundle();
        String s4 = ProtectedSandApp.s("ɬ\u0001");
        bundle.putString(ProtectedSandApp.s("ɭ\u0001"), s4 + str2);
        return d(m(str, s4 + str2, bundle));
    }

    Task<?> o(String str, String str2) {
        Bundle bundle = new Bundle();
        String s4 = ProtectedSandApp.s("ɬ\u0001");
        bundle.putString(ProtectedSandApp.s("ɭ\u0001"), s4 + str2);
        bundle.putString(ProtectedSandApp.s("ɩ\u0001"), ProtectedSandApp.s("ɪ\u0001"));
        return d(m(str, s4 + str2, bundle));
    }

    @androidx.annotation.m1
    j0(com.google.firebase.g gVar, p0 p0Var, Rpc rpc, y9.b<com.google.firebase.platforminfo.i> bVar, y9.b<com.google.firebase.heartbeatinfo.k> bVar2, com.google.firebase.installations.k kVar) {
        this.f60181a = gVar;
        this.f60182b = p0Var;
        this.f60183c = rpc;
        this.f60184d = bVar;
        this.f60185e = bVar2;
        this.f60186f = kVar;
    }
}
