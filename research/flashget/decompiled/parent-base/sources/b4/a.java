package b4;

import android.view.View;
import androidx.annotation.g0;
import androidx.annotation.x;
import com.cby.txliteav.live.g;
import com.cby.txliteav.live.i;
import com.cby.txliteav.live.j;
import com.cby.txliteav.live.l;
import com.cby.txliteav.live.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;

/* compiled from: ILivePlayer.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0010\u001a\u00020\u00062\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00122\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H&¢\u0006\u0004\b%\u0010$J\u001b\u0010&\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b(\u0010'J\u001b\u0010)\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b)\u0010'J\u001b\u0010*\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b*\u0010'J\u001b\u0010+\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b+\u0010'J\u001b\u0010,\u001a\u00020\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b,\u0010'J#\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H&¢\u0006\u0004\b1\u0010$J#\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u001c2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b3\u00104J+\u00107\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u00122\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b7\u00108J3\u0010=\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u001c2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b=\u0010>J#\u0010?\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u001c2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b?\u00104J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u001cH&¢\u0006\u0004\bA\u0010BJ\u0019\u0010E\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010CH&¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lb4/a;", "", "Landroid/view/View;", "view", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/i;", "fillMode", "I", "(Lcom/cby/txliteav/live/i;Lcom/cby/txliteav/live/listener/a;)V", "", "minTime", "maxTime", "v", "(FFLcom/cby/txliteav/live/listener/a;)V", "", "volume", "H", "(ILcom/cby/txliteav/live/listener/a;)V", "intervalMs", "t", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "", "isPlaying", "()Z", "", "url", "u", "(Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "Z", "()V", "R", "r", "(Lcom/cby/txliteav/live/listener/a;)V", "A", "J", "d", "a", "e", "Lcom/cby/txliteav/live/j;", "params", "o", "(Lcom/cby/txliteav/live/j;Lcom/cby/txliteav/live/listener/a;)V", "X", "mute", "T", "(ZLcom/cby/txliteav/live/listener/a;)V", "enable", "payloadType", "W", "(ZILcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "L", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "f", "isShow", "showDebugView", "(Z)V", "Lcom/cby/txliteav/live/listener/b;", "listener", "S", "(Lcom/cby/txliteav/live/listener/b;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ILivePlayer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b4.a$a, reason: collision with other inner class name */
    public static final class C0655a {
        public static /* synthetic */ void a(a aVar, boolean z4, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¦"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.f(z4, aVar2);
        }

        public static /* synthetic */ void b(a aVar, boolean z4, l lVar, g gVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("§"));
            }
            if ((i4 & 8) != 0) {
                aVar2 = null;
            }
            aVar.L(z4, lVar, gVar, aVar2);
        }

        public static /* synthetic */ void c(a aVar, boolean z4, int i4, com.cby.txliteav.live.listener.a aVar2, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¨"));
            }
            if ((i5 & 4) != 0) {
                aVar2 = null;
            }
            aVar.W(z4, i4, aVar2);
        }

        public static /* synthetic */ void d(a aVar, int i4, com.cby.txliteav.live.listener.a aVar2, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("©"));
            }
            if ((i5 & 2) != 0) {
                aVar2 = null;
            }
            aVar.t(i4, aVar2);
        }

        public static /* synthetic */ void e(a aVar, boolean z4, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("ª"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.T(z4, aVar2);
        }

        public static /* synthetic */ void f(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("«"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.J(aVar2);
        }

        public static /* synthetic */ void g(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¬"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.a(aVar2);
        }

        public static /* synthetic */ void h(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("\u00ad"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.A(aVar2);
        }

        public static /* synthetic */ void i(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("®"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.d(aVar2);
        }

        public static /* synthetic */ void j(a aVar, float f4, float f5, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¯"));
            }
            if ((i4 & 1) != 0) {
                f4 = 1.0f;
            }
            if ((i4 & 2) != 0) {
                f5 = 5.0f;
            }
            if ((i4 & 4) != 0) {
                aVar2 = null;
            }
            aVar.v(f4, f5, aVar2);
        }

        public static /* synthetic */ void k(a aVar, int i4, com.cby.txliteav.live.listener.a aVar2, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("°"));
            }
            if ((i5 & 2) != 0) {
                aVar2 = null;
            }
            aVar.H(i4, aVar2);
        }

        public static /* synthetic */ void l(a aVar, i iVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("±"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.I(iVar, aVar2);
        }

        public static /* synthetic */ void m(a aVar, r rVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("²"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.c(rVar, aVar2);
        }

        public static /* synthetic */ void n(a aVar, View view, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("³"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.b(view, aVar2);
        }

        public static /* synthetic */ void o(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("´"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.e(aVar2);
        }

        public static /* synthetic */ void p(a aVar, j jVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("µ"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.o(jVar, aVar2);
        }

        public static /* synthetic */ void q(a aVar, String str, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¶"));
            }
            if ((i4 & 2) != 0) {
                aVar2 = null;
            }
            aVar.u(str, aVar2);
        }

        public static /* synthetic */ void r(a aVar, com.cby.txliteav.live.listener.a aVar2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("·"));
            }
            if ((i4 & 1) != 0) {
                aVar2 = null;
            }
            aVar.r(aVar2);
        }
    }

    void A(@m com.cby.txliteav.live.listener.a callback);

    void H(@g0(from = 0, to = 150) int volume, @m com.cby.txliteav.live.listener.a callback);

    void I(@fg.l i fillMode, @m com.cby.txliteav.live.listener.a callback);

    void J(@m com.cby.txliteav.live.listener.a callback);

    void L(boolean enable, @fg.l l pixelFormat, @fg.l g bufferType, @m com.cby.txliteav.live.listener.a callback);

    void R();

    void S(@m com.cby.txliteav.live.listener.b listener);

    void T(boolean mute, @m com.cby.txliteav.live.listener.a callback);

    void W(boolean enable, int payloadType, @m com.cby.txliteav.live.listener.a callback);

    void X();

    void Z();

    void a(@m com.cby.txliteav.live.listener.a callback);

    void b(@fg.l View view, @m com.cby.txliteav.live.listener.a callback);

    void c(@fg.l r rotation, @m com.cby.txliteav.live.listener.a callback);

    void d(@m com.cby.txliteav.live.listener.a callback);

    void e(@m com.cby.txliteav.live.listener.a callback);

    void f(boolean enable, @m com.cby.txliteav.live.listener.a callback);

    boolean isPlaying();

    void o(@fg.l j params, @m com.cby.txliteav.live.listener.a callback);

    void r(@m com.cby.txliteav.live.listener.a callback);

    void showDebugView(boolean isShow);

    void t(int intervalMs, @m com.cby.txliteav.live.listener.a callback);

    void u(@fg.l String url, @m com.cby.txliteav.live.listener.a callback);

    void v(@x(from = 1.0d) float minTime, @x(from = 1.0d) float maxTime, @m com.cby.txliteav.live.listener.a callback);
}
