package kotlinx.coroutines.channels;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlinx.coroutines.channels.g0;
import kotlinx.coroutines.channels.k0;
import kotlinx.coroutines.internal.t0;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/n;", "E", "Lkotlinx/coroutines/channels/k0;", "Lkotlinx/coroutines/channels/g0;", "h", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface n<E> extends k0<E>, g0<E> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f27354i = Integer.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public static final int f27355j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f27356k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f27357l = -2;

    /* renamed from: m, reason: collision with root package name */
    public static final int f27358m = -3;

    /* renamed from: n, reason: collision with root package name */
    @d5.d
    public static final String f27359n = ProtectedSandApp.s("峎");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f27360a;

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a {
        @d5.d
        public static <E> kotlinx.coroutines.selects.d<E> b(@d5.d n<E> nVar) {
            return new g0.a.C0409a(nVar);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@d5.d n<E> nVar, E e6) {
            return k0.a.c(nVar, e6);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @d5.e
        public static <E> E d(@d5.d n<E> nVar) {
            return (E) g0.a.h(nVar);
        }

        @LowPriorityInOverloadResolution
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @d5.e
        public static <E> Object e(@d5.d n<E> nVar, @d5.d Continuation<? super E> continuation) {
            return g0.a.i(nVar, continuation);
        }
    }

    /* compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/n$b;", "", "", "b", "I", "UNLIMITED", "c", "RENDEZVOUS", "d", "CONFLATED", "e", "BUFFERED", "f", "OPTIONAL_CHANNEL", "", "g", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "h", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.n$b, reason: from kotlin metadata */
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
        @d5.d
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = ProtectedSandApp.s("峇");

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f27360a = new Companion();

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final int CHANNEL_DEFAULT_CAPACITY = t0.b(ProtectedSandApp.s("峈"), 64, 1, 2147483646);

        private Companion() {
        }

        public final int a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
