package com.google.firebase.sessions.settings;

import androidx.annotation.m1;
import com.android.internal.telephony.SmsConstants;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.k;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.b0;
import kotlin.c0;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.text.r;
import kotlin.time.e;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import ld.p;
import org.apache.log4j.net.SyslogAppender;
import org.json.JSONObject;

/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u001bB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010+R\u001f\u0010/\u001a\u0004\u0018\u00010-8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00101\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Lcom/google/firebase/sessions/settings/c;", "Lcom/google/firebase/sessions/settings/h;", "Lkotlin/coroutines/g;", "backgroundDispatcher", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/b;", "appInfo", "Lcom/google/firebase/sessions/settings/a;", "configsFetcher", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore", "<init>", "(Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/b;Lcom/google/firebase/sessions/settings/a;Landroidx/datastore/core/e;)V", "", "s", "i", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/k2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "d", "()Z", "g", "()V", "a", "Lkotlin/coroutines/g;", "b", "Lcom/google/firebase/installations/k;", "c", "Lcom/google/firebase/sessions/b;", "Lcom/google/firebase/sessions/settings/a;", "Lcom/google/firebase/sessions/settings/g;", "Lkotlin/b0;", "h", "()Lcom/google/firebase/sessions/settings/g;", "settingsCache", "Lkotlinx/coroutines/sync/a;", "f", "Lkotlinx/coroutines/sync/a;", "fetchInProgress", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,164:1\n107#2,10:165\n*S KotlinDebug\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings\n*L\n68#1:165,10\n*E\n"})
/* loaded from: classes6.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlin.coroutines.g backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final k firebaseInstallationsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final com.google.firebase.sessions.b appInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final com.google.firebase.sessions.settings.a configsFetcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 settingsCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private final kotlinx.coroutines.sync.a fetchInProgress;

    /* renamed from: h, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60942h = ProtectedSandApp.s("Ԣ\u0001");

    /* renamed from: i, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60943i = ProtectedSandApp.s("ԣ\u0001");

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final a f60941g = new a();

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/c$a;", "", "<init>", "()V", "", "FORWARD_SLASH_STRING", "Ljava/lang/String;", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60950b;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60950b;
            if (i4 == 0) {
                a1.n(obj);
                g h4 = c.this.h();
                this.f60950b = 1;
                if (h4.j(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ԙ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((b) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/g;", "a", "()Lcom/google/firebase/sessions/settings/g;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: com.google.firebase.sessions.settings.c$c, reason: collision with other inner class name */
    static final class C0941c extends n0 implements ld.a<g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.content.core.e<androidx.content.preferences.core.d> f60952b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0941c(androidx.content.core.e<androidx.content.preferences.core.d> eVar) {
            super(0);
            this.f60952b = eVar;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.f60952b);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {170, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f60953b;

        /* renamed from: c, reason: collision with root package name */
        Object f60954c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60955d;

        /* renamed from: f, reason: collision with root package name */
        int f60957f;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f60955d = obj;
            this.f60957f |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, UserData.IS91_MSG_TYPE_SHORT_MESSAGE_FULL, UserData.IS91_MSG_TYPE_SHORT_MESSAGE, SmsConstants.MAX_USER_DATA_BYTES_WITH_HEADER, SyslogAppender.LOG_LOCAL1}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Lkotlin/k2;", "<anonymous>", "(Lorg/json/JSONObject;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nRemoteSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteSettings.kt\ncom/google/firebase/sessions/settings/RemoteSettings$updateSettings$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n1#2:165\n*E\n"})
    static final class e extends o implements p<JSONObject, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f60958b;

        /* renamed from: c, reason: collision with root package name */
        Object f60959c;

        /* renamed from: d, reason: collision with root package name */
        int f60960d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f60961e;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l JSONObject jSONObject, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((e) create(jSONObject, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            e eVar = c.this.new e(dVar);
            eVar.f60961e = obj;
            return eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0192 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RemoteSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "msg", "Lkotlin/k2;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends o implements p<String, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60963b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60964c;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l String str, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(str, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(2, dVar);
            fVar.f60964c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f60963b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ԡ\u0001"));
            }
            a1.n(obj);
            return k2.f75408a;
        }
    }

    public c(@l kotlin.coroutines.g gVar, @l k kVar, @l com.google.firebase.sessions.b bVar, @l com.google.firebase.sessions.settings.a aVar, @l androidx.content.core.e<androidx.content.preferences.core.d> eVar) {
        l0.p(gVar, ProtectedSandApp.s("Ԥ\u0001"));
        l0.p(kVar, ProtectedSandApp.s("ԥ\u0001"));
        l0.p(bVar, ProtectedSandApp.s("Ԧ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ԧ\u0001"));
        l0.p(eVar, ProtectedSandApp.s("Ԩ\u0001"));
        this.backgroundDispatcher = gVar;
        this.firebaseInstallationsApi = kVar;
        this.appInfo = bVar;
        this.configsFetcher = aVar;
        this.settingsCache = c0.c(new C0941c(eVar));
        this.fetchInProgress = kotlinx.coroutines.sync.c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g h() {
        return (g) this.settingsCache.getValue();
    }

    private final String i(String s4) {
        return new r(ProtectedSandApp.s("ԣ\u0001")).m(s4, "");
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public Boolean a() {
        return h().m();
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public kotlin.time.e b() {
        Integer k4 = h().k();
        if (k4 == null) {
            return null;
        }
        e.Companion companion = kotlin.time.e.INSTANCE;
        return kotlin.time.e.f(kotlin.time.g.m0(k4.intValue(), kotlin.time.h.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.h
    @m
    public Double c() {
        return h().l();
    }

    @Override // com.google.firebase.sessions.settings.h
    public boolean d() {
        return h().i();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:26:0x004a, B:27:0x00b2, B:29:0x00c0, B:32:0x00c6), top: B:25:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:26:0x004a, B:27:0x00b2, B:29:0x00c0, B:32:0x00c6), top: B:25:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:40:0x0088, B:42:0x0092, B:45:0x009e), top: B:39:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0098, blocks: (B:40:0x0088, B:42:0x0092, B:45:0x009e), top: B:39:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.firebase.sessions.settings.h
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@fg.l kotlin.coroutines.d<? super kotlin.k2> r15) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.c.e(kotlin.coroutines.d):java.lang.Object");
    }

    @m1
    public final void g() {
        kotlinx.coroutines.k.f(s0.a(this.backgroundDispatcher), null, null, new b(null), 3, null);
    }
}
