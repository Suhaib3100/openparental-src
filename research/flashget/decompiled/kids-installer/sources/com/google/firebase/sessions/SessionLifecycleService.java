package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.sessions.f0;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.time.Duration;

/* compiled from: SessionLifecycleService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0005\u000eB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "a", "Lkotlin/m2;", "onCreate", "Landroid/os/IBinder;", "onBind", "onDestroy", "Landroid/os/HandlerThread;", "o", "Landroid/os/HandlerThread;", "b", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "p", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", "q", "Landroid/os/Messenger;", "messenger", "<init>", "()V", "r", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: v, reason: collision with root package name */
    public static final int f18498v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f18499w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final int f18500x = 3;

    /* renamed from: y, reason: collision with root package name */
    private static final int f18501y = 4;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final HandlerThread handlerThread = new HandlerThread(ProtectedSandApp.s("ᨴ"));

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private b messageHandler;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private Messenger messenger;

    /* renamed from: s, reason: collision with root package name */
    @d5.d
    public static final String f18495s = ProtectedSandApp.s("ᨱ");

    /* renamed from: t, reason: collision with root package name */
    @d5.d
    public static final String f18496t = ProtectedSandApp.s("ᨲ");

    /* renamed from: u, reason: collision with root package name */
    @d5.d
    public static final String f18497u = ProtectedSandApp.s("ᨳ");

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0019j\b\u0012\u0004\u0012\u00020\n`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$b;", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "Lkotlin/m2;", "d", "b", "c", "g", "a", "Landroid/os/Messenger;", "client", "f", "", "sessionId", "h", "", "foregroundTimeMs", "", "e", "handleMessage", "Z", "hasForegrounded", "J", "lastMsgTimeMs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "boundClients", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean hasForegrounded;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long lastMsgTimeMs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final ArrayList<Messenger> boundClients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@d5.d Looper looper) {
            super(looper);
            kotlin.jvm.internal.l0.p(looper, ProtectedSandApp.s("ᨬ"));
            this.boundClients = new ArrayList<>();
        }

        private final void a() {
            f0.Companion companion = f0.INSTANCE;
            Objects.toString(companion.a().c());
            d0.INSTANCE.a().a(companion.a().c());
            for (Messenger messenger : new ArrayList(this.boundClients)) {
                kotlin.jvm.internal.l0.o(messenger, ProtectedSandApp.s("ᨭ"));
                f(messenger);
            }
        }

        private final void b(Message message) {
            message.getWhen();
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void c(Message message) {
            this.boundClients.add(message.replyTo);
            Messenger messenger = message.replyTo;
            kotlin.jvm.internal.l0.o(messenger, ProtectedSandApp.s("ᨮ"));
            f(messenger);
            Objects.toString(message.replyTo);
            message.getWhen();
            this.boundClients.size();
        }

        private final void d(Message message) {
            message.getWhen();
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                g();
            } else if (e(message.getWhen())) {
                g();
            }
            this.lastMsgTimeMs = message.getWhen();
        }

        private final boolean e(long foregroundTimeMs) {
            return foregroundTimeMs - this.lastMsgTimeMs > Duration.S(com.google.firebase.sessions.settings.f.INSTANCE.c().c());
        }

        private final void f(Messenger messenger) {
            if (this.hasForegrounded) {
                h(messenger, f0.INSTANCE.a().c().h());
                return;
            }
            String a6 = y.INSTANCE.a().a();
            if (a6 != null) {
                h(messenger, a6);
            }
        }

        private final void g() {
            f0.Companion companion = f0.INSTANCE;
            companion.a().a();
            companion.a().c().h();
            a();
            y.INSTANCE.a().b(companion.a().c().h());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(ProtectedSandApp.s("ᨯ"), str);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Objects.toString(messenger);
                this.boundClients.remove(messenger);
            } catch (Exception unused2) {
                Objects.toString(messenger);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@d5.d Message message) {
            kotlin.jvm.internal.l0.p(message, ProtectedSandApp.s("ᨰ"));
            if (this.lastMsgTimeMs > message.getWhen()) {
                message.getWhen();
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                d(message);
                return;
            }
            if (i5 == 2) {
                b(message);
            } else if (i5 == 4) {
                c(message);
            } else {
                message.toString();
                super.handleMessage(message);
            }
        }
    }

    private final Messenger a(Intent intent) {
        int i5 = Build.VERSION.SDK_INT;
        String s5 = ProtectedSandApp.s("ᨵ");
        return i5 >= 33 ? (Messenger) intent.getParcelableExtra(s5, Messenger.class) : (Messenger) intent.getParcelableExtra(s5);
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    @Override // android.app.Service
    @d5.e
    public IBinder onBind(@d5.e Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger a6 = a(intent);
        if (a6 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a6;
            b bVar = this.messageHandler;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        kotlin.jvm.internal.l0.o(looper, ProtectedSandApp.s("ᨶ"));
        this.messageHandler = new b(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
