package ha;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.k2;
import kotlin.x0;

/* compiled from: Messaging.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"", "to", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$b;", "Lkotlin/k2;", "Lkotlin/u;", "init", "Lcom/google/firebase/messaging/RemoteMessage;", "b", "(Ljava/lang/String;Lld/l;)Lcom/google/firebase/messaging/RemoteMessage;", "Lea/b;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "a", "(Lea/b;)Lcom/google/firebase/messaging/FirebaseMessaging;", "messaging", "com.google.firebase-firebase-messaging"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c {
    @l
    public static final FirebaseMessaging a(@l ea.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("㠂\u0001"));
        FirebaseMessaging y4 = FirebaseMessaging.y();
        l0.o(y4, ProtectedSandApp.s("㠃\u0001"));
        return y4;
    }

    @l
    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @x0(expression = "", imports = {}))
    public static final RemoteMessage b(@l String str, @l ld.l<? super RemoteMessage.b, k2> lVar) {
        l0.p(str, ProtectedSandApp.s("㠄\u0001"));
        l0.p(lVar, ProtectedSandApp.s("㠅\u0001"));
        RemoteMessage.b bVar = new RemoteMessage.b(str);
        lVar.invoke(bVar);
        RemoteMessage b5 = bVar.b();
        l0.o(b5, ProtectedSandApp.s("㠆\u0001"));
        return b5;
    }
}
