package com.cby.txliteav;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.g0;
import androidx.annotation.x;
import b4.a;
import com.cby.txliteav.live.e;
import com.cby.txliteav.live.g;
import com.cby.txliteav.live.i;
import com.cby.txliteav.live.j;
import com.cby.txliteav.live.listener.a;
import com.cby.txliteav.live.n;
import com.cby.txliteav.live.q;
import com.cby.txliteav.live.r;
import com.cby.txliteav.live.s;
import com.cby.txliteav.live.t;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.live2.V2TXLiveDef;
import com.tencent.live2.V2TXLivePlayer;
import com.tencent.live2.V2TXLivePlayerObserver;
import com.tencent.live2.impl.V2TXLivePlayerImpl;
import com.tencent.rtmp.ui.TXCloudVideoView;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;

/* compiled from: TXLivePlayer.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0019\u001a\u00020\u000b2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u00162\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b \u0010\u001eJ)\u0010$\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020!H\u0016¢\u0006\u0004\b/\u00100J!\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u000bH\u0016¢\u0006\u0004\b:\u00106J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b;\u00108J\u0019\u0010<\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u00108J\u0019\u0010=\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b=\u00108J\u000f\u0010>\u001a\u00020!H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010@\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b@\u00108J!\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bE\u00106J!\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020!2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bG\u0010-J\u0019\u0010J\u001a\u00020\u000b2\b\u0010I\u001a\u0004\u0018\u00010HH\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010LR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010S¨\u0006U"}, d2 = {"Lcom/cby/txliteav/c;", "Lcom/cby/txliteav/live/impl/a;", "Lb4/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "Lcom/cby/txliteav/live/listener/a;", "callback", "Lkotlin/k2;", "b", "(Landroid/view/View;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/r;", "rotation", "c", "(Lcom/cby/txliteav/live/r;Lcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/i;", "mode", "I", "(Lcom/cby/txliteav/live/i;Lcom/cby/txliteav/live/listener/a;)V", "", "minTime", "maxTime", "v", "(FFLcom/cby/txliteav/live/listener/a;)V", "", "volume", "H", "(ILcom/cby/txliteav/live/listener/a;)V", "intervalMs", "t", "", "enable", "payloadType", "W", "(ZILcom/cby/txliteav/live/listener/a;)V", "Lcom/cby/txliteav/live/l;", "pixelFormat", "Lcom/cby/txliteav/live/g;", "bufferType", "L", "(ZLcom/cby/txliteav/live/l;Lcom/cby/txliteav/live/g;Lcom/cby/txliteav/live/listener/a;)V", "f", "(ZLcom/cby/txliteav/live/listener/a;)V", "isShow", "showDebugView", "(Z)V", "", "url", "u", "(Ljava/lang/String;Lcom/cby/txliteav/live/listener/a;)V", "Z", "()V", "A", "(Lcom/cby/txliteav/live/listener/a;)V", "d", "R", "J", "a", "r", "isPlaying", "()Z", "e", "Lcom/cby/txliteav/live/j;", "params", "o", "(Lcom/cby/txliteav/live/j;Lcom/cby/txliteav/live/listener/a;)V", "X", "isMute", "T", "Lcom/cby/txliteav/live/listener/b;", "listener", "S", "(Lcom/cby/txliteav/live/listener/b;)V", "Landroid/content/Context;", "Lc4/a;", "Lkotlin/b0;", "d0", "()Lc4/a;", "logger", "Lcom/tencent/live2/V2TXLivePlayer;", "Lcom/tencent/live2/V2TXLivePlayer;", "mLivePlayer", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends com.cby.txliteav.live.impl.a implements b4.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private V2TXLivePlayer mLivePlayer;

    /* compiled from: TXLivePlayer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46561a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46562b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46563c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f46564d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f46565e;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.Rotation0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.Rotation90.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.Rotation180.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.Rotation270.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46561a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[i.Fill.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i.ScaleFill.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i.Fit.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f46562b = iArr2;
            int[] iArr3 = new int[com.cby.txliteav.live.l.values().length];
            try {
                iArr3[com.cby.txliteav.live.l.LivePixelFormatI420.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.cby.txliteav.live.l.LivePixelFormatTexture2D.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f46563c = iArr3;
            int[] iArr4 = new int[g.values().length];
            try {
                iArr4[g.LiveBufferTypeByteBuffer.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[g.LiveBufferTypeByteArray.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[g.LiveBufferTypeTexture.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            f46564d = iArr4;
            int[] iArr5 = new int[q.values().length];
            try {
                iArr5[q.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            f46565e = iArr5;
        }
    }

    /* compiled from: TXLivePlayer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc4/a;", "a", "()Lc4/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends n0 implements ld.a<c4.a> {
        b() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4.a invoke() {
            return new c4.a(c.this.getClass());
        }
    }

    /* compiled from: TXLivePlayer.kt */
    @Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0010\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u0019\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001a\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0013J!\u0010\u001c\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010'\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b-\u0010(J#\u00100\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J#\u00104\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J+\u00109\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u00106\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010;\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b<\u0010=¨\u0006>"}, d2 = {"com/cby/txliteav/c$c", "Lcom/tencent/live2/V2TXLivePlayerObserver;", "Lcom/tencent/live2/V2TXLivePlayer;", "player", "", "code", "", "msg", "Landroid/os/Bundle;", "extraInfo", "Lkotlin/k2;", "onError", "(Lcom/tencent/live2/V2TXLivePlayer;ILjava/lang/String;Landroid/os/Bundle;)V", "onWarning", "width", "height", "onVideoResolutionChanged", "(Lcom/tencent/live2/V2TXLivePlayer;II)V", "onConnected", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/os/Bundle;)V", "", "firstPlay", "onVideoPlaying", "(Lcom/tencent/live2/V2TXLivePlayer;ZLandroid/os/Bundle;)V", "onAudioPlaying", "onVideoLoading", "onAudioLoading", "volume", "onPlayoutVolumeUpdate", "(Lcom/tencent/live2/V2TXLivePlayer;I)V", "Lcom/tencent/live2/V2TXLiveDef$V2TXLivePlayerStatistics;", "statistics", "onStatisticsUpdate", "(Lcom/tencent/live2/V2TXLivePlayer;Lcom/tencent/live2/V2TXLiveDef$V2TXLivePlayerStatistics;)V", "Landroid/graphics/Bitmap;", "image", "onSnapshotComplete", "(Lcom/tencent/live2/V2TXLivePlayer;Landroid/graphics/Bitmap;)V", "storagePath", "onLocalRecordBegin", "(Lcom/tencent/live2/V2TXLivePlayer;ILjava/lang/String;)V", "", "durationMs", "onLocalRecording", "(Lcom/tencent/live2/V2TXLivePlayer;JLjava/lang/String;)V", "onLocalRecordComplete", "Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;", "videoFrame", "onRenderVideoFrame", "(Lcom/tencent/live2/V2TXLivePlayer;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveVideoFrame;)V", "Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrame;", "audioFrame", "onPlayoutAudioFrame", "(Lcom/tencent/live2/V2TXLivePlayer;Lcom/tencent/live2/V2TXLiveDef$V2TXLiveAudioFrame;)V", "payloadType", "", "data", "onReceiveSeiMessage", "(Lcom/tencent/live2/V2TXLivePlayer;I[B)V", "url", "onStreamSwitched", "(Lcom/tencent/live2/V2TXLivePlayer;Ljava/lang/String;I)V", "TxLiteAV_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.cby.txliteav.c$c, reason: collision with other inner class name */
    public static final class C0762c extends V2TXLivePlayerObserver {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.cby.txliteav.live.listener.b f46568b;

        /* compiled from: TXLivePlayer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.cby.txliteav.c$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f46569a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f46570b;

            static {
                int[] iArr = new int[V2TXLiveDef.V2TXLivePixelFormat.values().length];
                try {
                    iArr[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f46569a = iArr;
                int[] iArr2 = new int[V2TXLiveDef.V2TXLiveBufferType.values().length];
                try {
                    iArr2[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                f46570b = iArr2;
            }
        }

        C0762c(com.cby.txliteav.live.listener.b bVar) {
            this.f46568b = bVar;
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onAudioLoading(@m V2TXLivePlayer player, @m Bundle extraInfo) {
            super.onAudioLoading(player, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("\u0cf5"));
            this.f46568b.k(c.this, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onAudioPlaying(@m V2TXLivePlayer player, boolean firstPlay, @m Bundle extraInfo) {
            super.onAudioPlaying(player, firstPlay, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("\u0cf6") + firstPlay);
            this.f46568b.j(c.this, firstPlay, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onConnected(@m V2TXLivePlayer player, @m Bundle extraInfo) {
            super.onConnected(player, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("\u0cf7"));
            this.f46568b.b(c.this, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onError(@m V2TXLivePlayer player, int code, @m String msg, @m Bundle extraInfo) {
            super.onError(player, code, msg, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("\u0cf8") + code + ProtectedSandApp.s("\u0cf9") + msg);
            this.f46568b.d(c.this, code, msg, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onLocalRecordBegin(@m V2TXLivePlayer player, int code, @m String storagePath) {
            super.onLocalRecordBegin(player, code, storagePath);
            String s4 = code != -8 ? code != -7 ? code != -6 ? code != -2 ? code != -1 ? code != 0 ? ProtectedSandApp.s("\u0cfa") : ProtectedSandApp.s("\u0cfb") : ProtectedSandApp.s("\u0cfc") : ProtectedSandApp.s("\u0cfd") : ProtectedSandApp.s("\u0cfe") : ProtectedSandApp.s("\u0cff") : ProtectedSandApp.s("ഀ");
            c.this.d0().c(ProtectedSandApp.s("ഁ") + s4 + ProtectedSandApp.s("ം") + storagePath);
            this.f46568b.g(c.this, code, storagePath);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onLocalRecordComplete(@m V2TXLivePlayer player, int code, @m String storagePath) {
            super.onLocalRecordComplete(player, code, storagePath);
            String s4 = code != -3 ? code != -2 ? code != -1 ? code != 0 ? ProtectedSandApp.s("\u0cfa") : ProtectedSandApp.s("ഃ") : ProtectedSandApp.s("ഄ") : ProtectedSandApp.s("അ") : ProtectedSandApp.s("ആ");
            c.this.d0().c(ProtectedSandApp.s("ഇ") + s4 + ProtectedSandApp.s("ം") + storagePath);
            this.f46568b.r(c.this, code, storagePath);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onLocalRecording(@m V2TXLivePlayer player, long durationMs, @m String storagePath) {
            super.onLocalRecording(player, durationMs, storagePath);
            this.f46568b.a(c.this, durationMs, storagePath);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.cby.txliteav.live.e] */
        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onPlayoutAudioFrame(@m V2TXLivePlayer player, @m V2TXLiveDef.V2TXLiveAudioFrame audioFrame) {
            super.onPlayoutAudioFrame(player, audioFrame);
            k1.h hVar = new k1.h();
            if (audioFrame != null) {
                ?? eVar = new e();
                eVar.f(audioFrame.data);
                eVar.g(audioFrame.sampleRate);
                eVar.e(audioFrame.channel);
                eVar.h(audioFrame.timestamp);
                hVar.f75329b = eVar;
            }
            this.f46568b.c(c.this, (e) hVar.f75329b);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onPlayoutVolumeUpdate(@m V2TXLivePlayer player, int volume) {
            super.onPlayoutVolumeUpdate(player, volume);
            c.this.d0().c(ProtectedSandApp.s("ഈ") + volume);
            this.f46568b.q(c.this, volume);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onReceiveSeiMessage(@m V2TXLivePlayer player, int payloadType, @m byte[] data) {
            super.onReceiveSeiMessage(player, payloadType, data);
            c.this.d0().c(ProtectedSandApp.s("ഉ") + payloadType + ProtectedSandApp.s("ഊ") + data);
            this.f46568b.f(c.this, payloadType, data);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, com.cby.txliteav.live.t] */
        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onRenderVideoFrame(@m V2TXLivePlayer player, @m V2TXLiveDef.V2TXLiveVideoFrame videoFrame) {
            super.onRenderVideoFrame(player, videoFrame);
            k1.h hVar = new k1.h();
            if (videoFrame != null) {
                V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat = videoFrame.pixelFormat;
                int i4 = v2TXLivePixelFormat == null ? -1 : a.f46569a[v2TXLivePixelFormat.ordinal()];
                com.cby.txliteav.live.l lVar = i4 != 1 ? i4 != 2 ? com.cby.txliteav.live.l.LivePixelFormatUnknown : com.cby.txliteav.live.l.LivePixelFormatTexture2D : com.cby.txliteav.live.l.LivePixelFormatI420;
                V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = videoFrame.bufferType;
                int i5 = v2TXLiveBufferType != null ? a.f46570b[v2TXLiveBufferType.ordinal()] : -1;
                g gVar = i5 != 1 ? i5 != 2 ? i5 != 3 ? g.LiveBufferTypeUnknown : g.LiveBufferTypeTexture : g.LiveBufferTypeByteArray : g.LiveBufferTypeByteBuffer;
                s sVar = new s();
                sVar.f(videoFrame.texture.textureId);
                sVar.d(videoFrame.texture.eglContext10);
                sVar.e(videoFrame.texture.eglContext14);
                ?? tVar = new t();
                tVar.m(lVar);
                tVar.j(gVar);
                tVar.o(sVar);
                tVar.k(videoFrame.data);
                tVar.i(videoFrame.buffer);
                tVar.p(videoFrame.width);
                tVar.l(videoFrame.height);
                tVar.n(videoFrame.rotation);
                hVar.f75329b = tVar;
            }
            this.f46568b.e(c.this, (t) hVar.f75329b);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onSnapshotComplete(@m V2TXLivePlayer player, @m Bitmap image) {
            super.onSnapshotComplete(player, image);
            c.this.d0().c(ProtectedSandApp.s("ഋ") + image);
            this.f46568b.m(c.this, image);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onStatisticsUpdate(@m V2TXLivePlayer player, @m V2TXLiveDef.V2TXLivePlayerStatistics statistics) {
            super.onStatisticsUpdate(player, statistics);
            this.f46568b.h(c.this, statistics != null ? new n(statistics.appCpu, statistics.systemCpu, statistics.width, statistics.height, statistics.fps, statistics.videoBitrate, statistics.audioBitrate, statistics.audioPacketLoss, statistics.videoPacketLoss, statistics.jitterBufferDelay, statistics.audioTotalBlockTime, statistics.audioBlockRate, statistics.videoTotalBlockTime, statistics.videoBlockRate, statistics.rtt, statistics.netSpeed) : null);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onStreamSwitched(@m V2TXLivePlayer player, @m String url, int code) {
            super.onStreamSwitched(player, url, code);
            c.this.d0().c(ProtectedSandApp.s("ഌ") + url + ProtectedSandApp.s("\u0d0d") + code);
            this.f46568b.i(c.this, url, code);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoLoading(@m V2TXLivePlayer player, @m Bundle extraInfo) {
            super.onVideoLoading(player, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("എ"));
            this.f46568b.o(c.this, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoPlaying(@m V2TXLivePlayer player, boolean firstPlay, @m Bundle extraInfo) {
            super.onVideoPlaying(player, firstPlay, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("ഏ") + firstPlay);
            this.f46568b.n(c.this, firstPlay, extraInfo);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onVideoResolutionChanged(@m V2TXLivePlayer player, int width, int height) {
            super.onVideoResolutionChanged(player, width, height);
            c.this.d0().c(ProtectedSandApp.s("ഐ") + width + ProtectedSandApp.s("\u0d11") + height);
            this.f46568b.l(c.this, width, height);
        }

        @Override // com.tencent.live2.V2TXLivePlayerObserver
        public void onWarning(@m V2TXLivePlayer player, int code, @m String msg, @m Bundle extraInfo) {
            super.onWarning(player, code, msg, extraInfo);
            c.this.d0().c(ProtectedSandApp.s("ഒ") + code + ProtectedSandApp.s("\u0cf9") + msg);
            this.f46568b.p(c.this, code, msg, extraInfo);
        }
    }

    public c(@l Context context) {
        l0.p(context, ProtectedSandApp.s("ക"));
        this.context = context;
        this.logger = c0.c(new b());
        this.mLivePlayer = new V2TXLivePlayerImpl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c4.a d0() {
        return (c4.a) this.logger.getValue();
    }

    @Override // b4.a
    public void A(@m com.cby.txliteav.live.listener.a callback) {
        if (isPlaying()) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.resumeAudio()) : null, callback);
        } else if (callback != null) {
            a.b.a(callback, -100, null, 2, null);
        }
    }

    @Override // b4.a
    public void H(@g0(from = 0, to = 150) int volume, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.setPlayoutVolume(volume)) : null, callback);
    }

    @Override // b4.a
    public void I(@l i mode, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveFillMode v2TXLiveFillMode;
        l0.p(mode, ProtectedSandApp.s("ഖ"));
        int i4 = a.f46562b[mode.ordinal()];
        if (i4 == 1) {
            v2TXLiveFillMode = V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFill;
        } else if (i4 == 2) {
            v2TXLiveFillMode = V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeScaleFill;
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            v2TXLiveFillMode = V2TXLiveDef.V2TXLiveFillMode.V2TXLiveFillModeFit;
        }
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.setRenderFillMode(v2TXLiveFillMode)) : null, callback);
    }

    @Override // b4.a
    public void J(@m com.cby.txliteav.live.listener.a callback) {
        if (isPlaying()) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.pauseAudio()) : null, callback);
        } else if (callback != null) {
            a.b.a(callback, -100, null, 2, null);
        }
    }

    @Override // b4.a
    public void L(boolean enable, @l com.cby.txliteav.live.l pixelFormat, @l g bufferType, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(pixelFormat, ProtectedSandApp.s("ഗ"));
        l0.p(bufferType, ProtectedSandApp.s("ഘ"));
        int i4 = a.f46563c[pixelFormat.ordinal()];
        V2TXLiveDef.V2TXLivePixelFormat v2TXLivePixelFormat = i4 != 1 ? i4 != 2 ? V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatUnknown : V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatTexture2D : V2TXLiveDef.V2TXLivePixelFormat.V2TXLivePixelFormatI420;
        int i5 = a.f46564d[bufferType.ordinal()];
        V2TXLiveDef.V2TXLiveBufferType v2TXLiveBufferType = i5 != 1 ? i5 != 2 ? i5 != 3 ? V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeUnknown : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeTexture : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteArray : V2TXLiveDef.V2TXLiveBufferType.V2TXLiveBufferTypeByteBuffer;
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        Integer valueOf = v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.enableObserveVideoFrame(enable, v2TXLivePixelFormat, v2TXLiveBufferType)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("ങ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            d0().c(ProtectedSandApp.s("ച"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ഛ"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ജ") + valueOf);
        if (callback != null) {
            a.b.a(callback, valueOf, null, 2, null);
        }
    }

    @Override // b4.a
    public void R() {
        a.C0655a.f(this, null, 1, null);
        a.C0655a.g(this, null, 1, null);
    }

    @Override // b4.a
    public void S(@m com.cby.txliteav.live.listener.b listener) {
        if (listener == null) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            if (v2TXLivePlayer != null) {
                v2TXLivePlayer.setObserver(null);
                return;
            }
            return;
        }
        V2TXLivePlayer v2TXLivePlayer2 = this.mLivePlayer;
        if (v2TXLivePlayer2 != null) {
            v2TXLivePlayer2.setObserver(new C0762c(listener));
        }
    }

    @Override // b4.a
    public void T(boolean isMute, @m com.cby.txliteav.live.listener.a callback) {
        if (!isPlaying() && callback != null) {
            callback.b(-100, ProtectedSandApp.s("ഝ"));
        }
        if (isMute) {
            J(callback);
        } else {
            A(callback);
        }
    }

    @Override // b4.a
    public void W(boolean enable, int payloadType, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.enableReceiveSeiMessage(enable, payloadType)) : null, callback);
    }

    @Override // b4.a
    public void X() {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        if (v2TXLivePlayer != null) {
            v2TXLivePlayer.stopLocalRecording();
        }
    }

    @Override // b4.a
    public void Z() {
        a.C0655a.h(this, null, 1, null);
        a.C0655a.i(this, null, 1, null);
    }

    @Override // b4.a
    public void a(@m com.cby.txliteav.live.listener.a callback) {
        if (isPlaying()) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.pauseVideo()) : null, callback);
        } else if (callback != null) {
            a.b.a(callback, -100, null, 2, null);
        }
    }

    @Override // b4.a
    public void b(@l View view, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(view, ProtectedSandApp.s("ഞ"));
        if (view instanceof SurfaceView) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.setRenderView((SurfaceView) view)) : null, callback);
        } else if (view instanceof TextureView) {
            V2TXLivePlayer v2TXLivePlayer2 = this.mLivePlayer;
            b0(v2TXLivePlayer2 != null ? Integer.valueOf(v2TXLivePlayer2.setRenderView((TextureView) view)) : null, callback);
        } else if (view instanceof TXCloudVideoView) {
            V2TXLivePlayer v2TXLivePlayer3 = this.mLivePlayer;
            b0(v2TXLivePlayer3 != null ? Integer.valueOf(v2TXLivePlayer3.setRenderView((TXCloudVideoView) view)) : null, callback);
        }
    }

    @Override // b4.a
    public void c(@l r rotation, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLiveDef.V2TXLiveRotation v2TXLiveRotation;
        l0.p(rotation, ProtectedSandApp.s("ട"));
        int i4 = a.f46561a[rotation.ordinal()];
        if (i4 == 1) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation0;
        } else if (i4 == 2) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation90;
        } else if (i4 == 3) {
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation180;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            v2TXLiveRotation = V2TXLiveDef.V2TXLiveRotation.V2TXLiveRotation270;
        }
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.setRenderRotation(v2TXLiveRotation)) : null, callback);
    }

    @Override // b4.a
    public void d(@m com.cby.txliteav.live.listener.a callback) {
        if (isPlaying()) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.resumeVideo()) : null, callback);
        } else if (callback != null) {
            a.b.a(callback, -100, null, 2, null);
        }
    }

    @Override // b4.a
    public void e(@m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.snapshot()) : null, callback);
    }

    @Override // b4.a
    public void f(boolean enable, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        Integer valueOf = v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.enableObserveAudioFrame(enable)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("ഠ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -4) {
            d0().c(ProtectedSandApp.s("ഡ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ഢ"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ണ") + valueOf);
        if (callback != null) {
            a.b.a(callback, valueOf, null, 2, null);
        }
    }

    @Override // b4.a
    public boolean isPlaying() {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        return v2TXLivePlayer != null && v2TXLivePlayer.isPlaying() == 1;
    }

    @Override // b4.a
    public void o(@l j params, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(params, ProtectedSandApp.s("ത"));
        V2TXLiveDef.V2TXLiveLocalRecordingParams v2TXLiveLocalRecordingParams = new V2TXLiveDef.V2TXLiveLocalRecordingParams();
        v2TXLiveLocalRecordingParams.filePath = params.getFilePath();
        v2TXLiveLocalRecordingParams.recordMode = a.f46565e[params.getRecordMode().ordinal()] == 1 ? V2TXLiveDef.V2TXLiveRecordMode.V2TXLiveRecordModeBoth : V2TXLiveDef.V2TXLiveRecordMode.V2TXLiveRecordModeBoth;
        v2TXLiveLocalRecordingParams.interval = params.getInterval();
        c4.a d02 = d0();
        int i4 = v2TXLiveLocalRecordingParams.interval;
        V2TXLiveDef.V2TXLiveRecordMode v2TXLiveRecordMode = v2TXLiveLocalRecordingParams.recordMode;
        String str = v2TXLiveLocalRecordingParams.filePath;
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ഥ"));
        sb.append(i4);
        String s4 = ProtectedSandApp.s("ദ");
        sb.append(s4);
        sb.append(v2TXLiveRecordMode);
        sb.append(s4);
        sb.append(str);
        d02.c(sb.toString());
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        com.cby.txliteav.live.impl.a.c0(this, v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.startLocalRecording(v2TXLiveLocalRecordingParams)) : null, null, 2, null);
    }

    @Override // b4.a
    public void r(@m com.cby.txliteav.live.listener.a callback) {
        if (isPlaying()) {
            V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
            b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.stopPlay()) : null, callback);
        } else if (callback != null) {
            a.b.a(callback, -100, null, 2, null);
        }
    }

    @Override // b4.a
    public void showDebugView(boolean isShow) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        if (v2TXLivePlayer != null) {
            v2TXLivePlayer.showDebugView(isShow);
        }
    }

    @Override // b4.a
    public void t(int intervalMs, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        b0(v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.enableVolumeEvaluation(intervalMs)) : null, callback);
    }

    @Override // b4.a
    public void u(@l String url, @m com.cby.txliteav.live.listener.a callback) {
        l0.p(url, ProtectedSandApp.s("ധ"));
        d0().c(ProtectedSandApp.s("ന") + url);
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        Integer valueOf = v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.startLivePlay(url)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("ഩ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -2) {
            d0().c(ProtectedSandApp.s("പ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ഫ"));
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -3) {
            d0().c(ProtectedSandApp.s("ബ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ഭ"));
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -5) {
            d0().c(ProtectedSandApp.s("മ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("യ"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ര") + valueOf);
        if (callback != null) {
            a.b.a(callback, valueOf, null, 2, null);
        }
    }

    @Override // b4.a
    public void v(@x(from = 1.0d) float minTime, @x(from = 1.0d) float maxTime, @m com.cby.txliteav.live.listener.a callback) {
        V2TXLivePlayer v2TXLivePlayer = this.mLivePlayer;
        Integer valueOf = v2TXLivePlayer != null ? Integer.valueOf(v2TXLivePlayer.setCacheParams(minTime, maxTime)) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            d0().c(ProtectedSandApp.s("റ"));
            if (callback != null) {
                callback.a();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -2) {
            d0().c(ProtectedSandApp.s("ല"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("ള"));
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == -3) {
            d0().c(ProtectedSandApp.s("ഴ"));
            if (callback != null) {
                callback.b(valueOf, ProtectedSandApp.s("വ"));
                return;
            }
            return;
        }
        d0().c(ProtectedSandApp.s("ശ") + valueOf);
        if (callback != null) {
            a.b.a(callback, valueOf, null, 2, null);
        }
    }
}
