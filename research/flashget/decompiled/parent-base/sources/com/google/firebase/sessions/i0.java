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
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: SessionLifecycleClient.kt */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u00010\b\u0000\u0018\u0000 42\u00020\u0001:\u0002\"%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/google/firebase/sessions/i0;", "", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/g;)V", "", "messageCode", "Lkotlin/k2;", "n", "(I)V", "", "Landroid/os/Message;", "messages", "Lkotlinx/coroutines/k2;", "o", "(Ljava/util/List;)Lkotlinx/coroutines/k2;", "msg", "p", "(Landroid/os/Message;)V", "m", "", "j", "()Ljava/util/List;", "msgCode", "l", "(Ljava/util/List;I)Landroid/os/Message;", "Lcom/google/firebase/sessions/j0;", "sessionLifecycleServiceBinder", "i", "(Lcom/google/firebase/sessions/j0;)V", "k", "()V", "h", "a", "Lkotlin/coroutines/g;", "Landroid/os/Messenger;", "b", "Landroid/os/Messenger;", "service", "", "c", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "d", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "com/google/firebase/sessions/i0$d", "e", "Lcom/google/firebase/sessions/i0$d;", "serviceConnection", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n766#2:219\n857#2,2:220\n1963#2,14:222\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient\n*L\n206#1:219\n206#1:220,2\n206#1:222,14\n*E\n"})
/* loaded from: classes6.dex */
public final class i0 {

    /* renamed from: h, reason: collision with root package name */
    private static final int f60906h = 20;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Messenger service;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean serviceBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final LinkedBlockingDeque<Message> queuedMessages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d serviceConnection;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    public static final String f60905g = ProtectedSandApp.s("Ӿ\u0001");

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/i0$a;", "Landroid/os/Handler;", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Lkotlin/coroutines/g;)V", "", "sessionId", "Lkotlin/k2;", "a", "(Ljava/lang/String;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "Lkotlin/coroutines/g;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final kotlin.coroutines.g backgroundDispatcher;

        /* compiled from: SessionLifecycleClient.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1855#2,2:219\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1\n*L\n74#1:219,2\n*E\n"})
        /* renamed from: com.google.firebase.sessions.i0$a$a, reason: collision with other inner class name */
        static final class C0940a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f60913b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f60914c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0940a(String str, kotlin.coroutines.d<? super C0940a> dVar) {
                super(2, dVar);
                this.f60914c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0940a(this.f60914c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f60913b;
                if (i4 == 0) {
                    a1.n(obj);
                    com.google.firebase.sessions.api.a aVar2 = com.google.firebase.sessions.api.a.f60788a;
                    this.f60913b = 1;
                    obj = aVar2.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("ӹ\u0001"));
                    }
                    a1.n(obj);
                }
                Collection<com.google.firebase.sessions.api.b> values = ((Map) obj).values();
                String str = this.f60914c;
                for (com.google.firebase.sessions.api.b bVar : values) {
                    bVar.c(new b.C0938b(str));
                    Objects.toString(bVar.b());
                }
                return k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((C0940a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@fg.l kotlin.coroutines.g gVar) {
            super(Looper.getMainLooper());
            kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("Ӻ\u0001"));
            this.backgroundDispatcher = gVar;
        }

        private final void a(String sessionId) {
            kotlinx.coroutines.k.f(s0.a(this.backgroundDispatcher), null, null, new C0940a(sessionId, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@fg.l Message msg) {
            String str;
            kotlin.jvm.internal.l0.p(msg, ProtectedSandApp.s("ӻ\u0001"));
            if (msg.what != 3) {
                msg.toString();
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (str = data.getString(ProtectedSandApp.s("Ӽ\u0001"))) == null) {
                str = "";
            }
            a(str);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSessionLifecycleClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$sendLifecycleEvents$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n2624#2,3:219\n1045#2:222\n1855#2,2:223\n*S KotlinDebug\n*F\n+ 1 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$sendLifecycleEvents$1\n*L\n157#1:219,3\n165#1:222\n166#1:223,2\n*E\n"})
    static final class c extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60915b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Message> f60917d;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SessionLifecycleClient.kt\ncom/google/firebase/sessions/SessionLifecycleClient$sendLifecycleEvents$1\n*L\n1#1,328:1\n165#2:329\n*E\n"})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t4, T t5) {
                return kotlin.comparisons.a.l(Long.valueOf(((Message) t4).getWhen()), Long.valueOf(((Message) t5).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f60917d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return i0.this.new c(this.f60917d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60915b;
            if (i4 == 0) {
                a1.n(obj);
                com.google.firebase.sessions.api.a aVar2 = com.google.firebase.sessions.api.a.f60788a;
                this.f60915b = 1;
                obj = aVar2.c(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ӽ\u0001"));
                }
                a1.n(obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((com.google.firebase.sessions.api.b) it.next()).a()) {
                            List u5 = kotlin.collections.w.u5(kotlin.collections.w.s2(kotlin.collections.w.S(i0.this.l(this.f60917d, 2), i0.this.l(this.f60917d, 1))), new a());
                            i0 i0Var = i0.this;
                            Iterator it2 = u5.iterator();
                            while (it2.hasNext()) {
                                i0Var.p((Message) it2.next());
                            }
                        }
                    }
                }
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((c) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/google/firebase/sessions/i0$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "Lkotlin/k2;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@fg.m ComponentName className, @fg.m IBinder serviceBinder) {
            i0.this.queuedMessages.size();
            i0.this.service = new Messenger(serviceBinder);
            i0.this.serviceBound = true;
            i0 i0Var = i0.this;
            i0Var.o(i0Var.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@fg.m ComponentName className) {
            i0.this.service = null;
            i0.this.serviceBound = false;
        }
    }

    public i0(@fg.l kotlin.coroutines.g gVar) {
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("ӿ\u0001"));
        this.backgroundDispatcher = gVar;
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

    private final void m(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            int i4 = msg.what;
        } else {
            int i5 = msg.what;
            this.queuedMessages.size();
        }
    }

    private final void n(int messageCode) {
        List<Message> j4 = j();
        Message obtain = Message.obtain(null, messageCode, 0, 0);
        kotlin.jvm.internal.l0.o(obtain, ProtectedSandApp.s("Ԁ\u0001"));
        j4.add(obtain);
        o(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f9.a
    public final kotlinx.coroutines.k2 o(List<Message> messages) {
        kotlinx.coroutines.k2 f4;
        f4 = kotlinx.coroutines.k.f(s0.a(this.backgroundDispatcher), null, null, new c(messages, null), 3, null);
        return f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message msg) {
        Messenger messenger = this.service;
        if (messenger == null) {
            m(msg);
            return;
        }
        try {
            int i4 = msg.what;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException unused) {
            int i5 = msg.what;
            m(msg);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(@fg.l j0 sessionLifecycleServiceBinder) {
        kotlin.jvm.internal.l0.p(sessionLifecycleServiceBinder, ProtectedSandApp.s("ԁ\u0001"));
        sessionLifecycleServiceBinder.a(new Messenger(new a(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void k() {
        n(1);
    }
}
