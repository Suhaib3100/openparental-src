package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.sessions.api.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.m2;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: SessionLifecycleClient.kt */
@Metadata(d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0001%\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002\u0016\u001aB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002J \u0010\u0011\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0004R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/google/firebase/sessions/h0;", "", "", "messageCode", "Lkotlin/m2;", "n", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/n2;", "o", "msg", "p", "m", "", "j", "msgCode", "l", "i", "k", "h", "Lkotlin/coroutines/g;", "a", "Lkotlin/coroutines/g;", "backgroundDispatcher", "Landroid/os/Messenger;", "b", "Landroid/os/Messenger;", "service", "", "c", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "d", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "com/google/firebase/sessions/h0$d", "e", "Lcom/google/firebase/sessions/h0$d;", "serviceConnection", "<init>", "(Lkotlin/coroutines/g;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: h, reason: collision with root package name */
    private static final int f18632h = 20;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.e
    private Messenger service;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean serviceBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final LinkedBlockingDeque<Message> queuedMessages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final d serviceConnection;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    public static final String f18631g = ProtectedSandApp.s("᪷");

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/h0$a;", "Landroid/os/Handler;", "", "sessionId", "Lkotlin/m2;", "a", "Landroid/os/Message;", "msg", "handleMessage", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/g;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final CoroutineContext backgroundDispatcher;

        /* compiled from: SessionLifecycleClient.kt */
        @DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.google.firebase.sessions.h0$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0233a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f18639s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f18640t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0233a(String str, Continuation<? super C0233a> continuation) {
                super(2, continuation);
                this.f18640t = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.f18639s;
                if (i5 == 0) {
                    a1.n(obj);
                    com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.f18518a;
                    this.f18639s = 1;
                    obj = aVar.c(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("㍖"));
                    }
                    a1.n(obj);
                }
                Collection<com.google.firebase.sessions.api.b> values = ((Map) obj).values();
                String str = this.f18640t;
                for (com.google.firebase.sessions.api.b bVar : values) {
                    bVar.c(new b.C0231b(str));
                    Objects.toString(bVar.b());
                }
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
                return ((C0233a) c(u0Var, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                return new C0233a(this.f18640t, continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@d5.d CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.l0.p(coroutineContext, ProtectedSandApp.s("᪴"));
            this.backgroundDispatcher = coroutineContext;
        }

        private final void a(String str) {
            kotlinx.coroutines.l.f(v0.a(this.backgroundDispatcher), null, null, new C0233a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@d5.d Message message) {
            String str;
            kotlin.jvm.internal.l0.p(message, ProtectedSandApp.s("᪵"));
            if (message.what != 3) {
                message.toString();
                super.handleMessage(message);
                return;
            }
            Bundle data = message.getData();
            if (data == null || (str = data.getString(ProtectedSandApp.s("᪶"))) == null) {
                str = "";
            }
            a(str);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class c extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18641s;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ List<Message> f18643u;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes2.dex */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t6) {
                int l5;
                l5 = kotlin.comparisons.g.l(Long.valueOf(((Message) t5).getWhen()), Long.valueOf(((Message) t6).getWhen()));
                return l5;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f18643u = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            boolean z5;
            List S;
            List s22;
            List u5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18641s;
            if (i5 == 0) {
                a1.n(obj);
                com.google.firebase.sessions.api.a aVar = com.google.firebase.sessions.api.a.f18518a;
                this.f18641s = 1;
                obj = aVar.c(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍗"));
                }
                a1.n(obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((com.google.firebase.sessions.api.b) it.next()).a()) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                if (!z5) {
                    S = kotlin.collections.a0.S(h0.this.l(this.f18643u, 2), h0.this.l(this.f18643u, 1));
                    s22 = kotlin.collections.j0.s2(S);
                    u5 = kotlin.collections.j0.u5(s22, new a());
                    h0 h0Var = h0.this;
                    Iterator it2 = u5.iterator();
                    while (it2.hasNext()) {
                        h0Var.p((Message) it2.next());
                    }
                }
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return h0.this.new c(this.f18643u, continuation);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/google/firebase/sessions/h0$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "Lkotlin/m2;", "onServiceConnected", "onServiceDisconnected", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@d5.e ComponentName componentName, @d5.e IBinder iBinder) {
            h0.this.queuedMessages.size();
            h0.this.service = new Messenger(iBinder);
            h0.this.serviceBound = true;
            h0 h0Var = h0.this;
            h0Var.o(h0Var.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@d5.e ComponentName componentName) {
            h0.this.service = null;
            h0.this.serviceBound = false;
        }
    }

    public h0(@d5.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.l0.p(coroutineContext, ProtectedSandApp.s("᪸"));
        this.backgroundDispatcher = coroutineContext;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void m(Message message) {
        if (!this.queuedMessages.offer(message)) {
            int i5 = message.what;
        } else {
            int i6 = message.what;
            this.queuedMessages.size();
        }
    }

    private final void n(int i5) {
        List<Message> j5 = j();
        Message obtain = Message.obtain(null, i5, 0, 0);
        kotlin.jvm.internal.l0.o(obtain, ProtectedSandApp.s("᪹"));
        j5.add(obtain);
        o(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n2 o(List<Message> messages) {
        n2 f6;
        f6 = kotlinx.coroutines.l.f(v0.a(this.backgroundDispatcher), null, null, new c(messages, null), 3, null);
        return f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message message) {
        Messenger messenger = this.service;
        if (messenger == null) {
            m(message);
            return;
        }
        try {
            int i5 = message.what;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException unused) {
            int i6 = message.what;
            m(message);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i() {
        i0.INSTANCE.a().a(new Messenger(new a(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void k() {
        n(1);
    }
}
