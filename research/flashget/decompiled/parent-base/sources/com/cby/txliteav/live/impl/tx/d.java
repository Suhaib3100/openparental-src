package com.cby.txliteav.live.impl.tx;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePremier;
import fg.l;
import fg.m;
import java.io.File;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import ld.p;

/* compiled from: TXLiveManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJm\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2:\b\u0002\u0010\u0016\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0003R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006%"}, d2 = {"Lcom/cby/txliteav/live/impl/tx/d;", "", "<init>", "()V", "", "print", "Lkotlin/k2;", "g", "(Z)V", "Landroid/content/Context;", "context", "", "licenceURL", "licenceKey", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/Function2;", "", "Lkotlin/r0;", "name", "level", "log", "onLog", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;Lld/p;)V", "h", "Lc4/a;", "b", "Lkotlin/b0;", "d", "()Lc4/a;", "logger", "c", "Z", "isInited", "isInInitializing", "enableLogFile", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTXLiveManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TXLiveManager.kt\ncom/cby/txliteav/live/impl/tx/TXLiveManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f46615a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final b0 logger = c0.c(b.f46622b);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile boolean isInited;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static boolean isInInitializing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static boolean enableLogFile;

    /* compiled from: TXLiveManager.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"com/cby/txliteav/live/impl/tx/d$a", "Lcom/tencent/live2/V2TXLivePremier$V2TXLivePremierObserver;", "", "result", "", "reason", "Lkotlin/k2;", "onLicenceLoaded", "(ILjava/lang/String;)V", "level", "log", "onLog", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends V2TXLivePremier.V2TXLivePremierObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46620a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p<Integer, String, k2> f46621b;

        /* JADX WARN: Multi-variable type inference failed */
        a(com.cby.txliteav.live.listener.a aVar, p<? super Integer, ? super String, k2> pVar) {
            this.f46620a = aVar;
            this.f46621b = pVar;
        }

        @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
        public void onLicenceLoaded(int result, @m String reason) {
            super.onLicenceLoaded(result, reason);
            d dVar = d.f46615a;
            d.isInInitializing = false;
            dVar.d().c(ProtectedSandApp.s("൰") + result + ProtectedSandApp.s("൱") + reason);
            if (result != 0) {
                com.cby.txliteav.live.listener.a aVar = this.f46620a;
                if (aVar != null) {
                    aVar.b(Integer.valueOf(result), reason);
                    return;
                }
                return;
            }
            d.isInited = true;
            com.cby.txliteav.live.listener.a aVar2 = this.f46620a;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
        public void onLog(int level, @m String log) {
            p<Integer, String, k2> pVar;
            super.onLog(level, log);
            if (log == null || (pVar = this.f46621b) == null) {
                return;
            }
            pVar.invoke(Integer.valueOf(level), log);
        }
    }

    /* compiled from: TXLiveManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc4/a;", "a", "()Lc4/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.a<c4.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f46622b = new b(0);

        b() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4.a invoke() {
            return new c4.a(d.f46615a.getClass());
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c4.a d() {
        return (c4.a) logger.getValue();
    }

    public final synchronized void e(@l Context context, @l String licenceURL, @l String licenceKey, @m com.cby.txliteav.live.listener.a callback, @m p<? super Integer, ? super String, k2> onLog) {
        Object a5;
        String s4 = ProtectedSandApp.s("൲");
        String s5 = ProtectedSandApp.s("൳");
        synchronized (this) {
            l0.p(context, ProtectedSandApp.s("൴"));
            l0.p(licenceURL, ProtectedSandApp.s("൵"));
            l0.p(licenceKey, ProtectedSandApp.s("൶"));
            if (isInInitializing) {
                return;
            }
            isInInitializing = true;
            if (isInited) {
                isInInitializing = false;
                if (callback != null) {
                    callback.a();
                }
                return;
            }
            String str = context.getApplicationInfo().packageName;
            d().c(s5 + str);
            V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new V2TXLiveDef.V2TXLiveLogConfig();
            v2TXLiveLogConfig.enableConsole = true;
            v2TXLiveLogConfig.enableObserver = true;
            if (enableLogFile) {
                v2TXLiveLogConfig.enableLogFile = true;
                try {
                    z0.Companion companion = z0.INSTANCE;
                    File externalCacheDir = context.getExternalCacheDir();
                    File file = new File((externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + ProtectedSandApp.s("൷"));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    v2TXLiveLogConfig.logPath = file.getAbsolutePath();
                    f46615a.d().c(s4 + file.getAbsolutePath());
                    a5 = k2.f75408a;
                } catch (Throwable th) {
                    z0.Companion companion2 = z0.INSTANCE;
                    a5 = a1.a(th);
                }
                Throwable e4 = z0.e(a5);
                if (e4 != null) {
                    e4.printStackTrace();
                }
            }
            V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
            V2TXLivePremier.setObserver(new a(callback, onLog));
            V2TXLivePremier.setLicence(context, licenceURL, licenceKey);
        }
    }

    public final void g(boolean print) {
        c4.a.INSTANCE.getClass();
        c4.a.f38597c = print;
    }

    public final void h() {
        isInited = false;
        isInInitializing = false;
    }
}
