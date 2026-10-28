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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.sessions.g0;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: SessionLifecycleService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0007\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0013\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "a", "(Landroid/content/Intent;)Landroid/os/Messenger;", "Lkotlin/k2;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "b", "Landroid/os/HandlerThread;", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "c", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", "d", "Landroid/os/Messenger;", "messenger", "e", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: i, reason: collision with root package name */
    public static final int f60741i = 1;

    /* renamed from: j, reason: collision with root package name */
    public static final int f60742j = 2;

    /* renamed from: k, reason: collision with root package name */
    public static final int f60743k = 3;

    /* renamed from: l, reason: collision with root package name */
    private static final int f60744l = 4;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final HandlerThread handlerThread = new HandlerThread(ProtectedSandApp.s("є\u0001"));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b messageHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Messenger messenger;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    public static final String f60738f = ProtectedSandApp.s("ё\u0001");

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f60739g = ProtectedSandApp.s("ђ\u0001");

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    public static final String f60740h = ProtectedSandApp.s("ѓ\u0001");

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00100\"j\b\u0012\u0004\u0012\u00020\u0010`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$b;", "Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Landroid/os/Message;", "msg", "Lkotlin/k2;", "d", "(Landroid/os/Message;)V", "b", "c", "g", "()V", "a", "Landroid/os/Messenger;", "client", "f", "(Landroid/os/Messenger;)V", "", "sessionId", "h", "(Landroid/os/Messenger;Ljava/lang/String;)V", "", "foregroundTimeMs", "", "e", "(J)Z", "handleMessage", "Z", "hasForegrounded", "J", "lastMsgTimeMs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "boundClients", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSessionLifecycleService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleService.kt\ncom/google/firebase/sessions/SessionLifecycleService$MessageHandler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1855#2,2:253\n1#3:255\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleService.kt\ncom/google/firebase/sessions/SessionLifecycleService$MessageHandler\n*L\n145#1:253,2\n*E\n"})
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean hasForegrounded;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long lastMsgTimeMs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ArrayList<Messenger> boundClients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@fg.l Looper looper) {
            super(looper);
            kotlin.jvm.internal.l0.p(looper, ProtectedSandApp.s("ь\u0001"));
            this.boundClients = new ArrayList<>();
        }

        private final void a() {
            g0.Companion companion = g0.INSTANCE;
            Objects.toString(companion.a().c());
            e0.INSTANCE.a().a(companion.a().c());
            for (Messenger messenger : new ArrayList(this.boundClients)) {
                kotlin.jvm.internal.l0.o(messenger, ProtectedSandApp.s("э\u0001"));
                f(messenger);
            }
        }

        private final void b(Message msg) {
            msg.getWhen();
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final void c(Message msg) {
            this.boundClients.add(msg.replyTo);
            Messenger messenger = msg.replyTo;
            kotlin.jvm.internal.l0.o(messenger, ProtectedSandApp.s("ю\u0001"));
            f(messenger);
            Objects.toString(msg.replyTo);
            msg.getWhen();
            this.boundClients.size();
        }

        private final void d(Message msg) {
            msg.getWhen();
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                g();
            } else if (e(msg.getWhen())) {
                g();
            }
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final boolean e(long foregroundTimeMs) {
            return foregroundTimeMs - this.lastMsgTimeMs > kotlin.time.e.M(com.google.firebase.sessions.settings.f.INSTANCE.c().c());
        }

        private final void f(Messenger client) {
            if (this.hasForegrounded) {
                h(client, g0.INSTANCE.a().c().h());
                return;
            }
            String a5 = z.INSTANCE.a().a();
            if (a5 != null) {
                h(client, a5);
            }
        }

        private final void g() {
            g0.Companion companion = g0.INSTANCE;
            companion.a().a();
            companion.a().c().h();
            a();
            z.INSTANCE.a().b(companion.a().c().h());
        }

        private final void h(Messenger client, String sessionId) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(ProtectedSandApp.s("я\u0001"), sessionId);
                Message obtain = Message.obtain(null, 3, 0, 0);
                obtain.setData(bundle);
                client.send(obtain);
            } catch (DeadObjectException unused) {
                Objects.toString(client);
                this.boundClients.remove(client);
            } catch (Exception unused2) {
                Objects.toString(client);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(@fg.l Message msg) {
            kotlin.jvm.internal.l0.p(msg, ProtectedSandApp.s("ѐ\u0001"));
            if (this.lastMsgTimeMs > msg.getWhen()) {
                msg.getWhen();
                return;
            }
            int i4 = msg.what;
            if (i4 == 1) {
                d(msg);
                return;
            }
            if (i4 == 2) {
                b(msg);
            } else if (i4 == 4) {
                c(msg);
            } else {
                msg.toString();
                super.handleMessage(msg);
            }
        }
    }

    private final Messenger a(Intent intent) {
        Object parcelableExtra;
        int i4 = Build.VERSION.SDK_INT;
        String s4 = ProtectedSandApp.s("ђ\u0001");
        if (i4 < 33) {
            return (Messenger) intent.getParcelableExtra(s4);
        }
        parcelableExtra = intent.getParcelableExtra(s4, Messenger.class);
        return (Messenger) parcelableExtra;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    @Override // android.app.Service
    @fg.m
    public IBinder onBind(@fg.m Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger a5 = a(intent);
        if (a5 != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = a5;
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
        kotlin.jvm.internal.l0.o(looper, ProtectedSandApp.s("ѕ\u0001"));
        this.messageHandler = new b(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
