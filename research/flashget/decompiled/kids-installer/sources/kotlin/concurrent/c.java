package kotlin.concurrent;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import org.apache.log4j.net.SyslogAppender;
import p3.i;
import q3.l;

/* compiled from: Timer.kt */
@i(name = "TimersKt")
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aM\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a'\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: Timer.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @SourceDebugExtension({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class a extends TimerTask {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l<TimerTask, m2> f23277o;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, m2> lVar) {
            this.f23277o = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f23277o.N(this);
        }
    }

    @InlineOnly
    private static final Timer a(String str, boolean z5, long j5, long j6, l<? super TimerTask, m2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㹶"));
        Timer k5 = k(str, z5);
        k5.scheduleAtFixedRate(new a(lVar), j5, j6);
        return k5;
    }

    @InlineOnly
    private static final Timer b(String str, boolean z5, Date date, long j5, l<? super TimerTask, m2> lVar) {
        l0.p(date, ProtectedSandApp.s("㹷"));
        l0.p(lVar, ProtectedSandApp.s("㹸"));
        Timer k5 = k(str, z5);
        k5.scheduleAtFixedRate(new a(lVar), date, j5);
        return k5;
    }

    static /* synthetic */ Timer c(String str, boolean z5, long j5, long j6, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            j5 = 0;
        }
        l0.p(lVar, ProtectedSandApp.s("㹹"));
        Timer k5 = k(str, z5);
        k5.scheduleAtFixedRate(new a(lVar), j5, j6);
        return k5;
    }

    static /* synthetic */ Timer d(String str, boolean z5, Date date, long j5, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        l0.p(date, ProtectedSandApp.s("㹺"));
        l0.p(lVar, ProtectedSandApp.s("㹻"));
        Timer k5 = k(str, z5);
        k5.scheduleAtFixedRate(new a(lVar), date, j5);
        return k5;
    }

    @InlineOnly
    private static final TimerTask e(Timer timer, long j5, long j6, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㹼"));
        l0.p(lVar, ProtectedSandApp.s("㹽"));
        a aVar = new a(lVar);
        timer.schedule(aVar, j5, j6);
        return aVar;
    }

    @InlineOnly
    private static final TimerTask f(Timer timer, long j5, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㹾"));
        l0.p(lVar, ProtectedSandApp.s("㹿"));
        a aVar = new a(lVar);
        timer.schedule(aVar, j5);
        return aVar;
    }

    @InlineOnly
    private static final TimerTask g(Timer timer, Date date, long j5, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㺀"));
        l0.p(date, ProtectedSandApp.s("㺁"));
        l0.p(lVar, ProtectedSandApp.s("㺂"));
        a aVar = new a(lVar);
        timer.schedule(aVar, date, j5);
        return aVar;
    }

    @InlineOnly
    private static final TimerTask h(Timer timer, Date date, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㺃"));
        l0.p(date, ProtectedSandApp.s("㺄"));
        l0.p(lVar, ProtectedSandApp.s("㺅"));
        a aVar = new a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @InlineOnly
    private static final TimerTask i(Timer timer, long j5, long j6, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㺆"));
        l0.p(lVar, ProtectedSandApp.s("㺇"));
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, j5, j6);
        return aVar;
    }

    @InlineOnly
    private static final TimerTask j(Timer timer, Date date, long j5, l<? super TimerTask, m2> lVar) {
        l0.p(timer, ProtectedSandApp.s("㺈"));
        l0.p(date, ProtectedSandApp.s("㺉"));
        l0.p(lVar, ProtectedSandApp.s("㺊"));
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j5);
        return aVar;
    }

    @PublishedApi
    @d5.d
    public static final Timer k(@e String str, boolean z5) {
        return str == null ? new Timer(z5) : new Timer(str, z5);
    }

    @InlineOnly
    private static final Timer l(String str, boolean z5, long j5, long j6, l<? super TimerTask, m2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㺋"));
        Timer k5 = k(str, z5);
        k5.schedule(new a(lVar), j5, j6);
        return k5;
    }

    @InlineOnly
    private static final Timer m(String str, boolean z5, Date date, long j5, l<? super TimerTask, m2> lVar) {
        l0.p(date, ProtectedSandApp.s("㺌"));
        l0.p(lVar, ProtectedSandApp.s("㺍"));
        Timer k5 = k(str, z5);
        k5.schedule(new a(lVar), date, j5);
        return k5;
    }

    static /* synthetic */ Timer n(String str, boolean z5, long j5, long j6, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        if ((i5 & 4) != 0) {
            j5 = 0;
        }
        l0.p(lVar, ProtectedSandApp.s("㺎"));
        Timer k5 = k(str, z5);
        k5.schedule(new a(lVar), j5, j6);
        return k5;
    }

    static /* synthetic */ Timer o(String str, boolean z5, Date date, long j5, l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = null;
        }
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        l0.p(date, ProtectedSandApp.s("㺏"));
        l0.p(lVar, ProtectedSandApp.s("㺐"));
        Timer k5 = k(str, z5);
        k5.schedule(new a(lVar), date, j5);
        return k5;
    }

    @InlineOnly
    private static final TimerTask p(l<? super TimerTask, m2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("㺑"));
        return new a(lVar);
    }
}
