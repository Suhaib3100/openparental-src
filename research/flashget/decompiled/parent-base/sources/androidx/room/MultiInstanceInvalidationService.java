package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.f0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: MultiInstanceInvalidationService.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\n\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "b", "I", "c", "()I", "d", "(I)V", "maxClientId", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "clientNames", "Landroid/os/RemoteCallbackList;", "Landroidx/room/e0;", "Landroid/os/RemoteCallbackList;", "a", "()Landroid/os/RemoteCallbackList;", "callbackList", "Landroidx/room/f0$b;", "e", "Landroidx/room/f0$b;", "binder", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@z
/* loaded from: classes3.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxClientId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<Integer, String> clientNames = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final RemoteCallbackList<e0> callbackList = new b();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f0.b binder = new a();

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/f0$b;", "Landroidx/room/e0;", "callback", "", "name", "", "r", "(Landroidx/room/e0;Ljava/lang/String;)I", "clientId", "Lkotlin/k2;", "D", "(Landroidx/room/e0;I)V", "", "tables", "n", "(I[Ljava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends f0.b {
        a() {
        }

        @Override // androidx.room.f0
        public void D(@fg.l e0 callback, int clientId) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            RemoteCallbackList<e0> a5 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a5) {
                multiInstanceInvalidationService.a().unregister(callback);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(clientId));
            }
        }

        @Override // androidx.room.f0
        public void n(int clientId, @fg.l String[] tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            RemoteCallbackList<e0> a5 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a5) {
                try {
                    String str = multiInstanceInvalidationService.b().get(Integer.valueOf(clientId));
                    if (str == null) {
                        return;
                    }
                    int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                    for (int i4 = 0; i4 < beginBroadcast; i4++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i4);
                            kotlin.jvm.internal.l0.n(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int intValue = num.intValue();
                            String str2 = multiInstanceInvalidationService.b().get(num);
                            if (clientId != intValue && kotlin.jvm.internal.l0.g(str, str2)) {
                                try {
                                    multiInstanceInvalidationService.a().getBroadcastItem(i4).e(tables);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.a().finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.a().finishBroadcast();
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.room.f0
        public int r(@fg.l e0 callback, @fg.m String name) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            int i4 = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<e0> a5 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a5) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(maxClientId), name);
                        i4 = maxClientId;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i4;
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/e0;", "callback", "", "cookie", "Lkotlin/k2;", "a", "(Landroidx/room/e0;Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends RemoteCallbackList<e0> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(@fg.l e0 callback, @fg.l Object cookie) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            kotlin.jvm.internal.l0.p(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    @fg.l
    public final RemoteCallbackList<e0> a() {
        return this.callbackList;
    }

    @fg.l
    public final Map<Integer, String> b() {
        return this.clientNames;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void d(int i4) {
        this.maxClientId = i4;
    }

    @Override // android.app.Service
    @fg.l
    public IBinder onBind(@fg.l Intent intent) {
        kotlin.jvm.internal.l0.p(intent, "intent");
        return this.binder;
    }
}
