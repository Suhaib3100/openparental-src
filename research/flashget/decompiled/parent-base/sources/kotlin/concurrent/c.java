package kotlin.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kd.i;
import kotlin.Metadata;
import kotlin.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.w0;
import ld.l;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: Timer.kt */
@i(name = "TimersKt")
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u001a:\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a:\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aB\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aB\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001aB\u0010\u0014\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012\u001a!\u0010\u0019\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aV\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aT\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\u001d\u001aT\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\"\u0010 \u001a.\u0010#\u001a\u00020\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006%"}, d2 = {"Ljava/util/Timer;", "", "delay", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "Lkotlin/k2;", "Lkotlin/u;", "action", "f", "(Ljava/util/Timer;JLld/l;)Ljava/util/TimerTask;", "Ljava/util/Date;", "time", "h", "(Ljava/util/Timer;Ljava/util/Date;Lld/l;)Ljava/util/TimerTask;", "period", "e", "(Ljava/util/Timer;JJLld/l;)Ljava/util/TimerTask;", "g", "(Ljava/util/Timer;Ljava/util/Date;JLld/l;)Ljava/util/TimerTask;", "i", "j", "", "name", "", "daemon", "k", "(Ljava/lang/String;Z)Ljava/util/Timer;", "initialDelay", "l", "(Ljava/lang/String;ZJJLld/l;)Ljava/util/Timer;", "startAt", "m", "(Ljava/lang/String;ZLjava/util/Date;JLld/l;)Ljava/util/Timer;", "a", "b", "p", "(Lld/l;)Ljava/util/TimerTask;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {

    /* compiled from: Timer.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/concurrent/c$a", "Ljava/util/TimerTask;", "Lkotlin/k2;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nTimer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timer.kt\nkotlin/concurrent/TimersKt$timerTask$1\n*L\n1#1,148:1\n*E\n"})
    public static final class a extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<TimerTask, k2> f75040b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super TimerTask, k2> lVar) {
            this.f75040b = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f75040b.invoke(this);
        }
    }

    @f
    private static final Timer a(String str, boolean z4, long j4, long j5, l<? super TimerTask, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.scheduleAtFixedRate(new a(lVar), j4, j5);
        return k4;
    }

    @f
    private static final Timer b(String str, boolean z4, Date date, long j4, l<? super TimerTask, k2> lVar) {
        l0.p(date, ProtectedSandApp.s("拫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.scheduleAtFixedRate(new a(lVar), date, j4);
        return k4;
    }

    static /* synthetic */ Timer c(String str, boolean z4, long j4, long j5, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.scheduleAtFixedRate(new a(lVar), j4, j5);
        return k4;
    }

    static /* synthetic */ Timer d(String str, boolean z4, Date date, long j4, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        l0.p(date, ProtectedSandApp.s("拫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.scheduleAtFixedRate(new a(lVar), date, j4);
        return k4;
    }

    @f
    private static final TimerTask e(Timer timer, long j4, long j5, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.schedule(aVar, j4, j5);
        return aVar;
    }

    @f
    private static final TimerTask f(Timer timer, long j4, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.schedule(aVar, j4);
        return aVar;
    }

    @f
    private static final TimerTask g(Timer timer, Date date, long j4, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(date, ProtectedSandApp.s("拭\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.schedule(aVar, date, j4);
        return aVar;
    }

    @f
    private static final TimerTask h(Timer timer, Date date, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(date, ProtectedSandApp.s("拭\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @f
    private static final TimerTask i(Timer timer, long j4, long j5, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, j4, j5);
        return aVar;
    }

    @f
    private static final TimerTask j(Timer timer, Date date, long j4, l<? super TimerTask, k2> lVar) {
        l0.p(timer, ProtectedSandApp.s("括\u0001"));
        l0.p(date, ProtectedSandApp.s("拭\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j4);
        return aVar;
    }

    @fg.l
    @w0
    public static final Timer k(@m String str, boolean z4) {
        return str == null ? new Timer(z4) : new Timer(str, z4);
    }

    @f
    private static final Timer l(String str, boolean z4, long j4, long j5, l<? super TimerTask, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.schedule(new a(lVar), j4, j5);
        return k4;
    }

    @f
    private static final Timer m(String str, boolean z4, Date date, long j4, l<? super TimerTask, k2> lVar) {
        l0.p(date, ProtectedSandApp.s("拫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.schedule(new a(lVar), date, j4);
        return k4;
    }

    static /* synthetic */ Timer n(String str, boolean z4, long j4, long j5, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            j4 = 0;
        }
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.schedule(new a(lVar), j4, j5);
        return k4;
    }

    static /* synthetic */ Timer o(String str, boolean z4, Date date, long j4, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        l0.p(date, ProtectedSandApp.s("拫\u0001"));
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        Timer k4 = k(str, z4);
        k4.schedule(new a(lVar), date, j4);
        return k4;
    }

    @f
    private static final TimerTask p(l<? super TimerTask, k2> lVar) {
        l0.p(lVar, ProtectedSandApp.s("拪\u0001"));
        return new a(lVar);
    }
}
