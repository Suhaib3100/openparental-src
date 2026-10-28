package b4;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.g0;
import androidx.annotation.x;
import com.cby.txliteav.live.d;
import com.cby.txliteav.live.f;
import com.cby.txliteav.live.g;
import com.cby.txliteav.live.k;
import com.cby.txliteav.live.l;
import com.cby.txliteav.live.listener.c;
import com.cby.txliteav.live.r;
import com.cby.txliteav.live.u;
import com.cby.txliteav.live.w;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;
import kotlin.Metadata;
import kotlin.x0;

/* compiled from: ILivePusher.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0010J\u001b\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0016\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0017\u0010\u0013J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 JC\u0010&\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010$\u001a\u00020\"2\b\b\u0001\u0010%\u001a\u00020\"2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b*\u0010+J/\u0010/\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b/\u00100J3\u00106\u001a\u00020\f2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u0002082\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b:\u0010;J#\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020<2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u00020\f2\u0006\u0010=\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bB\u0010\u0013J\u001b\u0010C\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bC\u0010\u0013J\u001b\u0010D\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bD\u0010\u0013J\u000f\u0010E\u001a\u00020\u0004H&¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0004H&¢\u0006\u0004\bG\u0010FJ#\u0010H\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bH\u0010AJ\u000f\u0010I\u001a\u00020\"H&¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0004H&¢\u0006\u0004\bK\u0010FJ#\u0010M\u001a\u00020\f2\u0006\u0010L\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bM\u0010AJ+\u0010O\u001a\u00020\f2\u0006\u0010#\u001a\u00020N2\u0006\u0010$\u001a\u00020N2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0004H&¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020SH&¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u00020\f2\b\b\u0001\u0010W\u001a\u00020NH&¢\u0006\u0004\bX\u0010YJ%\u0010[\u001a\u00020\f2\b\b\u0001\u0010Z\u001a\u00020\"2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\f2\u0006\u0010^\u001a\u00020]H&¢\u0006\u0004\b_\u0010`J#\u0010c\u001a\u00020\f2\u0006\u0010b\u001a\u00020a2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\bc\u0010dJ%\u0010e\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\be\u0010AJ\u001b\u0010f\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bf\u0010\u0013J\u001b\u0010g\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bg\u0010\u0013J\u001b\u0010$\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b$\u0010\u0013J#\u0010h\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\bj\u0010\u0013J\u000f\u0010k\u001a\u00020\u0004H&¢\u0006\u0004\bk\u0010FJ\u0017\u0010#\u001a\u00020\f2\u0006\u0010l\u001a\u00020\bH&¢\u0006\u0004\b#\u0010mJ\u0019\u0010p\u001a\u00020\f2\b\u0010o\u001a\u0004\u0018\u00010nH&¢\u0006\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lb4/b;", "", "Lcom/cby/txliteav/live/d;", "collectionSource", "", "frontCamera", "Landroid/graphics/Bitmap;", "image", "", "url", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "O", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "a0", "()V", "i", "d", "(Lcom/cby/txliteav/live/listener/a;)V", "N", "s", "a", "m", "k", "(Lcom/cby/txliteav/live/d;ZLandroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "Landroid/view/View;", "view", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "isShow", "showDebugView", "(Z)V", "bitmap", "", "x", "y", "scale", "D", "(Landroid/graphics/Bitmap;FFFLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/f;", "quality", "K", "(Lcom/cby/txliteav/live/f;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/u;", "resolution", "isLandscape", "z", "(Lcom/cby/txliteav/live/u;Ljava/lang/Boolean;Lcom/cby/txliteav/live/listener/a;)V", "enable", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "P", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/k;", "mirror", "w", "(Lcom/cby/txliteav/live/k;Lcom/cby/txliteav/live/listener/a;)V", "q", "(ZLcom/cby/txliteav/live/listener/a;)V", "e", "M", "B", "Q", "()Z", "isFrontCamera", "n", "getCameraZoomMaxRatio", "()F", "isAutoFocusEnabled", "enabled", "V", "", "l", "(IILcom/cby/txliteav/live/listener/a;)V", "enableCameraTorch", "(Z)Z", "Lcom/cby/txliteav/live/a;", "route", "U", "(Lcom/cby/txliteav/live/a;)V", "volume", "setVoiceCaptureVolume", "(I)V", "value", "Y", "(FLcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/c;", "params", "G", "(Lcom/cby/txliteav/live/c;)V", "Lcom/cby/txliteav/live/w;", "type", "h", "(Lcom/cby/txliteav/live/w;Lcom/cby/txliteav/live/listener/a;)V", "g", "C", "E", "p", "(Landroid/graphics/Bitmap;Lcom/cby/txliteav/live/listener/a;)V", "j", "isPushing", "msg", "(Ljava/lang/String;)V", "Lcom/cby/txliteav/live/listener/c;", "listener", "F", "(Lcom/cby/txliteav/live/listener/c;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ILivePusher.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void A(b bVar, d dVar, boolean z4, Bitmap bitmap, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¸"));
            }
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            if ((i4 & 4) != 0) {
                bitmap = null;
            }
            if ((i4 & 8) != 0) {
                aVar = null;
            }
            bVar.k(dVar, z4, bitmap, aVar);
        }

        public static /* synthetic */ void a(b bVar, boolean z4, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¹"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.V(z4, aVar);
        }

        public static /* synthetic */ void b(b bVar, boolean z4, l lVar, g gVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("º"));
            }
            if ((i4 & 8) != 0) {
                aVar = null;
            }
            bVar.P(z4, lVar, gVar, aVar);
        }

        public static /* synthetic */ void c(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("»"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.a(aVar);
        }

        public static /* synthetic */ void d(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¼"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.d(aVar);
        }

        public static /* synthetic */ void e(b bVar, f fVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("½"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.K(fVar, aVar);
        }

        public static /* synthetic */ void f(b bVar, int i4, int i5, com.cby.txliteav.live.listener.a aVar, int i6, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¾"));
            }
            if ((i6 & 4) != 0) {
                aVar = null;
            }
            bVar.l(i4, i5, aVar);
        }

        public static /* synthetic */ void g(b bVar, boolean z4, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("¿"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.q(z4, aVar);
        }

        public static /* synthetic */ void h(b bVar, float f4, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("À"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.Y(f4, aVar);
        }

        public static /* synthetic */ void i(b bVar, k kVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Á"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.w(kVar, aVar);
        }

        public static /* synthetic */ void j(b bVar, r rVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Â"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.c(rVar, aVar);
        }

        public static /* synthetic */ void k(b bVar, View view, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ã"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.b(view, aVar);
        }

        public static /* synthetic */ void l(b bVar, w wVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ä"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.h(wVar, aVar);
        }

        public static /* synthetic */ void m(b bVar, u uVar, Boolean bool, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Å"));
            }
            if ((i4 & 2) != 0) {
                bool = Boolean.FALSE;
            }
            if ((i4 & 4) != 0) {
                aVar = null;
            }
            bVar.z(uVar, bool, aVar);
        }

        public static /* synthetic */ void n(b bVar, Bitmap bitmap, float f4, float f5, float f6, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Æ"));
            }
            if ((i4 & 16) != 0) {
                aVar = null;
            }
            bVar.D(bitmap, f4, f5, f6, aVar);
        }

        public static /* synthetic */ void o(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ç"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.e(aVar);
        }

        public static /* synthetic */ void p(b bVar, boolean z4, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("È"));
            }
            if ((i4 & 1) != 0) {
                z4 = true;
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.g(z4, aVar);
        }

        public static /* synthetic */ void q(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("É"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.M(aVar);
        }

        public static /* synthetic */ void r(b bVar, d dVar, boolean z4, Bitmap bitmap, String str, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ê"));
            }
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            bVar.O(dVar, z4, (i4 & 4) != 0 ? null : bitmap, str, (i4 & 16) != 0 ? null : aVar);
        }

        public static /* synthetic */ void s(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ë"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.E(aVar);
        }

        public static /* synthetic */ void t(b bVar, Bitmap bitmap, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ì"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.p(bitmap, aVar);
        }

        public static /* synthetic */ void u(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Í"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.C(aVar);
        }

        public static /* synthetic */ void v(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Î"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.B(aVar);
        }

        public static /* synthetic */ void w(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ï"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.m(aVar);
        }

        public static /* synthetic */ void x(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ð"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.y(aVar);
        }

        public static /* synthetic */ void y(b bVar, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ñ"));
            }
            if ((i4 & 1) != 0) {
                aVar = null;
            }
            bVar.j(aVar);
        }

        public static /* synthetic */ void z(b bVar, boolean z4, com.cby.txliteav.live.listener.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("Ò"));
            }
            if ((i4 & 2) != 0) {
                aVar = null;
            }
            bVar.n(z4, aVar);
        }
    }

    void B(@m com.cby.txliteav.live.listener.a callback);

    void C(@m com.cby.txliteav.live.listener.a callback);

    void D(@m Bitmap bitmap, @x(from = 0.0d, to = 1.0d) float x4, @x(from = 0.0d, to = 1.0d) float y4, @x(from = 0.0d, to = 1.0d) float scale, @m com.cby.txliteav.live.listener.a callback);

    void E(@m com.cby.txliteav.live.listener.a callback);

    void F(@m c listener);

    void G(@fg.l com.cby.txliteav.live.c params);

    void K(@fg.l f quality, @m com.cby.txliteav.live.listener.a callback);

    void M(@m com.cby.txliteav.live.listener.a callback);

    void N();

    void O(@fg.l d collectionSource, boolean frontCamera, @m Bitmap image, @fg.l String url, @m com.cby.txliteav.live.listener.a callback);

    void P(boolean enable, @fg.l l pixelFormat, @fg.l g bufferType, @m com.cby.txliteav.live.listener.a callback);

    boolean Q();

    void U(@fg.l com.cby.txliteav.live.a route);

    void V(boolean enabled, @m com.cby.txliteav.live.listener.a callback);

    void Y(@x(from = -1.0d, to = 1.0d) float value, @m com.cby.txliteav.live.listener.a callback);

    void a(@m com.cby.txliteav.live.listener.a callback);

    void a0();

    void b(@fg.l View view, @m com.cby.txliteav.live.listener.a callback);

    void c(@fg.l r rotation, @m com.cby.txliteav.live.listener.a callback);

    void d(@m com.cby.txliteav.live.listener.a callback);

    void e(@m com.cby.txliteav.live.listener.a callback);

    boolean enableCameraTorch(boolean enable);

    void g(boolean frontCamera, @m com.cby.txliteav.live.listener.a callback);

    float getCameraZoomMaxRatio();

    @kotlin.k(message = "v9.5 版本开始不推荐使用。", replaceWith = @x0(expression = "TRTCCloud$startLocalAudio()", imports = {"quality"}))
    void h(@fg.l w type, @m com.cby.txliteav.live.listener.a callback);

    void i();

    boolean isAutoFocusEnabled();

    boolean isFrontCamera();

    boolean isPushing();

    void j(@m com.cby.txliteav.live.listener.a callback);

    void k(@fg.l d collectionSource, boolean frontCamera, @m Bitmap image, @m com.cby.txliteav.live.listener.a callback);

    void l(int x4, int y4, @m com.cby.txliteav.live.listener.a callback);

    void m(@m com.cby.txliteav.live.listener.a callback);

    void n(boolean frontCamera, @m com.cby.txliteav.live.listener.a callback);

    void p(@fg.l Bitmap image, @m com.cby.txliteav.live.listener.a callback);

    void q(boolean mirror, @m com.cby.txliteav.live.listener.a callback);

    void s();

    void setVoiceCaptureVolume(@g0(from = 1, to = 100) int volume);

    void showDebugView(boolean isShow);

    void w(@fg.l k mirror, @m com.cby.txliteav.live.listener.a callback);

    void x(@fg.l String msg);

    void y(@m com.cby.txliteav.live.listener.a callback);

    void z(@fg.l u resolution, @m Boolean isLandscape, @m com.cby.txliteav.live.listener.a callback);
}
