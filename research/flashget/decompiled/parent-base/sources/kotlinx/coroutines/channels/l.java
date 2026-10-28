package kotlinx.coroutines.channels;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.x0;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.channels.e0;
import kotlinx.coroutines.internal.v0;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/l;", "E", "Lkotlinx/coroutines/channels/e0;", "Lkotlinx/coroutines/channels/d0;", "q2", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface l<E> extends e0<E>, d0<E> {

    /* renamed from: r2, reason: collision with root package name */
    public static final int f79392r2 = Integer.MAX_VALUE;

    /* renamed from: s2, reason: collision with root package name */
    public static final int f79393s2 = 0;

    /* renamed from: t2, reason: collision with root package name */
    public static final int f79394t2 = -1;

    /* renamed from: u2, reason: collision with root package name */
    public static final int f79395u2 = -2;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f79396v2 = -3;

    /* renamed from: w2, reason: collision with root package name */
    @fg.l
    public static final String f79397w2 = ProtectedSandApp.s("薱\u0001");

    /* renamed from: q2, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f79398a;

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @fg.l
        public static <E> kotlinx.coroutines.selects.g<E> b(@fg.l l<E> lVar) {
            return d0.a.d(lVar);
        }

        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @x0(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@fg.l l<E> lVar, E e4) {
            return e0.a.c(lVar, e4);
        }

        @fg.m
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @x0(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E d(@fg.l l<E> lVar) {
            return (E) d0.a.h(lVar);
        }

        @fg.m
        @kotlin.internal.h
        @kotlin.k(level = kotlin.m.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @x0(expression = "receiveCatching().getOrNull()", imports = {}))
        public static <E> Object e(@fg.l l<E> lVar, @fg.l kotlin.coroutines.d<? super E> dVar) {
            return d0.a.i(lVar, dVar);
        }
    }

    /* compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/l$b;", "", "<init>", "()V", "", "b", "I", "UNLIMITED", "c", "RENDEZVOUS", "d", "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", "g", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "h", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.l$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final int UNLIMITED = Integer.MAX_VALUE;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final int RENDEZVOUS = 0;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final int CONFLATED = -1;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final int BUFFERED = -2;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final int OPTIONAL_CHANNEL = -3;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = ProtectedSandApp.s("虖\u0001");

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f79398a = new Companion();

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final int CHANNEL_DEFAULT_CAPACITY = v0.b(ProtectedSandApp.s("虖\u0001"), 64, 1, 2147483646);

        private Companion() {
        }

        public final int a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
