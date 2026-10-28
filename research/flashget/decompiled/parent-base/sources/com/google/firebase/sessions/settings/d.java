package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.r0;
import ld.p;
import org.json.JSONObject;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJo\u0010\u0016\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\r2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/settings/d;", "Lcom/google/firebase/sessions/settings/a;", "Lcom/google/firebase/sessions/b;", "appInfo", "Lkotlin/coroutines/g;", "blockingDispatcher", "", "baseUrl", "<init>", "(Lcom/google/firebase/sessions/b;Lkotlin/coroutines/g;Ljava/lang/String;)V", "Ljava/net/URL;", "c", "()Ljava/net/URL;", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/d;", "Lkotlin/k2;", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;Lld/p;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/b;", "b", "Lkotlin/coroutines/g;", "Ljava/lang/String;", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final com.google.firebase.sessions.b appInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlin.coroutines.g blockingDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String baseUrl;

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String f60966e = ProtectedSandApp.s("Թ\u0001");

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final String f60967f = ProtectedSandApp.s("Ժ\u0001");

    /* compiled from: RemoteSettingsFetcher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRemoteSettingsFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n215#2,2:101\n1#3:103\n*S KotlinDebug\n*F\n+ 1 RemoteSettingsFetcher.kt\ncom/google/firebase/sessions/settings/RemoteSettingsFetcher$doConfigFetch$2\n*L\n53#1:101,2\n*E\n"})
    static final class b extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60971b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f60973d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ p<JSONObject, kotlin.coroutines.d<? super k2>, Object> f60974e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<String, kotlin.coroutines.d<? super k2>, Object> f60975f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, p<? super String, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f60973d = map;
            this.f60974e = pVar;
            this.f60975f = pVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return d.this.new b(this.f60973d, this.f60974e, this.f60975f, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60971b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    URLConnection openConnection = d.this.c().openConnection();
                    l0.n(openConnection, ProtectedSandApp.s("Դ\u0001"));
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(ProtectedSandApp.s("Ե\u0001"));
                    httpsURLConnection.setRequestProperty(ProtectedSandApp.s("Զ\u0001"), ProtectedSandApp.s("Է\u0001"));
                    for (Map.Entry<String, String> entry : this.f60973d.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        k1.h hVar = new k1.h();
                        while (true) {
                            ?? readLine = bufferedReader.readLine();
                            hVar.f75329b = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p<JSONObject, kotlin.coroutines.d<? super k2>, Object> pVar = this.f60974e;
                        this.f60971b = 1;
                        if (pVar.invoke(jSONObject, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        p<String, kotlin.coroutines.d<? super k2>, Object> pVar2 = this.f60975f;
                        String str = ProtectedSandApp.s("Ը\u0001") + responseCode;
                        this.f60971b = 2;
                        if (pVar2.invoke(str, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i4 == 1 || i4 == 2) {
                    a1.n(obj);
                } else {
                    if (i4 != 3) {
                        throw new IllegalStateException(ProtectedSandApp.s("Գ\u0001"));
                    }
                    a1.n(obj);
                }
            } catch (Exception e4) {
                p<String, kotlin.coroutines.d<? super k2>, Object> pVar3 = this.f60975f;
                String message = e4.getMessage();
                if (message == null) {
                    message = e4.toString();
                }
                this.f60971b = 3;
                if (pVar3.invoke(message, this) == aVar) {
                    return aVar;
                }
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public d(@l com.google.firebase.sessions.b bVar, @l kotlin.coroutines.g gVar, @l String str) {
        l0.p(bVar, ProtectedSandApp.s("Ի\u0001"));
        l0.p(gVar, ProtectedSandApp.s("Լ\u0001"));
        l0.p(str, ProtectedSandApp.s("Խ\u0001"));
        this.appInfo = bVar;
        this.blockingDispatcher = gVar;
        this.baseUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(ProtectedSandApp.s("Ծ\u0001")).authority(this.baseUrl).appendPath(ProtectedSandApp.s("Կ\u0001")).appendPath(ProtectedSandApp.s("Հ\u0001")).appendPath(ProtectedSandApp.s("Ձ\u0001")).appendPath(ProtectedSandApp.s("Ժ\u0001")).appendPath(ProtectedSandApp.s("Ղ\u0001")).appendPath(this.appInfo.j()).appendPath(ProtectedSandApp.s("Ճ\u0001")).appendQueryParameter(ProtectedSandApp.s("Մ\u0001"), this.appInfo.i().i()).appendQueryParameter(ProtectedSandApp.s("Յ\u0001"), this.appInfo.i().n()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.a
    @m
    public Object a(@l Map<String, String> map, @l p<? super JSONObject, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar, @l p<? super String, ? super kotlin.coroutines.d<? super k2>, ? extends Object> pVar2, @l kotlin.coroutines.d<? super k2> dVar) {
        Object h4 = i.h(this.blockingDispatcher, new b(map, pVar, pVar2, null), dVar);
        return h4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? h4 : k2.f75408a;
    }

    public /* synthetic */ d(com.google.firebase.sessions.b bVar, kotlin.coroutines.g gVar, String str, int i4, w wVar) {
        this(bVar, gVar, (i4 & 4) != 0 ? ProtectedSandApp.s("Թ\u0001") : str);
    }
}
