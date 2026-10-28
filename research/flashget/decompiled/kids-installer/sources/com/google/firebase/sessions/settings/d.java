package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.j;
import kotlinx.coroutines.u0;
import org.json.JSONObject;
import q3.p;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000eB!\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002Jo\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/settings/d;", "Lcom/google/firebase/sessions/settings/a;", "Ljava/net/URL;", "c", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/d;", "Lkotlin/m2;", "", "onSuccess", "onFailure", "a", "(Ljava/util/Map;Lq3/p;Lq3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/b;", "Lcom/google/firebase/sessions/b;", "appInfo", "Lkotlin/coroutines/g;", "b", "Lkotlin/coroutines/g;", "blockingDispatcher", "Ljava/lang/String;", "baseUrl", "<init>", "(Lcom/google/firebase/sessions/b;Lkotlin/coroutines/g;Ljava/lang/String;)V", "d", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.sessions.b appInfo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext blockingDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String baseUrl;

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final String f18692e = ProtectedSandApp.s("⮺");

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final String f18693f = ProtectedSandApp.s("⮻");

    /* compiled from: RemoteSettingsFetcher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", i = {}, l = {68, 70, 73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18697s;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f18699u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ p<JSONObject, Continuation<? super m2>, Object> f18700v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ p<String, Continuation<? super m2>, Object> f18701w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super Continuation<? super m2>, ? extends Object> pVar, p<? super String, ? super Continuation<? super m2>, ? extends Object> pVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f18699u = map;
            this.f18700v = pVar;
            this.f18701w = pVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18697s;
            try {
                if (i5 == 0) {
                    a1.n(obj);
                    URLConnection openConnection = d.this.c().openConnection();
                    l0.n(openConnection, ProtectedSandApp.s("㍣"));
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                    httpsURLConnection.setRequestMethod(ProtectedSandApp.s("㍤"));
                    httpsURLConnection.setRequestProperty(ProtectedSandApp.s("㍥"), ProtectedSandApp.s("㍦"));
                    for (Map.Entry<String, String> entry : this.f18699u.entrySet()) {
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
                            hVar.f23572o = readLine;
                            if (readLine == 0) {
                                break;
                            }
                            sb.append((String) readLine);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        p<JSONObject, Continuation<? super m2>, Object> pVar = this.f18700v;
                        this.f18697s = 1;
                        if (pVar.g0(jSONObject, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        p<String, Continuation<? super m2>, Object> pVar2 = this.f18701w;
                        String str = ProtectedSandApp.s("㍧") + responseCode;
                        this.f18697s = 2;
                        if (pVar2.g0(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i5 == 1 || i5 == 2) {
                    a1.n(obj);
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException(ProtectedSandApp.s("㍢"));
                    }
                    a1.n(obj);
                }
            } catch (Exception e6) {
                p<String, Continuation<? super m2>, Object> pVar3 = this.f18701w;
                String message = e6.getMessage();
                if (message == null) {
                    message = e6.toString();
                }
                this.f18697s = 3;
                if (pVar3.g0(message, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return d.this.new b(this.f18699u, this.f18700v, this.f18701w, continuation);
        }
    }

    public d(@d5.d com.google.firebase.sessions.b bVar, @d5.d CoroutineContext coroutineContext, @d5.d String str) {
        l0.p(bVar, ProtectedSandApp.s("⮼"));
        l0.p(coroutineContext, ProtectedSandApp.s("⮽"));
        l0.p(str, ProtectedSandApp.s("⮾"));
        this.appInfo = bVar;
        this.blockingDispatcher = coroutineContext;
        this.baseUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme(ProtectedSandApp.s("⯀")).authority(this.baseUrl).appendPath(ProtectedSandApp.s("⯁")).appendPath(ProtectedSandApp.s("⯂")).appendPath(ProtectedSandApp.s("⯃")).appendPath(ProtectedSandApp.s("⯄")).appendPath(ProtectedSandApp.s("⯅")).appendPath(this.appInfo.j()).appendPath(ProtectedSandApp.s("⯆")).appendQueryParameter(ProtectedSandApp.s("⯇"), this.appInfo.i().i()).appendQueryParameter(ProtectedSandApp.s("⯈"), this.appInfo.i().n()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.a
    @d5.e
    public Object a(@d5.d Map<String, String> map, @d5.d p<? super JSONObject, ? super Continuation<? super m2>, ? extends Object> pVar, @d5.d p<? super String, ? super Continuation<? super m2>, ? extends Object> pVar2, @d5.d Continuation<? super m2> continuation) {
        Object h5 = j.h(this.blockingDispatcher, new b(map, pVar, pVar2, null), continuation);
        return h5 == CoroutineSingletons.COROUTINE_SUSPENDED ? h5 : m2.f23662a;
    }

    public /* synthetic */ d(com.google.firebase.sessions.b bVar, CoroutineContext coroutineContext, String str, int i5, w wVar) {
        this(bVar, coroutineContext, (i5 & 4) != 0 ? ProtectedSandApp.s("⮿") : str);
    }
}
