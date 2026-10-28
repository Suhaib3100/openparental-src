package x2;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import d5.d;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import q3.l;

/* compiled from: Messaging.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0019\b\u0004\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0015\u0010\u000f\u001a\u00020\r*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"", "to", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$b;", "Lkotlin/m2;", "Lkotlin/u;", "init", "Lcom/google/firebase/messaging/RemoteMessage;", "b", "a", "Ljava/lang/String;", "LIBRARY_NAME", "Lu2/b;", "Lcom/google/firebase/messaging/FirebaseMessaging;", "(Lu2/b;)Lcom/google/firebase/messaging/FirebaseMessaging;", "messaging", "com.google.firebase-firebase-messaging-ktx"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final String f34150a = ProtectedSandApp.s("ᮨ");

    @d
    public static final FirebaseMessaging a(@d u2.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᮣ"));
        FirebaseMessaging u5 = FirebaseMessaging.u();
        l0.o(u5, ProtectedSandApp.s("ᮤ"));
        return u5;
    }

    @d
    public static final RemoteMessage b(@d String str, @d l<? super RemoteMessage.b, m2> lVar) {
        l0.p(str, ProtectedSandApp.s("ᮥ"));
        l0.p(lVar, ProtectedSandApp.s("ᮦ"));
        RemoteMessage.b bVar = new RemoteMessage.b(str);
        lVar.N(bVar);
        RemoteMessage b6 = bVar.b();
        l0.o(b6, ProtectedSandApp.s("ᮧ"));
        return b6;
    }
}
