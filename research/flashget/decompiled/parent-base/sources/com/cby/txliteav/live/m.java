package com.cby.txliteav.live;

import android.view.View;
import b4.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.g0;
import kotlin.jvm.internal.l0;

/* compiled from: LivePlayerManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J!\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010'J\u0019\u0010)\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b+\u0010*J\u0019\u0010,\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b,\u0010*J\u0019\u0010-\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b-\u0010*J\u0019\u0010.\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b.\u0010*J\u0019\u0010/\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b/\u0010*J!\u00102\u001a\u00020\t2\u0006\u00101\u001a\u0002002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010'J!\u00106\u001a\u00020\t2\u0006\u00105\u001a\u00020\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\u00020\t2\u0006\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b:\u0010;J1\u0010@\u001a\u00020\t2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b@\u0010AJ!\u0010B\u001a\u00020\t2\u0006\u00108\u001a\u00020\u001f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bB\u00107J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010EJ\u0019\u0010H\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010J¨\u0006K"}, d2 = {"Lcom/cby/txliteav/live/m;", "Lb4/a;", "player", "<init>", "(Lb4/a;)V", "Landroid/view/View;", "view", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/i;", "fillMode", "I", "(Lcom/cby/txliteav/live/i;Lcom/cby/txliteav/live/listener/a;)V", "", "minTime", "maxTime", "v", "(FFLcom/cby/txliteav/live/listener/a;)V", "", "volume", "H", "(ILcom/cby/txliteav/live/listener/a;)V", "intervalMs", "t", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "", "isPlaying", "()Z", "", "url", "u", "(Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "Z", "()V", "R", "r", "(Lcom/cby/txliteav/live/listener/a;)V", "A", "J", "d", "a", "e", "Lcom/cby/txliteav/live/j;", "params", "o", "(Lcom/cby/txliteav/live/j;Lcom/cby/txliteav/live/listener/a;)V", "X", "mute", "T", "(ZLcom/cby/txliteav/live/listener/a;)V", "enable", "payloadType", "W", "(ZILcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "L", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "f", "isShow", "showDebugView", "(Z)V", "Lcom/cby/txliteav/live/listener/b;", "listener", "S", "(Lcom/cby/txliteav/live/listener/b;)V", "Lb4/a;", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements b4.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b4.a player;

    /* compiled from: LivePlayerManager.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/cby/txliteav/live/m$a", "Lcom/cby/txliteav/live/listener/a;", "Lkotlin/k2;", "a", "()V", "", "code", "", "msg", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.cby.txliteav.live.listener.a {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.a f46673c;

        a(com.cby.txliteav.live.listener.a aVar) {
            this.f46673c = aVar;
        }

        @Override // com.cby.txliteav.live.listener.a
        public void a() {
            com.cby.txliteav.live.listener.a aVar = this.f46673c;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // com.cby.txliteav.live.listener.a
        public void b(@fg.m Integer code, @fg.m String msg) {
            com.cby.txliteav.live.listener.a aVar = this.f46673c;
            if (aVar != null) {
                aVar.b(code, msg);
            }
        }
    }

    public m(@fg.l b4.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("෮"));
        this.player = aVar;
    }

    @Override // b4.a
    public void A(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.h(this.player, null, 1, null);
    }

    @Override // b4.a
    public void H(int volume, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.player.H(volume, callback);
    }

    @Override // b4.a
    public void I(@fg.l i fillMode, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(fillMode, ProtectedSandApp.s("෯"));
        a.C0655a.l(this.player, fillMode, null, 2, null);
    }

    @Override // b4.a
    public void J(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.f(this.player, null, 1, null);
    }

    @Override // b4.a
    public void L(boolean enable, @fg.l l pixelFormat, @fg.l g bufferType, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(pixelFormat, ProtectedSandApp.s("\u0df0"));
        l0.p(bufferType, ProtectedSandApp.s("\u0df1"));
        this.player.L(enable, pixelFormat, bufferType, callback);
    }

    @Override // b4.a
    public void R() {
        throw new g0(ProtectedSandApp.s("ෲ"));
    }

    @Override // b4.a
    public void S(@fg.m com.cby.txliteav.live.listener.b listener) {
        this.player.S(listener);
    }

    @Override // b4.a
    public void T(boolean mute, @fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.e(this.player, mute, null, 2, null);
    }

    @Override // b4.a
    public void W(boolean enable, int payloadType, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.player.W(enable, payloadType, callback);
    }

    @Override // b4.a
    public void X() {
        this.player.X();
    }

    @Override // b4.a
    public void Z() {
        throw new g0(ProtectedSandApp.s("ෲ"));
    }

    @Override // b4.a
    public void a(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.g(this.player, null, 1, null);
    }

    @Override // b4.a
    public void b(@fg.l View view, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(view, ProtectedSandApp.s("ෳ"));
        a.C0655a.n(this.player, view, null, 2, null);
    }

    @Override // b4.a
    public void c(@fg.l r rotation, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(rotation, ProtectedSandApp.s("෴"));
        a.C0655a.m(this.player, rotation, null, 2, null);
    }

    @Override // b4.a
    public void d(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.i(this.player, null, 1, null);
    }

    @Override // b4.a
    public void e(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.o(this.player, null, 1, null);
    }

    @Override // b4.a
    public void f(boolean enable, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.player.f(enable, callback);
    }

    @Override // b4.a
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // b4.a
    public void o(@fg.l j params, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(params, ProtectedSandApp.s("\u0df5"));
        this.player.o(params, callback);
    }

    @Override // b4.a
    public void r(@fg.m com.cby.txliteav.live.listener.a callback) {
        a.C0655a.r(this.player, null, 1, null);
    }

    @Override // b4.a
    public void showDebugView(boolean isShow) {
        this.player.showDebugView(isShow);
    }

    @Override // b4.a
    public void t(int intervalMs, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.player.t(intervalMs, callback);
    }

    @Override // b4.a
    public void u(@fg.l String url, @fg.m com.cby.txliteav.live.listener.a callback) {
        l0.p(url, ProtectedSandApp.s("\u0df6"));
        this.player.u(url, new a(callback));
    }

    @Override // b4.a
    public void v(float minTime, float maxTime, @fg.m com.cby.txliteav.live.listener.a callback) {
        this.player.v(minTime, maxTime, callback);
    }
}
